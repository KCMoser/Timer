// @author Kyle Moser
 
import java.io.*;

public class UniqueReadAndSearch {
    public String line;
    public String name;
    public String time;
    Item pt = new Item();                                                                       //Creating Item object called pt

        public void readIt(String newProductCode){                                              //method that takes screen input.
            String findMe = newProductCode;                                                     //assign value of data passed in to the findMe variable.
            //System.out.println(findMe);                                                       //This line is for testing of data input.
            if(OSFinder.isUnix()){                                                              //For Raspberry PI
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/pi/dataFile.csv")); // Open the file as a buffered reader.
			int linecount = 0;                                                      // Start a line count and declare a string to hold our current line.
			while (( line = br.readLine()) != null) {                               // Loops through each line, stashing the line into line variable.
    				linecount++;                                                    // Increment the count and find the index of the word.
    				int indexfound = line.indexOf(findMe.toUpperCase());            // Convert input to case match what is in data file.
                                if (indexfound > -1) {                                          // If greater than -1, means the word was found.
                                    String[] parts = line.split(",");                           // Splitting file lines by comma
                                    name = parts[0];                                            // Line split, this is the part number.
                                    time = parts[1];                                            // Line split, this is the time allocated.
                                //System.out.println(name+" found with time of "+time);         // Line added for testing.
                                break;                                                          // Added break to stop at first occurance.
                                }
			}
                        pt.setTime(time);
                        pt.setName(name);
			br.close();                                                             // Close the file after searching.
                }
		catch (IOException e) {
			System.out.println("IO Error Occurred: " + e.toString());
		}
            }
            else if(OSFinder.isWindows()){                                                              //For Windows
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\users\\public\\documents\\dataFile.csv")); // Open the file as a buffered reader.
			int linecount = 0;                                                      // Start a line count and declare a string to hold our current line.
			while (( line = br.readLine()) != null) {                               // Loops through each line, stashing the line into line variable.
    				linecount++;                                                    // Increment the count and find the index of the word.
    				int indexfound = line.indexOf(findMe.toUpperCase());            // Convert input to case match what is in data file.
    				if (indexfound > -1) {                                          // If greater than -1, means the word was found.
                                    String[] parts = line.split(",");                           // Splitting file lines by comma
                                    name = parts[0];                                            // Line split, this is the part number.
                                    time = parts[1];                                            // Line split, this is the time allocated.
                                //System.out.println(name+" found with time of "+time);         // Added line for testing.
                                break;                                                          // Added break to stop at first occurance.
                                }
			}
                        pt.setTime(time);
                        pt.setName(name);
			br.close();                                                             // Close the file after searching.
                }
		catch (IOException e) {
			System.out.println("IO Error Occurred: " + e.toString());
		}
        }
        }
}