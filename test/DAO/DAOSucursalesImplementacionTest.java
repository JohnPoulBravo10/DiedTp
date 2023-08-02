
package DAO;

import Clases.Sucursal;
import java.sql.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DAOSucursalesImplementacionTest {

    private Sucursal sucursal;

    @BeforeEach
    public void setUp() {
        
        int id = 1;
        String nombre = "Sucursal1";
        String estado = "Operativa";
        Time horaApertura = Time.valueOf("09:00:00");
        Time horaCierre = Time.valueOf("20:00:00");

        sucursal = new Sucursal(id, nombre, estado, horaApertura, horaCierre);
    }

    @Test
    public void testRegistrarSucursal() {
        
        DAOSucursalesImplementacion dao = new DAOSucursalesImplementacion();

        dao.Registrar(sucursal);
        dao.buscar(sucursal);
        
        assertEquals(1, sucursal.getId());
        assertEquals("Sucursal1", sucursal.getNombre());
        assertEquals(Time.valueOf("09:00:00"), sucursal.getHoraApertura());
        assertEquals(Time.valueOf("20:00:00"),sucursal.getHoraCierre());
        assertEquals("Operativa", sucursal.getEstado());
        

      
    }
    @Test
    public void testEliminarSucursal() {
        
        DAOSucursalesImplementacion dao = new DAOSucursalesImplementacion();

       
        dao.eliminar(sucursal);
        dao.buscar(sucursal);
         }

}  


