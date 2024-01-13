package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selec_Drop_Down 
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	Thread.sleep(1000);
		
	WebElement multiselec = driver.findElement(By.id("ide"));
	Select s=new Select(multiselec);
		
	System.out.println("ListBox Multiselectable status: "+s.isMultiple());
		
	s.selectByIndex(3);
	Thread.sleep(1000);
	s.selectByValue("vs");
	Thread.sleep(1000);
	s.selectByVisibleText("IntelliJ IDEA");	
	
	Thread.sleep(1000);
	System.out.println("========================");

	System.out.println("First selected option is: "+s.getFirstSelectedOption().getText());
	
	System.out.println("========================");
	
	List<WebElement> options = s.getOptions();
	System.out.println("List of all options from the list box..");
	for(WebElement o:options)
	{
		System.out.println(o.getText());
	}
	
	System.out.println("========================");
	
	List<WebElement> selectedoptions = s.getAllSelectedOptions();
	System.out.println("List of selected options from the list box..");
	for(WebElement so:selectedoptions)
	{
		System.out.println(so.getText());
	}
	
	}
}
