
package Clases;

public class DetalleOrden {
        private int id;
        private int idOrden;
        private int idProducto;
        private int cantidad;

        public DetalleOrden(int id, int idOrden, int idProducto, int cantidad) {
            this.id = id;
            this.idOrden = idOrden;
            this.idProducto = idProducto;
            this.cantidad = cantidad;
        }

        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    }