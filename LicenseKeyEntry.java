
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


// @author Kyle Moser

public class LicenseKeyEntry extends javax.swing.JFrame {
    public String keyCode;                                                      //Variable to load data entry into.

    public LicenseKeyEntry() {
        initComponents();
        setIcon();                                                              //Pull icon into title bar.
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
        jLabel1 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        keyField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter License Code Below");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jLabel1.setVerifyInputWhenFocusTarget(false);

        okButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        okButton.setText("OK");
        okButton.setToolTipText("");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        keyField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        keyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        keyField.setToolTipText("");

        jLabel2.setText("example:  1ABC-2DEF-3GHI-4JKL-5MNO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(okButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keyField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(keyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(okButton)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
     keyCode =  keyField.getText();                                             //Pull data from data field into variable.
     if(!keyCode.equalsIgnoreCase("JDU3-AJS9-86DF-SASF-AXF9")){                 //Compare entry, case irrelevant.
         setVisible(false);                                                     //Hide original message box.
         this.dispose();                                                        //Kill the process.
         JOptionPane.showMessageDialog(null, "Invalid License Key", "Error", JOptionPane.ERROR_MESSAGE);
         this.dispose();                                                        //Kill the process.
         LicenseKeyEntry lke = new LicenseKeyEntry();                           //Launch to license key entry screen.
         lke.showLicenseKeyEntry();                                             //Launch to license key entry screen.
     }
     else { 
            setVisible(false);                                                  //Closes message box.
            this.dispose();                                                     //Kill the process.
            JOptionPane.showMessageDialog(null, "License Key Successfully Added", "Thank You", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);                                                  //Closes message box.
            this.dispose();                                                     //Kill the process.
                if(OSFinder.isUnix()){                                          //Uses OSFinder class to determine how to write to disk.
                    File f = new File("//usr/share/pixmaps/"+"ebcf972b0a35b3832448b284902e2db1"+".txt"); //Create file named with Hashcode for comparison.
                    try {                                                                  //Make license file on hard drive.
                        f.createNewFile();                                                 //Make license file on hard drive.
                    } catch (IOException ex) {                                             //Make license file on hard drive.
                    Logger.getLogger(LicenseKeyEntry.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else if(OSFinder.isWindows()){                                  //Uses OSFinder class to determine how to write to disk.
                    File f = new File("C:\\Drivers\\"+"ebcf972b0a35b3832448b284902e2db1"+".txt"); //Create file named with Hashcode for comparison.
                    try {                                                                  //Make license file on hard drive.
                        f.createNewFile();                                                 //Make license file on hard drive.
                    } catch (IOException ex) {                                             //Make license file on hard drive.
                    Logger.getLogger(LicenseKeyEntry.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            Baseline b = new Baseline();                                        //Send back to license check.
            b.testIfExpired();
        }
    }//GEN-LAST:event_okButtonActionPerformed
private void setIcon() {                                                        //Method to pull image for Icon.
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));  //Method to pull image for Icon.
    }                                                                           //Method to pull image for Icon.
    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
    public void showLicenseKeyEntry(){                                          //Launch screen for license key entry.
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
            java.util.logging.Logger.getLogger(LicenseKeyEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LicenseKeyEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LicenseKeyEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LicenseKeyEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LicenseKeyEntry().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField keyField;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
