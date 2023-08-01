
package Interfaces;

import Clases.CaminoGrafo;
import Clases.DetalleOrden;
import DAO.Conexion;
import DAO.DetallesOrdenesDAO;
import DAO.RutasDAO;
import DAO.StockSucursalDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



public class SucursalesconProductos2 extends javax.swing.JFrame {

   
    Conexion conexion =  Conexion.getInstancia();
    
    @Override
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logTp2-P.png"));
        return retValue;
    }
    
    public SucursalesconProductos2(int numeroOrden,int idSucursalDestino) throws ClassNotFoundException {
        initComponents();
        DetallesOrdenesDAO dao = new DetallesOrdenesDAO();
        List<DetalleOrden> detalles = dao.obtenerProductosPorOrden(numeroOrden);
        ArrayList<Integer> listaProductos= detalles.stream()
                .map(DetalleOrden::getIdProducto)
                .collect(Collectors.toCollection(ArrayList::new));
        StockSucursalDAO dao2 = new StockSucursalDAO();
        List<Integer> sucursalesConProductos = dao2.buscarSucursalesConProductos(listaProductos);
        
        
        RutasDAO rutas = new RutasDAO();
        CaminoGrafo grafo = new CaminoGrafo();
        rutas.cargarCaminos(grafo);
        rutas.cargarSucursales(grafo);
        
        
       List<List<Integer>> caminos = new ArrayList<>();
       DefaultListModel<String> model = new DefaultListModel<>();
       for(int id: sucursalesConProductos){
           if(grafo.existeCamino(id, idSucursalDestino)){
              
               List<Integer> camino = grafo.obtenerCamino(id, idSucursalDestino);
              
               String caminoStr = camino.toString();
               int tiempo = grafo.tiempoTransitoCamino(id, idSucursalDestino);
               model.addElement("Camino desde:");
               model.addElement("Sucursal Origen "+ camino.get(0));
               model.addElement("Tiempo de demora "+tiempo+" min");
               model.addElement("Debera recorrer el siguiente camino:");
               model.addElement(caminoStr);
               model.addElement("----------------------------------");
               }
       }
          jScrollPane1.setViewportView(ListaCaminos);
          ListaCaminos.setModel(model);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaCaminos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        botonOrden = new javax.swing.JButton();
        txtOrden = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estos son los caminos posibles para llegar a la sucursal destino con todos los productos requeridos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 19, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 41, 34, 28));

        ListaCaminos.setBackground(new java.awt.Color(0, 0, 51));
        ListaCaminos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListaCaminos.setForeground(new java.awt.Color(255, 255, 255));
        ListaCaminos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "No existen caminos" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaCaminos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 62, 485, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese id de la sucursal Origen para ejecutar la orden de provision");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 226, -1, -1));

        botonOrden.setBackground(new java.awt.Color(0, 0, 51));
        botonOrden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonOrden.setForeground(new java.awt.Color(255, 255, 255));
        botonOrden.setText("Generar Orden");
        botonOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(botonOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        txtOrden.setBackground(new java.awt.Color(0, 0, 51));
        txtOrden.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtOrden.setForeground(new java.awt.Color(255, 255, 255));
        txtOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(txtOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 248, 107, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzul.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 580, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenActionPerformed
       
        int mensaje=JOptionPane.showConfirmDialog(null, "Desea confirmar el recorrido?"); 
        if(mensaje==JOptionPane.YES_OPTION){
             JOptionPane.showMessageDialog(null,"Recorrido Asignado");
             
             
             
             
             
             
         }
    }//GEN-LAST:event_botonOrdenActionPerformed

    private void txtOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdenActionPerformed
       
    }//GEN-LAST:event_txtOrdenActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaCaminos;
    private javax.swing.JButton botonOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtOrden;
    // End of variables declaration//GEN-END:variables
}
