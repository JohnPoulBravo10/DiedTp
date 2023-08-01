
package DAO;

import Clases.Camino;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DAOCaminoImplementacion implements DAO{
    Conexion conexion = Conexion.getInstancia();
    Camino camino;
    @Override
    public void Registrar(Object cam) {
        camino=(Camino)cam;
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement("insert into camino values(?,?,?,?,?,?)");

           
            insertar.setInt(1, camino.getId());
            insertar.setInt(2, camino.getIdSucursalOrigen());
            insertar.setInt(3,camino.getIdSucursalDestino());
            insertar.setInt(4, camino.getTiempoTransito());
            insertar.setInt(5, camino.getCapacidadMaxima());
            insertar.setString(6,camino.getEstado());
            insertar.executeUpdate();
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (SQLException e) {
            System.out.println("error" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void modificar(Object cam) {
        camino=(Camino)cam;
         try {
            Connection conectar = conexion.conectar();
            PreparedStatement modificar = conectar.prepareStatement("update camino set idsucursalorigen = ?, idsucursaldestino = ?, tiempotransito = ?, capacidadMaxima = ?, estado = ? where idcamino = ?");

            modificar.setInt(1, camino.getIdSucursalOrigen());
            modificar.setInt(2,camino.getIdSucursalDestino());
            modificar.setInt(3, camino.getTiempoTransito());
            modificar.setInt(4, camino.getCapacidadMaxima());
            modificar.setString(5,camino.getEstado());
            modificar.setInt(6, camino.getId());
            modificar.executeUpdate();
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Camino modficado");
        } catch (SQLException e) {
            System.out.println("error" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }

       }

    @Override
    public void eliminar(Object cam) {
        camino=(Camino)cam;
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement eliminar = conectar.prepareStatement("delete from camino where idcamino=?");
            
            eliminar.setInt(1,camino.getId());
            eliminar.executeUpdate();
            
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Camino eliminado");
        } catch (SQLException e) {
            System.out.println("error bd" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void buscar(Object cam) {
        camino=(Camino)cam;
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement buscar = conectar.prepareStatement("select * from camino where id = ?");
            
            buscar.setInt(1,camino.getId());
            ResultSet consulta =buscar.executeQuery();
           
            while(consulta.next()){
                camino.setId(Integer.parseInt(consulta.getString("id")));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error bd" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    
}
