
import static java.awt.Color.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class TIC_TAC_TOE_FRAME extends javax.swing.JFrame {

    private String turn; 
    private int oCount, xCount, totalCount;
    
    public TIC_TAC_TOE_FRAME() {
        initComponents();
        turn = "O";
        oCount =0;
        xCount=0;
        totalCount=0;
    }
    
    void choosePlayer()
    {
        if(turn.equals("O"))
        {
            turn ="X";
        }
        else
        {
            turn ="O";
        }
    }
    
    void updateScore()
    {
        varO.setText(String.valueOf(oCount));
        varX.setText(String.valueOf(xCount));
    }
    void checkWin()
    {
        //getting text from a particular box  
        String b1 = Button1.getText();
        String b2 = Button2.getText();
        String b3 = Button3.getText();
        String b4 = Button4.getText();
        String b5 = Button5.getText();
        String b6 = Button6.getText();
        String b7 = Button7.getText();
        String b8 = Button8.getText();
        String b9 = Button9.getText();
        
        if(b1.equals(b2) && b2.equals(b3) && !b1.equals(""))  
        {
            Button1.setBackground(green);
            Button2.setBackground(green);
            Button3.setBackground(green);
            
            JOptionPane.showMessageDialog(this,"Player "+ turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            //to increse score of winner 
            if(turn.equals("O"))
            {
                oCount++;    
            }
            else
            {
                xCount++;
            }
            
            updateScore();  //updating scorecard
            resetGame();    //automatically reset the game 

            
        }
        
        else if(b4.equals(b5) && b5.equals(b6) && !b4.equals(""))  
        {
           
            
            Button4.setBackground(green);
            Button5.setBackground(green);
            Button6.setBackground(green);
            
             JOptionPane.showMessageDialog(this,"Player "+ turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            resetGame();

            updateScore();
        }
        
        else if(b7.equals(b8) && b8.equals(b9) && !b7.equals(""))  
        {
           
            
            Button7.setBackground(green);
            Button8.setBackground(green);
            Button9.setBackground(green);
            
             JOptionPane.showMessageDialog(this,"Player "+ turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            resetGame();

            updateScore();
        }
        
        else if(b1.equals(b4) && b4.equals(b7) && !b1.equals(""))  
        {
            
            
            Button1.setBackground(green);
            Button4.setBackground(green);
            Button7.setBackground(green);
            
             JOptionPane.showMessageDialog(this,"Player "+ turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            resetGame();

            updateScore();
        }
        
        else if(b2.equals(b5) && b5.equals(b8) && !b2.equals(""))  
        {
           
            
            Button2.setBackground(green);
            Button5.setBackground(green);
            Button8.setBackground(green);
            
             JOptionPane.showMessageDialog(this,"Player "+ turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            resetGame();

            updateScore();
        }
        
        else if(b3.equals(b6) && b6.equals(b9) && !b3.equals(""))  
        {
            
            
            Button3.setBackground(green);
            Button6.setBackground(green);
            Button9.setBackground(green);
            
             JOptionPane.showMessageDialog(this,"Player "+ turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            resetGame();

            updateScore();
        }
        
        else if(b1.equals(b5) && b5.equals(b9) && !b1.equals(""))  
        {
            
            
            Button1.setBackground(green);
            Button5.setBackground(green);
            Button9.setBackground(green);
            
             JOptionPane.showMessageDialog(this,"Player "+ turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            resetGame();

            updateScore();
        }
        
        else if(b3.equals(b5) && b5.equals(b7) && !b3.equals(""))  
        {
            
            
            Button3.setBackground(green);
            Button5.setBackground(green);
            Button7.setBackground(green);
            
             JOptionPane.showMessageDialog(this,"Player "+ turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            resetGame();

            updateScore();
        }
        
        else if(totalCount==9)
        {
            JOptionPane.showMessageDialog(this, "Draw !", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }
    
    public void invokeButton(JButton btn)
    {
        // check if button is alreday filled or not .. if yes then dont do anything to that 
        if(!(btn.getText().equals("")))
        {
            return;
        }
        
        //if not then 
        btn.setText(turn);   // set whatever the turn value is
        totalCount++;            // counting total blanks i filled with o or x so i can make a drwa condition if no one wins
        
        if(turn.equals("O"))
        {
            btn.setForeground(red); 
        }
        else
        {
            btn.setForeground(black);
        }
        checkWin();
        choosePlayer();
    }

    void resetGame()
    {
        //for resetting i made all the boxes text empty
        Button1.setText("");
        Button2.setText("");
        Button3.setText("");
        Button4.setText("");
        Button5.setText("");
        Button6.setText("");
        Button7.setText("");
        Button8.setText("");
        Button9.setText("");
        
        // for winners background of 3 boxes changes to green so make all background white
        Button1.setBackground(white);
        Button2.setBackground(white);
        Button3.setBackground(white);
        Button4.setBackground(white);
        Button5.setBackground(white);
        Button6.setBackground(white);
        Button7.setBackground(white);
        Button8.setBackground(white);
        Button9.setBackground(white);
        
        totalCount=0;   // make total count to 0;  
        
        
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Buttonexit = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Buttonreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Player1 = new javax.swing.JLabel();
        Player2 = new javax.swing.JLabel();
        varO = new javax.swing.JLabel();
        varX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE GAME ");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Button2.setBackground(new java.awt.Color(242, 242, 242));
        Button2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        Button2.setOpaque(true);
        Button2.setPreferredSize(new java.awt.Dimension(400, 400));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(242, 242, 242));
        Button3.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        Button3.setOpaque(true);
        Button3.setPreferredSize(new java.awt.Dimension(400, 400));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(242, 242, 242));
        Button1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        Button1.setOpaque(true);
        Button1.setPreferredSize(new java.awt.Dimension(400, 400));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(242, 242, 242));
        Button4.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        Button4.setOpaque(true);
        Button4.setPreferredSize(new java.awt.Dimension(400, 400));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(242, 242, 242));
        Button5.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        Button5.setOpaque(true);
        Button5.setPreferredSize(new java.awt.Dimension(400, 400));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(242, 242, 242));
        Button6.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        Button6.setOpaque(true);
        Button6.setPreferredSize(new java.awt.Dimension(400, 400));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button7.setBackground(new java.awt.Color(242, 242, 242));
        Button7.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        Button7.setOpaque(true);
        Button7.setPreferredSize(new java.awt.Dimension(400, 400));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setBackground(new java.awt.Color(242, 242, 242));
        Button8.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        Button8.setOpaque(true);
        Button8.setPreferredSize(new java.awt.Dimension(400, 400));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Buttonexit.setBackground(new java.awt.Color(255, 51, 51));
        Buttonexit.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Buttonexit.setForeground(new java.awt.Color(255, 255, 255));
        Buttonexit.setText("EXIT");
        Buttonexit.setPreferredSize(new java.awt.Dimension(400, 400));
        Buttonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonexitActionPerformed(evt);
            }
        });

        Button9.setBackground(new java.awt.Color(242, 242, 242));
        Button9.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        Button9.setOpaque(true);
        Button9.setPreferredSize(new java.awt.Dimension(400, 400));
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Buttonreset.setBackground(new java.awt.Color(0, 51, 204));
        Buttonreset.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Buttonreset.setForeground(new java.awt.Color(255, 255, 255));
        Buttonreset.setText("RESET");
        Buttonreset.setPreferredSize(new java.awt.Dimension(400, 400));
        Buttonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonresetActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ScoreCard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Player1.setBackground(new java.awt.Color(0, 0, 0));
        Player1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Player1.setForeground(new java.awt.Color(255, 0, 0));
        Player1.setText("PlayerO");

        Player2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Player2.setText("PlayerX");

        varO.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        varO.setForeground(new java.awt.Color(255, 0, 0));
        varO.setText("0");

        varX.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        varX.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Player1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player2))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varO)
                    .addComponent(varX))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player1)
                    .addComponent(varO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player2)
                    .addComponent(varX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Buttonreset, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buttonexit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buttonexit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonreset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonexitActionPerformed
       if(JOptionPane.showConfirmDialog(this,"Are you sure you want to QUIT","Tic Tac Toe",  JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
       {
           System.exit(0);
       }
    }//GEN-LAST:event_ButtonexitActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        invokeButton(Button1);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        invokeButton(Button2);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        invokeButton(Button3);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        invokeButton(Button4);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
       invokeButton(Button5);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        invokeButton(Button6);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        invokeButton(Button7);
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        invokeButton(Button8);
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
      invokeButton(Button9);
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonresetActionPerformed
        resetGame();
    }//GEN-LAST:event_ButtonresetActionPerformed

    
    
   
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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        if(JOptionPane.showConfirmDialog(null,"Let's Start","Let's Play Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.NO_OPTION)
        {
            System.exit(0);
        }
   
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_FRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton Buttonexit;
    private javax.swing.JButton Buttonreset;
    private javax.swing.JLabel Player1;
    private javax.swing.JLabel Player2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel varO;
    private javax.swing.JLabel varX;
    // End of variables declaration//GEN-END:variables
}
