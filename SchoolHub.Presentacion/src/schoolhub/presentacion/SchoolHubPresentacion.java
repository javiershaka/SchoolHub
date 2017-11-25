/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolhub.presentacion;

/**
 *
 * @author Cristian
 */
public class SchoolHubPresentacion extends javax.swing.JFrame {

    /**
     * Creates new form SchoolHubPresentacion
     */
    public SchoolHubPresentacion() {
        initComponents();
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
        pdfContraseña = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        lblEslogan = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSignin = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();
        lblFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblLogo1.setFont(new java.awt.Font("HACKED", 0, 70)); // NOI18N
        lblLogo1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo1.setText("School");
        getContentPane().add(lblLogo1);
        lblLogo1.setBounds(70, 20, 204, 60);

        lblLogo2.setFont(new java.awt.Font("HACKED", 0, 70)); // NOI18N
        lblLogo2.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo2.setText("Hub");
        getContentPane().add(lblLogo2);
        lblLogo2.setBounds(180, 80, 110, 60);

        lblLogo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/hacking.png"))); // NOI18N
        getContentPane().add(lblLogo3);
        lblLogo3.setBounds(100, 80, 70, 70);

        lblAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/user.png"))); // NOI18N
        getContentPane().add(lblAlumno);
        lblAlumno.setBounds(510, 40, 140, 130);

        lblMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/user (1).png"))); // NOI18N
        getContentPane().add(lblMaestro);
        lblMaestro.setBounds(660, 40, 130, 128);

        lblNombre.setFont(new java.awt.Font("Earth Orbiter", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Usuario :");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(480, 210, 120, 20);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(560, 240, 210, 20);
        getContentPane().add(pdfContraseña);
        pdfContraseña.setBounds(560, 310, 210, 20);

        lblPassword.setFont(new java.awt.Font("Earth Orbiter", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña :");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(480, 280, 140, 19);

        lblEslogan.setFont(new java.awt.Font("Earth Orbiter", 2, 24)); // NOI18N
        lblEslogan.setForeground(new java.awt.Color(255, 255, 255));
        lblEslogan.setText("-- gETTING STUFF DONE;");
        getContentPane().add(lblEslogan);
        lblEslogan.setBounds(70, 260, 340, 50);

        lblLogin.setFont(new java.awt.Font("Earth Orbiter", 3, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Iniciar Sesión");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(490, 380, 180, 20);

        lblSignin.setFont(new java.awt.Font("Earth Orbiter", 3, 18)); // NOI18N
        lblSignin.setForeground(new java.awt.Color(255, 255, 255));
        lblSignin.setText("Registrarse");
        getContentPane().add(lblSignin);
        lblSignin.setBounds(670, 380, 140, 20);

        lblFondo2.setBackground(new java.awt.Color(0, 153, 0));
        lblFondo2.setOpaque(true);
        getContentPane().add(lblFondo2);
        lblFondo2.setBounds(470, 0, 360, 420);

        lblFondo1.setBackground(new java.awt.Color(0, 102, 204));
        lblFondo1.setForeground(new java.awt.Color(0, 51, 153));
        lblFondo1.setOpaque(true);
        getContentPane().add(lblFondo1);
        lblFondo1.setBounds(0, 0, 470, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel lblLogo3;
    private javax.swing.JLabel lblMaestro;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignin;
    private javax.swing.JPasswordField pdfContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
