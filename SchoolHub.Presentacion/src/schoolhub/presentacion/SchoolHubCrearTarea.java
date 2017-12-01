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
public class SchoolHubCrearTarea extends javax.swing.JFrame {

    /**
     * Creates new form SchoolHubCrearTarea
     */
    public SchoolHubCrearTarea() {
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

        jTextField1 = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblNombreTarea = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        cmbTipo = new javax.swing.JComboBox<>();
        cmbDia = new javax.swing.JComboBox<>();
        cmdMes = new javax.swing.JComboBox<>();
        cmbAño = new javax.swing.JComboBox<>();
        lblEntrega = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();
        lblHora = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(411, 376));
        setMinimumSize(new java.awt.Dimension(411, 376));
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 30, 170, 20);

        lblTipo.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("TIPO DE ASIGNACION :");
        getContentPane().add(lblTipo);
        lblTipo.setBounds(30, 70, 180, 15);

        lblDescripcion.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Descripción :");
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(30, 160, 120, 15);

        lblNombreTarea.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        lblNombreTarea.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreTarea.setText("Nombre de Asignación :");
        getContentPane().add(lblNombreTarea);
        lblNombreTarea.setBounds(30, 30, 190, 20);

        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txaDescripcion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 180, 370, 150);

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asignacion", "Tarea", "Actividad" }));
        getContentPane().add(cmbTipo);
        cmbTipo.setBounds(220, 70, 80, 20);

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(cmbDia);
        cmbDia.setBounds(140, 100, 40, 20);

        cmdMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(cmdMes);
        cmdMes.setBounds(190, 100, 56, 20);

        cmbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2017", "2018" }));
        getContentPane().add(cmbAño);
        cmbAño.setBounds(260, 100, 56, 20);

        lblEntrega.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        lblEntrega.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrega.setText("Entrega después de fecha limite :");
        getContentPane().add(lblEntrega);
        lblEntrega.setBounds(30, 130, 280, 15);

        jRadioButton1.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Si");
        jRadioButton1.setOpaque(false);
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(310, 130, 40, 20);

        jRadioButton2.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("No");
        jRadioButton2.setOpaque(false);
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(350, 130, 50, 20);

        btnAceptar.setText("Aceptar");
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(180, 340, 71, 23);

        lblHora.setFont(new java.awt.Font("Earth Orbiter", 0, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Fecha Limite:");
        getContentPane().add(lblHora);
        lblHora.setBounds(30, 100, 120, 15);

        lblFondo.setBackground(new java.awt.Color(0, 102, 153));
        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo);
        lblFondo.setBounds(-4, -5, 420, 380);

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
    private javax.swing.JComboBox<String> cmbAño;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmdMes;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEntrega;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNombreTarea;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextArea txaDescripcion;
    // End of variables declaration//GEN-END:variables
}
