package Interfaces;

import Clases.Camino;
import DAO.Conexion;
import DAO.DAOCaminoImplementacion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Caminos2 extends javax.swing.JFrame {

    Conexion conexion = Conexion.getInstancia();

    private Object camino;

    private void limpiar() {
        txtIdDestino.setText("");
        txtTiempo.setText("");
        txtCapacidad.setText("");
        txtIdOrigen.setText("");
        txtId.setText("");
    }
    @Override
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logTp2-P.png"));
        return retValue;
    }

  
    public Caminos2() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menu Caminos");
        setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooserBeanInfo1 = new com.toedter.calendar.JDayChooserBeanInfo();
        jLabel1 = new javax.swing.JLabel();
        txtIdOrigen = new javax.swing.JTextField();
        txtIdDestino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BotonEstado = new javax.swing.JComboBox<>();
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
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar Id sucursal Origen");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, -1));

        txtIdOrigen.setBackground(new java.awt.Color(0, 0, 51));
        txtIdOrigen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtIdOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, -1));

        txtIdDestino.setBackground(new java.awt.Color(0, 0, 51));
        txtIdDestino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtIdDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 190, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar id sucursal Destino");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 40, 200, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar capacidad maxima");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));

        txtCapacidad.setBackground(new java.awt.Color(0, 0, 51));
        txtCapacidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCapacidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 180, 180, -1));

        txtTiempo.setBackground(new java.awt.Color(0, 0, 51));
        txtTiempo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 255, 255));
        txtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 190, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresar tiempo de transito");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 200, -1));

        BotonEstado.setBackground(new java.awt.Color(0, 0, 51));
        BotonEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonEstado.setForeground(new java.awt.Color(255, 255, 255));
        BotonEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operativa", "No Operativa" }));
        getContentPane().add(BotonEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 120, -1));

        BotonAgregar.setBackground(new java.awt.Color(0, 0, 51));
        BotonAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BotonAgregar.setText("Agregar Camino");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 150, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresar id camino a modificar/eliminar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 360, 260, -1));

        txtId.setBackground(new java.awt.Color(0, 0, 51));
        txtId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 396, 110, 40));

        BotonModificar.setBackground(new java.awt.Color(0, 0, 51));
        BotonModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonModificar.setForeground(new java.awt.Color(255, 255, 255));
        BotonModificar.setText("Modificar Camino");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 447, 150, 40));

        BotonEliminar.setBackground(new java.awt.Color(0, 0, 51));
        BotonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setText("Eliminar Camino");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 447, 150, 40));

        listarCaminos.setBackground(new java.awt.Color(0, 0, 51));
        listarCaminos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listarCaminos.setForeground(new java.awt.Color(255, 255, 255));
        listarCaminos.setText("Listar Caminos");
        listarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(listarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 160, 40));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tablaCaminos.setBackground(new java.awt.Color(0, 0, 51));
        tablaCaminos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaCaminos.setForeground(new java.awt.Color(255, 255, 255));
        tablaCaminos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "IdCamino", "Id Sucursal Origen", "Id Sucursal Destino", "Tiempo del recorrido", "Capacidad Maxima", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCaminos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 40, 390, 380));

        fondo.setBackground(new java.awt.Color(0, 0, 51));
        fondo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzul.png"))); // NOI18N
        fondo.setText("jLabel6");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdOrigenActionPerformed

    private void txtIdDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDestinoActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void txtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed

        DAOCaminoImplementacion caminoDAO = new DAOCaminoImplementacion();
        Camino cam = new Camino();

        int idOrigen = Integer.parseInt(txtIdOrigen.getText());
        int idDestino = Integer.parseInt(txtIdDestino.getText());
        int capacidadMaxima = Integer.parseInt(txtCapacidad.getText());
        int tiempoTransito = Integer.parseInt(txtTiempo.getText());
        String idString=txtIdOrigen.getText()+txtIdDestino.getText();
        int id=Integer.parseInt(idString);
        String estado;

        if (BotonEstado.getSelectedIndex() == 0) {
            estado = "Operativa";
        } else {
            estado = "No Operativa";
        }
        cam.setId(id);
        cam.setIdSucursalOrigen(idOrigen);
        cam.setIdSucursalDestino(idDestino);
        cam.setTiempoTransito(tiempoTransito);
        cam.setCapacidadMaxima(capacidadMaxima);
        cam.setEstado(estado);

        caminoDAO.Registrar(cam);

        limpiar();
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        DAOCaminoImplementacion caminoDAO = new DAOCaminoImplementacion();
        Camino cam = new Camino();
        if (txtIdOrigen.getText().equals("") || txtIdDestino.getText().equals("") || txtCapacidad.getText().equals("") || txtTiempo.getText().equals("") || txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
        } else {
            int idOrigen = Integer.parseInt(txtIdOrigen.getText());
            int idDestino = Integer.parseInt(txtIdDestino.getText());
            int capacidadMaxima = Integer.parseInt(txtCapacidad.getText());
            int tiempoTransito = Integer.parseInt(txtTiempo.getText());
            String estado;
            int id = Integer.parseInt(txtId.getText());
            if (BotonEstado.getSelectedIndex() == 0) {
                estado = "Operativa";
            } else {
                estado = "No Operativa";
            }

            cam.setId(id);
            cam.setIdSucursalOrigen(idOrigen);
            cam.setIdSucursalDestino(idDestino);
            cam.setTiempoTransito(tiempoTransito);
            cam.setCapacidadMaxima(capacidadMaxima);
            cam.setEstado(estado);

            caminoDAO.modificar(cam);
            limpiar();

        }
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        DAOCaminoImplementacion caminoDAO = new DAOCaminoImplementacion();
        Camino cam = new Camino();
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Id a eliminar");
        } else {
            int id = Integer.parseInt(txtId.getText());
            cam.setId(id);
            caminoDAO.eliminar(cam);
            limpiar();

        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void listarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCaminosActionPerformed
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tablaCaminos.setModel(modelo);

            Connection conex = conexion.conectar();
            PreparedStatement seleccion = conex.prepareStatement("select * from camino");
            ResultSet consulta = seleccion.executeQuery();

            tablaCaminos = new JTable(modelo);
            jScrollPane1.setViewportView(tablaCaminos);

            modelo.addColumn("Id Camino");
            modelo.addColumn("Id Sucursal Origen");
            modelo.addColumn("Id Sucursal Destino");
            modelo.addColumn("Tiempo de Transito");
            modelo.addColumn("Capacidad maxima");
            modelo.addColumn("Estado");

            while (consulta.next()) {
                Object fila[] = new Object[6];

                for (int i = 0; i < 6; i++) {
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
    private javax.swing.JComboBox<String> BotonEstado;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JLabel fondo;
    private com.toedter.calendar.JDayChooserBeanInfo jDayChooserBeanInfo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listarCaminos;
    private javax.swing.JTable tablaCaminos;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdDestino;
    private javax.swing.JTextField txtIdOrigen;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
