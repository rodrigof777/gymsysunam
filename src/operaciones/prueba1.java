/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * prueba1.java
 *
 * Created on 03/03/2011, 23:19:05
 */

package operaciones;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class prueba1 extends javax.swing.JFrame {
    private Object model;
   

    /** Creates new form prueba1 */
    public prueba1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(640, 760));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "nombre", "ocupacion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 460, 420));

        jButton2.setText("guardar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 146, 44));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jTextField1.setText("facundo");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 140, 50));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24));
        jTextField2.setText("tete");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 140, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("ocupacion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 140, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setText("nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 70));

        jButton3.setText("ver datos");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 120, 40));

        jButton4.setText("eliminar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 120, 40));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 24));
        jTextField3.setText("33792113");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 140, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel3.setText("dni");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 140, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
   String nombre="'"+jTextField1.getText()+"'";
  String ocupacion="'"+jTextField2.getText()+"'";
  String dni="'"+jTextField3.getText()+"'";

  String sentencia="insert into persona values ("+nombre+","+ocupacion+","+dni+" );";

        try{
  Class.forName("org.sqlite.JDBC");
  Connection conn = DriverManager.getConnection("jdbc:sqlite:base1.db");
  Statement stat = conn.createStatement();
  ResultSet rs = stat.executeQuery(sentencia);
      } catch (Exception e){
          jDialog1.
          jDialog1.show();

      
     }
 

          
  
    }//GEN-LAST:event_jButton2MouseClicked


    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
             
limpiar(); //limpia la tabla
DefaultTableModel modelo = new DefaultTableModel();
            JTable tabla = new JTable(modelo);
            modelo.addColumn("nombre");
            modelo.addColumn("ocupacion");
            modelo.addColumn("dni");



try{
  Class.forName("org.sqlite.JDBC");
  Connection conn = DriverManager.getConnection("jdbc:sqlite:base1.db");
  Statement stat = conn.createStatement();
  ResultSet rs = stat.executeQuery("select * from persona");
  
while (rs.next()) {
                Object[] fila = new Object[3]; // Hay dos columnas en la tabla
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
                
                jTable1.setModel(modelo);

} }catch (Exception e)
      {
     }
            
        

      

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       
  /*String nombre="'"+jTextField1.getText()+"'";
  String ocupacion="'"+jTextField2.getText()+"'";
  String sentencia="insert into people values ("+nombre+","+ocupacion+" );";*/
Object dato=jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn());
dato.toString();
System.out.println(dato);
  


/*try{
  Class.forName("org.sqlite.JDBC");
  Connection conn = DriverManager.getConnection("jdbc:sqlite:base1.db");
  Statement stat = conn.createStatement();
  ResultSet rs = stat.executeQuery("select * from people");

}catch (Exception e)
      {
     }*/



    }//GEN-LAST:event_jButton4MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed







    void limpiar() {
        int fila=0;
        while (jTable1.getRowCount()>fila)  {

             int col=0;

                 jTable1.setValueAt(" ", fila, col);
                 jTable1.setValueAt(" ", fila, col+1);
                 fila=fila+1;
    }
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables


}