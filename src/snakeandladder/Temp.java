/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeandladder;

import java.io.Serializable;
import javax.swing.JLabel;

/**
 *
 * @author SampritBiswas
 * Roll : 11CS10038
 */
public class Temp extends javax.swing.JFrame implements Serializable{

    /**
     * Creates new form Temp
     */
    public Temp() {
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

        twoButtonsLabel = new javax.swing.JLabel();
        dice1 = new javax.swing.JLabel();
        threeButtonsLabel = new javax.swing.JLabel();
        button13 = new javax.swing.JLabel();
        button23 = new javax.swing.JLabel();
        snakePic = new javax.swing.JLabel();
        ladderImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        twoButtonsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/twobuttons.png"))); // NOI18N

        dice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/face1.jpg"))); // NOI18N

        threeButtonsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/threeButton.png"))); // NOI18N

        button13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/button13.png"))); // NOI18N

        button23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/button23.png"))); // NOI18N

        snakePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/snakec.png"))); // NOI18N

        ladderImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/ladder.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button13))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(snakePic)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                                        .addComponent(button23)
                                        .addGap(124, 124, 124))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(154, 154, 154)
                                        .addComponent(ladderImage)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dice1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(threeButtonsLabel)))))
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(twoButtonsLabel)
                    .addContainerGap(351, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(dice1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(threeButtonsLabel)))
                .addGap(45, 45, 45)
                .addComponent(button13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button23)
                        .addGap(13, 13, 13)
                        .addComponent(ladderImage))
                    .addComponent(snakePic))
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(twoButtonsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addGap(122, 122, 122)))
        );

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
            java.util.logging.Logger.getLogger(Temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel button13;
    private javax.swing.JLabel button23;
    private javax.swing.JLabel dice1;
    private javax.swing.JLabel ladderImage;
    private javax.swing.JLabel snakePic;
    private javax.swing.JLabel threeButtonsLabel;
    private javax.swing.JLabel twoButtonsLabel;
    // End of variables declaration//GEN-END:variables

    public JLabel getTwoLabel(){
        return twoButtonsLabel;
    }
    public JLabel getThreeLabel(){
        return threeButtonsLabel;
    }
    public JLabel getDice1(){
        return dice1;
    }
    public JLabel get13Button(){
        return button13;
    }
    public JLabel get23Button(){
        return button23;
    }
    public JLabel getSnake(){
        return snakePic;
    }
    public JLabel getLadder(){
        return ladderImage;
    }
}