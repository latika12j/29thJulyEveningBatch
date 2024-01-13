package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Parallel1 
{
	public void FacebookLogin() throws InterruptedException 
	  {	
		  WebDriver driver=new ChromeDriver();			
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  Reporter.log("FaceBook Launched",true);
		  Thread.sleep(2000);
		  driver.close();
	  }

}

