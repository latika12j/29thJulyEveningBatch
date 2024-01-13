package web_element_methods_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Practice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(1000);
		driver.findElement(By.name("fName")).sendKeys("Latika");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("Joshi");
		Thread.sleep(1000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("chinesechbx")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='bcTextBox'][3]")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("psw")).sendKeys("absfgt");
	}

}
