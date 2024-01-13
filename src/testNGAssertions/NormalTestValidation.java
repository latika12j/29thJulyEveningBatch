package testNGAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NormalTestValidation 
{
  @Test
  public void validateFBGenderCheckBox() throws InterruptedException 
  {
	  //Testcase-If Female Gender Radio Button is Selected then Test Case is Passed,Else Test Case is Failed
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(500);
	  
	  boolean radiobuttonselectionstatus = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	  
	  System.out.println("Female Radio Button Selection Status is: "+radiobuttonselectionstatus); 
	  Assert.assertTrue(radiobuttonselectionstatus,"Test Case is Failed,radio button is not selected");	  	  
	  
  }
}
