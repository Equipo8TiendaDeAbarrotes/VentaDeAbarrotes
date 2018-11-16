/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uttt.edu.front.controller.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karlo
 */
public class VentaView extends javax.swing.JFrame {
DefaultTableModel modelo;
    /**
     * Creates new form VentaView
     */
    public VentaView() {
        initComponents();
        String cabecera[] = {"Producto", "Precio", "Cantidad","Subtotal","IVA","Total"};
        String datos[][][][][][] = {};
        modelo = new DefaultTableModel(datos, cabecera);
        jTable1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbProducto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnRealizarCompra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ventas.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 90));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        cmbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Producto", "Frijoles", "Paquete de salchicas", "Tostadas", "Crema 1/2", "1Lt de Leche", " " }));
        cmbProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProductoItemStateChanged(evt);
            }
        });
        cmbProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbProductoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Precio:");

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frijoles.jpg"))); // NOI18N
        lblImagen.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Producto:");

        txtPrecio.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad:");

        btnRealizarCompra.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnRealizarCompra.setText("Realizar compra");
        btnRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCompraActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Producto", "Precio", "Cantidad", "Subtotal", "IVA", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Agregar");
        jButton2.setMaximumSize(new java.awt.Dimension(587, 521));
        jButton2.setMinimumSize(new java.awt.Dimension(587, 521));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(121, 121, 121)
                .addComponent(jButton4)
                .addGap(127, 127, 127))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCantidad)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(cmbProducto, 0, 154, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtPrecio))
                                .addComponent(jLabel4)))
                        .addGap(60, 60, 60)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnRealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(427, 427, 427)
                    .addComponent(jButton6)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(lblImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6))
                    .addContainerGap(233, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 490, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbProductoMouseClicked
   
        
        
    }//GEN-LAST:event_cmbProductoMouseClicked

    private void cmbProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProductoItemStateChanged
        
          int indice = 0;

        indice = this.cmbProducto.getSelectedIndex();
        switch (indice) {
            case 0:
                txtPrecio.setText("");
               this.lblImagen.setIcon(new ImageIcon
                                ("C:\\Users\\karlo\\OneDrive\\Documentos\\4to CUATRIMESTRE\\DesarrolloAplicacionesll\\GitHub(TiendaDeAbarrotes)\\VentaDeAbarrotes\\TiendaDeAbarrotes\\src\\Imagenes\\blanco.jpg"));
                break;
            case 1:
                txtPrecio.setText("13");
                this.lblImagen.setIcon(new ImageIcon
                                ("C:\\Users\\karlo\\OneDrive\\Documentos\\4to CUATRIMESTRE\\DesarrolloAplicacionesll\\GitHub(TiendaDeAbarrotes)\\VentaDeAbarrotes\\TiendaDeAbarrotes\\src\\Imagenes\\frijoles.jpg"));
                break;
            case 2:
               txtPrecio.setText("23");
                this.lblImagen.setIcon(new ImageIcon
        ("C:\\Users\\karlo\\OneDrive\\Documentos\\4to CUATRIMESTRE\\DesarrolloAplicacionesll\\GitHub(TiendaDeAbarrotes)\\VentaDeAbarrotes\\TiendaDeAbarrotes\\src\\Imagenes\\salchichas.jpg"));
                break;
            case 3:
                  txtPrecio.setText("32");
                this.lblImagen.setIcon(new ImageIcon
        ("C:\\Users\\karlo\\OneDrive\\Documentos\\4to CUATRIMESTRE\\DesarrolloAplicacionesll\\GitHub(TiendaDeAbarrotes)\\VentaDeAbarrotes\\TiendaDeAbarrotes\\src\\Imagenes\\tostadas.jpg"));
                break;
            case 4:
                 txtPrecio.setText("15");
                this.lblImagen.setIcon(new ImageIcon
        ("C:\\Users\\karlo\\OneDrive\\Documentos\\4to CUATRIMESTRE\\DesarrolloAplicacionesll\\GitHub(TiendaDeAbarrotes)\\VentaDeAbarrotes\\TiendaDeAbarrotes\\src\\Imagenes\\cremaPeq.jpg"));
                break;
            case 5:
                 txtPrecio.setText("21");
                this.lblImagen.setIcon(new ImageIcon
        ("C:\\Users\\karlo\\OneDrive\\Documentos\\4to CUATRIMESTRE\\DesarrolloAplicacionesll\\GitHub(TiendaDeAbarrotes)\\VentaDeAbarrotes\\TiendaDeAbarrotes\\src\\Imagenes\\lechelitro.jpg"));
                break;
        }
        
    }//GEN-LAST:event_cmbProductoItemStateChanged

    private void btnRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCompraActionPerformed
               double subt=0.0,total=0.0,desc=0.0,dest=0.0;
    for (int i = 0; i < modelo.getRowCount(); i++) {
        total+=Double.parseDouble(modelo.getValueAt(i, 5).toString());
      
    }
  JOptionPane.showMessageDialog(null,"El total de su venta fue: " +total+"\nGracias por su compra vuelva pronto!!!!");
  modelo.removeRow(jTable1.getSelectedRow());
  this.txtCantidad.setText("");
        this.cmbProducto.setSelectedIndex(0);
        this.txtPrecio.setText("");
    }//GEN-LAST:event_btnRealizarCompraActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double p,c,pv,t,i;
        c=Double.parseDouble(this.txtCantidad.getText());
        p=Double.parseDouble(this.txtPrecio.getText());
        t=c*p;
        i=t*.16;
        pv=t*.16+t;
        String prod = (String.valueOf(this.cmbProducto.getSelectedItem()));
        String cantidad=txtCantidad.getText();
        Double sub=t;
        Double iv=i;
        Double Iva=pv;
        String precio=txtPrecio.getText();

        Object datos[] = {prod,cantidad,precio,sub,iv,Iva};
        modelo.addRow(datos);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.txtCantidad.setText("");
        this.cmbProducto.setSelectedIndex(0);
        this.txtPrecio.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        modelo.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizarCompra;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
