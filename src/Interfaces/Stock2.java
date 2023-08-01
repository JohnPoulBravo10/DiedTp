

package Interfaces;

import DAO.Conexion;
import DAO.DAOSucursalesImplementacion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Stock2 extends javax.swing.JFrame {

    Conexion conexion =  Conexion.getInstancia();
    
    public Stock2() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Control de stock");
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

        jLabel1 = new javax.swing.JLabel();
        txtIdSucursal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        EliminarProducto = new javax.swing.JButton();
        AgregarProducto = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        ListarProductos = new javax.swing.JButton();
        ModificarCantidad = new javax.swing.JButton();
        ListarSucursales = new javax.swing.JButton();
        scroll1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        scroll2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        ListarSucursales1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSucu = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar  id Sucursal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtIdSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingresar  id producto ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));
        getContentPane().add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar cantidad ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, -1));

        EliminarProducto.setBackground(new java.awt.Color(0, 0, 51));
        EliminarProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        EliminarProducto.setText("Eliminar Producto");
        EliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(EliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, 40));

        AgregarProducto.setBackground(new java.awt.Color(0, 0, 51));
        AgregarProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        AgregarProducto.setText("Agregar Producto");
        AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 160, 40));

        Buscar.setBackground(new java.awt.Color(0, 0, 51));
        Buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar Sucursal");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 40));

        ListarProductos.setBackground(new java.awt.Color(0, 0, 51));
        ListarProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListarProductos.setForeground(new java.awt.Color(255, 255, 255));
        ListarProductos.setText("Listar Productos");
        ListarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarProductosActionPerformed(evt);
            }
        });
        getContentPane().add(ListarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 40));

        ModificarCantidad.setBackground(new java.awt.Color(0, 0, 51));
        ModificarCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ModificarCantidad.setForeground(new java.awt.Color(255, 255, 255));
        ModificarCantidad.setText("Modificar Cantidad");
        ModificarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(ModificarCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 170, 40));

        ListarSucursales.setBackground(new java.awt.Color(0, 0, 51));
        ListarSucursales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListarSucursales.setForeground(new java.awt.Color(255, 255, 255));
        ListarSucursales.setText("Listar Sucursales");
        ListarSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarSucursalesActionPerformed(evt);
            }
        });
        getContentPane().add(ListarSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 40));

        tabla1.setBackground(new java.awt.Color(0, 0, 51));
        tabla1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla1.setForeground(new java.awt.Color(255, 255, 255));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "IdSucursal", "IdProducto", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scroll1.setViewportView(tabla1);

        getContentPane().add(scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 470, 180));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 80, -1));

        tabla2.setBackground(new java.awt.Color(0, 0, 51));
        tabla2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabla2.setForeground(new java.awt.Color(255, 255, 255));
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        scroll2.setViewportView(tabla2);

        getContentPane().add(scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 380, 340));

        ListarSucursales1.setBackground(new java.awt.Color(0, 0, 51));
        ListarSucursales1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListarSucursales1.setForeground(new java.awt.Color(255, 255, 255));
        ListarSucursales1.setText("Actualizar");
        ListarSucursales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarSucursales1ActionPerformed(evt);
            }
        });
        getContentPane().add(ListarSucursales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Productos en la sucursal:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 170, -1));

        txtSucu.setBackground(new java.awt.Color(0, 0, 51));
        txtSucu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSucu.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtSucu, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 40, 20));

        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSucursalActionPerformed

    private void EliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProductoActionPerformed
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement eliminar = conectar.prepareStatement("delete from stock_sucursales where idSucursal = ? and idproducto = ?");
            String idString =txtIdSucursal.getText();
            int prod= Integer.parseInt(txtIdProducto.getText());
            int id=Integer.parseInt(idString);
            eliminar.setInt(1,id);
            eliminar.setInt(2, prod);
            eliminar.executeUpdate();

            
            JOptionPane.showMessageDialog(null,"Eliminado con exito");
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error bd" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EliminarProductoActionPerformed

    private void AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductoActionPerformed

        try {
            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement("insert into stock_sucursales values(?,?,?,?)");

            String idString = txtIdSucursal.getText()+txtIdProducto.getText();
            int id=Integer.parseInt(idString);

            insertar.setInt(1, id);
            insertar.setInt(2, Integer.parseInt(txtIdSucursal.getText()));
            insertar.setInt(3,Integer.parseInt(txtIdProducto.getText()));
            insertar.setInt(4, Integer.parseInt(txtCantidad.getText()));
            insertar.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Agregado con exito");
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("error" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AgregarProductoActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        try {
            DefaultTableModel modelo1 = new DefaultTableModel();
            tabla2.setModel(modelo1);

            Connection conex = conexion.conectar();
            PreparedStatement seleccion1 = conex.prepareStatement("select idproducto,cantidad from stock_sucursales where idsucursal = ?");

            seleccion1.setInt(1, Integer.parseInt(txtIdSucursal.getText()));
            ResultSet consulta1 = seleccion1.executeQuery();

            tabla2 = new JTable(modelo1);
            scroll2.setViewportView(tabla2);

            modelo1.addColumn("Id Producto");
            modelo1.addColumn("Cantidad");

            txtSucu.setText(txtIdSucursal.getText());

            while (consulta1.next()) {
                Object fila[] = new Object[2];

                for (int i = 0; i < 2; i++) {
                    fila[i] = consulta1.getObject(i + 1);
                }
                modelo1.addRow(fila);

            }

            conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void ListarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarProductosActionPerformed

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tabla1.setModel(modelo);

            Connection conex = conexion.conectar();
            PreparedStatement seleccion = conex.prepareStatement("select * from producto");
            ResultSet consulta = seleccion.executeQuery();

            tabla1 = new JTable(modelo);
            scroll1.setViewportView(tabla1);

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
    }//GEN-LAST:event_ListarProductosActionPerformed

    private void ModificarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarCantidadActionPerformed
        
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement modificar = conectar.prepareStatement("update stock_sucursales set cantidad = ? where idsucursal = ? and idproducto = ?");

            modificar.setInt(1, Integer.parseInt(txtCantidad.getText()));
            modificar.setInt(2, Integer.parseInt(txtIdSucursal.getText()));
            modificar.setInt(3, Integer.parseInt(txtIdProducto.getText()));            
            modificar.executeUpdate();
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null,"Modificado con exito");
        } catch (SQLException e) {
            System.out.println("error" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSucursalesImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ModificarCantidadActionPerformed

    private void ListarSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarSucursalesActionPerformed
        try{
            DefaultTableModel modelo =new DefaultTableModel();
            tabla1.setModel(modelo);

            Connection conex = conexion.conectar();
            PreparedStatement seleccion = conex.prepareStatement("select * from sucursal");
            ResultSet consulta = seleccion.executeQuery();

            tabla1=new JTable(modelo);
            scroll1.setViewportView(tabla1);

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
    }//GEN-LAST:event_ListarSucursalesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ListarSucursales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarSucursales1ActionPerformed
        BuscarActionPerformed(evt);
    }//GEN-LAST:event_ListarSucursales1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarProducto;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton EliminarProducto;
    private javax.swing.JButton ListarProductos;
    private javax.swing.JButton ListarSucursales;
    private javax.swing.JButton ListarSucursales1;
    private javax.swing.JButton ModificarCantidad;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdSucursal;
    private javax.swing.JLabel txtSucu;
    // End of variables declaration//GEN-END:variables
}
