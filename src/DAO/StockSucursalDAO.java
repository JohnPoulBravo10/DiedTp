
package DAO;


import Clases.DetalleOrden;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    
    public List<Integer> buscarSucursalesConProductoss(List<DetalleOrden> detalles) throws ClassNotFoundException {
    List<Integer> sucursalesConProductos = new ArrayList<>();

        try (Connection conex = conexion.conectar()) {
             String consulta = "SELECT DISTINCT ss.idSucursal " +
                          "FROM stock_sucursales ss " +
                          "WHERE ";

        for (int i = 0; i < detalles.size(); i++) {
            if (i > 0) {
                consulta += " OR ";
            }
            consulta += "(ss.idProducto = ? AND ss.cantidad >= ?) ";
        }

        consulta += "GROUP BY ss.idSucursal " +
                    "HAVING COUNT(DISTINCT ss.idProducto) = ?";

        PreparedStatement statement = conex.prepareStatement(consulta);

        int paramIndex = 1;
        for (DetalleOrden detalle : detalles) {
            statement.setInt(paramIndex++, detalle.getIdProducto());
            statement.setInt(paramIndex++, detalle.getCantidad());
        }

        // Agregar el total de productos en los detalles de la orden como último parámetro
        statement.setInt(paramIndex++, detalles.size());

        ResultSet resultado = statement.executeQuery();
        while (resultado.next()) {
            int idSucursal = resultado.getInt("idsucursal");
            sucursalesConProductos.add(idSucursal);
        }


        } catch (SQLException e) {
            System.out.println(e);
        }

        return sucursalesConProductos;
    }
    
    
    public int cantidadProductoSucursal(int idSucursal,int idProducto){
     
        int cantidad =0;
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement buscar = conectar.prepareStatement("select cantidad from stock_sucursales where idsucursal = ? and idproducto = ?");

            buscar.setInt(1, idSucursal);
            buscar.setInt(2, idProducto);
            ResultSet consulta = buscar.executeQuery();
            
        
            while(consulta.next()){
                cantidad = consulta.getInt("cantidad");
            }
            
            conexion.cerrarConexion();
            return cantidad;
        } catch (SQLException e) {
            System.out.println("error" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cantidad;
    }
    public void actualizarStockProducto(int idSucursal,int idProducto, int cantidad){
        
        int cant = cantidadProductoSucursal(idSucursal, idProducto);
        
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement modificar = conectar.prepareStatement("update stock_sucursales set cantidad = ? where idsucursal = ? and idproducto = ?");

            modificar.setInt(1, cant-cantidad);
            modificar.setInt(2, idSucursal);
            modificar.setInt(3, idProducto);
            modificar.executeUpdate();
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
