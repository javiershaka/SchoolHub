/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolhub.presentacion;

import java.awt.Color;
import java.awt.Cursor;
import mx.itson.SchoolHub.enumeradores.TipoUsuario;
import mx.itson.SchoolHub.entidades.Usuario;
import static schoolhub.presentacion.SchoolHubCrearTarea.Descripcion1;
import static schoolhub.presentacion.SchoolHubCrearTarea.Descripcion2;
import static schoolhub.presentacion.SchoolHubCrearTarea.Descripcion3;
import static schoolhub.presentacion.SchoolHubCrearTarea.Descripcion4;
import static schoolhub.presentacion.SchoolHubCrearTarea.Fecha1;
import static schoolhub.presentacion.SchoolHubCrearTarea.Fecha2;
import static schoolhub.presentacion.SchoolHubCrearTarea.Fecha3;
import static schoolhub.presentacion.SchoolHubCrearTarea.Fecha4;
import static schoolhub.presentacion.SchoolHubCrearTarea.Tarea1;
import static schoolhub.presentacion.SchoolHubCrearTarea.Tarea2;
import static schoolhub.presentacion.SchoolHubCrearTarea.Tarea3;
import static schoolhub.presentacion.SchoolHubCrearTarea.Tarea4;
import static schoolhub.presentacion.SchoolHubPresentacion.SHPR;
import static schoolhub.presentacion.SchoolHubPresentacion.SHT;
import static schoolhub.presentacion.SchoolHubTarea.lblHora;
import static schoolhub.presentacion.SchoolHubTarea.lblNombreTarea;
import static schoolhub.presentacion.SchoolHubTarea.txaDescripcion;


/**
 *
 * @author Cristian
 */
public class SchoolHubPrincipal extends javax.swing.JFrame {
 int yMouse;
 int xMouse;
 
 boolean panel1 = true;
 boolean panel2 = false;
 static boolean tarea1 = false;
 static boolean tarea2 = false;
 static boolean tarea3 = false;
 static boolean tarea4 = false;
 

 
 
