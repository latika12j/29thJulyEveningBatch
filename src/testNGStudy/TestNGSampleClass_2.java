package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGSampleClass_2 
{
  @Test
  public void fbLaunch() 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Reporter.log("Loading Facebook...", true);
  } 
  @Test
  public void instaLaunch() 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.instagram.com/");
	 Reporter.log("Loading Instagram...", true);

  }  
  @Test
  public void twitterLaunch() 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.twitter.com/");
	 Reporter.log("Loading Twitter...", true);

  }
}
