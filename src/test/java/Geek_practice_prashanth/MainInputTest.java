package Geek_practice_prashanth;

import java.io.InputStream;
import java.net.URL;
import java.util.*;  
import java.io.*; 

import org.junit.*;

public class MainInputTest {

	 @Test
	  public void MainTestCall() {
		 //InputStream TestInput = AlliesReg.class.getResourceAsStream("/TestInput.txt");
		 URL url = getClass().getResource("/TestInput.txt");
		 String TestFilePath=url.getPath();
	        MainInput.main(new String[] {TestFilePath});
	  
	 }
}
