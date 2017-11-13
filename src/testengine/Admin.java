/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testengine;


import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Er. Ved Prakash Arya
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
       // setUndecorated(true);
        initComponents();
    }
   
    String VQ[] = new String[100];
   int counter=6;
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        timev = new javax.swing.JLabel();
        datev = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Q1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Q2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Q3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Q4 = new javax.swing.JLabel();
        Q5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        optA1 = new javax.swing.JLabel();
        optB1 = new javax.swing.JLabel();
        optC1 = new javax.swing.JLabel();
        optD1 = new javax.swing.JLabel();
        optA2 = new javax.swing.JLabel();
        optB2 = new javax.swing.JLabel();
        optC2 = new javax.swing.JLabel();
        optD2 = new javax.swing.JLabel();
        optA3 = new javax.swing.JLabel();
        optB3 = new javax.swing.JLabel();
        optC3 = new javax.swing.JLabel();
        optD3 = new javax.swing.JLabel();
        optA4 = new javax.swing.JLabel();
        optB4 = new javax.swing.JLabel();
        optC4 = new javax.swing.JLabel();
        optD4 = new javax.swing.JLabel();
        optA5 = new javax.swing.JLabel();
        optB5 = new javax.swing.JLabel();
        optC5 = new javax.swing.JLabel();
        optD5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        remove1 = new javax.swing.JButton();
        remove2 = new javax.swing.JButton();
        remove3 = new javax.swing.JButton();
        remove4 = new javax.swing.JButton();
        remove5 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(889, 544));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("TEST ENGINE");

        timev.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timev.setForeground(new java.awt.Color(153, 0, 153));
        timev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timev.setText("Time :");

        datev.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        datev.setForeground(new java.awt.Color(153, 0, 153));
        datev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datev.setText("Date :");

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("1.");

        Q1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        Q1.setText("Question will get from database.....................");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("2.");

        Q2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        Q2.setText("Question will get from database.....................");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("3.");

        Q3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        Q3.setText("Question will get from database.....................");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("4.");

        Q4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        Q4.setText("Question will get from database.....................");

        Q5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        Q5.setText("Question will get from database.....................");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 0));
        jLabel7.setText("5.");

        optA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optA1.setText("jLabel2");

        optB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optB1.setText("jLabel2");

        optC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optC1.setText("jLabel2");

        optD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optD1.setText("jLabel2");

        optA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optA2.setText("jLabel2");

        optB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optB2.setText("jLabel2");

        optC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optC2.setText("jLabel2");

        optD2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optD2.setText("jLabel2");

        optA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optA3.setText("jLabel2");

        optB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optB3.setText("jLabel2");

        optC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optC3.setText("jLabel2");

        optD3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optD3.setText("jLabel2");

        optA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optA4.setText("jLabel2");

        optB4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optB4.setText("jLabel2");

        optC4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optC4.setText("jLabel2");

        optD4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optD4.setText("jLabel2");

        optA5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optA5.setText("jLabel2");

        optB5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optB5.setText("jLabel2");

        optC5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optC5.setText("jLabel2");

        optD5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optD5.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(optA2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(optB2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(optC2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optD2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Q2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 19, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(optA3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(optB3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(optC3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optD3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Q3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Q5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(optA5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(optB5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(optC5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(optD5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(optA4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(optB4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(optC4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optD4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Q4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Q1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(optA1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(optB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15)
                                .addComponent(optC1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optD1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optA1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optB1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optC1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optD1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Q2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optA2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optB2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optC2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optD2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Q3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optA3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optB3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optC3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optD3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Q4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optA4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optB4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optC4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optD4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Q5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optA5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optB5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optC5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optD5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        remove1.setBackground(new java.awt.Color(255, 255, 255));
        remove1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        remove1.setForeground(new java.awt.Color(255, 0, 0));
        remove1.setText("Remove");
        remove1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remove1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                remove1MouseEntered(evt);
            }
        });
        remove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove1ActionPerformed(evt);
            }
        });

        remove2.setBackground(new java.awt.Color(255, 255, 255));
        remove2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        remove2.setForeground(new java.awt.Color(255, 0, 0));
        remove2.setText("Remove");
        remove2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remove2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                remove2MouseEntered(evt);
            }
        });
        remove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove2ActionPerformed(evt);
            }
        });

        remove3.setBackground(new java.awt.Color(255, 255, 255));
        remove3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        remove3.setForeground(new java.awt.Color(255, 0, 0));
        remove3.setText("Remove");
        remove3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remove3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                remove3MouseEntered(evt);
            }
        });
        remove3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove3ActionPerformed(evt);
            }
        });

        remove4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        remove4.setForeground(new java.awt.Color(255, 0, 0));
        remove4.setText("Remove");
        remove4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remove4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                remove4MouseEntered(evt);
            }
        });
        remove4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove4ActionPerformed(evt);
            }
        });

        remove5.setBackground(new java.awt.Color(255, 255, 255));
        remove5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        remove5.setForeground(new java.awt.Color(255, 0, 0));
        remove5.setText("Remove");
        remove5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        remove5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remove5MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                remove5MouseEntered(evt);
            }
        });
        remove5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove5ActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(0, 0, 255));
        Exit.setText("NEXT/Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remove1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remove2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remove3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remove4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remove5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(remove1)
                .addGap(49, 49, 49)
                .addComponent(remove2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(remove3)
                .addGap(48, 48, 48)
                .addComponent(remove4)
                .addGap(55, 55, 55)
                .addComponent(remove5)
                .addGap(40, 40, 40)
                .addComponent(Exit))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(timev, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(datev, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(datev, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(timev, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(902, 559));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     public void timerMethod(){
        Thread clock = new Thread(){
          public void run(){

              for (;;){
                 Date d = new Date();
                 int hr ,min,sec;
                 hr= d.getHours();
                 min= d.getMinutes();
                sec = d.getSeconds();
              String formTime=("Time:-"+(hr+":")+(min+":")+(sec)); 
              timev.setText(formTime);
              try{
                  
                  sleep(1000);
              }
              catch(Exception ex){
                  JOptionPane.showMessageDialog(null, "Error"+ex);
              }
              }
          }
          
      };
        clock.start();
       Calander ved = new Calander();
       ved.dateDisplay();
       datev.setText(ved.formDate); 
    }
        String vA[] = new String[20];
        String vB[] = new String[20];
        String vC[] = new String[20];
        String vD[] = new String[20];
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timerMethod();
        getPaper();
        buttonVisibility();
    }
    public void getPaper(){
        for(int s=0 ; s<20; s++){
            VQ[s]=null;
        }
        DBPaper getpaper = new DBPaper();
        
        
        
        String query="select * from "+ SetQuestion.sub;
       int i=1;
        try {
             getpaper.rs= getpaper.st.executeQuery(query);
             while(getpaper.rs.next()){
            VQ[i]=(getpaper.rs.getString("Q"));
            vA[i]=(getpaper.rs.getString("A"));
            vB[i]=(getpaper.rs.getString("B"));
            vC[i]=(getpaper.rs.getString("C"));
            vD[i]=(getpaper.rs.getString("D"));
           
                i++;
             }
        } catch (Exception ex) {
           System.out.println("Error: "+ex);
        }
        finally{
           
            Q1.setText(VQ[1]);
            optA1.setText(vA[1]);
            optB1.setText(vB[1]);
            optC1.setText(vC[1]);
            optD1.setText(vD[1]);
            
            Q2.setText(VQ[2]);
            optA2.setText(vA[2]);
            optB2.setText(vB[2]);
            optC2.setText(vC[2]);
            optD2.setText(vD[2]);
            
            Q3.setText(VQ[3]);
            optA3.setText(vA[3]);
            optB3.setText(vB[3]);
            optC3.setText(vC[3]);
            optD3.setText(vD[3]);
            
            Q4.setText(VQ[4]);
            optA4.setText(vA[4]);
            optB4.setText(vB[4]);
            optC4.setText(vC[4]);
            optD4.setText(vD[4]);
            
            Q5.setText(VQ[5]);
            optA5.setText(vA[5]);
            optB5.setText(vB[5]);
            optC5.setText(vC[5]);
            optD5.setText(vD[5]);
            
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        String Op[]={"Next","Exit"};  
        int x=JOptionPane.showOptionDialog(null, "Which Action You Want To Perform!", null, 0, 1,null, Op, "");
        if(x==0){
            
             Q1.setText(VQ[counter]);
            optA1.setText(vA[counter]);
            optB1.setText(vB[counter]);
            optC1.setText(vC[counter]);
            optD1.setText(vD[counter]);
            
            counter++;
            
            Q2.setText(VQ[counter]);
            optA2.setText(vA[counter]);
            optB2.setText(vB[counter]);
            optC2.setText(vC[counter]);
            optD2.setText(vD[counter]);
            
            counter++;
            Q3.setText(VQ[counter]);
            optA3.setText(vA[counter]);
            optB3.setText(vB[counter]);
            optC3.setText(vC[counter]);
            optD3.setText(vD[counter]);
            
            counter++;
            Q4.setText(VQ[counter]);
            optA4.setText(vA[counter]);
            optB4.setText(vB[counter]);
            optC4.setText(vC[counter]);
            optD4.setText(vD[counter]);
            
            counter++;
            Q5.setText(VQ[counter]);
            optA5.setText(vA[counter]);
            optB5.setText(vB[counter]);
            optC5.setText(vC[counter]);
            optD5.setText(vD[counter]);
            
            
            
            //JOptionPane.showMessageDialog(null, "Next");
        }
        else{
            this.setVisible(false);
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed
     public void buttonVisibility(){
        if(VQ[1]==null){
            remove1.setEnabled(false);
        }
        else{
             remove1.setEnabled(true);
        }
        if(VQ[2]==null){
           remove2.setEnabled(false);
        }
        else{
             remove2.setEnabled(true);
        }
        if(VQ[3]==null){
           remove3.setEnabled(false);
        }
        else{
             remove3.setEnabled(true);
        }
        if(VQ[4]==null){
            remove4.setEnabled(false);
        }
        else{
             remove4.setEnabled(true);
        }
        if(VQ[5]==null){
            remove5.setEnabled(false);
        }
        else{
             remove5.setEnabled(true);
        }
    }
     public void removeButtonWork(String query){
        DBPaper del = new DBPaper();
        try {
             del.st.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "One Question Is successfully Removed!");
            } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Not successful "+ex);
        }
        finally {
            for (int z=0;z<6;z++){
                VQ[z]=null;
            }
        
          
        }
    }
    private void remove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove1ActionPerformed
         String query ="DELETE  FROM `"+SetQuestion.sub+"` WHERE Q ='"+VQ[1]+"'";
         removeButtonWork(query);
         getPaper();
         buttonVisibility();
        // TODO add your handling code here:
    }//GEN-LAST:event_remove1ActionPerformed

    private void remove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove2ActionPerformed
         String query ="DELETE  FROM `"+SetQuestion.sub+"` WHERE Q ='"+VQ[2]+"'";
         removeButtonWork(query);
         getPaper();
         buttonVisibility();// TODO add your handling code here:
    }//GEN-LAST:event_remove2ActionPerformed

    private void remove3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove3ActionPerformed
 String query ="DELETE  FROM `"+SetQuestion.sub+"` WHERE Q ='"+VQ[3]+"'";
         removeButtonWork(query);
         getPaper();
         buttonVisibility();        // TODO add your handling code here:
    }//GEN-LAST:event_remove3ActionPerformed

    private void remove4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove4ActionPerformed

         String query ="DELETE  FROM `"+SetQuestion.sub+"` WHERE Q ='"+VQ[4]+"'";
         removeButtonWork(query);
         getPaper();
         buttonVisibility();// TODO add your handling code here:
    }//GEN-LAST:event_remove4ActionPerformed

    private void remove5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove5ActionPerformed
        String query ="DELETE  FROM `"+SetQuestion.sub+"` WHERE Q ='"+VQ[5]+"'";
         removeButtonWork(query);
         getPaper();
         buttonVisibility();        // TODO add your handling code here:
    }//GEN-LAST:event_remove5ActionPerformed

    private void remove1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove1MouseEntered
        remove1.setBackground(Color.yellow);
        // TODO add your handling code here:
    }//GEN-LAST:event_remove1MouseEntered

    private void remove1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove1MouseExited
        remove1.setBackground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_remove1MouseExited

    private void remove2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove2MouseEntered
       
        remove2.setBackground(Color.yellow);// TODO add your handling code here:
    }//GEN-LAST:event_remove2MouseEntered

    private void remove2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove2MouseExited
        remove2.setBackground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_remove2MouseExited

    private void remove3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove3MouseEntered
        remove3.setBackground(Color.yellow);
        // TODO add your handling code here:
    }//GEN-LAST:event_remove3MouseEntered

    private void remove3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove3MouseExited
        remove3.setBackground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_remove3MouseExited

    private void remove4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove4MouseEntered
        remove4.setBackground(Color.yellow);
        // TODO add your handling code here:
    }//GEN-LAST:event_remove4MouseEntered

    private void remove4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove4MouseExited
        remove4.setBackground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_remove4MouseExited

    private void remove5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove5MouseEntered
        remove5.setBackground(Color.yellow);
        // TODO add your handling code here:
    }//GEN-LAST:event_remove5MouseEntered

    private void remove5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove5MouseExited
        remove5.setBackground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_remove5MouseExited

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        Exit.setBackground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitMouseClicked

  
    
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Q5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel datev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel optA1;
    private javax.swing.JLabel optA2;
    private javax.swing.JLabel optA3;
    private javax.swing.JLabel optA4;
    private javax.swing.JLabel optA5;
    private javax.swing.JLabel optB1;
    private javax.swing.JLabel optB2;
    private javax.swing.JLabel optB3;
    private javax.swing.JLabel optB4;
    private javax.swing.JLabel optB5;
    private javax.swing.JLabel optC1;
    private javax.swing.JLabel optC2;
    private javax.swing.JLabel optC3;
    private javax.swing.JLabel optC4;
    private javax.swing.JLabel optC5;
    private javax.swing.JLabel optD1;
    private javax.swing.JLabel optD2;
    private javax.swing.JLabel optD3;
    private javax.swing.JLabel optD4;
    private javax.swing.JLabel optD5;
    private javax.swing.JButton remove1;
    private javax.swing.JButton remove2;
    private javax.swing.JButton remove3;
    private javax.swing.JButton remove4;
    private javax.swing.JButton remove5;
    private javax.swing.JLabel timev;
    // End of variables declaration//GEN-END:variables
}
