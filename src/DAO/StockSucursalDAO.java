
package DAO;


import java.util.*;
import java.sql.*;


public class StockSucursalDAO {
 
    Conexion conexion = Conexion.getInstancia();
   
    public StockSucursalDAO(){}
    public List<Integer> buscarSucursalesConProductos(ArrayList<Integer> idsProductos) throws ClassNotFoundException {
        List<Integer> sucursalesConProductos = new ArrayList<>();

        Connection conex = conexion.conectar();
                
        try{
           
           String consulta = "SELECT DISTINCT ss.idSucursal " +
                              "FROM stock_sucursales ss " +
                              "WHERE ss.idProducto = ? ";

            for (int i = 1; i < idsProductos.size(); i++) {
                consulta += "AND EXISTS (SELECT 1 FROM stock_sucursales WHERE idSucursal = ss.idSucursal AND idProducto = ?) ";
            }

            PreparedStatement statement = conex.prepareStatement(consulta);

           
            for (int i = 0; i < idsProductos.size(); i++) {
                statement.setInt(i + 1, idsProductos.get(i));
            }

            
            ResultSet resultado = statement.executeQuery();
            while (resultado.next()) {
                int idSucursal = resultado.getInt("idsucursal");
                sucursalesConProductos.add(idSucursal);
            }

           
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println(e);
        }

        return sucursalesConProductos;
    }
}
