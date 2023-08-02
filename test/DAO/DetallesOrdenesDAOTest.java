
package DAO;


import static org.junit.jupiter.api.Assertions.*;
import Clases.DetalleOrden;
import java.util.List;
import org.junit.jupiter.api.Test;

public class DetallesOrdenesDAOTest {

    @Test
    public void testObtenerProductosPorOrden() throws ClassNotFoundException {
        
        DetallesOrdenesDAO dao = new DetallesOrdenesDAO();

        
        List<DetalleOrden> productosOrden = dao.obtenerProductosPorOrden(9);

        
        assertFalse(productosOrden.isEmpty());
        assertEquals(4, productosOrden.size()); 

       
        DetalleOrden detalle1 = productosOrden.get(0);
        assertEquals(91, detalle1.getId());
        assertEquals(9, detalle1.getIdOrden());
        assertEquals(1, detalle1.getIdProducto());
        assertEquals(10, detalle1.getCantidad());

        DetalleOrden detalle2 = productosOrden.get(1);
        assertEquals(92, detalle2.getId());
        assertEquals(9, detalle2.getIdOrden());
        assertEquals(2, detalle2.getIdProducto());
        assertEquals(5, detalle2.getCantidad());

        DetalleOrden detalle3 = productosOrden.get(2);
        assertEquals(947, detalle3.getId());
        assertEquals(9, detalle3.getIdOrden());
        assertEquals(47, detalle3.getIdProducto());
        assertEquals(10, detalle3.getCantidad());
        
        DetalleOrden detalle4 = productosOrden.get(2);
        assertEquals(949, detalle3.getId());
        assertEquals(9, detalle3.getIdOrden());
        assertEquals(49, detalle3.getIdProducto());
        assertEquals(10, detalle3.getCantidad());
    }
}
