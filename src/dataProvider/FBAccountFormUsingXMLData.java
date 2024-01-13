package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBAccountFormUsingXMLData 
{
  @Parameters({"fName","lName","MNum"})
	@Test()
  public void facebookTest(String firstname,String lastname,String MobNum) throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("Create new account")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.name("firstname")).sendKeys(firstname);
	  driver.findElement(By.name("lastname")).sendKeys(lastname);
	  driver.findElement(By.name("reg_email__")).sendKeys(MobNum);
	  Thread.sleep(1000);
	  driver.close();

	  
	  
  }
}
