/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolhub.presentacion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import mx.itson.SchoolHub.entidades.Curso;
import static schoolhub.presentacion.SchoolHubRegistro.curso;
import static schoolhub.presentacion.SchoolHubPrincipal.pnlConfiguracion;
import static schoolhub.presentacion.SchoolHubPrincipal.pnlTareas;
import static schoolhub.presentacion.SchoolHubPrincipal.lblCrearAsignacion;

/**
 *
 * @author Cristian
 */
public class SchoolHubPresentacion extends javax.swing.JFrame {

    public static SchoolHubRegistro SHR = new SchoolHubRegistro();
    public static SchoolHubPrincipal SHP = new SchoolHubPrincipal();
    public static SchoolHubPresentacion SHPR = new SchoolHubPresentacion();
    public static SchoolHubTarea SHT = new SchoolHubTarea();
    int xMouse;
    int xMouse2;
    int yMouse;
    int yMouse2;

    /**
     * Creates new form SchoolHubPresentacion
     */
    public SchoolHubPresentacion() {
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

        lblLogo1 = new javax.swing.JLabel();
        lblLogo2 = new javax.swing.JLabel();
        lblLogo3 = new javax.swing.JLabel();
        lblAlumno = new javax.swing.JLabel();
        lblMaestro = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        lblEslogan = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSignin = new javax.swing.JLabel();
        lblFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(821, 417));
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblLogo1.setFont(new java.awt.Font("Cracked Code", 0, 48)); // NOI18N
        lblLogo1.setForeground(new java.awt.Color(240, 240, 240));
        lblLogo1.setText("SCHOOL");
        getContentPane().add(lblLogo1);
        lblLogo1.setBounds(30, 20, 270, 60);

        lblLogo2.setFont(new java.awt.Font("Cracked Code", 0, 48)); // NOI18N
        lblLogo2.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo2.setText("HUB");
        getContentPane().add(lblLogo2);
        lblLogo2.setBounds(150, 90, 150, 60);

        lblLogo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/hacking.png"))); // NOI18N
        getContentPane().add(lblLogo3);
        lblLogo3.setBounds(60, 80, 70, 70);

        lblAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/user.png"))); // NOI18N
        getContentPane().add(lblAlumno);
        lblAlumno.setBounds(510, 40, 140, 130);

        lblMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/user (1).png"))); // NOI18N
        getContentPane().add(lblMaestro);
        lblMaestro.setBounds(660, 40, 130, 128);

        lblNombre.setFont(new java.awt.Font("Earth Orbiter", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Usuario ");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(620, 210, 90, 20);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(560, 240, 210, 30);
        getContentPane().add(txtContraseña);
        txtContraseña.setBounds(560, 310, 210, 30);

        lblPassword.setFont(new java.awt.Font("Earth Orbiter", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(600, 280, 130, 19);

        lblEslogan.setFont(new java.awt.Font("Earth Orbiter", 2, 24)); // NOI18N
        lblEslogan.setForeground(new java.awt.Color(255, 255, 255));
        lblEslogan.setText("-- gETTING STUFF DONE;");
        getContentPane().add(lblEslogan);
        lblEslogan.setBounds(70, 260, 340, 50);

        lblLogin.setFont(new java.awt.Font("Earth Orbiter", 3, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Iniciar Sesión");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        getContentPane().add(lblLogin);
        lblLogin.setBounds(490, 380, 180, 20);

        lblSignin.setFont(new java.awt.Font("Earth Orbiter", 3, 18)); // NOI18N
        lblSignin.setForeground(new java.awt.Color(255, 255, 255));
        lblSignin.setText("Registrarse");
        lblSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSigninMouseClicked(evt);
            }
        });
        getContentPane().add(lblSignin);
        lblSignin.setBounds(670, 380, 140, 20);

        lblFondo1.setBackground(new java.awt.Color(34, 35, 38));
        lblFondo1.setForeground(new java.awt.Color(0, 51, 153));
        lblFondo1.setOpaque(true);
        lblFondo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblFondo1MouseDragged(evt);
            }
        });
        lblFondo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFondo1MousePressed(evt);
            }
        });
        getContentPane().add(lblFondo1);
        lblFondo1.setBounds(0, 0, 820, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSigninMouseClicked
        SHR.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_lblSigninMouseClicked

    private void lblFondo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondo1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);


    }//GEN-LAST:event_lblFondo1MouseDragged

    private void lblFondo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondo1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lblFondo1MousePressed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        try {
            File archivo = new File("Usuarios.txt");
            boolean ventana = false;

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            if (archivo.exists()) {
                BufferedReader rb = new BufferedReader(new FileReader("Usuarios.txt"));
                curso = gson.fromJson(rb, Curso.class);
                char[] pass = txtContraseña.getPassword();
                String passString = new String(pass);

                for (int var = 0; var < curso.getUsuario().size(); var++) {

                    if (txtUsuario.getText().equals(curso.getUsuario().get(var).getCorreo()) && passString.equals(curso.getUsuario().get(var).getContraseñaUsuario())) {
                        SchoolHubPrincipal.lblNombreUsuario.setText(curso.getUsuario().get(var).getNombre());
                        SchoolHubPrincipal.lbltipoUsuario.setText(curso.getUsuario().get(var).getTipoUsuario().toString());
                        if (curso.getUsuario().get(var).getTipoUsuario().toString().equals("DOCENTE")) {
                          
                            
                      
                         lblCrearAsignacion.setVisible(true); 
                        }else{
                        lblCrearAsignacion.setVisible(false);
                            
              
                        }

                        SHP.setVisible(true);
                        this.setVisible(false);
                        ventana = true;
                        break;
                    }
                }
                if (ventana == false) {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "NO hay usuarios registrados", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_lblLoginMouseClicked

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
            java.util.logging.Logger.getLogger(SchoolHubPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchoolHubPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchoolHubPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchoolHubPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchoolHubPresentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblEslogan;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel lblLogo3;
    private javax.swing.JLabel lblMaestro;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignin;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
