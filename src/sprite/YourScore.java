/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprite;


/**
 *
 * @author Ridho
 */

public class YourScore extends javax.swing.JFrame {

    /**
     * Creates new form YourScore
     */
    public static MainMenu menu = new MainMenu ();
    Board board = new Board();
    
    public YourScore() {

    }

    YourScore(Board th) {
        initComponents();
        this.board=th;
        String tampung = Integer.toString(board.getScore());
        skor.setText(tampung);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        skor = new javax.swing.JLabel();
        YourScore = new javax.swing.JLabel();
        BackToMenu = new javax.swing.JButton();
        titik = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        skor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(skor);
        skor.setBounds(290, 170, 50, 40);

        YourScore.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        YourScore.setText("Your Score");
        jPanel1.add(YourScore);
        YourScore.setBounds(230, 110, 170, 60);

        BackToMenu.setBackground(new java.awt.Color(255, 255, 255));
        BackToMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackToMenu.setText("Back To Menu");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenu);
        BackToMenu.setBounds(460, 300, 150, 40);

        titik.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titik.setText("------------------------");
        jPanel1.add(titik);
        titik.setBounds(150, 190, 320, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridho\\Documents\\NetBeansProjects\\Sprite\\src\\resources\\kosong.JPG")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackToMenuActionPerformed
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
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HighScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        YourScore X = new YourScore();
        X.setVisible(true);
            
            
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenu;
    private javax.swing.JLabel YourScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel skor;
    private javax.swing.JLabel titik;
    // End of variables declaration//GEN-END:variables

}
