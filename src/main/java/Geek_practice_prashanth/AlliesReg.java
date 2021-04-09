package Geek_practice_prashanth;

import java.util.ArrayList;
import java.util.Map;

public class AlliesReg {
	
	public  ArrayList<String> Allys;
	
	public AlliesReg()
	{
		this.Allys=new ArrayList<String>();
		
	}
	
	/*
	 * Function which Helps in decypting the message and returns true if the message contains the given Emblem
	 * @param : Input data  
	 *  Input data consit of Encrypted message
	 * 
	 */
	
	public ArrayList<String> getAllies(Map<String,String> InputData)
	{
		DecryptClass Decrypt = new DecryptClass();
		for (Map.Entry<String,String> Input : InputData.entrySet())
		{
			
			if(Decrypt.decryptandvalidate(Input.getKey(),Input.getValue()))
				
			{   
				//Only if it does not contain
				if(!Allys.contains(Input.getKey()))
				{  
					Allys.add(Input.getKey());
				}
			}
    }
		return Allys;
	}

}
