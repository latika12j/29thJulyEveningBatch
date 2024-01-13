package miscellaneous;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Wait_Screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		CommonlyUsedMethods.implicitWait(driver, 5);
		CommonlyUsedMethods.takeScreenshot(driver, "myimage");
	}

}
