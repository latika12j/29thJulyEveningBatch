package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserWindowPopUp_1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links");
		Thread.sleep(1000);
		//To get text on the main page
		WebElement mainpageelement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		System.out.println("Text of the element on the main page is: "+mainpageelement.getText());
		
		//clicking on New Window Button
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		//getWindowHandle()- is used to get the address of the current browser where the control is and return type is String
		String mainPageId = driver.getWindowHandle();
		System.out.println("Main Page Window Id is: "+mainPageId);
		
		
		//getWindowHandles-Get the handles of all the windows/Get all page IDs
		Set<String> allWindowId = driver.getWindowHandles();
		
		Iterator<String> it = allWindowId.iterator();
		
		String mainPageID = it.next();	//getting ID of main  page
		String childPageId = it.next();	//getting ID of Child Page
		
		//Printing Main/Parent Window Id and Child Page Id
		System.out.println("Main Page Window Id is: "+mainPageID);
		System.out.println("Child Page Window Id is: "+childPageId);
		
		//switching focus from the main page to the child window
		driver.switchTo().window(childPageId);
		Thread.sleep(1000);
		driver.manage().window().maximize(); //maximizes child window
		
		//entering text in the search box element of the child window
		driver.findElement(By.id("the7-search")).sendKeys("Child Window PopUp Practice");
		Thread.sleep(1000);
		//driver.close();	//NoSuchWindowException
		System.out.println(driver.findElement(By.xpath("//h1[text()='About me']")).getText());
		
		//switching focus from the child page to the main page
		driver.switchTo().window(mainPageId);
		Thread.sleep(1000);
		
		String mainPageText2 = driver.findElement(By.xpath("//p[contains(text(),'open link')]")).getText();
		System.out.println("Main Page Text is: "+mainPageText2);
		
				
		
	}

}
