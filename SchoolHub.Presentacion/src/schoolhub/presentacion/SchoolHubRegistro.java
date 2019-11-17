/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolhub.presentacion;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import mx.itson.SchoolHub.enumeradores.TipoUsuario;
import mx.itson.SchoolHub.entidades.Usuario;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mx.itson.SchoolHub.controller.CursoController;
import mx.itson.SchoolHub.entidades.Curso;
import mx.itson.SchoolHub.controller.GsonController;
import mx.itson.SchoolHub.controller.FileController;
/**
 *
 * @author Cristian
 */
public class SchoolHubRegistro extends javax.swing.JFrame {
    
int xMouse;
int yMouse;
    
static Curso curso;

    public SchoolHubRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbCuenta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(557, 436));
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(158, 185, 250, 30);
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(158, 236, 250, 30);

        jLabel1.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(158, 165, 90, 15);

        jLabel2.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correo :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(158, 216, 90, 15);

        jLabel3.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de cuenta :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 330, 160, 15);

        cmbCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOCENTE", "ALUMNO" }));
        getContentPane().add(cmbCuenta);
        cmbCuenta.setBounds(300, 330, 110, 20);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(56, 34, 0, 0);

        jLabel5.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 270, 110, 15);
        getContentPane().add(txtContraseña);
        txtContraseña.setBounds(158, 287, 250, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/team.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(212, 11, 128, 128);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 370, 110, 23);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 370, 110, 23);

        lblFondo.setBackground(new java.awt.Color(34, 35, 38));
        lblFondo.setMaximumSize(new java.awt.Dimension(557, 436));
        lblFondo.setMinimumSize(new java.awt.Dimension(557, 436));
        lblFondo.setOpaque(true);
        lblFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblFondoMouseDragged(evt);
            }
        });
        lblFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFondoMousePressed(evt);
            }
        });
        getContentPane().add(lblFondo);
        lblFondo.setBounds(-6, -6, 570, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMouseDragged
         int x = evt.getXOnScreen();
    int y = evt.getYOnScreen(); 
    this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblFondoMouseDragged

    private void lblFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMousePressed
     xMouse = evt.getX();
  yMouse = evt.getY();     
    }//GEN-LAST:event_lblFondoMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtContraseña.getPassword().length !=0 && txtCorreo.getText().length()!=0 && txtNombre.getText().length()!=0){
        
            
        
        
        try {
            SchoolHubPresentacion SHP = new SchoolHubPresentacion();
            char[] pass = txtContraseña.getPassword();
            String passString = new String(pass);
            Usuario user = new Usuario(txtNombre.getText(), TipoUsuario.valueOf(cmbCuenta.getSelectedItem().toString()), txtCorreo.getText(), passString, 0);
            
            new CursoController().AddCursoAlumno(user);     
            SHP.setVisible(true);
            this.setVisible(false);
            
           
        } catch (IOException ex) {
        }
}else{
        JOptionPane.showMessageDialog(null, "Los campos solicitados no han sido completados totalmente", "Aviso", JOptionPane.INFORMATION_MESSAGE);

       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
               SchoolHubPresentacion SHP = new SchoolHubPresentacion();
        SHP.setVisible(true);
                        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SchoolHubRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchoolHubRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchoolHubRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchoolHubRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchoolHubRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCuenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
