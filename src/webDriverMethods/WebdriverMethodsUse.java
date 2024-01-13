package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodsUse 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		//driver.close();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();

		driver.get("https://www.thehindu.com/");
		Thread.sleep(500);
		//System.out.println(driver.getTitle());
		String Title = driver.getTitle();
		System.out.println("Title is "+Title);
		
		driver.get("https://www.meesho.com/");
		Thread.sleep(400);
		//System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		System.out.println("Url is "+url);


	}

}
