
package DAO;

import Interfaces.OrdenProvision2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class OrdenDAO {
    
    Conexion conexion = Conexion.getInstancia();
    public OrdenDAO(){ 
        
    }
    
    public void eliminarOrden(int idorden){
        try {
                Connection conectar = conexion.conectar();
                PreparedStatement eliminar = conectar.prepareStatement("delete from ordenprovision where idorden = ? ");
                eliminar.setInt(1,idorden);
                eliminar.executeUpdate();

                JOptionPane.showMessageDialog(null,"Eliminado con exito");
                conexion.cerrarConexion();
            } catch (SQLException e) {
                System.out.println("error bd" + e);
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(OrdenProvision2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }
    
    public void asignarOrden(int idorden){
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement modificar = conectar.prepareStatement("update ordenprovision set estado = ? where idorden = ?");

            modificar.setString(1, "ASIGNADA");
            modificar.setInt(2, idorden);
            modificar.executeUpdate();
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
