package Com.SElenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
	public static void main(String[] args) {
//		WebDriver driver= new FirefoxDriver();
//		driver.get("http://www.google.com/");
		
		
		
		// Chrome  Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QEDGE 12\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("http://www.google.com/");
		
		// IE Browser
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\QEDGE 12\\Downloads\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
//		WebDriver driver= new InternetExplorerDriver();
//	    driver.get("http://www.facebook.com/");
	    
	    //Implicit wait
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //Explicit wait
	    WebDriverWait explicitWait = new WebDriverWait(driver, 30);
	    
	    WebElement myElement = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("your xpath value")));
	    
	    
	    
	    
	    
	    
	    
	    
	}
	}
	


