package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelTest
{
	public WebDriver driver;
    @Test
    public void FirefoxTest() throws InterruptedException 
    {	 
    //Initializing the firefox driver
    driver = new FirefoxDriver();	  
    driver.get("https://www.facebook.com"); 
    Thread.sleep(3000);
    Reporter.log("facebook is running",true);
     }

    @Test
	public void ChromeTest() throws InterruptedException
	{ 
  //Initialize the chrome driver
  driver = new ChromeDriver();
  driver.get("https://www.instagram.com"); 
  Thread.sleep(3000);
  Reporter.log("instagram is running",true);
	}
}
