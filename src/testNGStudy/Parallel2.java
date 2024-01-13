package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Parallel2 
{
	public void InstagramLogin() throws InterruptedException 
	  {	
		  WebDriver driver=new ChromeDriver();			
		  driver.manage().window().maximize();
		  driver.get("https://www.instagram.com/");
		  Reporter.log("Instagram Launched",true);
		  Thread.sleep(2000);
		  driver.close();
	  }
}
