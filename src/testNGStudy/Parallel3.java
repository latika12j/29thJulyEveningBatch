package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Parallel3 
{
	public void VCTCLogin() throws InterruptedException 
	  {	
		  WebDriver driver=new ChromeDriver();			
		  driver.manage().window().maximize();
		  driver.get("https://www.vctcpune.com/");
		  Reporter.log("VCTC Launched",true);
		  Thread.sleep(2000);
		  driver.close();
	  }
}
