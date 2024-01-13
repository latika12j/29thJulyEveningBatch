package setsize_setposition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Thread.sleep(1000);
		Point defaultposition = driver.manage().window().getPosition();
		System.out.println("The default position of the browser is: "+defaultposition);
		Point p = new Point(800, -8); 	// x and y co-ordinates
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		
	}

}
