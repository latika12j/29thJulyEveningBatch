package locator_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_Use 
{

	public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(1000);
			
			//Use of css=tag#id
			/*tag = the HTML tag of the element being accessed
				# = the hash sign. This should always be present when using a Selenium CSS Selector with ID
				id = the ID of the element being accessed*/	
			
			//driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
			
			//Use of css=tag.class			
			//driver.findElement(By.cssSelector("div._6ltj")).click();

			//Use of css=tag[attribute=value]
			driver.findElement(By.cssSelector("button[name=login]")).click();
			
			

	}

}
