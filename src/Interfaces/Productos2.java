package Interfaces;

import Clases.Producto;
import DAO.Conexion;
import DAO.DAOProductoImplementacion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Productos2 extends javax.swing.JFrame {

    Conexion conexion = Conexion.getInstancia();

    private Object producto;

    private void limpiar() {

        txtPrecio.setText("");
        txtPeso.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
    }
    @Override
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logTp2-P.png"));
        return retValue;
    }
   
    public Productos2() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menu Productos");
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooserBeanInfo1 = new com.toedter.calendar.JDayChooserBeanInfo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        listarCaminos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCaminos = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar Nombre del Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 33, 169, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar descripcion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 33, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(0, 0, 51));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 198, 200));

        txtNombre.setBackground(new java.awt.Color(0, 0, 51));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 67, 148, 32));

        txtPrecio.setBackground(new java.awt.Color(0, 0, 51));
        txtPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 151, 148, 32));

        txtPeso.setBackground(new java.awt.Color(0, 0, 51));
        txtPeso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(255, 255, 255));
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 235, 148, 32));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar peso");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 201, 130, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresar precio unitario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 117, -1, -1));

        BotonAgregar.setBackground(new java.awt.Color(0, 0, 51));
        BotonAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BotonAgregar.setText("Agregar Producto");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 285, -1, 43));

        jLabel5.setBackground(new java.awt.Color(0, 0, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresar id producto a modificar/eliminar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        txtId.setBackground(new java.awt.Color(0, 0, 51));
        txtId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 148, 32));

        BotonModificar.setBackground(new java.awt.Color(0, 0, 51));
        BotonModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonModificar.setForeground(new java.awt.Color(255, 255, 255));
        BotonModificar.setText("Modificar Producto");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, 43));

        BotonEliminar.setBackground(new java.awt.Color(0, 0, 51));
        BotonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setText("Eliminar Producto");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, 43));

        listarCaminos.setBackground(new java.awt.Color(0, 0, 51));
        listarCaminos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listarCaminos.setForeground(new java.awt.Color(255, 255, 255));
        listarCaminos.setText("Listar Productos");
        listarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(listarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, 43));

        tablaCaminos.setBackground(new java.awt.Color(0, 0, 51));
        tablaCaminos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaCaminos.setForeground(new java.awt.Color(255, 255, 255));
        tablaCaminos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdProducto", "Nombre", "Descripcion", "Precio", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCaminos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 20, 490, 418));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzul.png"))); // NOI18N
        fondo.setText("jLabel6");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed

        DAOProductoImplementacion productoDAO = new DAOProductoImplementacion();
        Producto prod = new Producto();

        String nombre = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        int peso = Integer.parseInt(txtPeso.getText());
        double precio = Double.parseDouble(txtPrecio.getText());

        prod.setNombre(nombre);
        prod.setDescripcion(descripcion);
        prod.setPeso(peso);
        prod.setPrecio(precio);

        productoDAO.Registrar(prod);
        JOptionPane.showMessageDialog(null, "Registro exitoso");

        limpiar();
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        DAOProductoImplementacion productoDAO = new DAOProductoImplementacion();
        Producto prod = new Producto();
        if (txtNombre.getText().equals("") || txtDescripcion.getText().equals("") || txtPeso.getText().equals("") || txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
        } else {
            String nombre = txtNombre.getText();
            String descripcion = txtDescripcion.getText();
            int peso = Integer.parseInt(txtPeso.getText());
            double precio = Double.parseDouble(txtPrecio.getText());
            int id = Integer.parseInt(txtId.getText());

            prod.setId(id);
            prod.setNombre(nombre);
            prod.setDescripcion(descripcion);
            prod.setPeso(peso);
            prod.setPrecio(precio);

            productoDAO.modificar(prod);
            limpiar();
            JOptionPane.showMessageDialog(null, "Producto modficado");
        }
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        DAOProductoImplementacion productoDAO = new DAOProductoImplementacion();
        Producto prod = new Producto();
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Id a eliminar");
        } else {
            int id = Integer.parseInt(txtId.getText());
            prod.setId(id);
            productoDAO.eliminar(prod);
            limpiar();
            JOptionPane.showMessageDialog(null, "Producto eliminado");
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void listarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCaminosActionPerformed
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tablaCaminos.setModel(modelo);

            Connection conex = conexion.conectar();
            PreparedStatement seleccion = conex.prepareStatement("select * from producto");
            ResultSet consulta = seleccion.executeQuery();

            tablaCaminos = new JTable(modelo);
            jScrollPane1.setViewportView(tablaCaminos);

            modelo.addColumn("Id Producto");
            modelo.addColumn("Nombre");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Precio");
            modelo.addColumn("Peso");

            while (consulta.next()) {
                Object fila[] = new Object[5];

                for (int i = 0; i < 5; i++) {
                    fila[i] = consulta.getObject(i + 1);
                }
                modelo.addRow(fila);

            }

            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_listarCaminosActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JLabel fondo;
    private com.toedter.calendar.JDayChooserBeanInfo jDayChooserBeanInfo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listarCaminos;
    private javax.swing.JTable tablaCaminos;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
