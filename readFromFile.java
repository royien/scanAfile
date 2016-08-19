package scanafiletop20words;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class readFromFile extends Thread
{
	//local variables
	File fileName = new File("filename.txt");
	Scanner scanFile = new Scanner(fileName);
	private ArrayList<String> fileWords = new ArrayList<String>();
    
	
	//constructor
	readFromFile(File fileName)throws IOException 
	{
	 this.fileName= fileName;
	}

	//Override run
	public void run()
	{
		String temporaryStoreForWord;
		while(scanFile.hasNext()){
			try{          
				temporaryStoreForWord = scanFile.nextLine();
				storeMemory(temporaryStoreForWord);
				Thread.sleep(100);
			}catch(Exception e){
				System.out.println("An error occured.");
				e.printStackTrace();
			}
		}
	}	
	
     void storeMemory(String string) {
    	 if(!fileWords.contains(string))
    	 {
    	fileWords.add(string);
    	 }
	}
     
     ArrayList<String> getArrayOfWords()
     {
    	 return fileWords;
     }
      
}
