
package puzzle;
import javax.swing.*;
public class Puzzle1 extends javax.swing.JFrame {
  
   static public String name,str = " ",count;
   static  public int index,clicks ;
   static String arr[] = new String[10];
   static int countclicks()
   {
       return(++clicks);
   }
   void  show1( String str)
   {
          name = str;
   }  
   
    public Puzzle1() {
        initComponents();
        setExtendedState(Puzzle1.MAXIMIZED_BOTH);
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPlayername = new java.awt.TextField();
        btnStart = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtClicks = new java.awt.TextField();
        btnRestart = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        textField1 = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Puzzle Game");

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Puzzle");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("Name of the player");

        txtPlayername.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N

        btnStart.setBackground(new java.awt.Color(153, 255, 153));
        btnStart.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnStart.setForeground(new java.awt.Color(0, 0, 255));
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 102, 102));
        btn0.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 0, 0));
        btn0.setText("5");
        btn0.setEnabled(false);
        btn0.setName("5"); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(51, 255, 102));
        btn1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 0, 255));
        btn1.setText("4");
        btn1.setEnabled(false);
        btn1.setName("4"); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(102, 255, 255));
        btn2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(51, 51, 51));
        btn2.setText("3");
        btn2.setEnabled(false);
        btn2.setName("3"); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 0));
        btn3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 0, 204));
        btn3.setText("1");
        btn3.setEnabled(false);
        btn3.setName("1"); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(204, 255, 204));
        btn4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(51, 255, 255));
        btn4.setEnabled(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(153, 153, 0));
        btn5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(51, 0, 255));
        btn5.setText("8");
        btn5.setEnabled(false);
        btn5.setName("8"); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(51, 255, 51));
        btn6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn6.setText("2");
        btn6.setEnabled(false);
        btn6.setName("2"); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 204, 204));
        btn7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 0, 0));
        btn7.setText("6");
        btn7.setEnabled(false);
        btn7.setFocusPainted(false);
        btn7.setName("6"); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 112, 155));
        btn8.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 0, 0));
        btn8.setText("7");
        btn8.setEnabled(false);
        btn8.setName("7"); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 204));
        jLabel3.setText("No of Clicks");

        txtClicks.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N

        btnRestart.setBackground(new java.awt.Color(102, 255, 153));
        btnRestart.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        btnRestart.setForeground(new java.awt.Color(255, 0, 0));
        btnRestart.setText("Restart");
        btnRestart.setEnabled(false);
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        btnFinish.setBackground(new java.awt.Color(0, 255, 51));
        btnFinish.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        btnFinish.setForeground(new java.awt.Color(255, 0, 0));
        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        textField1.setEditable(false);
        textField1.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        textField1.setForeground(new java.awt.Color(255, 0, 0));
        textField1.setText("Developed  By Asharaf");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(62, 62, 62))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlayername, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClicks, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(446, 446, 446)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(txtPlayername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(74, 74, 74))))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtClicks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
     if(index == 1 || index == 3 || index == 5 || index ==7)
     {     
        str = btn4.getText();
        btn4.setText(null);
        if(index==1)
           btn1.setText(str);   
        else if(index==3)
                btn3.setText(str);
        else if(index==5)
            btn5.setText(str);
        else
            btn7.setText(str);
        index = 4; 
     }
       if(btn0.getText()=="1"  &&  btn1.getText()=="2" && btn2.getText()=="3" && btn3.getText()=="4" && btn4.getText()=="5" && btn5.getText()=="6" && btn6.getText()=="7" && btn7.getText()=="8")
        {
                 btn0.setEnabled(false);
                 btn1.setEnabled(false);
                 btn2.setEnabled(false);
                 btn3.setEnabled(false);
                 btn4.setEnabled(false);
                 btn5.setEnabled(false);
                 btn6.setEnabled(false);
                 btn7.setEnabled(false);
                 btn8.setEnabled(false);
                 JOptionPane.showMessageDialog(null , "Congrats You Won The Match !!!");
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
         
                 txtPlayername.setText(name);
                 txtPlayername.setEditable(false);
                 txtClicks.setText("0");
                 clicks = 0;
                 btnStart.setEnabled(false);
                 btn0.setEnabled(true);
                 btn1.setEnabled(true);
                 btn2.setEnabled(true);
                 btn3.setEnabled(true);
                 btn4.setEnabled(true);
                 btn5.setEnabled(true);
                 btn6.setEnabled(true);
                 btn7.setEnabled(true);
                 btn8.setEnabled(true);
                 btnRestart.setEnabled(true);
                 arr[0]=btn0.getName();
                 arr[1]=btn1.getName();
                 arr[2]=btn2.getName();
                 arr[3]=btn3.getName();
                 arr[4]=btn4.getName();
                 arr[5]=btn5.getName();
                 arr[6]=btn6.getName();
                 arr[7]=btn7.getName();
                 arr[8]=btn8.getName();
                 for(int j =0;j<9;j++)
                 if(arr[j]==null)
                     index = j;  
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
 
       if(JOptionPane.showConfirmDialog(null,null,"Are You Sure Want to Exit !!",0)==0)
           System.exit(1);
           
             
    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
 
                 btn0.setEnabled(true);
                 btn1.setEnabled(true);
                 btn2.setEnabled(true);
                 btn3.setEnabled(true);
                 btn4.setEnabled(true);
                 btn5.setEnabled(true);
                 btn6.setEnabled(true);
                 btn7.setEnabled(true);
                 btn8.setEnabled(true);
                 clicks = 0;
                 txtClicks.setText("0");
                 String str[] = new String[]{"1","4","3","8","5"," ","2","6","7"};
                 btn0.setText(str[0]);
                 btn1.setText(str[1]);
                 btn2.setText(str[2]);
                 btn3.setText(str[3]);
                 btn4.setText(str[4]);
                 btn5.setText(str[5]);
                 btn6.setText(str[6]);
                 btn7.setText(str[7]);
                 btn8.setText(str[8]);
                 index = 5;
                  
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed

              count =Integer.toString(countclicks());
              txtClicks.setText(count);
              if(index == 1 || index == 3)
              {
                  str = btn0.getText();  
                  if(index==1)
                  {
                      btn0.setText(null);
                      btn1.setText(str);
                      index = 0;
                  }
                  else
                  {  
                      btn0.setText(null);
                      btn3.setText(str);
                      index = 0;
                  }
              }
                if(btn0.getText()=="1"  &&  btn1.getText()=="2" && btn2.getText()=="3" && btn3.getText()=="4" && btn4.getText()=="5" && btn5.getText()=="6" && btn6.getText()=="7" && btn7.getText()=="8")
        {
                 btn0.setEnabled(false);
                 btn1.setEnabled(false);
                 btn2.setEnabled(false);
                 btn3.setEnabled(false);
                 btn4.setEnabled(false);
                 btn5.setEnabled(false);
                 btn6.setEnabled(false);
                 btn7.setEnabled(false);
                 btn8.setEnabled(false);
                 JOptionPane.showMessageDialog(null , "Congrats You Won The Match !!!");
        }
             
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
             
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
        if(index == 2 || index == 4 || index == 0)
        {
            str =btn1.getText();
            switch (index)
            {
                case 0:
                    btn1.setText(null);
                    btn0.setText(str);
                    index = 1;
                    break;
                case 2:
                    btn1.setText(null);
                    btn2.setText(str);
                    index = 1;
                    break;
                    
                case 4:
                    btn1.setText(null);
                    btn4.setText(str);
                    index = 1;
                    break;
            }       
        }
          if(btn0.getText()=="1"  &&  btn1.getText()=="2" && btn2.getText()=="3" && btn3.getText()=="4" && btn4.getText()=="5" && btn5.getText()=="6" && btn6.getText()=="7" && btn7.getText()=="8")
        {
                 btn0.setEnabled(false);
                 btn1.setEnabled(false);
                 btn2.setEnabled(false);
                 btn3.setEnabled(false);
                 btn4.setEnabled(false);
                 btn5.setEnabled(false);
                 btn6.setEnabled(false);
                 btn7.setEnabled(false);
                 btn8.setEnabled(false);
                 JOptionPane.showMessageDialog(null , "Congrats You Won The Match !!!");
        }
       
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
        
        if(index==1 || index == 5)
        {
            str = btn2.getText();
            if(index==1)
            {
                btn2.setText(null);
                btn1.setText(str);
                index = 2;
            }
            else
            {
                btn2.setText(null);
                btn5.setText(str);
                index = 2;
            }
        }
          if(btn0.getText()=="1"  &&  btn1.getText()=="2" && btn2.getText()=="3" && btn3.getText()=="4" && btn4.getText()=="5" && btn5.getText()=="6" && btn6.getText()=="7" && btn7.getText()=="8")
        {
                 btn0.setEnabled(false);
                 btn1.setEnabled(false);
                 btn2.setEnabled(false);
                 btn3.setEnabled(false);
                 btn4.setEnabled(false);
                 btn5.setEnabled(false);
                 btn6.setEnabled(false);
                 btn7.setEnabled(false);
                 btn8.setEnabled(false);
                 JOptionPane.showMessageDialog(null , "Congrats You Won The Match !!!");
        }
         
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
        if(index == 0 || index == 4 || index == 6)
        {
           str =btn3.getText();
           if(index ==0)
           {
              btn3.setText(null);
              btn0.setText(str);
              index = 3;
           }
           else if(index==4)
           {
               btn3.setText(null);
               btn4.setText(str);
               index = 3;
           }
           else
           {
               btn3.setText(null);
               btn6.setText(str);
               index = 3;
           }      
       }
          if(btn0.getText()=="1"  &&  btn1.getText()=="2" && btn2.getText()=="3" && btn3.getText()=="4" && btn4.getText()=="5" && btn5.getText()=="6" && btn6.getText()=="7" && btn7.getText()=="8")
        {
                 btn0.setEnabled(false);
                 btn1.setEnabled(false);
                 btn2.setEnabled(false);
                 btn3.setEnabled(false);
                 btn4.setEnabled(false);
                 btn5.setEnabled(false);
                 btn6.setEnabled(false);
                 btn7.setEnabled(false);
                 btn8.setEnabled(false);
                 JOptionPane.showMessageDialog(null , "Congrats You Won The Match !!!");
        }
      
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed

        count = Integer.toString(countclicks());
        txtClicks.setText(count); 
      if(index == 2 || index == 4 || index == 8)
      {   
        str = btn5.getText();
        btn5.setText(null);
        if(index==2)
            btn2.setText(str);
        else if(index==4)
            btn4.setText(str);
        else
            btn8.setText(str);
        
        index = 5;
      }
        if(btn0.getText()=="1"  &&  btn1.getText()=="2" && btn2.getText()=="3" && btn3.getText()=="4" && btn4.getText()=="5" && btn5.getText()=="6" && btn6.getText()=="7" && btn7.getText()=="8")
        {
                 btn0.setEnabled(false);
                 btn1.setEnabled(false);
                 btn2.setEnabled(false);
                 btn3.setEnabled(false);
                 btn4.setEnabled(false);
                 btn5.setEnabled(false);
                 btn6.setEnabled(false);
                 btn7.setEnabled(false);
                 btn8.setEnabled(false);
                 JOptionPane.showMessageDialog(null , "Congrats You Won The Match !!!");
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
     if(index == 3 || index==7)
     {     
        str = btn6.getText();
         btn6.setText(null);
        if(index==3)
            btn3.setText(str);
        else 
            btn7.setText(str);
        index = 6;
     }
       if(btn0.getText()=="1"  &&  btn1.getText()=="2" && btn2.getText()=="3" && btn3.getText()=="4" && btn4.getText()=="5" && btn5.getText()=="6" && btn6.getText()=="7" && btn7.getText()=="8")
        {
                 btn0.setEnabled(false);
                 btn1.setEnabled(false);
                 btn2.setEnabled(false);
                 btn3.setEnabled(false);
                 btn4.setEnabled(false);
                 btn5.setEnabled(false);
                 btn6.setEnabled(false);
                 btn7.setEnabled(false);
                 btn8.setEnabled(false);
                 JOptionPane.showMessageDialog(null , "Congrats You Won The Match !!!");
        }
  
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
     if(index == 4 || index == 6 || index == 8)   
     {   str = btn7.getText();
        if(index == 4)
        {
            btn7.setText(null);
            btn4.setText(str);
            index = 7;

        }
        else if(index==6)
        {
            btn7.setText(null);
            btn6.setText(str);
            index = 7;

        }
        else if(index ==8)
        {
            btn7.setText(null);
            btn8.setText(str);
            index = 7;
        }
     }
       if(btn0.getText()=="1"  &&  btn1.getText()=="2" && btn2.getText()=="3" && btn3.getText()=="4" && btn4.getText()=="5" && btn5.getText()=="6" && btn6.getText()=="7" && btn7.getText()=="8")
        {
                 btn0.setEnabled(false);
                 btn1.setEnabled(false);
                 btn2.setEnabled(false);
                 btn3.setEnabled(false);
                 btn4.setEnabled(false);
                 btn5.setEnabled(false);
                 btn6.setEnabled(false);
                 btn7.setEnabled(false);
                 btn8.setEnabled(false);
                 JOptionPane.showMessageDialog(null , "Congrats You Won The Match !!!");
        }
     
            
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
        if(index == 5 || index == 7)
        {
                   str = btn8.getText();
               if(index==5)
                 {
                     btn8.setText(null);
                     btn5.setText(str); 
                     index = 8;
                 }
               else if(index == 7)
                 {
                  btn8.setText(null);
                  btn7.setText(str);
                  index = 8;
                 }
        }
        if(btn0.getText()=="1"  &&  btn1.getText()=="2" && btn2.getText()=="3" && btn3.getText()=="4" && btn4.getText()=="5" && btn5.getText()=="6" && btn6.getText()=="7" && btn7.getText()=="8")
        {
                 btn0.setEnabled(false);
                 btn1.setEnabled(false);
                 btn2.setEnabled(false);
                 btn3.setEnabled(false);
                 btn4.setEnabled(false);
                 btn5.setEnabled(false);
                 btn6.setEnabled(false);
                 btn7.setEnabled(false);
                 btn8.setEnabled(false);
                 JOptionPane.showMessageDialog(null , "Congrats You Won The Match !!!");
        }
    }//GEN-LAST:event_btn8ActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Puzzle1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puzzle1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puzzle1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puzzle1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Instructions s = new Instructions();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.TextField textField1;
    private java.awt.TextField txtClicks;
    private java.awt.TextField txtPlayername;
    // End of variables declaration//GEN-END:variables

}
