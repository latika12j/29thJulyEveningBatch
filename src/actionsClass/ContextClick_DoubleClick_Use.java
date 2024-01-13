package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_DoubleClick_Use 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[contains(text(),'See Alert')]"));
		Actions act=new Actions(driver);
		//act.doubleClick(doubleclickbutton).perform();
		act.moveToElement(doubleclickbutton).doubleClick().build().perform();
		
		//WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		//Actions act=new Actions(driver);
		//act.contextClick(rightclickbutton).perform();
		//act.moveToElement(rightclickbutton).contextClick().build().perform();	
	}

}
