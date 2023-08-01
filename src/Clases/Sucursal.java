
package Clases;


import java.sql.Time;


public class Sucursal {
    private int id;
    private String nombre;
    private String estado;
    private Time horaApertura;
    private Time horaCierre;

    public Sucursal(){}
    public Sucursal(int id, String nombre, String estado, Time horaApertura, Time horaCierre) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setHoraApertura(Time horaApertura) {
        this.horaApertura = horaApertura;
    }

    public void setHoraCierre(Time horaCierre) {
        this.horaCierre = horaCierre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public Time getHoraApertura() {
        return horaApertura;
    }

    public Time getHoraCierre() {
        return horaCierre;
    }

    
     
}
