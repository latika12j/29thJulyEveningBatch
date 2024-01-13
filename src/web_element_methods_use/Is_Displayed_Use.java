package web_element_methods_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed_Use 
{
	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
Thread.sleep(2000);

//driver.findElement(By.id("hide-textbox")).click();
//Thread.sleep(2000);

boolean result = driver.findElement(By.name("show-hide")).isDisplayed();
 
System.out.println("Display status is "+result);

//driver.findElement(By.name("show-hide")).sendKeys("IT IS VISIBLE");


	}

}
