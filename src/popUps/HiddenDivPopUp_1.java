package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopUp_1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.poptin.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='close-icon'][1]")).click();
		Thread.sleep(1000);
		
	}

}