    public SchoolHubPrincipal() {
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

        lblTarea = new javax.swing.JLabel();
        lblCrearAsignacion = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltTareas = new javax.swing.JList<>();
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
        jLabel1 = new javax.swing.JLabel();
        pnlTareas = new javax.swing.JPanel();
        lblTarea1 = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        lblTarea2 = new javax.swing.JLabel();
        lblFecha2 = new javax.swing.JLabel();
        lblTarea3 = new javax.swing.JLabel();
        lblFecha3 = new javax.swing.JLabel();
        lblTarea4 = new javax.swing.JLabel();
        lblFecha4 = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(914, 444));
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblTarea.setFont(new java.awt.Font("Earth Orbiter", 0, 24)); // NOI18N
        lblTarea.setForeground(new java.awt.Color(255, 255, 255));
        lblTarea.setText("Tareas");
        lblTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTareaMouseClicked(evt);
            }
        });
        getContentPane().add(lblTarea);
        lblTarea.setBounds(90, 160, 110, 30);

        lblCrearAsignacion.setFont(new java.awt.Font("Earth Orbiter", 0, 24)); // NOI18N
        lblCrearAsignacion.setForeground(new java.awt.Color(255, 255, 255));
        lblCrearAsignacion.setText("CRear Asignacion");
        lblCrearAsignacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCrearAsignacionMouseMoved(evt);
            }
        });
        lblCrearAsignacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrearAsignacionMouseClicked(evt);
            }
        });
        getContentPane().add(lblCrearAsignacion);
        lblCrearAsignacion.setBounds(30, 120, 250, 25);

        lblCerrarSesion.setFont(new java.awt.Font("Earth Orbiter", 0, 18)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarSesion.setText("Cerrar Sesión");
        lblCerrarSesion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseMoved(evt);
            }
        });
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(lblCerrarSesion);
        lblCerrarSesion.setBounds(750, 10, 150, 20);

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/SchoolHub/imagenes/user (6).png"))); // NOI18N
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(410, 10, 64, 64);

        lblNombreUsuario.setFont(new java.awt.Font("Earth Orbiter", 0, 24)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setText("nombre USUARIO");
        lblNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(lblNombreUsuario);
        lblNombreUsuario.setBounds(320, 80, 240, 20);

        ltTareas.setBackground(new java.awt.Color(34, 35, 38));
        jScrollPane1.setViewportView(ltTareas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 200, 170, 190);

        lbltipoUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lbltipoUsuario.setText("Tipo de usuario");
        getContentPane().add(lbltipoUsuario);
        lbltipoUsuario.setBounds(30, 20, 80, 14);

        pnlConfiguracion.setBackground(new java.awt.Color(34, 35, 38));

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

        jLabel1.setFont(new java.awt.Font("Earth Orbiter", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONFIGURACION");

        javax.swing.GroupLayout pnlConfiguracionLayout = new javax.swing.GroupLayout(pnlConfiguracion);
        pnlConfiguracion.setLayout(pnlConfiguracionLayout);
        pnlConfiguracionLayout.setHorizontalGroup(
            pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jPasswordField1)))
                    .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlConfiguracionLayout.setVerticalGroup(
            pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
        pnlConfiguracion.setBounds(370, 150, 420, 250);

        pnlTareas.setBackground(new java.awt.Color(34, 35, 38));
        pnlTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTarea1.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        lblTarea1.setForeground(new java.awt.Color(255, 255, 255));
        lblTarea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTarea1MouseClicked(evt);
            }
        });

        lblFecha1.setFont(new java.awt.Font("Terminator Two", 0, 11)); // NOI18N
        lblFecha1.setForeground(new java.awt.Color(240, 240, 240));

        lblTarea2.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        lblTarea2.setForeground(new java.awt.Color(255, 255, 255));
        lblTarea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTarea2MouseClicked(evt);
            }
        });

        lblFecha2.setFont(new java.awt.Font("Terminator Two", 0, 11)); // NOI18N
        lblFecha2.setForeground(new java.awt.Color(240, 240, 240));

        lblTarea3.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        lblTarea3.setForeground(new java.awt.Color(255, 255, 255));
        lblTarea3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTarea3MouseClicked(evt);
            }
        });

        lblFecha3.setFont(new java.awt.Font("Terminator Two", 0, 11)); // NOI18N
        lblFecha3.setForeground(new java.awt.Color(240, 240, 240));

        lblTarea4.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        lblTarea4.setForeground(new java.awt.Color(255, 255, 255));
        lblTarea4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTarea4MouseClicked(evt);
            }
        });

        lblFecha4.setFont(new java.awt.Font("Terminator Two", 0, 11)); // NOI18N
        lblFecha4.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout pnlTareasLayout = new javax.swing.GroupLayout(pnlTareas);
        pnlTareas.setLayout(pnlTareasLayout);
        pnlTareasLayout.setHorizontalGroup(
            pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTareasLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFecha3)
                    .addGroup(pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFecha1)
                            .addComponent(lblTarea1))
                        .addGroup(pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFecha2)
                            .addComponent(lblTarea2))
                        .addGroup(pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFecha4)
                            .addComponent(lblTarea4))
                        .addComponent(lblTarea3)))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        pnlTareasLayout.setVerticalGroup(
            pnlTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTareasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTarea1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTarea2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTarea3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFecha3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTarea4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTareas);
        pnlTareas.setBounds(340, 400, 350, 20);

        lblFondo2.setBackground(new java.awt.Color(34, 35, 38));
        lblFondo2.setOpaque(true);
        lblFondo2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblFondo2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblFondo2MouseMoved(evt);
            }
        });
        lblFondo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFondo2MousePressed(evt);
            }
        });
        getContentPane().add(lblFondo2);
        lblFondo2.setBounds(-10, 0, 930, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
//        SchoolHubPresentacion SHP = new SchoolHubPresentacion();
        SHPR.setVisible(true);
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

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void lblNombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreUsuarioMouseClicked
//lblTarea1.setText("Hola que hace we xddddddddddd");
    }//GEN-LAST:event_lblNombreUsuarioMouseClicked

    private void lblTarea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTarea1MouseClicked
        tarea1 = true;
        tarea2 = false;
        tarea3 = false;
        tarea4 = false;
        lblNombreTarea.setText(Tarea1);
       txaDescripcion.setText(Descripcion1);
       lblHora.setText(Fecha1);
                SHT.setVisible(true);
    }//GEN-LAST:event_lblTarea1MouseClicked

    private void lblTarea2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTarea2MouseClicked
      lblNombreTarea.setText(Tarea2);
      tarea1 = false;
        tarea2 = true;
        tarea3 = false;
        tarea4 = false;
       txaDescripcion.setText(Descripcion2);
       lblHora.setText(Fecha2);
       SHT.setVisible(true);
    }//GEN-LAST:event_lblTarea2MouseClicked

    private void lblTarea3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTarea3MouseClicked
       lblNombreTarea.setText(Tarea3);
       tarea1 = false;
        tarea2 = false;
        tarea3 = true;
        tarea4 = false;
       txaDescripcion.setText(Descripcion3);
       lblHora.setText(Fecha3);
       SHT.setVisible(true);
    }//GEN-LAST:event_lblTarea3MouseClicked

    private void lblTarea4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTarea4MouseClicked
        lblNombreTarea.setText(Tarea4);
        tarea1 = false;
        tarea2 = false;
        tarea3 = false;
        tarea4 = true;
       txaDescripcion.setText(Descripcion4);
       lblHora.setText(Fecha4);
       SHT.setVisible(true);
    }//GEN-LAST:event_lblTarea4MouseClicked

    private void lblCrearAsignacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearAsignacionMouseClicked
   SchoolHubCrearTarea SHCT = new SchoolHubCrearTarea();
            SHCT.setVisible(true);
    }//GEN-LAST:event_lblCrearAsignacionMouseClicked

    private void lblFondo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondo2MousePressed
       xMouse = evt.getX();
    yMouse = evt.getY(); 
        
        
        
        
    }//GEN-LAST:event_lblFondo2MousePressed

    private void lblFondo2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondo2MouseDragged
