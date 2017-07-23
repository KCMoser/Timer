import javax.swing.JOptionPane;
import java.io.IOException;
import java.net.URISyntaxException;
        
//This is the start of this software package.

// @author Kyle Moser

public class Entrypoint {
    public static String getNewVersion = "http://www.java.com/download";        //Web address assigned to String for use.

    public static void main(String[] args) throws IOException, URISyntaxException {
        if(OSFinder.isJava6()){
            if(JOptionPane.showConfirmDialog(null, "You have an outdated version of Java on this machine.\n"+
                    "Would you like to upgrage now?", "Outdated Java Version",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {             //Yes/No Box.
                //Not licensed option.
            java.awt.Desktop myNewBrowserDesktop = java.awt.Desktop.getDesktop();   //Create desktop variable for local browser.
            java.net.URI getUpdate = new java.net.URI(getNewVersion);               //Pass URL to variable.
            myNewBrowserDesktop.browse(getUpdate);                                  //Open browser with URL.
            }
        }
        else if(OSFinder.isJava7()){
            SplashScreen splash = new SplashScreen(3000);                         //Uncomment this to skip all license checking & run splash screen
            splash.showSplash();                                                  //Uncomment this to skip all license checking & run splash screen
            //Baseline b = new Baseline();                                            //Uncomment to Send to license check.
            //b.testIfExpired();
        }
        else if(OSFinder.isJava8()){
            SplashScreen splash = new SplashScreen(3000);                         //Uncomment this to skip all license checking & run splash screen
            splash.showSplash();                                                  //Uncomment this to skip all license checking & run splash screen
            //Baseline b = new Baseline();                                            //Uncomment to Send to license check.
            //b.testIfExpired();
        }
    }
}