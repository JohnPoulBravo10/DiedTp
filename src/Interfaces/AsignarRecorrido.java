
package Interfaces;

import DAO.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AsignarRecorrido extends javax.swing.JFrame {

    Conexion conexion = Conexion.getInstancia();
    
    public AsignarRecorrido() {
        initComponents();
         setLocationRelativeTo(null);
        setTitle("Asignar Recorridos");
        setResizable(false);
    }

    @Override
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logTp2-P.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        scroll3 = new javax.swing.JScrollPane();
        tablaOrdenes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        botonBuscarCaminos = new javax.swing.JButton();
        txtOrden = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdDestino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaOrdenes.setBackground(new java.awt.Color(0, 0, 51));
        tablaOrdenes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaOrdenes.setForeground(new java.awt.Color(255, 255, 255));
        tablaOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "IdOrden", "idSucursalDestino", "tiempoEsperado", "idListaProductos", "fecha", "estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scroll3.setViewportView(tablaOrdenes);

        jPanel2.add(scroll3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, 440, 267));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Visualizar ordenes pendientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        botonBuscarCaminos.setBackground(new java.awt.Color(0, 0, 51));
        botonBuscarCaminos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonBuscarCaminos.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarCaminos.setText("Buscar caminos");
        botonBuscarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCaminosActionPerformed(evt);
            }
        });
        jPanel2.add(botonBuscarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        txtOrden.setBackground(new java.awt.Color(0, 0, 51));
        txtOrden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOrden.setForeground(new java.awt.Color(255, 255, 255));
        txtOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdenActionPerformed(evt);
            }
        });
        jPanel2.add(txtOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 150, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Asignar recorrido a la orden");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese id de la orden");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 360, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese id sucursal destino");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 360, -1, -1));

        txtIdDestino.setBackground(new java.awt.Color(0, 0, 51));
        txtIdDestino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtIdDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDestinoActionPerformed(evt);
            }
        });
        jPanel2.add(txtIdDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzul.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 480));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
            DefaultTableModel modelo =new DefaultTableModel();
            tablaOrdenes.setModel(modelo);

            Connection conex = conexion.conectar();
            PreparedStatement seleccion = conex.prepareStatement("select * from ordenprovision where estado = ?");
            seleccion.setString(1, "PENDIENTE");
            ResultSet consulta = seleccion.executeQuery();

            tablaOrdenes=new JTable(modelo);
            scroll3.setViewportView(tablaOrdenes);

            modelo.addColumn("idOrden");
            modelo.addColumn("idSucursalDestino");
            modelo.addColumn("tiempo");
            modelo.addColumn("fechadelaorden");
            modelo.addColumn("estado");

            while(consulta.next()){
                Object fila[]=new Object[5];

                for(int i=0;i<5;i++){
                    fila[i]=consulta.getObject(i+1);
                }
                modelo.addRow(fila);

            }

            conexion.cerrarConexion();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonBuscarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCaminosActionPerformed

       SucursalesconProductos2 sucursales;
        try {
            
            sucursales = new SucursalesconProductos2(Integer.parseInt(txtOrden.getText().trim()),Integer.parseInt(txtIdDestino.getText().trim()));
            sucursales.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsignarRecorrido.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }//GEN-LAST:event_botonBuscarCaminosActionPerformed

    private void txtOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdenActionPerformed
        
    }//GEN-LAST:event_txtOrdenActionPerformed

    private void txtIdDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDestinoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarCaminos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scroll3;
    private javax.swing.JTable tablaOrdenes;
    private javax.swing.JTextField txtIdDestino;
    private javax.swing.JTextField txtOrden;
    // End of variables declaration//GEN-END:variables
}
