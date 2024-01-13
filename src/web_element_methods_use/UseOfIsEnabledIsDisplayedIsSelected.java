package web_element_methods_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfIsEnabledIsDisplayedIsSelected 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		// Declare and initialize variable to store the expected title of the webpage
	     String expectedTitle="Google";

	     // Fetch title of the web page and save it using a variable actualTitle with data type string
	     String actualTitle = driver.getTitle(); 
	     
	     Thread.sleep(1000);

	     // Compare expected title of the page with actual title of the page and print the result
	     if(expectedTitle.equals(actualTitle)) 
	     { 
	       System.out.println("Verification Successful – Correct title is displayed on the home webpage");
	     } 
	     else 
	     { 
	    	 System.out.println("Verification Failed-Incorrect title is displayed on the home webpage");
	     }
	     
	     Thread.sleep(1000);
	     
	  // Check that “Google Search box” is enabled or not. If Search box is enabled, it will return true. 
	    WebElement searchbox = driver.findElement(By.xpath("//textarea[@name='q']"));
	   
	   if(searchbox.isEnabled()) 
	   { 
		   System.out.println("Search box is Enabled.Return: "+searchbox.isEnabled());
	   } 
	   else 
	   { 
		   System.out.println("Search box is disabled.Return: "+searchbox.isEnabled());
	   } 
	
	   // Enter text in the “Google Search” box
	   driver.findElement(By.id("APjFqb")).sendKeys("Testing Selenium Tool");
	   
	   WebElement searchbutton = driver.findElement(By.name("btnK"));
	   if(searchbutton.isEnabled())
	   {
		   System.out.println("Search button is Enabled.Return: "+searchbutton.isEnabled());
	   }
	   else
	   {
		   System.out.println("Search button is Disabled.Return: "+searchbutton.isEnabled());
	   }
	   
	   
	}

}
