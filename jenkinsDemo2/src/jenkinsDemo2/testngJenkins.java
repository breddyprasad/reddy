package jenkinsDemo2;

import org.testng.annotations.Test;

public class testngJenkins {
	
	
	@Test
	public void method_1(){
		
		System.out.println("Welcome to Jenkins demo");
		
		int result = 10/0;
		
		System.out.println(result);
		
	}
	
	

}
