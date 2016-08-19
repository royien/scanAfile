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
		
		//THIS SECTION JUST CHECKS THE FILES ON THE FOLDER. if filename.txt isn't listed, it will not work.
		System.out.println("CHECKING FILES ON THE LIST....");
		File file = new File(".");
		for(String fileNames : file.list()){
			System.out.println(fileNames);
			}
		System.out.println("\n\n\n");	
		
		
	File nameOfFileToScan = new File("C:\\Users\\User\\workspace\\scanAfile\\src\\scanafiletop20words\\filename.txt");
	readFromFile caller = new readFromFile(nameOfFileToScan);
	caller.run();
    System.out.println(caller.getArrayOfWords());
	
	}
}

