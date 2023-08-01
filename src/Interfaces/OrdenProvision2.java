
package Interfaces;

import DAO.Conexion;
import DAO.DAOSucursalesImplementacion;
import java.awt.Image;
import java.awt.Toolkit;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;



public class OrdenProvision2 extends javax.swing.JFrame {

    Conexion conexion =  Conexion.getInstancia();
    public OrdenProvision2() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Orden Provision");
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

        jLabel2 = new javax.swing.JLabel();
        txtIdSucursalDestino = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BotonRegistrarOrden = new javax.swing.JButton();
        BotonRegistrarOrden1 = new javax.swing.JButton();
        botonEliminarProductos = new javax.swing.JButton();
        botonAgregarProductos = new javax.swing.JButton();
        txtIdProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtOrden = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        botonActualizar = new javax.swing.JButton();
        botonOrdenes = new javax.swing.JButton();
        scroll3 = new javax.swing.JScrollPane();
        tablaOrdenes = new javax.swing.JTable();
        scroll4 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese id Sucursal Destino");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 42, -1, 30));

        txtIdSucursalDestino.setBackground(new java.awt.Color(0, 0, 51));
        txtIdSucursalDestino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdSucursalDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtIdSucursalDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSucursalDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdSucursalDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 78, 141, 31));

        txtTiempo.setBackground(new java.awt.Color(0, 0, 51));
        txtTiempo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 255, 255));
        txtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 165, 141, 31));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese tiempo de recepcion ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 127, -1, 30));

        BotonRegistrarOrden.setBackground(new java.awt.Color(0, 0, 51));
        BotonRegistrarOrden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonRegistrarOrden.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarOrden.setText("Registrar orden");
        BotonRegistrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegistrarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        BotonRegistrarOrden1.setBackground(new java.awt.Color(0, 0, 51));
        BotonRegistrarOrden1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonRegistrarOrden1.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarOrden1.setText("Eliminar orden");
        BotonRegistrarOrden1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarOrden1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegistrarOrden1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        botonEliminarProductos.setBackground(new java.awt.Color(0, 0, 51));
        botonEliminarProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonEliminarProductos.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarProductos.setText("Eliminar producto de la orden");
        botonEliminarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProductosActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 240, -1));

        botonAgregarProductos.setBackground(new java.awt.Color(0, 0, 51));
        botonAgregarProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonAgregarProductos.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarProductos.setText("Agregar producto a la orden");
        botonAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProductosActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 240, -1));

        txtIdProducto.setBackground(new java.awt.Color(0, 0, 51));
        txtIdProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 78, 103, 31));

        jLabel5.setBackground(new java.awt.Color(0, 0, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese Orden");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, 30));

        txtOrden.setBackground(new java.awt.Color(0, 0, 51));
        txtOrden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOrden.setForeground(new java.awt.Color(255, 255, 255));
        txtOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(txtOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 78, 103, 31));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese id producto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 42, -1, 30));

        txtCantidad.setBackground(new java.awt.Color(0, 0, 51));
        txtCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 103, 31));

        botonActualizar.setBackground(new java.awt.Color(0, 0, 51));
        botonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizar.setText("Actualizar lista de productos de la orden");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        botonOrdenes.setBackground(new java.awt.Color(0, 0, 51));
        botonOrdenes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonOrdenes.setForeground(new java.awt.Color(255, 255, 255));
        botonOrdenes.setText("Listar Ordenes");
        botonOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenesActionPerformed(evt);
            }
        });
        getContentPane().add(botonOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 416, -1, -1));

        tablaOrdenes.setBackground(new java.awt.Color(0, 0, 51));
        tablaOrdenes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaOrdenes.setForeground(new java.awt.Color(255, 255, 255));
        tablaOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdOrden", "idSucursalDestino", "tiempoEsperado", "idListaProductos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scroll3.setViewportView(tablaOrdenes);

        getContentPane().add(scroll3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 265, 261, 139));

        tablaProductos.setBackground(new java.awt.Color(0, 0, 51));
        tablaProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaProductos.setForeground(new java.awt.Color(255, 255, 255));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "IdOrden", "idProducto", "idCantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scroll4.setViewportView(tablaProductos);

        getContentPane().add(scroll4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 224, 378, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzul.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdSucursalDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSucursalDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSucursalDestinoActionPerformed

    private void txtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoActionPerformed

    private void BotonRegistrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarOrdenActionPerformed
        if(txtIdSucursalDestino.getText().equals("") || txtTiempo.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"Complete los campos\nidOrden\nidSucursalDestino\ntiempo");
        }else{
            try {
                Connection conectar = conexion.conectar();
                PreparedStatement insertar = conectar.prepareStatement("insert into ordenprovision values(?,?,?,?,?)");

                int idSucursal=Integer.parseInt(txtIdSucursalDestino.getText());

                Timestamp horaActual = new Timestamp(System.currentTimeMillis());
                insertar.setInt(1, 0);
                insertar.setInt(2,idSucursal);
                insertar.setInt(3,Integer.parseInt(txtTiempo.getText()));
                insertar.setTimestamp(4,horaActual);
                insertar.setString(5,"PENDIENTE");
                insertar.executeUpdate();

                JOptionPane.showMessageDialog(null,"Orden registrada con exito");
                conexion.cerrarConexion();
            } catch (SQLException e) {
                System.out.println("error" + e);
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(OrdenProvision2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } 
        }

    }//GEN-LAST:event_BotonRegistrarOrdenActionPerformed

    private void BotonRegistrarOrden1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarOrden1ActionPerformed
        if(txtOrden.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Complete el campo:\nidOrden\nY/O veriffique que existe la orden");
        }else{
            try {
                Connection conectar = conexion.conectar();
                PreparedStatement eliminar = conectar.prepareStatement("delete from ordenprovision where idorden = ? ");
                String idString =txtOrden.getText();
                int id=Integer.parseInt(idString);
                eliminar.setInt(1,id);
                eliminar.executeUpdate();

                JOptionPane.showMessageDialog(null,"Eliminado con exito");
                conexion.cerrarConexion();
            } catch (SQLException e) {
                System.out.println("error bd" + e);
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(OrdenProvision2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } }
    }//GEN-LAST:event_BotonRegistrarOrden1ActionPerformed

    private void botonEliminarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProductosActionPerformed
        if(txtOrden.getText().equals("") || txtIdProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Complete el campo:\nidOrden\nidProducto\nY/O veriffique que existe la orden");
        }else{
            try {
                Connection conectar = conexion.conectar();
                PreparedStatement eliminar = conectar.prepareStatement("delete from detallesorden where idorden = ? and idProducto = ?");

                eliminar.setInt(1,Integer.parseInt(txtOrden.getText()));
                eliminar.setInt(2,Integer.parseInt(txtIdProducto.getText()));
                eliminar.executeUpdate();

                JOptionPane.showMessageDialog(null,"Eliminado con exito");

                conexion.cerrarConexion();
            } catch (SQLException e) {
                System.out.println("error bd" + e);
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(OrdenProvision2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } }
    }//GEN-LAST:event_botonEliminarProductosActionPerformed

    private void botonAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductosActionPerformed

        if(txtIdSucursalDestino.getText().equals("") || txtOrden.getText().equals("") || txtIdProducto.getText().equals("") || txtCantidad.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Complete los campos:\nidproducto\ncantidad\nidOrden\nidSucursalDestino\nY/O veriffique que existe la orden");
        }else{
            try {
                Connection conectar = conexion.conectar();
                PreparedStatement insertar = conectar.prepareStatement("insert into detallesorden values(?,?,?,?)");

                String id = txtOrden.getText()+txtIdProducto.getText();
                int idInt = Integer.parseInt(id);
                insertar.setInt(1,idInt );
                insertar.setInt(2, Integer.parseInt(txtOrden.getText()));
                insertar.setInt(3,Integer.parseInt(txtIdProducto.getText()));
                insertar.setInt(4, Integer.parseInt(txtCantidad.getText()));
                insertar.executeUpdate();

                conexion.cerrarConexion();
                JOptionPane.showMessageDialog(null,"Producto Agregado con exito");
            } catch (SQLException e) {
                System.out.println("error" + e);
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(OrdenProvision2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_botonAgregarProductosActionPerformed

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void txtOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrdenActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        if(txtIdSucursalDestino.getText().equals("") || txtOrden.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"Complete los campos:\nidSucursalDestino\nidOrden");
        }else{
            try{
                DefaultTableModel modelo =new DefaultTableModel();
                tablaProductos.setModel(modelo);

                Connection conex = conexion.conectar();
                PreparedStatement seleccion = conex.prepareStatement("select * from detallesorden where idorden = ?");
                seleccion.setInt(1, Integer.parseInt(txtOrden.getText()));
                ResultSet consulta = seleccion.executeQuery();

                tablaProductos=new JTable(modelo);
                scroll4.setViewportView(tablaProductos);

                modelo.addColumn("id");
                modelo.addColumn("idOrden");
                modelo.addColumn("idProducto");
                modelo.addColumn("cantidad");

                while(consulta.next()){
                    Object fila[]=new Object[4];

                    for(int i=0;i<4;i++){
                        fila[i]=consulta.getObject(i+1);
                    }
                    modelo.addRow(fila);

                }

                conexion.cerrarConexion();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenesActionPerformed

        try{
            DefaultTableModel modelo =new DefaultTableModel();
            tablaOrdenes.setModel(modelo);

            Connection conex = conexion.conectar();
            PreparedStatement seleccion = conex.prepareStatement("select * from ordenprovision");
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

    }//GEN-LAST:event_botonOrdenesActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrarOrden;
    private javax.swing.JButton BotonRegistrarOrden1;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregarProductos;
    private javax.swing.JButton botonEliminarProductos;
    private javax.swing.JButton botonOrdenes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane scroll3;
    private javax.swing.JScrollPane scroll4;
    private javax.swing.JTable tablaOrdenes;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdSucursalDestino;
    private javax.swing.JTextField txtOrden;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
