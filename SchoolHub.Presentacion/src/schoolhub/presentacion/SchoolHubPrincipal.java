/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolhub.presentacion;

import java.awt.Point;
import mx.itson.SchoolHub.enumeradores.TipoUsuario;
import mx.itson.SchoolHub.entidades.Usuario;

/**
 *
 * @author Cristian
 */
public class SchoolHubPrincipal extends javax.swing.JFrame {
 int yMouse;
 int xMouse;
 
 
    public SchoolHubPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnagregarAsig.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTarea = new javax.swing.JLabel();
        lblConfiguracion = new javax.swing.JLabel();
        lblComentarios = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lbltipoUsuario = new javax.swing.JLabel();
        pnlConfiguracion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pnlTareas = new javax.swing.JPanel();
        lblTarea1 = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        lblTarea2 = new javax.swing.JLabel();
        lblFecha2 = new javax.swing.JLabel();
        lblTarea3 = new javax.swing.JLabel();
        lblFecha3 = new javax.swing.JLabel();
        lblTarea4 = new javax.swing.JLabel();
        lblFecha4 = new javax.swing.JLabel();
        btnagregarAsig = new javax.swing.JButton();
        lblFondo1 = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(867, 444));
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblTarea.setFont(new java.awt.Font("Earth Orbiter", 0, 24)); // NOI18N
        lblTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/pencil.png"))); // NOI18N
        lblTarea.setText("Tareas");
        lblTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTareaMouseClicked(evt);
            }
        });
        getContentPane().add(lblTarea);
        lblTarea.setBounds(10, 120, 170, 70);

        lblConfiguracion.setFont(new java.awt.Font("Earth Orbiter", 0, 24)); // NOI18N
        lblConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/cogwheel.png"))); // NOI18N
        lblConfiguracion.setText("Configuración");
        lblConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfiguracionMouseClicked(evt);
            }
        });
        getContentPane().add(lblConfiguracion);
        lblConfiguracion.setBounds(10, 280, 270, 70);

        lblComentarios.setFont(new java.awt.Font("Earth Orbiter", 0, 24)); // NOI18N
        lblComentarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/amplified-speaker.png"))); // NOI18N
        lblComentarios.setText("Comentarios");
        getContentPane().add(lblComentarios);
        lblComentarios.setBounds(10, 200, 203, 64);

        lblCerrarSesion.setFont(new java.awt.Font("Earth Orbiter", 0, 24)); // NOI18N
        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/cross.png"))); // NOI18N
        lblCerrarSesion.setText("Cerrar Sesión");
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(lblCerrarSesion);
        lblCerrarSesion.setBounds(10, 360, 270, 64);

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/user (2).png"))); // NOI18N
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(120, 10, 64, 64);

        lblNombreUsuario.setFont(new java.awt.Font("Earth Orbiter", 0, 24)); // NOI18N
        lblNombreUsuario.setText("nombre USUARIO");
        getContentPane().add(lblNombreUsuario);
        lblNombreUsuario.setBounds(30, 80, 240, 20);

        lbltipoUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lbltipoUsuario.setText("Tipo de usuario");
        getContentPane().add(lbltipoUsuario);
        lbltipoUsuario.setBounds(10, 30, 80, 14);

        pnlConfiguracion.setBackground(new java.awt.Color(0, 153, 0));

        jLabel5.setFont(new java.awt.Font("Earth Orbiter", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre :");

        jLabel6.setFont(new java.awt.Font("Earth Orbiter", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo :");

        jLabel7.setFont(new java.awt.Font("Earth Orbiter", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña :");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");

        jButton3.setText("Aceptar");

        javax.swing.GroupLayout pnlConfiguracionLayout = new javax.swing.GroupLayout(pnlConfiguracion);
        pnlConfiguracion.setLayout(pnlConfiguracionLayout);
        pnlConfiguracionLayout.setHorizontalGroup(
            pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConfiguracionLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(36, 36, 36))
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jPasswordField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConfiguracionLayout.setVerticalGroup(
            pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlConfiguracion);
        pnlConfiguracion.setBounds(310, 20, 20, 30);

        pnlTareas.setBackground(new java.awt.Color(0, 153, 0));
        pnlTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTarea1.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        lblTarea1.setForeground(new java.awt.Color(255, 255, 255));
        lblTarea1.setText("Lorem ipsum dolor sit amet");

        lblFecha1.setFont(new java.awt.Font("Terminator Two", 0, 11)); // NOI18N
        lblFecha1.setForeground(new java.awt.Color(240, 240, 240));
        lblFecha1.setText("Fecha de entrega : 10 / 10 / 9999 : 11:59 PM");

        lblTarea2.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        lblTarea2.setForeground(new java.awt.Color(255, 255, 255));
        lblTarea2.setText("Lorem ipsum dolor sit amet");

        lblFecha2.setFont(new java.awt.Font("Terminator Two", 0, 11)); // NOI18N
        lblFecha2.setForeground(new java.awt.Color(240, 240, 240));
        lblFecha2.setText("Fecha de entrega : 10 / 10 / 9999 : 11:59 PM");

        lblTarea3.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        lblTarea3.setForeground(new java.awt.Color(255, 255, 255));
        lblTarea3.setText("Lorem ipsum dolor sit amet");

        lblFecha3.setFont(new java.awt.Font("Terminator Two", 0, 11)); // NOI18N
        lblFecha3.setForeground(new java.awt.Color(240, 240, 240));
        lblFecha3.setText("Fecha de entrega : 10 / 10 / 9999 : 11:59 PM");

        lblTarea4.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        lblTarea4.setForeground(new java.awt.Color(255, 255, 255));
        lblTarea4.setText("Lorem ipsum dolor sit amet");

        lblFecha4.setFont(new java.awt.Font("Terminator Two", 0, 11)); // NOI18N
        lblFecha4.setForeground(new java.awt.Color(240, 240, 240));
        lblFecha4.setText("Fecha de entrega : 10 / 10 / 9999 : 11:59 PM");

        javax.swing.GroupLayout pnlTareasLayout = new javax.swing.GroupLayout(pnlTareas);
        pnlTareas.setLayout(pnlTareasLayout);
        pnlTareasLayout.setHorizontalGroup(
            pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTareasLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblFecha1)
                        .addComponent(lblTarea1))
                    .addGroup(pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblFecha2)
                        .addComponent(lblTarea2))
                    .addGroup(pnlTareasLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblFecha3))
                    .addGroup(pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblFecha4)
                        .addComponent(lblTarea4))
                    .addComponent(lblTarea3))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlTareasLayout.setVerticalGroup(
            pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTareasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTarea1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha1)
                .addGap(18, 18, 18)
                .addComponent(lblTarea2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha2)
                .addGap(18, 18, 18)
                .addComponent(lblTarea3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha3)
                .addGap(11, 11, 11)
                .addComponent(lblTarea4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha4)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTareas);
        pnlTareas.setBounds(380, 60, 410, 290);

        btnagregarAsig.setText("Crear asignacion");
        btnagregarAsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarAsigActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregarAsig);
        btnagregarAsig.setBounds(340, 400, 150, 23);

        lblFondo1.setBackground(new java.awt.Color(255, 255, 255));
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
        lblFondo1.setBounds(0, 0, 290, 450);

        lblFondo2.setBackground(new java.awt.Color(0, 153, 0));
        lblFondo2.setOpaque(true);
        getContentPane().add(lblFondo2);
        lblFondo2.setBounds(290, 0, 580, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfiguracionMouseClicked
  int w2 = pnlConfiguracion.getWidth();
  int h2 = pnlConfiguracion.getHeight();
        
        
        int w = pnlTareas.getWidth();
        int h = pnlTareas.getHeight();
        
      Point p1 = pnlTareas.getLocation();
      Point p2 = pnlConfiguracion.getLocation();
      
        pnlConfiguracion.setSize(w,h);
       // pnlConfiguracion.setBounds(300, 300, w, h);
       pnlConfiguracion.setLocation(p1);
        
      pnlTareas.setLocation(p1);
     
       pnlTareas.setSize(w2, h2);


    }//GEN-LAST:event_lblConfiguracionMouseClicked

    private void lblFondo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondo1MousePressed
    xMouse = evt.getX();
    yMouse = evt.getY(); 
    }//GEN-LAST:event_lblFondo1MousePressed

    private void lblFondo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondo1MouseDragged
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen(); 
    this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblFondo1MouseDragged

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        SchoolHubPresentacion SHP = new SchoolHubPresentacion();
        SHP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void lblTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTareaMouseClicked
        Usuario usuario = new Usuario();
        if(usuario.getTipoUsuario()==TipoUsuario.ALUMNO){
            SchoolHubTarea SHT = new SchoolHubTarea();
            SHT.setVisible(true);
        }    
        if(usuario.getTipoUsuario()==TipoUsuario.DOCENTE){
            
        }
    }//GEN-LAST:event_lblTareaMouseClicked

    private void btnagregarAsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarAsigActionPerformed
        // TODO add your handling code here:
        SchoolHubCrearTarea SHCT = new SchoolHubCrearTarea();
            SHCT.setVisible(true);
    }//GEN-LAST:event_btnagregarAsigActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(SchoolHubPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchoolHubPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchoolHubPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchoolHubPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchoolHubPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnagregarAsig;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblComentarios;
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblFecha2;
    private javax.swing.JLabel lblFecha3;
    private javax.swing.JLabel lblFecha4;
    private javax.swing.JLabel lblFondo1;
    public static javax.swing.JLabel lblFondo2;
    public static javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblTarea;
    private javax.swing.JLabel lblTarea1;
    private javax.swing.JLabel lblTarea2;
    private javax.swing.JLabel lblTarea3;
    private javax.swing.JLabel lblTarea4;
    private javax.swing.JLabel lblUsuario;
    public static javax.swing.JLabel lbltipoUsuario;
    public static javax.swing.JPanel pnlConfiguracion;
    public static javax.swing.JPanel pnlTareas;
    // End of variables declaration//GEN-END:variables
}
