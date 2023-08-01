
package DAO;

import java.sql.*;

public class Conexion {
    
    private Conexion(){
        
    }
    
    
    private static  Connection conexion;
    
    private static Conexion instancia;
    
    private static final String URL="jdbc:mysql://localhost/bd_tpdied";
    private static final String USER="root";
    private static final String PASS="";
    
    public Connection conectar() throws ClassNotFoundException{
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(URL,USER,PASS);
            return conexion;
        }catch(SQLException e){
           System.out.println(e);
        }
        return conexion;
    }
    
    public void cerrarConexion() throws SQLException{
        
        try{
            conexion.close();
        }catch(SQLException e){
            conexion.close();
            System.out.println(e);
        }finally{
            conexion.close();
        }
    }
    
    public static Conexion getInstancia(){
        if(instancia==null){
            instancia=new Conexion();
        }
        return instancia;
    }
    
}
