package Geek_practice_prashanth;

import java.net.URL;
import Geek_practice_prashanth.Kingdom;

import org.junit.Test;

public class KingdomTest {
	@Test
	  public void InitTest() {
       
		Kingdom King = new Kingdom ("TestKing","TestEmblem");
		 System.out.println(King.getKingname());
		 System.out.println(King.getKingEmblem());
		 King.setKingEmblem("TestKingSet");
		 King.setKingEmblem("TestEmblemSet"); 
		 System.out.println(King.getKingname());
		 System.out.println(King.getKingEmblem());
	  
	 }

}
