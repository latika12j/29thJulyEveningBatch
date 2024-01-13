package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropUse 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.id("draggable"));
	    WebElement target = driver.findElement(By.id("droppable"));	
	    Actions act=new Actions(driver);
	    //1st way
	    //act.dragAndDrop(source, target).perform();
	    
	    //2nd way
	    //act.clickAndHold().moveToElement(target).release().build().perform();
	    
	    //3rd way
	    act.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
	}

}
