import java.util.Calendar;
import java.io.File;
import javax.swing.JOptionPane;

//This file checks for an expiration date of the software and then
//checks for a license file on a linux or windows machine to be sure
//it is authorized.  If ok, software starts otherwise user is prompted.

// @author Kyle Moser

public class Baseline {
    Calendar expiration = Calendar.getInstance();                               //Create calendar object for expiration.
    Calendar now = Calendar.getInstance();                                      //Get current date.
    
    Baseline() {
        expiration.set(2017, 11, 31, 0, 0);                                     // Set expiration at 2017, Dec, 31, times.   
    }
    public void testIfExpired() {
        if( now.after(expiration)) {                                            //error for out of time.
            JOptionPane.showMessageDialog(null,"Please puchase new license key", 
                    "Your Software Has Expired.", JOptionPane.ERROR_MESSAGE);
        }
        else if(OSFinder.isUnix()){                                             //For Raspberry PI
            File f = new File("//usr/share/pixmaps/"+"ebcf972b0a35b3832448b284902e2db1"+".txt"); //Create file named with Hashcode for comparison.
            if(!f.exists()){                                                    //If file doesn't exist prompt to enter.
            if(JOptionPane.showConfirmDialog(null, "Would you like to enter license key?", "Unlicensed Version",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {             //Yes/No Box.
                //Not licensed option.
                LicenseKeyEntry lke = new LicenseKeyEntry();                    //Launch to license key entry screen.
                lke.showLicenseKeyEntry();                                      //Launch to license key entry screen.
            }
            }
            else { 
            SplashScreen splash = new SplashScreen(3000);                       //Run splash screen for 5 seconds
            splash.showSplash();
            }
        }
        else if(OSFinder.isWindows()){                                          //Check to see if it is a windows machine.
            File f = new File("C:\\Drivers\\"+"ebcf972b0a35b3832448b284902e2db1"+".txt");    //Create file named with Hashcode for comparison.
            if(!f.exists()){                                                    //If file doesn't exist prompt to enter.
            if(JOptionPane.showConfirmDialog(null, "Would you like to enter license key?", "Unlicensed Version",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {             //Yes/No Box.
                //Not licensed option.
                LicenseKeyEntry lke = new LicenseKeyEntry();                    //Launch to license key entry screen.
                lke.showLicenseKeyEntry();                                      //Launch to license key entry screen.
            }
            }
            else { 
            SplashScreen splash = new SplashScreen(3000);                       //Run splash screen for 5 seconds
            splash.showSplash();
            }
        }
}
}