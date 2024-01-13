package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp_2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links");
		Thread.sleep(1000);
		
		//Clicking on New Tab Button on the Parent Window
		driver.findElement(By.name("NewTab")).click();
		
		//Getting the Main Page Id 
		String mainPageId = driver.getWindowHandle();
		System.out.println("Main Page Id is: "+mainPageId);
		
		//Getting Ids of all Pages
		Set<String> alPageIds = driver.getWindowHandles();
		
		//Iterate
		Iterator<String> it1 = alPageIds.iterator();
		
		String mainPageID = it1.next(); 		//Main Page Id
		String childPageID = it1.next();		//Child Page Id
		
		//Printing Main and Child Page Ids
		System.out.println("Main Page Id is: "+mainPageID);
		System.out.println("Child Page Id is: "+childPageID);
		
		//switching the focus from Parent Page to the Child Window
		driver.switchTo().window(childPageID);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement textonchildpage = driver.findElement(By.xpath("//h3[@class='vc_custom_heading'][1]"));
		System.out.println("Child Page Text is: "+textonchildpage.getText());
		
		
	}

}
