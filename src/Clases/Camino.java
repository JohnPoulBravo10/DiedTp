
package Clases;


public class Camino {
    private int id;
    private int idSucursalOrigen;
    private int idSucursalDestino;
    private int capacidadMaxima;
    private int tiempoTransito;
    private String estado;

    public Camino() {
    }

    public Camino(int id, int idSucursalOrigen, int idSucursalDestino, int capacidadMaxima, int tiempoTransito, String estado) {
        this.id = id;
        this.idSucursalOrigen = idSucursalOrigen;
        this.idSucursalDestino = idSucursalDestino;
        this.capacidadMaxima = capacidadMaxima;
        this.tiempoTransito = tiempoTransito;
        this.estado = estado;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSucursalOrigen() {
        return idSucursalOrigen;
    }

    public void setIdSucursalOrigen(int idSucursalOrigen) {
        this.idSucursalOrigen = idSucursalOrigen;
    }

    public int getIdSucursalDestino() {
        return idSucursalDestino;
    }

    public void setIdSucursalDestino(int idSucursalDestino) {
        this.idSucursalDestino = idSucursalDestino;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getTiempoTransito() {
        return tiempoTransito;
    }

    public void setTiempoTransito(int tiempoTransito) {
        this.tiempoTransito = tiempoTransito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
