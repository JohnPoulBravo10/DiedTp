
package Clases;


import static org.junit.jupiter.api.Assertions.*;
import java.sql.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CaminoGrafoTest {
    private CaminoGrafo grafo;
    
    @BeforeEach
    public void setup() {
        
        grafo = new CaminoGrafo();
       
        Time tiempo2 = new Time(20, 0, 0);
        Time tiempo = new Time(8, 0, 0);
        
        Sucursal sucursalA = new Sucursal(1, "Sucursal A", "OPERATIVA",tiempo , tiempo2);
        Sucursal sucursalB = new Sucursal(2, "Sucursal B","OPERATIVA",tiempo , tiempo2);
        Sucursal sucursalC = new Sucursal(3, "Sucursal C","OPERATIVA",tiempo , tiempo2);
        Sucursal sucursalD = new Sucursal(4, "Sucursal D","OPERATIVA",tiempo , tiempo2);
        
        ArrayList<Sucursal> listaSucursales = new ArrayList<>();
        listaSucursales.add(sucursalA);
        listaSucursales.add(sucursalB);
        listaSucursales.add(sucursalC);
        listaSucursales.add(sucursalD);
        
        grafo.setVertices(listaSucursales);
        
        Camino caminoAB = new Camino(1, 1, 2, 120,100, "OPERATIVO");
        Camino caminoBC = new Camino(2, 1, 3, 120,100, "OPERATIVO");
        Camino caminoCD = new Camino(3, 3, 4, 120,100, "OPERATIVO");
       
        
        ArrayList<Camino> listaCaminos = new ArrayList<>();
        listaCaminos.add(caminoAB);
        listaCaminos.add(caminoBC);
        listaCaminos.add(caminoCD);
        
        grafo.setAristas(listaCaminos);
    }
    
    @Test
    public void testExisteCamino() {
        assertTrue(grafo.existeCamino(1, 2));
        assertTrue(grafo.existeCamino(1, 3));
        assertTrue(grafo.existeCamino(1, 4));
        assertFalse(grafo.existeCamino(2, 4));
    }
    
    @Test
    public void testObtenerCamino() {
        List<Integer> caminoAB = grafo.obtenerCamino(1, 2);
        List<Integer> caminoAC = grafo.obtenerCamino(1, 3);
        List<Integer> caminoAD = grafo.obtenerCamino(1, 4);
        List<Integer> caminoBD = grafo.obtenerCamino(2, 4);
        
        assertEquals(List.of(1, 2), caminoAB);
        assertEquals(List.of(1, 2, 3), caminoAC);
        assertEquals(List.of(1,  3, 4), caminoAD);
        assertEquals(List.of(), caminoBD); // No hay camino entre sucursal 2 y 4
    }
    
    @Test
    public void testTiempoTransitoCamino() {
        int tiempoAB = grafo.tiempoTransitoCamino(1, 2);
        int tiempoAC = grafo.tiempoTransitoCamino(1, 3);
        int tiempoAD = grafo.tiempoTransitoCamino(1, 4);
        int tiempoBD = grafo.tiempoTransitoCamino(2, 4);
        
        assertEquals(100, tiempoAB);
        assertEquals(100, tiempoAC);
        assertEquals(200, tiempoAD);
        assertEquals(-1, tiempoBD); // No hay camino entre sucursal 2 y 4
    }
}

