package misc;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomList 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> searchresult = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		
		System.out.println("Using For Each Loop....");
		for(WebElement s:searchresult)
		{
			System.out.println(s.getText());
		}
		
		Thread.sleep(1000);
		
		System.out.println("====================");
		
		String expresult="honda elevate";
		for(WebElement sr1:searchresult)
		{
			String actualresult=sr1.getText();
			if(actualresult.equals(expresult))
			{
				sr1.click();
				break;
			}
		}
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		
		/*System.out.println("Using For Loop...");
		for(int i=0;i<=searchresult.size()-1;i++)
		{
			System.out.println(searchresult.get(i).getText());
		}
		
		Thread.sleep(1000);
		System.out.println("====================");
		
		System.out.println("Using Iterator...");
		Iterator<WebElement> a = searchresult.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next().getText());
		}
		
		Thread.sleep(1000);
		System.out.println("====================");
		
		System.out.println("Using List Iterator...");
	    ListIterator<WebElement> b = searchresult.listIterator();
	    while(b.hasNext())
		{
			System.out.println(b.next().getText());
		}
		*/
	}

}
