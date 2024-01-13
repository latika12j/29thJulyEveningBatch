package miscellaneous;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Scrolling 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		CommonlyUsedMethods.implicitWait(driver, 3);
		WebElement buildWebsite = driver.findElement(By.xpath("//span[text()='Build Website']"));
		CommonlyUsedMethods.scrollIntoView(driver, buildWebsite);
		CommonlyUsedMethods.takeScreenshot(driver, "buildwebsite_guru99_srcshot");
	}

}
