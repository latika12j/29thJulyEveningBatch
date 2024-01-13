package testNG_Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priortized_Test 
{
	WebDriver driver=new ChromeDriver();
	
	@Test(priority = 1) 
	public void driverSetup()
	{ 
	Reporter.log("Running GoogleChrome",true);
	}
	
	@Test(priority = 2) 
	public void getURL()
	{ 
	driver.get("https://www.google.com");
	Reporter.log("URL Launched", true);
	}
	
	@Test(priority = 3) 
	public void getTitle() throws InterruptedException
	{ 
	String title = driver.getTitle(); 
	Reporter.log("Title of the Webpage is: "+title, true); 
	Thread.sleep(1000);
	} 
	
	@Test(priority = 4) 
	public void closeBrowser() throws InterruptedException
	{ 
	driver.close(); 
	Thread.sleep(2000);
	Reporter.log("Test successfully passed",true); 
	}
}
