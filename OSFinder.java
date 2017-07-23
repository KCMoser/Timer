// @author Kyle Moser
public class OSFinder {
    public static String OS = System.getProperty("os.name").toLowerCase();
    public static String JVersion = System.getProperty("java.version");         //Pull JVM version from system as String value.
	//public static void main(String[] args) {
        public void findOSType() {
		//System.out.println(OS);                                       //Here for testing
                //System.out.println(JVersion);                                 //Here for testing
		/*if (isWindows()) {
			System.out.println("This is Windows");                  //Condition if Windows
		} 
                else if (isMac()) {
			System.out.println("This is Mac");                      //Condition if Mac
		} 
                else if (isUnix()) {
			System.out.println("This is Unix or Linux");            //Condition if Linux
		} 
                else {
			System.out.println("Your OS is not support!!");
		}
                */
                /*if (isJava6()) {                                              //Condition if Java 6
			//System.out.println("This is Java version 6");
		} 
                else if (isJava7()) {                                           //Condition if Java 7
			//System.out.println("This is Java version 7");
		}
                else if (isJava8()) {                                           //Condition if Java 8
			//System.out.println("This is Java version 8");
		}
                else {                                                          //Condition if Unsupported version.
                    //System.out.println("Your version of Java is not supported");
                    
		}
                */
        }
        //Begins OS value testing..
	public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}
	public static boolean isMac() {
		return (OS.indexOf("mac") >= 0);
	}
	public static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
	}
	public static boolean isSolaris() {
		return (OS.indexOf("sunos") >= 0);
	}
        //Begins JVM value testing..
        public static boolean isJava6() {
		return (JVersion.indexOf("1.6") >= 0);
        }
        public static boolean isJava7() {
		return (JVersion.indexOf("1.7") >= 0);
        }
        public static boolean isJava8() {
		return (JVersion.indexOf("1.8") >= 0);
        }
}