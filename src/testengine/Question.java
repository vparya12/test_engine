/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testengine;

import java.awt.Color;
import static java.lang.Thread.sleep;

import java.util.AbstractCollection.*;
import java.util.*;

import javax.swing.JOptionPane;
/**
 *
 * @author Er. Ved Prakash Arya
 */
public class Question extends javax.swing.JFrame {

    /**
     * Creates new form Question
     */
    int timer=59 ;
    String ans[]= new String[20]; 
    String query;
    int flag=0;
    int studenttick[]=  new int[20]; 
    String answers[]= new String[20];
    String answer[]= new String[6];
    
    public Question() {
       // setUndecorated(true);
        initComponents();
       double val= Math.random();
       double valu=val*5;
         setNull();
        timerMethod();
        DBPaper getpaper = new DBPaper();
        String que[] = new String[20];
        String vA[] = new String[20];
        String vB[] = new String[20];
        String vC[] = new String[20];
        String vD[] = new String[20];
      
        String query="select * from "+StudentDetail.sub;
       
       int i=0;
        try {
            
             getpaper.rs= getpaper.st.executeQuery(query);
             
             while(getpaper.rs.next()){
                
            que[i]=(getpaper.rs.getString("Q"));
           
            vA[i]=(getpaper.rs.getString("A"));
            
            vB[i]=(getpaper.rs.getString("B"));
            
            vC[i]=(getpaper.rs.getString("C"));
            
            vD[i]=(getpaper.rs.getString("D"));
            
            answers[i]=(getpaper.rs.getString("Ans"));
            
                i++;
                
             }
        } catch (Exception ex) {
          System.out.println("Error: "+ex);
        }
        finally{
            
          int x;
          
          x=(int)valu;
            if(x>12){
                x=0;
            }
            Q1.setText(que[x]);
            a1.setText(vA[x]);
            b1.setText(vB[x]);
            c1.setText(vC[x]);
            d1.setText(vD[x]);
            answer[1]=answers[x];
           x++;
           if(x>12){
                x=0;
            }
            Q2.setText(que[x]);
            a2.setText(vA[x]);
            b2.setText(vB[x]);
            c2.setText(vC[x]);
            d2.setText(vD[x]);
            answer[2]=answers[x];
           x++;
           if(x>12){
                x=0;
            }
            Q3.setText(que[x]);
            a3.setText(vA[x]);
            b3.setText(vB[x]);
            c3.setText(vC[x]);
            d3.setText(vD[x]);
            answer[3]=answers[x];
            x++;
            if(x>12){
                x=0;
            }
            Q4.setText(que[x]);
            a4.setText(vA[x]);
            b4.setText(vB[x]);
            c4.setText(vC[x]);
            d4.setText(vD[x]);
            answer[4]=answers[x];
            x++;
            if(x>12){
                x=0;
            }
            Q5.setText(que[x]);
            a5.setText(vA[x]);
            b5.setText(vB[x]);
            c5.setText(vC[x]);
            d5.setText(vD[x]);
            answer[5]=answers[x];
            
        }
       
        
    }
    int C=3;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        datev = new javax.swing.JLabel();
        timev = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Done = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Q1 = new javax.swing.JLabel();
        a1 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JRadioButton();
        c1 = new javax.swing.JRadioButton();
        d1 = new javax.swing.JRadioButton();
        Q2 = new javax.swing.JLabel();
        a2 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        c2 = new javax.swing.JRadioButton();
        d2 = new javax.swing.JRadioButton();
        Q3 = new javax.swing.JLabel();
        a3 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        c3 = new javax.swing.JRadioButton();
        d3 = new javax.swing.JRadioButton();
        a4 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JRadioButton();
        c4 = new javax.swing.JRadioButton();
        d4 = new javax.swing.JRadioButton();
        Q4 = new javax.swing.JLabel();
        Q5 = new javax.swing.JLabel();
        a5 = new javax.swing.JRadioButton();
        b5 = new javax.swing.JRadioButton();
        c5 = new javax.swing.JRadioButton();
        d5 = new javax.swing.JRadioButton();
        second = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(273, 0, 68, 82);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("TEST ENGINE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(347, 19, 299, 46);

        datev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        datev.setForeground(new java.awt.Color(153, 0, 153));
        datev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        datev.setText("Date :");
        jPanel1.add(datev);
        datev.setBounds(721, 27, 123, 23);

        timev.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        timev.setForeground(new java.awt.Color(153, 0, 153));
        timev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timev.setText("4");
        jPanel1.add(timev);
        timev.setBounds(60, 10, 90, 70);

        jLabel2.setFont(new java.awt.Font("BatangChe", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Question Paper");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(413, 76, 123, 26);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("1.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 122, 16, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("2.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 201, 16, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 0));
        jLabel8.setText("3.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 277, 16, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 0));
        jLabel10.setText("4.");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 359, 16, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 0));
        jLabel12.setText("5.");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 440, 16, 15);

        Done.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Done.setForeground(new java.awt.Color(0, 153, 51));
        Done.setText("Done");
        Done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DoneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DoneMouseExited(evt);
            }
        });
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        jPanel1.add(Done);
        Done.setBounds(771, 74, 65, 28);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        Q1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Q1.setText("Question will get from database.....................");

        a1.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(a1);
        a1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        a1.setText("Option also ");

        b1.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(b1);
        b1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b1.setText("Option also ");

        c1.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(c1);
        c1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        c1.setText("Option also ");

        d1.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(d1);
        d1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        d1.setText("Option also ");

        Q2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Q2.setText("Question will get from database.....................");

        a2.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup2.add(a2);
        a2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        a2.setText("Option also ");

        b2.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup2.add(b2);
        b2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b2.setText("Option also ");

        c2.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup2.add(c2);
        c2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        c2.setText("Option also ");

        d2.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup2.add(d2);
        d2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        d2.setText("Option also ");

        Q3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Q3.setText("Question will get from database.....................");

        a3.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup3.add(a3);
        a3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        a3.setText("Option also ");

        b3.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup3.add(b3);
        b3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b3.setText("Option also ");

        c3.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup3.add(c3);
        c3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        c3.setText("Option also ");

        d3.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup3.add(d3);
        d3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        d3.setText("Option also ");

        a4.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup4.add(a4);
        a4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        a4.setText("Option also ");

        b4.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup4.add(b4);
        b4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b4.setText("Option also ");

        c4.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup4.add(c4);
        c4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        c4.setText("Option also ");

        d4.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup4.add(d4);
        d4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        d4.setText("Option also ");

        Q4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Q4.setText("Question will get from database.....................");

        Q5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Q5.setText("Question will get from database.....................");

        a5.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup5.add(a5);
        a5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        a5.setText("Option also ");

        b5.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup5.add(b5);
        b5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b5.setText("Option also ");

        c5.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup5.add(c5);
        c5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        c5.setText("Option also ");

        d5.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup5.add(d5);
        d5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        d5.setText("Option also ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Q2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Q3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Q4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Q5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Q1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a1)
                    .addComponent(b1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c1)
                        .addComponent(d1)))
                .addGap(18, 18, 18)
                .addComponent(Q2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a2)
                    .addComponent(b2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c2)
                        .addComponent(d2)))
                .addGap(18, 18, 18)
                .addComponent(Q3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a3)
                    .addComponent(b3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c3)
                        .addComponent(d3)))
                .addGap(18, 18, 18)
                .addComponent(Q4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a4)
                    .addComponent(b4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c4)
                        .addComponent(d4)))
                .addGap(18, 18, 18)
                .addComponent(Q5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a5)
                    .addComponent(b5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c5)
                        .addComponent(d5)))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 113, 866, 407);

        second.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        second.setForeground(new java.awt.Color(51, 51, 255));
        second.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(second);
        second.setBounds(50, 60, 50, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clock.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 10, 90, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(902, 559));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Thread clock;
    public void timerMethod(){
         clock = new Thread(){
          public void run(){
             

              for (;;){
                 
                  second.setText(timer+"");
                 timer--;
                 if(timer==-1){
                     timev.setText(C+"");
                     C--;
                     timer=59;
                 }
                 
                 if(C==-1){
                    
                   diableMethod();
                   if(flag==0){
                        JOptionPane.showMessageDialog(null, "Dear Student, Time Up!");
                   }
                  allActionOfDone();
                 
                   clock.stop();
                  Done.setEnabled(false);
                  
                 }
               
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
    public void setNull(){
        for(int v=1;v<6;v++){
           ans[v]="sorry"; 
        }
    }
         
    public void allActionOfDone(){
            
           if(a1.isSelected()){
               ans[1]=a1.getText();
           }
           if(b1.isSelected()){
               ans[1]=b1.getText();
           }
           if(c1.isSelected()){
               ans[1]=c1.getText();
           }
           if(d1.isSelected()){
               ans[1]=d1.getText();
           }
           
           
            if(a2.isSelected()){
               ans[2]=a2.getText();
           }
           if(b2.isSelected()){
               ans[2]=b2.getText();
           }
           if(c2.isSelected()){
               ans[2]=c2.getText();
           }
           if(d2.isSelected()){
               ans[2]=d2.getText();
           }
           
           
            if(a3.isSelected()){
               ans[3]=a3.getText();
           }
           if(b3.isSelected()){
               ans[3]=b3.getText();
           }
           if(c3.isSelected()){
               ans[3]=c3.getText();
           }
           if(d3.isSelected()){
               ans[3]=d3.getText();
           }
           
           
            if(a4.isSelected()){
               ans[4]=a4.getText();
           }
           if(b4.isSelected()){
               ans[4]=b4.getText();
           }
           if(c4.isSelected()){
               ans[4]=c4.getText();
           }
           if(d4.isSelected()){
               ans[4]=d4.getText();
           }
           
           
            if(a5.isSelected()){
               ans[5]=a5.getText();
           }
           if(b5.isSelected()){
               ans[5]=b5.getText();
           }
           if(c5.isSelected()){
               ans[5]=c5.getText();
           }
           if(d5.isSelected()){
               ans[5]=d5.getText();
           }
           
         
          int obtainMarks=0;
          for(int z=1;z<6;z++){
                if(ans[z].equals(answer[z])){
                    studenttick[z]=1;
                    obtainMarks+=5;
                }
                else{
                    studenttick[z]=0;
                }
          }
        
        String query1 = "INSERT INTO `result`.`"+StudentDetail.sub+"` (`Roll`, `FirstQ`, `SecQ`, `ThirdQ`, `FourthQ`, `FifthQ`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Ans5`, `Obtain Marks`)";
        String query2 = " VALUES ("+StudentDetail.studentroll+","+studenttick[1]+","+studenttick[2]+","+studenttick[3]+","+studenttick[4]+","+studenttick[5]+",";
        String query3 = "'"+answer[1]+"','"+answer[2]+"','"+answer[3]+"','"+answer[4]+"','"+answer[5]+"',"+obtainMarks+")";
        query =query1+query2+query3;
        
        DBResult dr = new DBResult();
                
                try{
                 dr.st.executeUpdate(query);
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Error:"+ex,"Error Message",JOptionPane.ERROR_MESSAGE);
                }
                   
                    ResultCheck1 rc = new ResultCheck1();
                   
                    this.setVisible(false);
                     rc.setVisible(true);
    }
    public void confirmMessage(){
                int x=1;
   
           x=JOptionPane.showConfirmDialog(null, "Are You Confirm", "Confirm Box", JOptionPane.YES_NO_OPTION);
           
           if(x==0){
                C=-1;
                timev.setText("0");
                second.setText("00");
                flag=1;
                
           }
     
            
        }
    
 
     public void diableMethod(){
                
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                a4.setEnabled(false);
                a5.setEnabled(false);
                
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                c4.setEnabled(false);
                c5.setEnabled(false);
                
                d1.setEnabled(false);
                d2.setEnabled(false);
                d3.setEnabled(false);
                d4.setEnabled(false);
                d5.setEnabled(false);
                
              
        }
    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
     
       
       confirmMessage();
      
    }//GEN-LAST:event_DoneActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void DoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneMouseEntered
        Done.setBackground(Color.green);
        // TODO add your handling code here:
    }//GEN-LAST:event_DoneMouseEntered

    private void DoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneMouseExited

        Done.setBackground(Color.gray);// TODO add your handling code here:
    }//GEN-LAST:event_DoneMouseExited

    
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
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
       
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Done;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Q5;
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton a2;
    private javax.swing.JRadioButton a3;
    private javax.swing.JRadioButton a4;
    private javax.swing.JRadioButton a5;
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton b4;
    private javax.swing.JRadioButton b5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JRadioButton c1;
    private javax.swing.JRadioButton c2;
    private javax.swing.JRadioButton c3;
    private javax.swing.JRadioButton c4;
    private javax.swing.JRadioButton c5;
    private javax.swing.JRadioButton d1;
    private javax.swing.JRadioButton d2;
    private javax.swing.JRadioButton d3;
    private javax.swing.JRadioButton d4;
    private javax.swing.JRadioButton d5;
    private javax.swing.JLabel datev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel second;
    private javax.swing.JLabel timev;
    // End of variables declaration//GEN-END:variables
}
