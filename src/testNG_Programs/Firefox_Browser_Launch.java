package testNG_Programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Firefox_Browser_Launch 
{
  @Test
  public void f() throws InterruptedException, IOException 
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(1000);
	  
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dest=new File("E:\\SC\\myimg.png");
	  FileHandler.copy(source, dest);
  }
}
