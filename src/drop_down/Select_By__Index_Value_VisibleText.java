package drop_down;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_By__Index_Value_VisibleText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

		//selecting day
		WebElement date = driver.findElement(By.id("day"));
		Select sday=new Select(date);
		sday.selectByIndex(4);
		
		//traversing using for each loop
		List<WebElement> dates = sday.getOptions();
		System.out.println("Traversing using for each loop");
		for(WebElement d:dates)
		{
			System.out.println(d.getText());
		}
		
		System.out.println("===================================");
		
		//traversing using Iterator 
		Iterator<WebElement> dt = dates.iterator();
		System.out.println("Traversing using Iterator");
		while(dt.hasNext())
		{
			System.out.println(dt.next().getText());
		}
		
		System.out.println("===================================");
		
		//traversing using List Iterator 
		ListIterator<WebElement> dts = dates.listIterator();
		System.out.println("Traversing using List Iterator");
		while(dts.hasNext())
		{
			System.out.println(dts.next().getText());
		}
		
		System.out.println("===================================");
		
		//traversing using For loop
		System.out.println("Traversing using For Loop");
		for(int i=0;i<=dates.size()-1;i++)
		{
			System.out.println(dates.get(i).getText());
		}

		
		//selecting month
		//WebElement month = driver.findElement(By.id("month"));
		//Select smonth=new Select(month);
		//smonth.selectByValue("1");
		
		//selecting year
		//WebElement year = driver.findElement(By.id("year"));
		//Select syear=new Select(year);
		//syear.selectByVisibleText("2021");
	}

}
