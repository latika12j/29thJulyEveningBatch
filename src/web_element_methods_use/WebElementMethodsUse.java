package web_element_methods_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/m/login?URL=https://www.firstcry.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		
		//Use of Locator -- id
		//driver.findElement(By.id("lemail")).sendKeys("xyz@gmail.com");
		
		//Use of Locator -- name
		driver.findElement(By.name("email")).sendKeys("mnb@gmail.com");
		Thread.sleep(2000);
		
		//Use of Clear() Method
		driver.findElement(By.name("email")).clear();
	}

}
