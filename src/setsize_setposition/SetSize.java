package setsize_setposition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Thread.sleep(1000);
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println("The dimensions for default window size are : "+defaultsize);
		Dimension d = new Dimension(2000, 0); //passing width and height as parameters
		Thread.sleep(1000);
		driver.manage().window().setSize(d);	
	}

}
