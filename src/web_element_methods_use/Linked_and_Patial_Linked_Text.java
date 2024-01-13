package web_element_methods_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linked_and_Patial_Linked_Text 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		//Use of Locator---LinkText 
		//driver.findElement(By.linkText("Create new account")).click();

		//Use of Locator---Partial Link Text
		driver.findElement(By.partialLinkText("new account")).click();

	}

}
