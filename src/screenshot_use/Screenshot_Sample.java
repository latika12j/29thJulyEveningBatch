package screenshot_use;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Sample 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	Thread.sleep(1000);
	
    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("E:\\SC\\img3.jpg");
    
	//File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
	//System.out.println(source);
    	
	//File dest = new File("E:\\SC\\img1.png");
	
	FileHandler.copy(source, dest);
    	
    //FileHandler.copy(source, dest);

	}

}
