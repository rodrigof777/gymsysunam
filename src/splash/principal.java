/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * principal.java
 *
 * Created on 04/10/2009, 22:04:55
 */

package splash;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;

public class principal extends javax.swing.JFrame {

    /** Creates new form principal */
    public principal() {
        initComponents();
                this.setLocationRelativeTo(null);
    }
public class efecto implements Runnable{ //efecto de la ventana buscar
    Thread t;
    @SuppressWarnings("static-access")
    public void run () {
            for (int i=-990; i<=80 ;i=i+50){
                try {
                    t.sleep(2);
                     panelcli.setLocation(i, 80);
                     } catch (InterruptedException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                }
              }

  }
}
public class efecto_inverso implements Runnable{ //efecto retroceso de la ventana buscar
    Thread t2;
    @SuppressWarnings("static-access")
    public void run () {
            for (int i=60; i>=-1000 ;i=i-50){
                try {
                    t2.sleep(2);
                     panelcli.setLocation(i, 80);
                } catch (InterruptedException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                }
              }

  }
}
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        panelcli = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        calendarComponent1 = new com.imagine.component.calendar.CalendarComponent();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();

        jMenuItem2.setText("Nuevo Cliente");

        jMenuItem3.setText("Editar Cliente");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(177, 177, 177));
        setMinimumSize(new java.awt.Dimension(1024, 730));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelcli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelcli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("HORARIOS"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DIA", "HORA INICIO", "HORA FINAL", "TOTAL ", "EMPLEADO A CARGO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 510, 140));

        panelcli.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 530, 210));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Cliente desde : 10 de Octubre de 2009");
        panelcli.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 260, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("SALDO A FAVOR DE $ 80");
        panelcli.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 260, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18));
        jLabel7.setText("GATES, Bill");
        panelcli.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 250, 30));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Ultimas 5 Asistencias"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DIA", "FECHA", "HORA", "TIPO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 400, 150));

        panelcli.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 440, 230));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("RUTINA DE HOY"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("\nAqui va la rutina");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 390, 170));

        panelcli.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 430, 210));
        jPanel6.getAccessibleContext().setAccessibleName("Rutina");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12));
        jLabel6.setText("Tu última visita fue: \"ULTIMA VISITA\"");
        panelcli.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 260, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("SALDO PENDIENTE DE $ 40000");
        panelcli.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 260, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelcli.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operaciones/bill [320x200].jpg"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelcli.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 190));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/32x32/accept.png"))); // NOI18N
        jButton8.setText("Empezar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        panelcli.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 210, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 12));
        jLabel12.setText("ESTADO DE CUENTA :  VENCIDA");
        panelcli.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 260, 40));

        jButton16.setText("Realizar Pago del Cliente");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        panelcli.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 210, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel14.setText("2 Agosto del 2009");
        panelcli.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 140, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel15.setText("00:00");
        panelcli.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 80, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel17.setText("Fecha");
        panelcli.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 40, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel18.setText("Hora");
        panelcli.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 40, -1));

        getContentPane().add(panelcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(-940, 70, 1010, 520));

        cliente.setFont(new java.awt.Font("Tahoma", 1, 18));
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 330, 30));

        jLabel1.setText("Buscar Cliente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 170, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24x24/users.png"))); // NOI18N
        jButton4.setText("F1:CLIENTES");
        jButton4.setMaximumSize(new java.awt.Dimension(143, 53));
        jButton4.setMinimumSize(new java.awt.Dimension(173, 55));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24x24/clock.png"))); // NOI18N
        jButton5.setText("F2:HORARIOS");
        jButton5.setMaximumSize(new java.awt.Dimension(143, 55));
        jButton5.setMinimumSize(new java.awt.Dimension(173, 55));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24x24/attachment.png"))); // NOI18N
        jButton6.setText("F3:RUTINAS");
        jButton6.setMaximumSize(new java.awt.Dimension(143, 55));
        jButton6.setMinimumSize(new java.awt.Dimension(173, 55));
        jPanel2.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24x24/user.png"))); // NOI18N
        jButton7.setText("F4:EMPLEADOS");
        jButton7.setMaximumSize(new java.awt.Dimension(143, 55));
        jButton7.setMinimumSize(new java.awt.Dimension(173, 55));
        jPanel2.add(jButton7);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24x24/chart.png"))); // NOI18N
        jButton9.setText("F5:INFORMES");
        jButton9.setMaximumSize(new java.awt.Dimension(143, 55));
        jButton9.setMinimumSize(new java.awt.Dimension(173, 55));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel2.add(jButton9);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 1080, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24x24/next.png"))); // NOI18N
        jButton2.setText("Ir a Pantalla Principal");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 180, 30));

        jLabel5.setText("Búsqueda por Nombre, Apellido o DNI");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 360, -1));

        jLabel9.setText("Total Asistencias Registradas:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 210, -1));

        jLabel10.setText("Usuario en Sesión:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 150, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre Cliente", "Empleado", "Hora Inicio", "Hora Final", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 700, 470));
        getContentPane().add(calendarComponent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, -1, 160));

        jButton12.setText("Busqueda Avanzada");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 140, 30));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24x24/find.png"))); // NOI18N
        jButton13.setText("Buscar");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 130, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/32x32/clock.png"))); // NOI18N
        jButton10.setText("Ver Horarios del Cliente Seleccionado");
        jButton10.setMaximumSize(new java.awt.Dimension(143, 55));
        jButton10.setMinimumSize(new java.awt.Dimension(173, 55));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, 290, 100));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24x24/attachment.png"))); // NOI18N
        jButton18.setText("Ver Rutina del cliente seleccionado");
        jButton18.setMaximumSize(new java.awt.Dimension(143, 55));
        jButton18.setMinimumSize(new java.awt.Dimension(173, 55));
        jPanel8.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, -1));

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24x24/user.png"))); // NOI18N
        jButton19.setText("Ver Empleado Del Cliente Seleccionado");
        jButton19.setMaximumSize(new java.awt.Dimension(143, 55));
        jButton19.setMinimumSize(new java.awt.Dimension(173, 55));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, -1));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/24x24/clock.png"))); // NOI18N
        jButton20.setText("Ver Horarios del Cliente Seleccionado");
        jButton20.setMaximumSize(new java.awt.Dimension(143, 55));
        jButton20.setMinimumSize(new java.awt.Dimension(173, 55));
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });
        jPanel8.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, -1));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 290, 180));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel13.setText("CLIENTES ACTUALMENTE EN EL GIMNASIO CAPACIDAD MAX ( 20)");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 520, 30));

        jLabel16.setForeground(new java.awt.Color(169, 13, 13));
        jLabel16.setText("Dia de Hoy");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 150, 20));

        jMenu8.setText("Archivo");

        jMenu9.setText("Cerrar Sesión");
        jMenu8.add(jMenu9);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salir");
        jMenu8.add(jMenuItem1);

        jMenuBar2.add(jMenu8);

        jMenu10.setText("Clientes");

        jMenuItem8.setText("Busqueda Avanzada");
        jMenu10.add(jMenuItem8);
        jMenu10.add(jSeparator2);
        jMenu10.add(jSeparator3);

        jMenu15.setText("Foto del Cliente");

        jMenuItem6.setText("Importar Foto");
        jMenu15.add(jMenuItem6);

        jMenu10.add(jMenu15);
        jMenu10.add(jSeparator4);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem7.setText("Hacer un Pago");
        jMenu10.add(jMenuItem7);

        jMenuItem9.setText("Ver Todas Asistencias");
        jMenu10.add(jMenuItem9);

        jMenuItem10.setText("Ver todos los Clientes");
        jMenu10.add(jMenuItem10);

        jMenuBar2.add(jMenu10);

        jMenu12.setText("Administración");

        jMenuItem11.setText("Administrar a (nombre cliente)");
        jMenu12.add(jMenuItem11);
        jMenu12.add(jSeparator5);

        jMenuItem12.setText("Administrar Empleados");
        jMenu12.add(jMenuItem12);

        jMenuItem13.setText("Administrar Visitas");
        jMenu12.add(jMenuItem13);

        jMenuItem14.setText("Administrar Cuentas");
        jMenu12.add(jMenuItem14);

        jMenuBar2.add(jMenu12);

        jMenu13.setText("Informes");

        jMenu11.setText("Socios");

        jMenuItem15.setText("Lista de todos los clientes");
        jMenu11.add(jMenuItem15);

        jMenuItem16.setText("Clientes con vencimiento");
        jMenu11.add(jMenuItem16);

        jMenuItem17.setText("Clientes al Dia");
        jMenu11.add(jMenuItem17);

        jMenu13.add(jMenu11);

        jMenu16.setText("Asistencia");

        jMenuItem18.setText("Lista de clientes que ingresaron por fecha");
        jMenu16.add(jMenuItem18);

        jMenuItem19.setText("Lista de invitados");
        jMenu16.add(jMenuItem19);

        jMenuItem20.setText("Asistencia por hora");
        jMenu16.add(jMenuItem20);

        jMenu13.add(jMenu16);

        jMenu17.setText("Pagos");

        jMenuItem21.setText("Pagos por Fecha");
        jMenu17.add(jMenuItem21);

        jMenuItem22.setText("Suma total de Pagos por periodo de tiempo");
        jMenu17.add(jMenuItem22);

        jMenuItem23.setText("Saldo pendiente de clientes vencidos");
        jMenu17.add(jMenuItem23);

        jMenu13.add(jMenu17);

        jMenuBar2.add(jMenu13);

        jMenu14.setText("Ayuda");

        jMenuItem24.setText("Ayuda");
        jMenu14.add(jMenuItem24);

        jMenuItem25.setText("Acerca de este Programa");
        jMenu14.add(jMenuItem25);

        jMenuBar2.add(jMenu14);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
          panelcli.setLocation(-990, 80);
     /*ImageIcon icono=new ImageIcon("/splash/P280809_17.28.jpg");
Image img = icono.getImage();
Image newimg = img.getScaledInstance(100, 200,  java.awt.Image.SCALE_SMOOTH);
ImageIcon newIcon = new ImageIcon(newimg);
jLabel2.setIcon(newIcon);
//jLabel2.setSize(350, 450);*/
       //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splash/P280809_17.28.jpg")));

      
    }//GEN-LAST:event_formComponentShown

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        new operaciones.agregar_cliente().setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
               new Thread(new efecto_inverso()).start();

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
          new operaciones.Busqueda().setVisible(true);

    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
          new Thread(new efecto()).start();
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked


    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
new operaciones.realizar_pago().setVisible(true);
    }//GEN-LAST:event_jButton8MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        new operaciones.Horario().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.imagine.component.calendar.CalendarComponent calendarComponent1;
    private javax.swing.JTextField cliente;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea2;
    public javax.swing.JPanel panelcli;
    // End of variables declaration//GEN-END:variables

}
