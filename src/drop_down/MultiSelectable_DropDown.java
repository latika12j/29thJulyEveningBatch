package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable_DropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver  driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement multiselctdropdown = driver.findElement(By.id("cars"));
		Select obj=new Select(multiselctdropdown);
		
		//To check whether dropdown is multiselectable or not
		System.out.println("Status of Mutiselectabe Drop Down is "+obj.isMultiple());
		Thread.sleep(1000);
		
		//Select Class-->All Methods
		obj.selectByIndex(3);
		Thread.sleep(1000);
		obj.selectByValue("volvo");
		Thread.sleep(1000);
		obj.selectByVisibleText("Opel");
		Thread.sleep(1000);
		
		System.out.println("=========================================");
		
		//getFirstSelectedOption()--> fetches first selected option from dropdown
		System.out.println("First selected option from drop down is "+obj.getFirstSelectedOption().getText());
		
		System.out.println("=========================================");
		
		//retrieves all the options on a Select tag and returns a list of web elements
		
		
		//gettext-->works on webelement not on list.therefore following syntax is wrong:-
		//System.out.println(options.gettext);
		
		//traversing through dropdown
		//options---> returns all options from the dropdown
		List<WebElement> options = obj.getOptions();
		for(WebElement o:options)
		{
			System.out.println(o.getText());
		}
		
		System.out.println("=========================================");
		
		//getAllSelectedOptions--> returns selected options from the dropdown
		List<WebElement> selectedoptions = obj.getAllSelectedOptions();
		for(WebElement so:selectedoptions)
		{
			System.out.println(so.getText());
		}
		
		System.out.println("=========================================");
		
		
		//Creating object of Interface-->Upcasting
		//List<WebElement> allcars = driver.findElements(By.xpath("//select[@id='cars']"));
		
		
		//Deselect 
		//obj.deselectByIndex(3);
		//Thread.sleep(2000);
		//obj.deselectByValue("volvo");
		//Thread.sleep(2000);
		//obj.deselectByVisibleText("Opel");
		//Thread.sleep(1000);
	}

}
