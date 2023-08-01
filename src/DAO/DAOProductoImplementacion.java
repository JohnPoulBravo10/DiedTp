
package DAO;


import Clases.Producto;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAOProductoImplementacion implements DAO{
    Conexion conexion = Conexion.getInstancia();
    Producto producto;
    @Override
    public void Registrar(Object prod) {
        producto=(Producto)prod;
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement("insert into producto values(?,?,?,?,?)");

           
            insertar.setInt(1, 0);
            insertar.setString(2, producto.getNombre());
            insertar.setString(3,producto.getNombre());
            insertar.setDouble(4, producto.getPrecio());
            insertar.setInt(5, producto.getPeso());
            insertar.executeUpdate();
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void modificar(Object prod) {
        producto=(Producto)prod;
         try {
            Connection conectar = conexion.conectar();
            PreparedStatement modificar = conectar.prepareStatement("update producto set nombreproducto = ?, descripcionproducto = ?, precioProducto = ?, peso = ? where idproducto = ?");

            
            modificar.setString(1, producto.getNombre());
            modificar.setString(2,producto.getNombre());
            modificar.setDouble(3, producto.getPrecio());
            modificar.setInt(4, producto.getPeso());
            modificar.setInt(5, producto.getId());
            modificar.executeUpdate();
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }

       }

    @Override
    public void eliminar(Object prod) {
       producto=(Producto)prod;
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement eliminar = conectar.prepareStatement("delete from producto where idproducto = ?");
            
            eliminar.setInt(1,producto.getId());
            eliminar.executeUpdate();
            
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error bd" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void buscar(Object prod) {
        producto=(Producto)prod;
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement buscar = conectar.prepareStatement("select * from producto where idproducto = ?");
            
            buscar.setInt(1,producto.getId());
            ResultSet consulta =buscar.executeQuery();
           
            while(consulta.next()){
                 System.out.println(consulta.getString("nombre"));
                 System.out.println("hoal");
                producto.setId(Integer.parseInt(consulta.getString("id")));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error bd" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    
}
