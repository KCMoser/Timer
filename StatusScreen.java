import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.RED;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

// @author Kyle Moser

class StatusScreen extends javax.swing.JFrame {
    public String newProductCode;
    Timer timer;
    public Boolean pauseClicked = false;            //setting up timer button variable.
    public Boolean helpClicked = false;             //setting up help button variable.
    public StatusScreen() {                         //Creates new form StatusScreen
        initComponents();
        setIcon();                                  //Calls the icon into the titlebar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parttextfield = new javax.swing.JTextField();
        TextLabel = new javax.swing.JLabel();
        AllottedTime = new javax.swing.JTextField();
        timerLabel = new javax.swing.JLabel();
        pauseButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Real Time Process Monitor");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        parttextfield.setBackground(new java.awt.Color(0, 0, 0));
        parttextfield.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        parttextfield.setForeground(new java.awt.Color(255, 255, 255));
        parttextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        parttextfield.setAutoscrolls(false);
        parttextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parttextfieldActionPerformed(evt);
            }
        });

        TextLabel.setBackground(new java.awt.Color(0, 0, 0));
        TextLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TextLabel.setForeground(new java.awt.Color(255, 255, 255));
        TextLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TextLabel.setText("Time Allocated:");
        TextLabel.setFocusable(false);
        TextLabel.setOpaque(true);

        AllottedTime.setEditable(false);
        AllottedTime.setBackground(new java.awt.Color(0, 0, 0));
        AllottedTime.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        AllottedTime.setForeground(new java.awt.Color(255, 255, 255));
        AllottedTime.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        AllottedTime.setBorder(null);
        AllottedTime.setFocusable(false);

        timerLabel.setBackground(new java.awt.Color(0, 0, 0));
        timerLabel.setFont(new java.awt.Font("Tahoma", 1, 230)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setFocusable(false);
        timerLabel.setOpaque(true);

        pauseButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pauseButton.setText("Pause or Run New Product");
        pauseButton.setFocusable(false);
        pauseButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        helpButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        helpButton.setText("Request Help");
        helpButton.setFocusable(false);
        helpButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pauseButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AllottedTime)
                        .addGap(113, 113, 113))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parttextfield, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(helpButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parttextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pauseButton)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextLabel)
                    .addComponent(AllottedTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(helpButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(JFrame.MAXIMIZED_BOTH);                                //Maximizes window.
    }//GEN-LAST:event_formWindowOpened

    private void parttextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parttextfieldActionPerformed
        newProductCode = parttextfield.getText();           //This is where I assign the input to a String object.
        if (timer != null) {                                //This is to stop previous timer if still active.
        timer.stop();                                       //This is to stop previous timer if still active.
        }                                                   //This is to stop previous timer if still active.
        //System.out.println(newProductCode);               //This line is for testing of data input.
        UniqueReadAndSearch rs = new UniqueReadAndSearch(); //Sending keyboard input to method readIt of class ReadAndSearch
        rs.readIt(newProductCode);                          //Sending keyboard input to method readIt of class ReadAndSearch
        try {
            String name = Item.getName()+",Begins";                //Retrieve item name and assign to variable.
            int status = Integer.parseInt(Item.getTime());         //Retrieve timer data and assign to variable.
            WriteToTextFile writenow = new WriteToTextFile();      //Creating object to trigger filewrite.
            writenow.runWriteToTextFile(name, status);             //Writing to file with name variable.
            String t = Item.getTime();                      //Pulling time data into String variable "t"
            timerLabel.setBackground(Color.BLACK);          //put here to reset colors when running parts back to back
            timerLabel.setForeground(Color.WHITE);          //put here to reset colors when running parts back to back
            int convertedtime = Integer.parseInt(t);        //Convert string variable "t" into integer for countdown.
            timerLabel.setText(convertedtime+" Left");      //This is the first displayed element, then it is passed to TimeClass.
            TimeClass tc = new TimeClass(convertedtime);    //setting up tc object
            timer = new Timer(60000, tc);                   //tc is the actionListener the timer is waiting on.
            timer.start();                                  //
            AllottedTime.setText(Item.getTime()+" Minutes");//Setting target time on screen.
            parttextfield.setText(Item.getName());          //Loading part number in text field.
            pauseButton.setText("Pause or Run New Product");//Reset button text if it is a part change.
            helpButton.setBackground(Color.GRAY);           //Reset button text if it is a part change.
            pauseButton.setBackground(Color.GRAY);          //Reset button color back to normal when paused.
            helpButton.setText("Request Help");             //Reset button text if it is a part change.
            pauseClicked = false;                           //Reset button if it is a part change.
            helpClicked = false;                            //Reset button if it is a part change.
            parttextfield.selectAll();                      //Putting in to test not having to click in the field before rescan
        }
        catch(NumberFormatException e) {                    //error handling disables counter.
                String message = "Item record not on file.";
                String title = "Invalid Data";
                JOptionPane.showMessageDialog(this, message, title, JOptionPane.ERROR_MESSAGE);
                parttextfield.selectAll();                      //Putting in to test not having to click in the field before rescan
            }
    }//GEN-LAST:event_parttextfieldActionPerformed

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        if (pauseClicked == false) {                                // Code below changes button text back and forth.       *****
            pauseClicked = true;
            pauseButton.setText("Resume from Pause");               //Change button text when pressed.
            pauseButton.setBackground(Color.ORANGE);                //Change button color when paused.
            timer.stop();
            String name = Item.getName()+",Stopped";                //Retrieve item name and assign to variable.
            int status = Item.getRemTime();                         //Retrieve timer data and assign to variable.
            WriteToTextFile writenow = new WriteToTextFile();       //Creating object to trigger filewrite.
            writenow.runWriteToTextFile(name, status);              //Writing to file with name variable.
        }
        else {
                pauseClicked = false;
                pauseButton.setText("Pause or Run New Product");    //Change button text when pressed.
                pauseButton.setBackground(Color.GRAY);              //Change button color back to normal when paused.
                timer.start();
                String name = Item.getName()+",Restarted";          //Retrieve item name and assign to variable.
                int status = Item.getRemTime();                        //Retrieve timer data and assign to variable.
                WriteToTextFile writenow = new WriteToTextFile();   //Creating object to trigger filewrite.
                writenow.runWriteToTextFile(name, status);          //Writing to file with name variable.
        }
    }//GEN-LAST:event_pauseButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        if (helpClicked == false) {                               // Code below changes button text back and forth.       *****
            helpClicked = true;
            helpButton.setText("Resume from Help");               //Change button text when pressed.
            helpButton.setBackground(Color.WHITE);                //Change button color when paused.
            getContentPane().setBackground(RED);
            TextLabel.setBackground(RED);
            AllottedTime.setBackground(RED);
            parttextfield.setBackground(RED);
            //timer.stop();                                     //I don't want to impact timer for help.
            String name = Item.getName()+",help requested";     //Retrieve item name and assign to variable.
            int status = Item.getRemTime();                     //Retrieve timer data and assign to variable.
            WriteToTextFile writenow = new WriteToTextFile();   //Creating object to trigger filewrite.
            writenow.runWriteToTextFile(name, status);          //Writing to file with name variable.
        }
        else {
                helpClicked = false;
                helpButton.setText("Request Help");             //Change button text when pressed.
                helpButton.setBackground(Color.GRAY);           //Change button color back to normal when paused.
                getContentPane().setBackground(BLACK);
                TextLabel.setBackground(BLACK);
                AllottedTime.setBackground(BLACK);
                parttextfield.setBackground(BLACK);
                //timer.start();                                //I don't want to impact timer for help.
                String name = Item.getName()+",help resolved";  //Retrieve item name and assign to variable.
                int status = Item.getRemTime();                 //Retrieve timer data and assign to variable.
                WriteToTextFile writenow = new WriteToTextFile();   //Creating object to trigger filewrite.
                writenow.runWriteToTextFile(name, status);      //Writing to file with name variable.
        }
    }//GEN-LAST:event_helpButtonActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
    }
    public class TimeClass implements ActionListener {
        int counter;                                        //setting up a local variable for incrementing.
        int baseline;                                       //setting up a local variable to calculate %
        public TimeClass(int counter) {
            this.counter = counter;
            baseline = (int) (counter*.1);                  //Setting the "ok" level at 90% of start value (as integer).
        }
        public void actionPerformed(ActionEvent tc) {
          counter--;
          if(counter > baseline) {
              Item.setRemTime(counter);                     //send time to item method
              timerLabel.setText(counter+" Left");
          }
          else if(counter >= 0) {
              Item.setRemTime(counter);                     //send time to item method
              timerLabel.setText(counter+" Left");
              timerLabel.setForeground(Color.BLACK);
              timerLabel.setBackground(Color.YELLOW);
          }
          else {
              Item.setRemTime(counter);                     //send time to item method
              timerLabel.setForeground(Color.RED);
              timerLabel.setText(counter+" Over");
          }
        }
}
    //public static void main(String args[]) {
    public void showStatusScreen(){                                                         //Program entry point.
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
            java.util.logging.Logger.getLogger(StatusScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        StatusScreen ss = new StatusScreen();                                     //Sets Status screen as variable and assigns values.
        ss.setVisible(true);
        ss.getContentPane().setBackground(BLACK);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AllottedTime;
    private javax.swing.JLabel TextLabel;
    private javax.swing.JButton helpButton;
    private javax.swing.JTextField parttextfield;
    private javax.swing.JButton pauseButton;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
}