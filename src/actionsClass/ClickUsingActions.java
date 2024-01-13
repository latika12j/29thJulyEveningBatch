package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
		WebElement loginbutton = driver.findElement(By.name("login"));
		Actions act=new Actions(driver);
		//1st way
		//act.moveToElement(loginbutton).perform();
		//act.click().perform();
		
		//2nd way
		//act.moveToElement(loginbutton).click().perform();
		
		//3rd way
		act.click(loginbutton).perform();
		 
	}

}
