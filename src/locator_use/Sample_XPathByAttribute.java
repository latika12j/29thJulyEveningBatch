package locator_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_XPathByAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
			
		//enter UserName	//input[@name='email']
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		
		//enter Password	//input[@type='password']
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("fggfvvghf");
		Thread.sleep(2000);
		
	}

}
