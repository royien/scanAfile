/*
 * 
 * THIS CODE IS NOT FINAL.
 * 
 */

package scanafiletop20words;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class mainFile {
	public static void main (String[] args)throws IOException {
		
	File nameOfFileToScan = new File("filename.txt");
	readFromFile caller = new readFromFile(nameOfFileToScan);
	
	
	caller.run();
	System.out.println(caller.getArrayOfWords());
	
	}
}
