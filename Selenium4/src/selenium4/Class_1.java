package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_1 {

	public static void main(String[] args) throws Exception {

		WebDriver myBrowser =  new FirefoxDriver();
		
		myBrowser.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		
		myBrowser.manage().window().maximize();
		
		//myBrowser.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		
		//myBrowser.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		
		String actvalue = myBrowser.findElement(By.xpath("//*[@id='gaia_firstform']/div/a")).getAttribute("href").toString();
		
		System.out.println("actvalue::::::::::::::: " + actvalue);
		
		
		//myBrowser.
		
		
		Thread.sleep(10000);
		
		myBrowser.close();
		
		
		
		
		
	}

}
