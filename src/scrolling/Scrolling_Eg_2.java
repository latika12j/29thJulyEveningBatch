package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Eg_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Example of Scroll into View
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/");
		Thread.sleep(1000);
		
		//Scroll down upto -->Trending Articles 
		WebElement trendingArticles = driver.findElement(By.xpath("//h2[text()='Trending Articles']"));
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", trendingArticles);
		Thread.sleep(1000);
		
		//Scroll upto--> Art of Testing
		WebElement artoftesting = driver.findElement(By.xpath("//h2[text()='ArtOfTesting']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", artoftesting);
		Thread.sleep(1000);	
	}

}
