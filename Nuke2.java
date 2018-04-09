package hw1;
/* Nuke2.java */

import java.io.*;

/** A class whose main method reads a string from the keyboard and prints the same string,
 *  with its second character removed.
 */

public class Nuke2 {
	
	/** Prompts the user to input a string, prints the string back without its second character.
	 *  @param args is not used.
     *  @exception Exception thrown if there are any problems parsing the 
     *             user's input or opening the connection.
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader keyboard;
		String inputLine;
		
		// Gets the string and stores it.
		System.out.println("Please enter the string (at least 2 characters): ");		
		keyboard = new BufferedReader(new InputStreamReader(System.in));
		inputLine = keyboard.readLine();
		
		String result = new String();
		for (int i = 0; i < inputLine.length(); i++) {
			if (i == 1) {
				continue;	//Skip the second character.
			}
			result = result + inputLine.charAt(i);
		}
		
		System.out.println(result);

	}

}
