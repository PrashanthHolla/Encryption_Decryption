package Geek_practice_prashanth;

import java.util.*;  
import java.io.*; 
import Geek_practice_prashanth.Kingdom;

public class KingdomReg {

	private  Map<String,Kingdom> Kingdoms= new HashMap<String,Kingdom>();
	
	/*
	 * Constructor which init the Kingdoms
	 */
	
	public KingdomReg()
	{  
		try {
	    
			
			
		    //Load the Avail Kingdom from input file
			//AlliesList.txt avail in Resources.
			//Incase of new Kingdom or different kingdom, Change the values in AlliesList.txt
		 
		
		 InputStream AlliesIpStream = KingdomReg.class.getResourceAsStream("/AlliesList.txt");	 
		Scanner scan = new Scanner(AlliesIpStream);
		while (scan.hasNextLine()) {
			String data = scan.nextLine();
			String[] Ipstring = data.split(" ");
			String Kingname = Ipstring[0];
			String KingEmblem = Ipstring[1];
			this.Kingdoms.put(Kingname,new Kingdom(Kingname,KingEmblem));
			
		}
		
		scan.close();
			 
		
		}
		catch (Exception e) {
			
			System.out.println("Exception occured in Class : AlliesReg , Proc : AlliesReg "+e);
		}
	}
	
	

	
	public Map<String,Kingdom> getKingdoms()
	{
		return this.Kingdoms;
	}
	
	/*
	 * Return Init Kingdom list
	 */
	
	
	/*
	 * Function to add new kingdom in runtime.
	 * @param KingName
	 * @param KingEmblem
	 * Will retun the new Map
	 */
	public Map<String,Kingdom> addKingdom(String Kingname,String KingEmblem)
	{   
		Kingdoms.put(Kingname,new Kingdom(Kingname,KingEmblem));
		return this.Kingdoms;
	}
	
	/*
	 * Function to remove the Kingdom at runtime.
	 * @param KingName
	 * Will retun the new Map
	 * 
	 */
	public Map<String,Kingdom> deleteKingdom(String Kingname)
	{   
		Kingdoms.remove(Kingname);
		return Kingdoms;
	}
	
}
