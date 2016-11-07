package myPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class_1 {
	
	@Test
	@Parameters({"username", "pwd"})
	public void testMethod_A(String username, String pwd){
		
		System.out.println("Username is:::::: " + username );
		
		System.out.println("Username is:::::: " + pwd );
		
		System.out.println("First test method from TestNG class from CLass 1");
	
		System.out.println("Thread ID: " + Thread.currentThread().getId());
	
	}
	
	@Test
	public void testMethod_B(){
		
		System.out.println("Second test method from TestNG class from Class 1");
		System.out.println("Thread ID: " + Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod_C(){
		
		System.out.println("Third test method from TestNG class from Class 1");
		System.out.println("Thread ID: " + Thread.currentThread().getId());
	}


}
