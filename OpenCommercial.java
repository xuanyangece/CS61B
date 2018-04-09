package hw1;
/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    try {
    	// Create an instance of URL.
        URL url = new URL("http://www." + inputLine + ".com");
        
        try {
        	InputStream is = url.openStream();
        	InputStreamReader isr = new InputStreamReader(is, "utf-8");
        	
        	// Load content from URL and store them.
        	BufferedReader br = new BufferedReader(isr);
        	String[] data = new String[5];
        	for (int i = 0; i < data.length; i++) {
        		data[i] = br.readLine();
        	}
        		
        	// Output the first five lines in reserve order.
        	for (int i = data.length-1; i >= 0; i--) {
        		System.out.println(data[i]);
        	}
        	br.close();
        	isr.close();
        	is.close();
        } catch (IOException e) {
        	e.printStackTrace();
        }
    } catch (MalformedURLException e) {
    	e.printStackTrace();
    }
    
  }
}
