/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.conexion;
import java.awt.Toolkit;
import javax.swing.WindowConstants;

/**
 *
 * @author ricar
 */
public class Administrador extends javax.swing.JFrame {

    String user, nombre_usuario;
    public static int sesion_usuario;
    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
        user = login.user;
        sesion_usuario = 1;
        
        setTitle("Administrador");
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Administrador = Sesion de " + user);
        setSize(650,500);
        //metodo que evita que se ejecute cuando la interfaz sea cerrada
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
        
        
        //Imagen agregar usuario
        ImageIcon imagen = new ImageIcon("src/imagenes/usuario.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(registrar_usuario.getWidth(), 
                registrar_usuario.getHeight(), Image.SCALE_DEFAULT));
        registrar_usuario.setIcon(icono);
        this.repaint();
        
        //imagen gestionar usuario
        ImageIcon gestionar = new ImageIcon("src/imagenes/gestionar_user.png");
        Icon icono_gestionar = new ImageIcon(gestionar.getImage().getScaledInstance(gestionar_user.getWidth(), 
                gestionar_user.getHeight(), Image.SCALE_DEFAULT));
        gestionar_user.setIcon(icono_gestionar);
        this.repaint();
        
        //imagen capturar usuario
        ImageIcon capturar = new ImageIcon("src/imagenes/capturista.png");
        Icon icono_capturar = new ImageIcon(capturar.getImage().getScaledInstance(capturista.getWidth(), 
                capturista.getHeight(), Image.SCALE_DEFAULT));
        capturista.setIcon(icono_capturar);
        this.repaint();
        
        //imgaen configuracion
        ImageIcon configuration = new ImageIcon("src/imagenes/configuracion.png");
        Icon icono_configuration = new ImageIcon(configuration.getImage().getScaledInstance(gestionar_user.getWidth(), 
                gestionar_user.getHeight(), Image.SCALE_DEFAULT));
        configuracion.setIcon(icono_configuration);
        this.repaint();
        
        //imagaen cerrar sesión
         ImageIcon Img_cerrar_sesion = new ImageIcon("src/imagenes/apagado.png");
        Icon icono_cerrar_sesion = new ImageIcon(Img_cerrar_sesion.getImage().getScaledInstance(cerrar_sesion.getWidth(), 
                cerrar_sesion.getHeight(), Image.SCALE_DEFAULT));
        cerrar_sesion.setIcon(icono_cerrar_sesion);
        this.repaint();
        
        try {
            Connection cn = conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select nombre_usuario from usuarios where username = '" + user +  "'");
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                nombre_usuario = rs.getString("nombre_usuario");
                nom_usuario.setText(nombre_usuario);
            }
        } catch (Exception e) {
            System.err.println("Error  de conexion desde la interfaz Administrador");
        }
        
        
    }
    
    //Imagen de icono (aún no aparece)
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/usuario.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        ColorFondo = new javax.swing.JPanel();
        registrar_usuario = new javax.swing.JButton();
        nom_usuario = new javax.swing.JLabel();
        capturista = new javax.swing.JButton();
        gestionar_user = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cerrar_sesion = new javax.swing.JButton();
        configuracion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ColorFondo.setBackground(new java.awt.Color(204, 204, 204));

        registrar_usuario.setText("agregar_user");
        registrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_usuarioActionPerformed(evt);
            }
        });

        nom_usuario.setBackground(new java.awt.Color(204, 204, 204));
        nom_usuario.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N

        capturista.setText("capturar");
        capturista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capturistaActionPerformed(evt);
            }
        });

        gestionar_user.setText("gestionar_user");
        gestionar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionar_userActionPerformed(evt);
            }
        });

        jButton3.setText("boton");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cerrar_sesion.setText("jButton1");
        cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesionActionPerformed(evt);
            }
        });

        configuracion.setText("configuracion");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Agregar Usuario");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Gestionar Usuario");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Capturista");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Configuracion");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Cerrar sesión");

        javax.swing.GroupLayout ColorFondoLayout = new javax.swing.GroupLayout(ColorFondo);
        ColorFondo.setLayout(ColorFondoLayout);
        ColorFondoLayout.setHorizontalGroup(
            ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColorFondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(nom_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ColorFondoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ColorFondoLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ColorFondoLayout.createSequentialGroup()
                        .addGroup(ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(registrar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ColorFondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addGroup(ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ColorFondoLayout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ColorFondoLayout.createSequentialGroup()
                                .addComponent(gestionar_user, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(capturista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98))))
        );
        ColorFondoLayout.setVerticalGroup(
            ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColorFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nom_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ColorFondoLayout.createSequentialGroup()
                        .addGroup(ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(capturista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gestionar_user, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(58, 58, 58)
                        .addComponent(configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        getContentPane().add(ColorFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void gestionar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionar_userActionPerformed
        // TODO add your handling code here:
        new gestionar_usuario().setVisible(true);
    }//GEN-LAST:event_gestionar_userActionPerformed

    private void capturistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capturistaActionPerformed
        // TODO add your handling code here:
        Capturista cp = new Capturista();
        cp.setVisible(true);
    }//GEN-LAST:event_capturistaActionPerformed

    private void registrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_usuarioActionPerformed
        // TODO add your handling code here:
        new registrar_usuarios().setVisible(true);
    }//GEN-LAST:event_registrar_usuarioActionPerformed

    private void cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesionActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_cerrar_sesionActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ColorFondo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton capturista;
    private javax.swing.JButton cerrar_sesion;
    private javax.swing.JButton configuracion;
    private javax.swing.JButton gestionar_user;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel nom_usuario;
    private javax.swing.JButton registrar_usuario;
    // End of variables declaration//GEN-END:variables
}
