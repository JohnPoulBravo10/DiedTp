
package Clases;

import java.util.*;

public class CaminoGrafo {

 private List<Camino> aristas;
 private List<Sucursal> vertices;
 
 public CaminoGrafo(){
 this.aristas = new ArrayList<>();
 this.vertices = new ArrayList<>();
 }
 public void addNodo(Sucursal nodo){ this.vertices.add(nodo); }
 
 public void setAristas(ArrayList<Camino> aristas){
     this.aristas=aristas;
 }
 public List<Camino> getAristas(){
     return aristas;
 }
  public void setVertices(ArrayList<Sucursal> vertices){
     this.vertices=vertices;
 }
 public List<Sucursal> getVerticess(){
     return vertices;
 }
 
 
  
        public boolean existeCamino(int origen, int destino) {
            if(origen != destino){
                 return existeCaminoRecursivo(origen, destino, new ArrayList<>());
            }else{
                return false;
            }
        }

        private boolean existeCaminoRecursivo(int actual, int destino, ArrayList<Integer> visitados) {
            if (actual == destino) {
                return true;
            }

            visitados.add(actual);

            for (Camino arista : aristas) {
                if (arista.getIdSucursalOrigen()==actual && !visitados.contains(arista.getIdSucursalDestino())) {
                    if (existeCaminoRecursivo(arista.getIdSucursalDestino(), destino, visitados)) {
                        return true;
                    }
                }
            }

            return false;
        }
        
         public List<Integer> obtenerCamino(int origen, int destino) {
        if (origen != destino) {
            List<Integer> caminoActual = new ArrayList<>();
            caminoActual.add(origen);
            return obtenerCaminoRecursivo(origen, destino, caminoActual);
        } else {
            return new ArrayList<>(); 
        }
    }

    private List<Integer> obtenerCaminoRecursivo(int actual, int destino, List<Integer> caminoActual) {
        if (actual == destino) {
            return caminoActual;
        }

        for (Camino arista : aristas) {
            if (arista.getIdSucursalOrigen() == actual && !caminoActual.contains(arista.getIdSucursalDestino())) {
                List<Integer> nuevoCamino = new ArrayList<>(caminoActual);
                nuevoCamino.add(arista.getIdSucursalDestino());
                List<Integer> caminoEncontrado = obtenerCaminoRecursivo(arista.getIdSucursalDestino(), destino, nuevoCamino);
                if (!caminoEncontrado.isEmpty()) {
                    return caminoEncontrado;
                }
            }
        }

        return new ArrayList<>(); 
    }
 
     public int tiempoTransitoCamino(int origen, int destino) {
    if (origen != destino) {
        return tiempoTransitoCaminoRecursivo(origen, destino, new ArrayList<>());
    }
    return 0;
}

private int tiempoTransitoCaminoRecursivo(int actual, int destino, List<Integer> visitados) {
    if (actual == destino) {
        return 0; 
    }

    visitados.add(actual);

    for (Camino arista : aristas) {
        if (arista.getIdSucursalOrigen() == actual && !visitados.contains(arista.getIdSucursalDestino())) {
            int tiempoTransitoRestante = tiempoTransitoCaminoRecursivo(arista.getIdSucursalDestino(), destino, visitados);

            if (tiempoTransitoRestante >= 0) {
                return arista.getTiempoTransito() + tiempoTransitoRestante;
            }
        }
    }

    return -1; 
}




}

 