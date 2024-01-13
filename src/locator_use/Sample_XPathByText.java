package locator_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_XPathByText 
{
	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Sell']")).click();

Thread.sleep(2000);

driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();

	}

}
