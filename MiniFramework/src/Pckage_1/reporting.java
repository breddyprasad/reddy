package Pckage_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class reporting {
	

	public static void main(String[] args) throws Exception {

		String htmlContent = "<div><h1" + result + "</h1></div>";
		
		File myFile = new File("report.html");
		
		BufferedWriter buffWrtr = new BufferedWriter(new FileWriter(myFile));
		
		buffWrtr.write(htmlContent);
		
		buffWrtr.close();
		
		
		
		
	}

}
