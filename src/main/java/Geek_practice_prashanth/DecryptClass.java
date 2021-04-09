package Geek_practice_prashanth;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import Geek_practice_prashanth.KingdomReg;
import java.util.*;  
import java.io.*; 

public class DecryptClass {
	public    Map<String,Kingdom> Kingdoms;
	public  Properties config;
	
	public  DecryptClass()
	{
		KingdomReg kingdomreg = new KingdomReg();
		this.Kingdoms=kingdomreg.getKingdoms();
	}
	
	/*
	 * Function which Helps in decypting the message and returns true if the message contains the given Emblem
	 * @param : King Name 
	 * @parma : Encrypt Message
	 * 
	 */
	public boolean decryptandvalidate(String KingName , String EncryptMessage)
	{    
		try {
			 // REading Property files and loading it to memory
	    	
			 InputStream ConfigIpStream = MainInput.class.getResourceAsStream("/PropertyFile.properties"); 
			     config=new Properties();  
			    config.load(ConfigIpStream); 
			    
		 String DecodedString="";
		 // Receive Passed King Emblem to calculate the length from Map
		 Kingdom King = Kingdoms.get(KingName);
		 String KingEmblem=King.getKingEmblem();
		 int EncryptionNumber = KingEmblem.length();
		 //Alpha Index from config property file , which returns A-Z
		 String ALPH_INDEX=config.getProperty("ALPH_INDEX");
		for (int i = 0; i < EncryptMessage.length(); i++) {
			int MappingAlph = ALPH_INDEX.indexOf(EncryptMessage.charAt(i));
			//shifting the character to left by length of the emblem
			int DycrptionVal = MappingAlph - EncryptionNumber;
			//Handleing Chars like Z , X , Y etc
			DycrptionVal = (DycrptionVal < 0 ? (ALPH_INDEX.length() + DycrptionVal) : DycrptionVal);
			//index of decoded character
			char DecodedChar = ALPH_INDEX.charAt(DycrptionVal); 
			//adding decoded char to the decoded string
			DecodedString = DecodedString + DecodedChar;
		}
		
		for (int i = 0; i < DecodedString.length(); i++) {
			char ch = DecodedString.charAt(i) ; 
			if (KingEmblem.indexOf(ch) != -1) {
				//removing char matching from the emblem
				KingEmblem = KingEmblem.replaceFirst("" +ch, "");
			}
		}
		//if decoded string contains all the char in the emblem
		if (KingEmblem.equals("")) {
			return true;
		}
		else
		{
			return false;
		}
		
		}
		catch (Exception e) {
			System.out.println("Exception occured in Class : DecryptClass , Proc : dycriptandvalidate "+e);
			return false;
		}
	}


}
