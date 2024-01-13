package misc;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mutiple_Window_Handling 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//span[text()='Remote']")).click();
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		driver.findElement(By.xpath("//span[text()='Engineering']")).click();
		
		Set<String> allTabsIds = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(allTabsIds);
		
		for(int i=0;i<al.size();i++)
		{
		Thread.sleep(1000);
		driver.switchTo().window(al.get(i));
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();
	}

}
