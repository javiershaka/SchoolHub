/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolhub.presentacion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.SchoolHub.entidades.Asignacion;
import mx.itson.SchoolHub.entidades.Curso;
import mx.itson.SchoolHub.enumeradores.TiempoEngrega;
import mx.itson.SchoolHub.enumeradores.TipoAsignacion;
import static schoolhub.presentacion.SchoolHubRegistro.curso;

/**
 *
 * @author Cristian
 */
public class SchoolHubCrearTarea extends javax.swing.JFrame {

    public static String Tarea1;
    public static String Tarea2;
    public static String Tarea3;
    public static String Tarea4;
    public static String Descripcion1;
    public static String Descripcion2;
    public static String Descripcion3;
    public static String Descripcion4;
    public static String Fecha1;
    public static String Fecha2;
    public static String Fecha3;
    public static String Fecha4;
    int yMouse;
    int xMouse;
    DefaultTableModel model;
    /**
     * Creates new form SchoolHubCrearTarea
     */
    public SchoolHubCrearTarea() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtnombreAsig = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblNombreTarea2 = new javax.swing.JLabel();
        txtMaximo = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcion2 = new javax.swing.JTextArea();
        cmbTipo = new javax.swing.JComboBox<>();
        cmbDia = new javax.swing.JComboBox<>();
        cmdMes = new javax.swing.JComboBox<>();
        cmbAño = new javax.swing.JComboBox<>();
        lblEntrega = new javax.swing.JLabel();
        rbsi = new javax.swing.JRadioButton();
        rbno = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblHora2 = new javax.swing.JLabel();
        lblHoraLimite = new javax.swing.JLabel();
        cmbHora = new javax.swing.JComboBox<>();
        cmbMinuto = new javax.swing.JComboBox<>();
        cmbTiempo = new javax.swing.JComboBox<>();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(415, 503));
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(txtnombreAsig);
        txtnombreAsig.setBounds(220, 30, 170, 30);

        lblTipo.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("TIPO DE ASIGNACION :");
        getContentPane().add(lblTipo);
        lblTipo.setBounds(30, 70, 180, 19);

        lblDescripcion.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Descripción :");
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(30, 270, 120, 19);

        lblNombreTarea2.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        lblNombreTarea2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreTarea2.setText("Nombre de Asignación :");
        getContentPane().add(lblNombreTarea2);
        lblNombreTarea2.setBounds(30, 30, 190, 20);

        txtMaximo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##0"))));
        getContentPane().add(txtMaximo);
        txtMaximo.setBounds(250, 230, 60, 40);

        txaDescripcion2.setColumns(20);
        txaDescripcion2.setRows(5);
        jScrollPane1.setViewportView(txaDescripcion2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 370, 150);

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASIGNACION", "TAREA", "ACTIVIDAD" }));
        getContentPane().add(cmbTipo);
        cmbTipo.setBounds(220, 70, 120, 20);

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(cmbDia);
        cmbDia.setBounds(140, 110, 50, 20);

        cmdMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(cmdMes);
        cmdMes.setBounds(210, 110, 70, 20);

        cmbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2017", "2018" }));
        getContentPane().add(cmbAño);
        cmbAño.setBounds(300, 110, 80, 20);

        lblEntrega.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        lblEntrega.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrega.setText("Entrega después de fecha limite :");
        getContentPane().add(lblEntrega);
        lblEntrega.setBounds(30, 190, 280, 19);

        buttonGroup1.add(rbsi);
        rbsi.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        rbsi.setForeground(new java.awt.Color(255, 255, 255));
        rbsi.setSelected(true);
        rbsi.setText("Si");
        rbsi.setOpaque(false);
        getContentPane().add(rbsi);
        rbsi.setBounds(310, 190, 40, 20);

        buttonGroup1.add(rbno);
        rbno.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        rbno.setForeground(new java.awt.Color(255, 255, 255));
        rbno.setText("No");
        rbno.setOpaque(false);
        getContentPane().add(rbno);
        rbno.setBounds(350, 190, 50, 20);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(180, 450, 71, 23);

        jLabel1.setBackground(new java.awt.Color(34, 35, 38));
        jLabel1.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALIFICACION MAXIMA :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 230, 200, 19);

        lblHora2.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        lblHora2.setForeground(new java.awt.Color(255, 255, 255));
        lblHora2.setText("Fecha Limite:");
        getContentPane().add(lblHora2);
        lblHora2.setBounds(30, 110, 120, 19);

        lblHoraLimite.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        lblHoraLimite.setForeground(new java.awt.Color(255, 255, 255));
        lblHoraLimite.setText("HORA LIMITE :");
        getContentPane().add(lblHoraLimite);
        lblHoraLimite.setBounds(30, 150, 120, 20);

        cmbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" }));
        getContentPane().add(cmbHora);
        cmbHora.setBounds(150, 150, 50, 20);

        cmbMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "56", "57", "58", "59" }));
        getContentPane().add(cmbMinuto);
        cmbMinuto.setBounds(210, 150, 50, 20);

        cmbTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        getContentPane().add(cmbTiempo);
        cmbTiempo.setBounds(270, 150, 50, 20);

        lblFondo.setBackground(new java.awt.Color(34, 35, 38));
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
        lblFondo.setBounds(-4, -5, 420, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(txtnombreAsig.getText().length()!=0 && txtMaximo.getText().length()!=0 && txaDescripcion2.getText().length()!=0){
        boolean tareacerra = false;
        
//        if (lblTarea1.getText().isEmpty()) {
//            lblTarea1.setText(txtnombreAsig.getText());
//            Tarea1 = txtnombreAsig.getText();
//            Fecha1 = cmbDia.getSelectedItem().toString() + "/" + cmdMes.getSelectedItem().toString() + "/" + cmbAño.getSelectedItem().toString();
//            Descripcion1 = txaDescripcion2.getText();
//            lblFecha1.setText("Fecha de entrega: " + cmbDia.getSelectedItem().toString() + "/" + cmdMes.getSelectedItem().toString() + "/" + cmbAño.getSelectedItem().toString());
//        } else if (lblTarea2.getText().isEmpty()) {
//            Tarea2 = txtnombreAsig.getText();
//            Fecha2 = cmbDia.getSelectedItem().toString() + "/" + cmdMes.getSelectedItem().toString() + "/" + cmbAño.getSelectedItem().toString();
//            Descripcion2 = txaDescripcion2.getText();
//            lblTarea2.setText(txtnombreAsig.getText());
//            lblFecha2.setText("Fecha de entrega: " + cmbDia.getSelectedItem().toString() + "/" + cmdMes.getSelectedItem().toString() + "/" + cmbAño.getSelectedItem().toString());
//        } else if (lblTarea3.getText().isEmpty()) {
//            Tarea3 = txtnombreAsig.getText();
//            Fecha3 = cmbDia.getSelectedItem().toString() + "/" + cmdMes.getSelectedItem().toString() + "/" + cmbAño.getSelectedItem().toString();
//            Descripcion3 = txaDescripcion2.getText();
//            lblTarea3.setText(txtnombreAsig.getText());
//            lblFecha3.setText("Fecha de entrega: " + cmbDia.getSelectedItem().toString() + "/" + cmdMes.getSelectedItem().toString() + "/" + cmbAño.getSelectedItem().toString());
//        } else if (lblTarea4.getText().isEmpty()) {
//            Tarea4 = txtnombreAsig.getText();
//            Fecha4 = cmbDia.getSelectedItem().toString() + "/" + cmdMes.getSelectedItem().toString() + "/" + cmbAño.getSelectedItem().toString();
//            Descripcion4 = txaDescripcion2.getText();
//            lblTarea4.setText(txtnombreAsig.getText());
//            lblFecha4.setText("Fecha de entrega: " + cmbDia.getSelectedItem().toString() + "/" + cmdMes.getSelectedItem().toString() + "/" + cmbAño.getSelectedItem().toString());
//        }
//        lblTarea1.setText(txtnombreAsig.getText());
//        lblFecha1.setText("Fecha de entrega: "+cmbDia.getSelectedItem().toString()+"/"+cmdMes.getSelectedItem().toString()+"/"+cmbAño.getSelectedItem().toString());
        // lblNombreTarea.setText(txtnombreAsig.getText());
        // txaDescripcion.setText(txaDescripcion2.getText());
        // lblHora.setText(cmbDia.getSelectedItem().toString()+"/"+cmdMes.getSelectedItem().toString()+"/"+cmbAño.getSelectedItem().toString());
        
        if (rbsi.isSelected()) {
            tareacerra = false;
        } else {
            tareacerra = true;
        }
        try {
            Asignacion asignacionTarea = new Asignacion(txtnombreAsig.getText() + "", TipoAsignacion.valueOf(cmbTipo.getSelectedItem().toString()), "" + txaDescripcion2.getText(), new Date(), new Date(Integer.parseInt(cmbAño.getSelectedItem().toString()),cmdMes.getSelectedIndex()+1, Integer.parseInt(cmbDia.getSelectedItem().toString())), 0, TiempoEngrega.NoEntregado, tareacerra,Integer.parseInt(txtMaximo.getText()));
            boolean bloqueo = false;
            SchoolHubPresentacion SHP = new SchoolHubPresentacion();
            boolean repe = false;
            File archivo = new File("Usuarios.txt");
            BufferedWriter bw;
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            
            if (archivo.exists()) {
                
                BufferedReader rb = new BufferedReader(new FileReader("Usuarios.txt"));
                
                curso = gson.fromJson(rb, Curso.class);
                curso.getAsignacion().add(asignacionTarea);
                for (int variable = 0; variable < curso.getUsuario().size(); variable++) {
                    curso.getUsuario().get(variable).getAsignacionUsu().add(asignacionTarea);
                }
                
                String textoUsuario = gson.toJson(curso);
                
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("" + textoUsuario);
                
                bw.close();
                SchoolHubPrincipal.ActualizarLista();
                
                this.setVisible(false);
                
            } else {
                curso = new Curso();
                String textoUsuario = gson.toJson(curso);
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("" + textoUsuario);
                bw.close();
                SHP.setVisible(true);
                this.setVisible(false);
            }
        } catch (IOException ex) {
        }
}else{
        JOptionPane.showMessageDialog(null, "Los campos solicitados no han sido completados totalmente", "Aviso", JOptionPane.INFORMATION_MESSAGE);

       }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void lblFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();        
    }//GEN-LAST:event_lblFondoMousePressed

    private void lblFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblFondoMouseDragged

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
            java.util.logging.Logger.getLogger(SchoolHubCrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchoolHubCrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchoolHubCrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchoolHubCrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchoolHubCrearTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbAño;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbHora;
    private javax.swing.JComboBox<String> cmbMinuto;
    private javax.swing.JComboBox<String> cmbTiempo;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmdMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEntrega;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora2;
    private javax.swing.JLabel lblHoraLimite;
    private javax.swing.JLabel lblNombreTarea2;
    private javax.swing.JLabel lblTipo;
    public static javax.swing.JRadioButton rbno;
    public static javax.swing.JRadioButton rbsi;
    public static javax.swing.JTextArea txaDescripcion2;
    public static javax.swing.JFormattedTextField txtMaximo;
    public static javax.swing.JTextField txtnombreAsig;
    // End of variables declaration//GEN-END:variables
}
