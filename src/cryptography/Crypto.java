/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.border.TitledBorder;

/**
 *
 * @author resultugay
 */
public class Crypto extends javax.swing.JFrame {

    /**
     * Creates new form Crypto
     */
    public Crypto() {       
        initComponents();
        Image2Button.setEnabled(false);
        jButton3.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browse1 = new javax.swing.JFileChooser();
        browse2 = new javax.swing.JFileChooser();
        Image2Button = new javax.swing.JButton();
        Image1Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Image2Label = new javax.swing.JLabel();
        Image1Label = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        Image1Label1 = new javax.swing.JLabel();
        cryptImageLabel = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crypt Your Images");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(375, 100, 300, 300));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Image2Button.setText("Image  2");
        Image2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Image2ButtonActionPerformed(evt);
            }
        });

        Image1Button.setText("Image 1");
        Image1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Image1ButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Firstly,Please choose an image to hide your secret image");

        jLabel2.setText("Image to encript!");

        Image1Label.setMaximumSize(new java.awt.Dimension(132, 139));
        Image1Label.setPreferredSize(new java.awt.Dimension(132, 139));

        jButton3.setText("Crypt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Image1Label1.setMaximumSize(new java.awt.Dimension(132, 139));
        Image1Label1.setPreferredSize(new java.awt.Dimension(132, 139));

        ProgressBar.setStringPainted(true);

        jLabel3.setText("Crypted Image was saved to ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Image1Button, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(Image1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(cryptImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Image2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Image2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(Image1Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(338, 338, 338)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Image2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Image1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Image2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Image1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cryptImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(Image1Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(144, 144, 144)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Image1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Image1ButtonActionPerformed
            //user is being forced unless choose an image.  
                while(true){                    
                 file1 = chooseFile(browse1).getSelectedFile();
                if(getImage(file1) == true){
                   break;}
                }
                  try{
           //The image is written to the label to help user in order to understand
           //which image was chosen.      
                      BufferedImage img = null;
                      Image1 = ImageIO.read(file1);
                      Image dimg = Image1.getScaledInstance(Image1Label.getWidth(), Image1Label.getHeight(),Image.SCALE_DEFAULT);
                      ImageIcon icon = new ImageIcon(dimg);
                      Image1Label.setIcon(icon);
                      Image2Button.setEnabled(true);
                      Image1Job crypto = new Image1Job();
                      crypto.start();   
                    }catch(IOException w){
                       JOptionPane.showMessageDialog(rootPane, "Error!!!" + errorLabel.getText());
                     }
                  
    }//GEN-LAST:event_Image1ButtonActionPerformed
 
    
    private void Image2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Image2ButtonActionPerformed
                  //user is being forced unless choose an image.
                while(true){                    
                 file2 = chooseFile(browse2).getSelectedFile();
                if(getImage(file2) == true){
                   break;}
                }
                  try{
           //The image is written to the label to help user in order to understand
           //which image was chosen.      
                      BufferedImage img = null;
                      Image2 = ImageIO.read(file2);
                      Image dimg = Image2.getScaledInstance(Image2Label.getWidth(), Image2Label.getHeight(),Image.SCALE_DEFAULT);
                      ImageIcon icon = new ImageIcon(dimg);
                      Image2Label.setIcon(icon);
                      jButton3.setEnabled(true);
                      Image2Job encrypto = new Image2Job();
                      encrypto.start();   
                    }catch(IOException w){
                       JOptionPane.showMessageDialog(rootPane, "Error!!!" + errorLabel.getText());
                     }
    }//GEN-LAST:event_Image2ButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        CryptoJob crypto = new CryptoJob();
        crypto.start();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Crypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crypto().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Image1Button;
    private static javax.swing.JLabel Image1Label;
    private javax.swing.JLabel Image1Label1;
    public static javax.swing.JButton Image2Button;
    private static javax.swing.JLabel Image2Label;
    public static javax.swing.JProgressBar ProgressBar;
    private javax.swing.JFileChooser browse1;
    private javax.swing.JFileChooser browse2;
    private static javax.swing.JLabel cryptImageLabel;
    public static javax.swing.JLabel errorLabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
    static File file1;
    static File file2;
    static BufferedImage Image1;
    static BufferedImage Image2;
    //Return Which File is selected.     
        public JFileChooser chooseFile(JFileChooser browser){
                    int control;
           
                browser = new JFileChooser();
               // browser.addChoosableFileFilter(new ImageFilter());
                control = browser.showDialog(this, "add");
            while(control == 1){
                        
                        JOptionPane.showMessageDialog(rootPane, "Please choose images: ");
                        control = browser.showOpenDialog(this);
               }
              return browser;
        }
         // to control Image is really image or not!
            public boolean getImage(File file){            
            try{
              BufferedImage  img = ImageIO.read(file);
               img.getHeight();
               }catch(Exception e){
                JOptionPane.showMessageDialog(null, "The Image could not open please choose another one!!");
               return false;          
            }
            return true;
        }
               
    public static JLabel getImage1Label(){
        return Image1Label;
    }
    public static JLabel getImage2Label(){
        return Image2Label;
    }
    public static JLabel getImage3Label(){
        return cryptImageLabel;
    }


}