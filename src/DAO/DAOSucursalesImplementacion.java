
package DAO;

import Clases.Sucursal;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DAOSucursalesImplementacion implements DAO{

    Conexion conexion = Conexion.getInstancia();
    Sucursal sucursal;
    @Override
    public void Registrar(Object sucu) {
        sucursal=(Sucursal)sucu;
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement("insert into sucursal values(?,?,?,?,?)");

           
            
            insertar.setInt(1, sucursal.getId());
            insertar.setString(2,sucursal.getNombre());
            insertar.setTime(3, sucursal.getHoraApertura());
            insertar.setTime(4, sucursal.getHoraCierre());
            insertar.setString(5,sucursal.getEstado());
            insertar.executeUpdate();
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void modificar(Object sucu) {
        sucursal=(Sucursal)sucu;
         try {
            Connection conectar = conexion.conectar();
            PreparedStatement modificar = conectar.prepareStatement("update sucursal set nombre = ?, horarioApertura = ?, HorarioCierre = ?, Estado = ? where id = ?");

            modificar.setString(1,sucursal.getNombre());
            modificar.setTime(2, sucursal.getHoraApertura());
            modificar.setTime(3, sucursal.getHoraCierre());
            modificar.setString(4,sucursal.getEstado());
            modificar.setInt(5, sucursal.getId());
            modificar.executeUpdate();
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }

       }

    @Override
    public void eliminar(Object sucu) {
        sucursal=(Sucursal)sucu;
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement eliminar = conectar.prepareStatement("delete from sucursal where id=?");
            
            eliminar.setInt(1,sucursal.getId());
            eliminar.executeUpdate();
            
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error bd" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void buscar(Object sucu) {
        sucursal=(Sucursal)sucu;
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement buscar = conectar.prepareStatement("select * from sucursal where id = ?");
            
            buscar.setInt(1,sucursal.getId());
            ResultSet consulta =buscar.executeQuery();
           
            while(consulta.next()){
                 System.out.println(consulta.getString("nombre"));
                 System.out.println("hoal");
                sucursal.setId(Integer.parseInt(consulta.getString("id")));
                sucursal.setNombre(consulta.getString("nombre"));
                //sucursal.setHoraApertura(consulta.getTime("horaApertura"));
                //sucursal.setHoraCierre(consulta.getTime("horaCierre"));
                //sucursal.setEstado(consulta.getString("estado"));
            }
            JOptionPane.showMessageDialog(null,"LLEGUE");
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error bd" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    
    
}
