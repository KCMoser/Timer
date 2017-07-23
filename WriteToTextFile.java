import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// @author Kyle Moser

public class WriteToTextFile {
    //public static void main( String[] args ) {
    public void runWriteToTextFile(String name, int status)  {
        if(OSFinder.isUnix()){                                                      //For Raspberry PI
    	try{
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd,HH:mm").format(Calendar.getInstance().getTime());   //Data for file
            String logFileName = new SimpleDateFormat("YYYY-MM").format(Calendar.getInstance().getTime());          //Filename
                File dirName = new File("//home/pi/");                              //Create directory as a variable.
    		File file =new File(dirName, logFileName+".csv");                   //Creates file with .csv extension
    		if(!file.exists()){                                                 //if file doesnt exists, then create it
    			file.createNewFile();                                       //if file doesnt exists, then create it
    		}                                                                   //if file doesnt exists, then create it
    		FileWriter fw = new FileWriter(new File(dirName, file.getName()),true);  //if file exists, append file in specified directory
    	        BufferedWriter bw = new BufferedWriter(fw);
    	        bw.write(timeStamp);                                                //Write timeStamp data
                bw.write(","+name);                                                 //Write item number
                bw.write(","+status);                                               //Write timer status
                bw.newLine();                                                       //Create new line.
    	        bw.close();                                                         //Close buffered writer
                //System.out.println("Ran PI filewriter");                            //Output for action testing.
    	}
        catch(IOException e){
    		e.printStackTrace();
    	} 
    }
        else if(OSFinder.isWindows()){                                              //For Windows
    	try{
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd,HH:mm").format(Calendar.getInstance().getTime());   //Data for file
            String logFileName = new SimpleDateFormat("YYYY-MM").format(Calendar.getInstance().getTime());          //Filename
                File dirName = new File("C:\\users\\public\\documents\\");          //Create directory as a variable.
    		File file =new File(dirName, logFileName+".csv");                    //Creates file with .csv extension in specified directory
    		if(!file.exists()){                                                 //if file doesnt exists, then create it
    			file.createNewFile();                                       //if file doesnt exists, then create it
    		}                                                                   //if file doesnt exists, then create it
                FileWriter fw = new FileWriter(new File(dirName, file.getName()),true);  //if file exists, append file in specified directory
    	        BufferedWriter bw = new BufferedWriter(fw);
    	        bw.write(timeStamp);                                                //Write timeStamp data
                bw.write(","+name);                                                 //Write item number
                bw.write(","+status);                                               //Write timer status
                bw.newLine();                                                       //Create new line.
    	        bw.close();                                                         //Close buffered writer
                //System.out.println("Ran Windows filewriter");                       //Output for action testing.
    	}
        catch(IOException e){
    		e.printStackTrace();
    	} 
    }
}
}