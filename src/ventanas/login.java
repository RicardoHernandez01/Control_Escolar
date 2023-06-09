/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class login extends javax.swing.JFrame {

    public static String user = "";
    String pass = "";
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        setResizable(false);
        setSize(400, 490);
        setLocationRelativeTo(null);
        setTitle("Acceso al sistema");
        
        //imagen de logo
        logo.setSize(108, 108);
        ImageIcon imagen = new ImageIcon("src/imagenes/usuario.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), 
                logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(icono);
        this.repaint();
        
    }
    
    //Imagen de icono (aún no aparece)
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logotipo.png"));
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

        Color_Fondo = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        acceder = new javax.swing.JButton();
        contrasenia = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Color_Fondo.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("Contraseña");

        usuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        acceder.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        acceder.setText("Acceder");
        acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederActionPerformed(evt);
            }
        });

        contrasenia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        contrasenia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Color_FondoLayout = new javax.swing.GroupLayout(Color_Fondo);
        Color_Fondo.setLayout(Color_FondoLayout);
        Color_FondoLayout.setHorizontalGroup(
            Color_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Color_FondoLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(Color_FondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Color_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(contrasenia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Color_FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(Color_FondoLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Color_FondoLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Color_FondoLayout.setVerticalGroup(
            Color_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Color_FondoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(Color_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederActionPerformed
        // TODO add your handling code here:
         user = usuario.getText().trim();
        pass = contrasenia.getText().trim();
        //contraseña
        
        if(!user.equals("")||! pass.equals("")){
            
        /* 
        //
        }else if(!user.equals("Admi")&& !pass.equals("Admi")){
            
            JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecta");
            
        }else if(!user.equals("") || !pass.equals("")){
        */
            
           try {
                Connection cn = conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                    "select tipo_nivel, estatus from usuarios where username = '" + user
                        + "' and password = '" + pass + "'");
                
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    
                    String tipo_nivel = rs.getString("tipo_nivel");
                    String estatus = rs.getString("estatus");
                    
                    if(tipo_nivel.equals("Administrador") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Administrador().setVisible(true);
                        
                    } else if(tipo_nivel.equals("Capturista") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Capturista().setVisible(true);
                        
                    }else if(tipo_nivel.equals("Visualizador") && estatus.equalsIgnoreCase("Activo")){
                        
                        dispose();
                        new Visualizador().setVisible(true);
                        
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Datos de acceso incorrectos");
                    usuario.setText("");
                    contrasenia.setText("");

                }
                
            } catch (SQLException e) {
                System.err.println("Error en el boton Acceder"+ e);
                JOptionPane.showMessageDialog(null,"Error al iniciar sesion, Contacte al administrador");
                
            }
        } else {
            JOptionPane.showMessageDialog(null,"Debes rellenar todos los campos");
        }   
    }//GEN-LAST:event_accederActionPerformed

    private void contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseniaActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Color_Fondo;
    private javax.swing.JButton acceder;
    private javax.swing.JPasswordField contrasenia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
