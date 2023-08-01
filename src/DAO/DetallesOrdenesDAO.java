package DAO;

import Clases.DetalleOrden;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetallesOrdenesDAO {

    
    public List<DetalleOrden> obtenerProductosPorOrden(int idOrden) throws ClassNotFoundException {
        List<DetalleOrden> productosOrden = new ArrayList<>();

       
        Conexion conexion = Conexion.getInstancia();

        try{
          
            Connection conex = conexion.conectar();
            String consulta = "SELECT id, idProducto, cantidad FROM detallesorden WHERE idOrden = ?";
            PreparedStatement preparedStatement = conex.prepareStatement(consulta);
            preparedStatement.setInt(1, idOrden);
                
                
            ResultSet resultado = preparedStatement.executeQuery();
                
                
                while (resultado.next()) {
                    int idDetalle = resultado.getInt("id");
                    int idProducto = resultado.getInt("idProducto");
                    int cantidad = resultado.getInt("cantidad");
                    
                    
                    DetalleOrden detalleOrden = new DetalleOrden(idDetalle, idOrden, idProducto, cantidad);
                    productosOrden.add(detalleOrden);
                
                
                }
                conexion.cerrarConexion();
            
        } catch (SQLException e) {
            System.out.println(e);
        }

        return productosOrden;
    }
}
