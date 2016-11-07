package pckage_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesManupulation {

	public static void main(String[] args) throws Exception {
		
		Properties myProp = new Properties();
		
		OutputStream outPutFile = new FileOutputStream("output.properties");

		myProp.setProperty("url", "http://www.amazon.in");
		myProp.setProperty("username", "testUser");
		myProp.setProperty("pwd", "testPwd");
		
		myProp.store(outPutFile, "Unique Credentials");
		
		
		InputStream myIninputFile = new FileInputStream("output.properties");
		
		myProp.load(myIninputFile);
		
		System.out.println(myProp.getProperty("url"));
		
		
		
		
	}

}
