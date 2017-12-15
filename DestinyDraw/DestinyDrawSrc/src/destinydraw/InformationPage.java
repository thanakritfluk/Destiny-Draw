/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package destinydraw;

import java.awt.Dimension;

/**
 *
 * @author Piyaphol Wiengperm
 * @author Thanakrit Daowrueang
 */
public class InformationPage extends javax.swing.JFrame {

    /**
     * Creates new form InformationPage
     */
    public InformationPage() {
        this.setPreferredSize(new Dimension(900, 600));
        this.setMinimumSize(new Dimension(900, 600));
        this.setLocationRelativeTo(null);
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

        playhelp = new javax.swing.JLabel();
        standhelp = new javax.swing.JLabel();
        moneyhelp = new javax.swing.JLabel();
        Hithelp = new javax.swing.JLabel();
        bethelp = new javax.swing.JLabel();
        Instruction = new javax.swing.JLabel();
        Detail = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        bethelp1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playhelp.setFont(new java.awt.Font("DIN Alternate", 0, 18)); // NOI18N
        playhelp.setForeground(new java.awt.Color(255, 255, 255));
        playhelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/playbutton.png"))); // NOI18N
        playhelp.setText("Start the round.");
        getContentPane().add(playhelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 270, 60));

        standhelp.setFont(new java.awt.Font("DIN Alternate", 0, 18)); // NOI18N
        standhelp.setForeground(new java.awt.Color(255, 255, 255));
        standhelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/standbutton.png"))); // NOI18N
        standhelp.setText("    Stop to check the result.");
        standhelp.setToolTipText("");
        getContentPane().add(standhelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 280, 50));

        moneyhelp.setFont(new java.awt.Font("DIN Alternate", 0, 18)); // NOI18N
        moneyhelp.setForeground(new java.awt.Color(255, 255, 255));
        moneyhelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Money.png"))); // NOI18N
        moneyhelp.setText("Show your money.");
        getContentPane().add(moneyhelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 240, 70));

        Hithelp.setFont(new java.awt.Font("DIN Alternate", 0, 18)); // NOI18N
        Hithelp.setForeground(new java.awt.Color(255, 255, 255));
        Hithelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hitbutton.png"))); // NOI18N
        Hithelp.setText("    Draw a card.");
        getContentPane().add(Hithelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 220, 50));

        bethelp.setFont(new java.awt.Font("DIN Alternate", 0, 18)); // NOI18N
        bethelp.setForeground(new java.awt.Color(255, 255, 255));
        bethelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/doublebutton.png"))); // NOI18N
        bethelp.setText("    Double your bet.");
        getContentPane().add(bethelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 250, 70));

        Instruction.setFont(new java.awt.Font("DIN Alternate", 0, 36)); // NOI18N
        Instruction.setForeground(new java.awt.Color(255, 255, 255));
        Instruction.setText("     Instruction");
        getContentPane().add(Instruction, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 250, -1));

        Detail.setFont(new java.awt.Font("DIN Alternate", 1, 16)); // NOI18N
        Detail.setForeground(new java.awt.Color(255, 255, 255));
        Detail.setText("<html> <body> <p>Rules:<p> <p>1) Start by player and dealer have 2 cards (with 1 card is fold).<p> <p>2) You start to decide what you want to do (hit or stand).<p> <p>3) Hit button is to draw a card and Stand button is to break.<p> <p>4) If you have sum of cards' value over 21, you will lose suddenly (bust).<p> <p>5) If your sum equals to dealer’s sum, It will draw and you will get back your bet.<p> <p>6) If you have sum of cards' value equals 21 when you start<p>(have 2 card), It called Blackjack.<p> <p>7) After you win the match you will get money back depends on your bet <p> <p>(if you got Blackjack you will get back 1.5 times of your bet).<p> </body> </html> ");
        getContentPane().add(Detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 510, 380));

        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/backbutton.png"))); // NOI18N
        Back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, 70));

        bethelp1.setFont(new java.awt.Font("DIN Alternate", 0, 18)); // NOI18N
        bethelp1.setForeground(new java.awt.Color(255, 255, 255));
        bethelp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BetMoney.png"))); // NOI18N
        bethelp1.setText("Show your bet.");
        getContentPane().add(bethelp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 210, 70));

        Background.setFont(new java.awt.Font("DIN Alternate", 0, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/helppage.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        PlayInterface.helpCheck = true;
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(InformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformationPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Detail;
    private javax.swing.JLabel Hithelp;
    private javax.swing.JLabel Instruction;
    private javax.swing.JLabel bethelp;
    private javax.swing.JLabel bethelp1;
    private javax.swing.JLabel moneyhelp;
    private javax.swing.JLabel playhelp;
    private javax.swing.JLabel standhelp;
    // End of variables declaration//GEN-END:variables
}
