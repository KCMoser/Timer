import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

//@author Kyle Moser

public class SplashScreen extends JWindow {
  private int duration;

  public SplashScreen(int d) {
    duration = d;
  }

  // A simple method to show a title screen in the center
  // of the screen for the amount of time given in the constructor
  public void showSplash(){
    JPanel content = (JPanel) getContentPane();
    content.setBackground(Color.white);

    // Set the window's bounds, centering the window
    int width = 350;
    int height = 300;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screen.width - width) / 2;
    int y = (screen.height - height) / 2;
    setBounds(x, y, width, height);

    // Build the splash screen
    JLabel progname = new JLabel("Real Time Process Monitor v2.9",JLabel.CENTER);
    Image logoimage = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Logo.gif"));
    JLabel label = new JLabel(new ImageIcon(logoimage));
    JLabel copyrt = new JLabel("© Copyright 2013-2014, Kyle Moser",JLabel.CENTER);
    progname.setFont(new Font("Sans-Serif", Font.BOLD, 21));
    copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
    content.add(progname, BorderLayout.NORTH);
    content.add(label, BorderLayout.CENTER);
    content.add(copyrt, BorderLayout.SOUTH);
    Color oraRed = new Color(156, 20, 20, 255);
    content.setBorder(BorderFactory.createLineBorder(oraRed, 5));

    setVisible(true);                                               //Display screen

    try {                                                           // Wait for xx seconds.
      Thread.sleep(duration);
    } catch (Exception e) {
    }
    setVisible(false);                                              //Remove display
    this.dispose();                                                 //Close file
    StatusScreen ss = new StatusScreen();                 //Run program
    ss.showStatusScreen();
  }
}