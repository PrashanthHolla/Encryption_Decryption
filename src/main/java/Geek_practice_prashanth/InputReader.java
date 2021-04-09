package Geek_practice_prashanth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;  
import java.io.*; 
import Geek_practice_prashanth.KingdomReg;
import Geek_practice_prashanth.DecryptClass;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
public class InputReader {
	
	
	public  Map<String,String> InputData;
	


	public InputReader()
	{
		
		this.InputData=new  LinkedHashMap<String,String>();
		
	}
	
	@Override
	public String toString() {
		return "ReadInputFile [inputData=" + InputData + "]";
	}

	/*
	 * Function helps to read ip file
	 * @param : File path 
	 * 
	 * 
	 */
	public  Map<String,String> getAllys(String filePath) {
		
	     
		try {
			
			File file = new File(filePath);
			Scanner scan = new Scanner(file);
				while (scan.hasNextLine()) {
				String data = scan.nextLine();
				String[] IpString = data.split(" ", 2);
				String name = IpString[0];
				String encodedString = IpString[1];
				encodedString = encodedString.replace(" ", "");
				InputData.put(name, encodedString);
				 
				
			}
			scan.close();
			
		} catch (Exception e) {
			System.out.println(e);
			
		}

		return InputData;
	}

}