int x = evt.getXOnScreen();
    int y = evt.getYOnScreen(); 
    this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblFondo2MouseDragged

    private void lblFondo2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondo2MouseMoved
       lblCrearAsignacion.setForeground(Color.WHITE);
       lblCerrarSesion.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblFondo2MouseMoved

    private void lblCrearAsignacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearAsignacionMouseMoved
        lblCrearAsignacion.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        lblCrearAsignacion.setForeground(Color.BLUE);
        lblCerrarSesion.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblCrearAsignacionMouseMoved

    private void lblCerrarSesionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseMoved
        lblCerrarSesion.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        lblCerrarSesion.setForeground(Color.BLUE);
        lblCrearAsignacion.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblCerrarSesionMouseMoved

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCerrarSesion;
    public static javax.swing.JLabel lblCrearAsignacion;
    public static javax.swing.JLabel lblFecha1;
    public static javax.swing.JLabel lblFecha2;
    public static javax.swing.JLabel lblFecha3;
    public static javax.swing.JLabel lblFecha4;
    public static javax.swing.JLabel lblFondo2;
    public static javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblTarea;
    public static javax.swing.JLabel lblTarea1;
    public static javax.swing.JLabel lblTarea2;
    public static javax.swing.JLabel lblTarea3;
    public static javax.swing.JLabel lblTarea4;
    private javax.swing.JLabel lblUsuario;
    public static javax.swing.JLabel lbltipoUsuario;
    private javax.swing.JList<String> ltTareas;
    public static javax.swing.JPanel pnlConfiguracion;
    public static javax.swing.JPanel pnlTareas;
    // End of variables declaration//GEN-END:variables
}
