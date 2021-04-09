package Geek_practice_prashanth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
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
import java.util.List;


public class MainInput {
	public static Map<String, String> Kingdoms;
	public static Properties config;
	public static ArrayList<String> Allys;
	public static String ReturnString="";
	public static Map<String,String> InputData;
	
	/*
	 * Main Function , Entry Point
	 * @param : Input file which contains King name and Encrypt message 
	 * 
	 * 
	 */
	public static void main(String[] args) {
	try {
		
		
		
		String filePath = args[0];
	        
       // REading Property files and loading it to memory
    	
		 InputStream ConfigIpStream = MainInput.class.getResourceAsStream("/PropertyFile.properties"); 
		     config=new Properties();  
		    config.load(ConfigIpStream); 
		    
	   //Get IP data
		    InputReader IpReader = new InputReader();
		    InputData=IpReader.getAllys(filePath);
		    
		    
     
	        	
		//Initalize the Allies List object and init all the Kingdoms available.
		    AlliesReg allisReg = new AlliesReg();
		    Allys = new ArrayList<String>();
            Allys=allisReg.getAllies(InputData);
       
        
		
		//Check if min required allies present.
		
		
		if(Allys.size()>=Integer.parseInt(config.getProperty("MIN_ALLIES_REQ")))
		{
			 ReturnString =config.getProperty("RULER_KING_NAME")+" "+ String.join(" ", Allys);

		}
		else
		{
			ReturnString="NONE";
		}
		
		System.out.println(ReturnString);
	}
	catch (Exception e) {
		
		System.out.println("Exception occured in Class : MainInput , Proc : Main "+e);
	       }
	}
	
	
}
