package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ltimindtree.com/");
		Thread.sleep(1000);
		
		String url=driver.getCurrentUrl();
		
		System.out.println("URL is "+url);

	}

}
