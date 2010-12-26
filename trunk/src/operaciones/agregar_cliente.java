/*
 * agregar_cliente.java
 *
 * Created on 8 de octubre de 2009, 14:26
 */

package operaciones;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author  zxero
 */
public class agregar_cliente extends javax.swing.JFrame {
    
    /** Creates new form agregar_cliente */
    public agregar_cliente() {
        initComponents();
    }

    javax.swing.JPanel panel_izq,panel_der;

    public class efecto_der implements Runnable{
    Thread t;
    @SuppressWarnings("static-access")
    public void run () {
            for (int i=-990; i<=80 ;i=i+50){
                try {
                    t.sleep(2);
                    panel_der.setLocation(i, 160);
                } catch (InterruptedException ex) {
                    Logger.getLogger(agregar_cliente.class.getName()).log(Level.SEVERE, null, ex);
                }

              }

  }
}

    public class efecto_izq implements Runnable{
    Thread t2;
    @SuppressWarnings("static-access")
    public void run () {
            for (int i=60; i>=-1000 ;i=i-50){
                try {
                    t2.sleep(2);

                     panel_izq.setLocation(i, 160);
                } catch (InterruptedException ex) {
                    Logger.getLogger(agregar_cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                
              }
  }
}








    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        nro_cel4 = new javax.swing.JTextField();
        apellido1 = new javax.swing.JTextField();
        teléfono_fijo2 = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        nombre4 = new javax.swing.JTextField();
        sexo4 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        sexo5 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        nro_cel5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nro_cel2 = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        teléfono_fijo1 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nombre3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        sexo3 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        nro_cel3 = new javax.swing.JTextField();
        nro_cel6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(890, 630));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/32x32/back.png"))); // NOI18N
        jButton1.setText("Atrás");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 540, 150, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/32x32/block.png"))); // NOI18N
        jButton2.setText("Cancelar");
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 540, 140, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 62, 640, 0);

        jLabel1.setText(".");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 520, 650, 14);

        jLabel11.setText(".");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 4, 14);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/32x32/next.png"))); // NOI18N
        jButton3.setText("Siguiente");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(410, 540, 150, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 510, 870, 20);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(-10, 100, 870, 20);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Nombre");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel21.setText("Tipo de Documento");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel22.setText("Fecha de Nacimiento");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel2.add(nro_cel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 180, -1));
        jPanel2.add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 240, -1));

        teléfono_fijo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teléfono_fijo2ActionPerformed(evt);
            }
        });
        jPanel2.add(teléfono_fijo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 200, -1));

        jLabel23.setText("Sexo");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        jLabel24.setText("Nº Celular");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));
        jPanel2.add(nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 220, -1));

        sexo4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DNI", "Libreta de Enrolamiento", "Libreta Cívica" }));
        jPanel2.add(sexo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 140, -1));

        jLabel25.setText("Nº Teléfono fijo");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        jPanel2.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Apellido");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        sexo5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        jPanel2.add(sexo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 170, -1));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Nro ");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));
        jPanel2.add(nro_cel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 130, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 170, 820, 280);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Otros Datos"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Numero");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel13.setText("Localidad");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));
        jPanel1.add(nro_cel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 220, -1));
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 140, -1));

        teléfono_fijo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teléfono_fijo1ActionPerformed(evt);
            }
        });
        jPanel1.add(teléfono_fijo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 130, -1));

        jLabel15.setText("Problemas de Salud");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel16.setText("E-Mail");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));
        jPanel1.add(nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 220, -1));

        jLabel18.setText("Ocupación");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("calle");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        sexo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "@Yahoo.com", "@Hotmail.com" }));
        jPanel1.add(sexo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 130, -1));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Cód. Postal");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));
        jPanel1.add(nro_cel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, -1));
        jPanel1.add(nro_cel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 130, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 310, 80));

        jButton4.setText("Cargar Foto");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 190, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(880, 60, 790, 360);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/32x32/accept_page.png"))); // NOI18N
        jButton7.setText("Finalizar");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(630, 540, 150, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/48x48/add.png"))); // NOI18N
        jLabel2.setText("Agregar Cliente");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 330, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Ingrese los datos del cliente, el horario y la rutina.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 60, 290, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       String[] arraydeaños=new String[70];
       String año;
        int a=2000;
        arraydeaños[0]=String.valueOf(a);
        this.setLocationRelativeTo(null);
               for (int i=1;i<=69;i=i+1){
           a=a-1;
                 
           System.out.println(a);
           arraydeaños[i]=String.valueOf(a);
       }
            jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(arraydeaños));
       
    }//GEN-LAST:event_formComponentShown

    private void teléfono_fijo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teléfono_fijo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teléfono_fijo1ActionPerformed

    private void teléfono_fijo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teléfono_fijo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teléfono_fijo2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        panel_izq=jPanel2;
        panel_der=jPanel1;

        new Thread(new efecto_der()).start();
        new Thread(new efecto_izq()).start();
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        panel_izq=jPanel1;
        panel_der=jPanel2;

        new Thread(new efecto_izq()).start();
        new Thread(new efecto_der()).start();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar_cliente().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField apellido1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nombre3;
    private javax.swing.JTextField nombre4;
    private javax.swing.JTextField nro_cel2;
    private javax.swing.JTextField nro_cel3;
    private javax.swing.JTextField nro_cel4;
    private javax.swing.JTextField nro_cel5;
    private javax.swing.JTextField nro_cel6;
    private javax.swing.JComboBox sexo3;
    private javax.swing.JComboBox sexo4;
    private javax.swing.JComboBox sexo5;
    private javax.swing.JFormattedTextField teléfono_fijo1;
    private javax.swing.JFormattedTextField teléfono_fijo2;
    // End of variables declaration//GEN-END:variables
    
}
