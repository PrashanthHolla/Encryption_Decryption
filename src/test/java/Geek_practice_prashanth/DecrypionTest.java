package Geek_practice_prashanth;

import org.junit.Test;

public class DecrypionTest {
	
	@Test
	  public void InitTest() {
     
		DecryptClass Decryptor = new DecryptClass ();
		System.out.println(Decryptor.decryptandvalidate("test","test"));
		System.out.println(Decryptor.decryptandvalidate("ICE","MOMAMVTMTMHTM"));
	 }


}
