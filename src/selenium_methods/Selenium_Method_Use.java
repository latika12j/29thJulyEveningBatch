package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Method_Use 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
				
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		driver.close();

	}

}
