
package DAO;

import Clases.Camino;
import Clases.CaminoGrafo;
import Clases.Sucursal;
import java.sql.*;
import java.util.ArrayList;



public class RutasDAO {
    
    Conexion conexion = Conexion.getInstancia();

    ArrayList<Camino> listaCaminos = new ArrayList<>();
    ArrayList<Sucursal> listaSucursales = new ArrayList<>();
    
    public void cargarCaminos(CaminoGrafo grafo) throws ClassNotFoundException {
        try{
            String sql = "SELECT * FROM camino";
            Connection conex = conexion.conectar();
            Statement statement = conex.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int idCamino = resultSet.getInt("IdCamino");
                int idSucursalOrigen = resultSet.getInt("IdSucursalOrigen");
                int idSucursalDestino = resultSet.getInt("IdSucursalDestino");
                int tiempoTransito = resultSet.getInt("TiempoTransito");
                int capacidadMaxima = resultSet.getInt("CapacidadMaxima");
                String estado = resultSet.getString("estado");
                
                Camino camino =new Camino(idCamino,idSucursalOrigen,idSucursalDestino,capacidadMaxima,tiempoTransito,estado);
                
                listaCaminos.add(camino);
            }
            grafo.setAristas(listaCaminos);
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void cargarSucursales(CaminoGrafo grafo) throws ClassNotFoundException {
        try{
            String sql = "SELECT * FROM sucursal";
            Connection conex = conexion.conectar();
            Statement statement = conex.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre= resultSet.getString("nombre");
                Time horarioApertura;
                horarioApertura = resultSet.getTime("horarioApertura");
                Time HorarioCierre = resultSet.getTime("HorarioCierre");
                String estado = resultSet.getString("estado");
                
                
                Sucursal sucursal = new Sucursal(id,nombre,estado,horarioApertura,HorarioCierre);
                
                listaSucursales.add(sucursal);
            }
            grafo.setVertices(listaSucursales);
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
