import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text_use 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://byjus.com/");
	Thread.sleep(2000);
	
	String expresult = "Book your Free Session";
	
	String actualresult = driver.findElement(By.className("trial-form-title")).getText();
	
	System.out.println(actualresult);
	
//	WebElement myelement = driver.findElement(By.className("trial-form-title"));
	
	if(expresult.equals(actualresult))
	{
		System.out.println("Text is matching and Test Case is passed");
	}
	else
	{
		System.out.println("Text is not matching and Test Case is failed");
	}

	}

}
