package click_Using_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Click_Using_JavaScriptExecutor 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		WebElement searchbox = driver.findElement(By.name("q"));
		//JavaScript Executor to click element
		JavascriptExecutor j=(JavascriptExecutor)driver;
	     j.executeScript("arguments[0].click();", searchbox );
	     //JavaScript Executor to enter text j.executeScript("document.getElementsByName('q')[0].value= 'Java'");
	     String s = searchbox .getAttribute("value");
	     System.out.println("Value entered is: " + s);
	     driver.close();
	}

}
