package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUsingActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		WebElement wednesday = driver.findElement(By.id("wednesday"));
		WebElement thursday = driver.findElement(By.id("thursday"));	
		WebElement friday = driver.findElement(By.id("friday"));
		Actions act=new Actions(driver);
		act.scrollToElement(friday).perform();
		Thread.sleep(500);
		wednesday.click();
		Thread.sleep(500);
		thursday.click();
		Thread.sleep(500);
		friday.click();
		
	}

}
