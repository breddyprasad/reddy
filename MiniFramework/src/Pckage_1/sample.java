package Pckage_1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class sample {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		
		InputStream myInput = new FileInputStream("config.properties"); 
		
		prop.load(myInput);
		
		//String url = prop.getProperty("url");
		
		System.out.println(prop.getProperty("url"));
		

	}

}
