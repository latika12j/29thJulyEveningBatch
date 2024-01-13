package web_element_methods_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled_Method_Use 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login");
		Thread.sleep(2000);

		driver.findElement(By.id("mobileNumber")).sendKeys("7894561230");

		boolean result = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();

		System.out.println("The status of get OTP is "+result);

	}

}
