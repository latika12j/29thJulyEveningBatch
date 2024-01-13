package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_Eg_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		
		//switching focus from main page to iframe
		driver.switchTo().frame("singleframe");
		Thread.sleep(1000);
		
		String test = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		System.out.println("Text on IFrame is --> "+test);
		
		//shifting selenium focus from IFrame to Mainpage
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		WebElement button = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		
		System.out.println("Display status for button is "+button.isDisplayed());
	}

}
