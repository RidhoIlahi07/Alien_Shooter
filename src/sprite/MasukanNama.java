/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprite;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ridho
 */
public class MasukanNama extends javax.swing.JFrame {

    /**
     * Creates new form MasukanNama
     */
    public static Loading loading = new Loading();
    public static MainMenu mn = new MainMenu();
    public DataBase db = new DataBase();
    public String nama;
    public MasukanNama() {
        initComponents();
        db.connect();   
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
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Okbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        cancel.setText("Cencel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(190, 220, 80, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Enter Your Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 110, 220, 50);

        Okbutton.setText("OK");
        Okbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Okbutton);
        Okbutton.setBounds(370, 220, 80, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("-----------------------");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 180, 300, 44);

        Nama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nama.setBorder(null);
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        jPanel1.add(Nama);
        Nama.setBounds(190, 160, 260, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridho\\Documents\\NetBeansProjects\\Sprite\\src\\resources\\kosong.JPG")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 640, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkbuttonActionPerformed
        nama=Nama.getText();
        new CollisionEx (nama).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OkbuttonActionPerformed
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        
    }//GEN-LAST:event_NamaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Okbutton;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}