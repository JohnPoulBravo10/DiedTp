
package Interfaces;

import DAO.DAOSucursalesImplementacion;
import Clases.Sucursal;
import DAO.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Sucursales2 extends javax.swing.JFrame {

    Conexion conexion =  Conexion.getInstancia();
    
    
    private Object sucursal;

    private void limpiar(){
        txtNombre.setText("");
        txtId.setText("");
    }
    
    public Sucursales2() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menu Sucursales");
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

        jDayChooserBeanInfo1 = new com.toedter.calendar.JDayChooserBeanInfo();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCierre = new com.toedter.calendar.JSpinnerDateEditor();
        txtApertura1 = new com.toedter.calendar.JSpinnerDateEditor();
        BotonEstado = new javax.swing.JComboBox<>();
        BotonEliminar = new javax.swing.JButton();
        BotonAgregar = new javax.swing.JButton();
        BotonModifica = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSucursales = new javax.swing.JTable();
        listarSucursales = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        txtNombre.setBackground(new java.awt.Color(0, 0, 51));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 148, 32));

        txtId.setBackground(new java.awt.Color(0, 0, 51));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 148, 32));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar Horario Cierre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresar Horario Apertura");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtCierre.setBackground(new java.awt.Color(0, 0, 51));
        txtCierre.setForeground(new java.awt.Color(255, 255, 255));
        txtCierre.setDate(new java.util.Date(1688004973000L));
        txtCierre.setDateFormatString("HH:mm:ss");
        txtCierre.setMaxSelectableDate(new java.util.Date(253370779273000L));
        getContentPane().add(txtCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, 32));

        txtApertura1.setBackground(new java.awt.Color(0, 0, 51));
        txtApertura1.setForeground(new java.awt.Color(255, 255, 255));
        txtApertura1.setDate(new java.util.Date(1688004973000L));
        txtApertura1.setDateFormatString("HH:mm:ss");
        txtApertura1.setMaxSelectableDate(new java.util.Date(253370779273000L));
        getContentPane().add(txtApertura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 32));

        BotonEstado.setBackground(new java.awt.Color(0, 0, 51));
        BotonEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonEstado.setForeground(new java.awt.Color(255, 255, 255));
        BotonEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operativa", "No Operativa" }));
        getContentPane().add(BotonEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 124, 40));

        BotonEliminar.setBackground(new java.awt.Color(0, 0, 51));
        BotonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setText("Eliminar Sucursal");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, 43));

        BotonAgregar.setBackground(new java.awt.Color(0, 0, 51));
        BotonAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BotonAgregar.setText("Agregar Sucursal");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, 43));

        BotonModifica.setBackground(new java.awt.Color(0, 0, 51));
        BotonModifica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonModifica.setForeground(new java.awt.Color(255, 255, 255));
        BotonModifica.setText("Modificar Sucursal");
        BotonModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 43));

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        tablaSucursales.setBackground(new java.awt.Color(0, 0, 51));
        tablaSucursales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaSucursales.setForeground(new java.awt.Color(255, 255, 255));
        tablaSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Hora Apertura", "Hora Cierre", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaSucursales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 510, 240));

        listarSucursales.setBackground(new java.awt.Color(0, 0, 51));
        listarSucursales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listarSucursales.setForeground(new java.awt.Color(255, 255, 255));
        listarSucursales.setText("Listar Sucursales");
        listarSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarSucursalesActionPerformed(evt);
            }
        });
        getContentPane().add(listarSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 150, 40));

        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed

        DAOSucursalesImplementacion sucursalDAO =new DAOSucursalesImplementacion();
        Sucursal sucu = new Sucursal();

        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        String estado;

        if (BotonEstado.getSelectedIndex() == 0) {
            estado = "Operativa";
        } else {
            estado = "No Operativa";
        }

        Time horarioApertura = new Time(0, 0, 0);
        Date horarioA = txtApertura1.getDate();
        horarioApertura.setTime(horarioA.getTime());

        Time horarioCierre = new Time(0, 0, 0);
        Date horarioC = txtCierre.getDate();
        horarioCierre.setTime(horarioC.getTime());

        sucu.setId(id);
        sucu.setNombre(nombre);
        sucu.setEstado(estado);
        sucu.setHoraApertura(horarioApertura);
        sucu.setHoraCierre(horarioCierre);

        sucursalDAO.Registrar(sucu);
        JOptionPane.showMessageDialog(null, "Registro exitoso");

        limpiar();
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void BotonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificaActionPerformed
        DAOSucursalesImplementacion sucursalDAO =new DAOSucursalesImplementacion();
        Sucursal sucu = new Sucursal();
        if(txtId.getText().equals("") || txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor complete todos los campos");
        }else{
            int id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            String estado;

            if (BotonEstado.getSelectedIndex() == 0) {
                estado = "Operativa";
            } else {
                estado = "No Operativa";
            }

            Time horarioApertura = new Time(0, 0, 0);
            Date horarioA = txtApertura1.getDate();
            horarioApertura.setTime(horarioA.getTime());

            Time horarioCierre = new Time(0, 0, 0);
            Date horarioC = txtCierre.getDate();
            horarioCierre.setTime(horarioC.getTime());

            sucu.setId(id);
            sucu.setNombre(nombre);
            sucu.setEstado(estado);
            sucu.setHoraApertura(horarioApertura);
            sucu.setHoraCierre(horarioCierre);

            sucursalDAO.modificar(sucu);
            limpiar();
            JOptionPane.showMessageDialog(null,"Sucursal modficada");
        }
    }//GEN-LAST:event_BotonModificaActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        DAOSucursalesImplementacion sucursalDAO =new DAOSucursalesImplementacion();
        Sucursal sucu = new Sucursal();
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese Id a eliminar");
        }else{
            int id = Integer.parseInt(txtId.getText());
            sucu.setId(id);
            sucursalDAO.eliminar(sucu);
            limpiar();
            JOptionPane.showMessageDialog(null,"Sucursal eliminada");
        }

    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void listarSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarSucursalesActionPerformed
        try{
            DefaultTableModel modelo =new DefaultTableModel();
            tablaSucursales.setModel(modelo);

            Connection conex = conexion.conectar();
            PreparedStatement seleccion = conex.prepareStatement("select * from sucursal");
            ResultSet consulta = seleccion.executeQuery();

            tablaSucursales=new JTable(modelo);
            jScrollPane1.setViewportView(tablaSucursales);

            modelo.addColumn("idSucursal");
            modelo.addColumn("Nombre");
            modelo.addColumn("HorarioApertura");
            modelo.addColumn("HorarioCierre");
            modelo.addColumn("Estado");

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
    }//GEN-LAST:event_listarSucursalesActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JComboBox<String> BotonEstado;
    private javax.swing.JButton BotonModifica;
    private javax.swing.JLabel fondo;
    private com.toedter.calendar.JDayChooserBeanInfo jDayChooserBeanInfo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listarSucursales;
    private javax.swing.JTable tablaSucursales;
    private com.toedter.calendar.JSpinnerDateEditor txtApertura1;
    private com.toedter.calendar.JSpinnerDateEditor txtCierre;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
