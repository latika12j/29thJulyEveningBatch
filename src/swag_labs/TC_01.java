package swag_labs;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			WebElement user_name = driver.findElement(By.id("user-name"));
			WebElement password = driver.findElement(By.id("password"));
			WebElement login_button = driver.findElement(By.id("login-button"));
			
			user_name.sendKeys("standard_user");
			password.sendKeys("secret_sauce");
			login_button.click();
			
			WebElement backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
			backpack.click();
			
			WebElement cart_button = driver.findElement(By.id("shopping_cart_container"));
			cart_button.click();
			
			List<WebElement> cartitems = driver.findElements(By.className("inventory_item_name"));
			System.out.println("Number of items in the cart are: "+cartitems.size());
			
			for(WebElement ci:cartitems)
			{
				System.out.println("Names of Items in the cart are: "+ci.getText());
			}
			
			//validate item as same what we want
			Iterator<WebElement> it = cartitems.iterator();
			WebElement Item1 = it.next();
			
			if(Item1.getText().equals("Sauce Labs Backpack"))
			{
			System.out.println("Selected item is correct ==> Sauce Labs Backpack");

			driver.findElement(By.name("checkout")).click();
			}
			else 
			{
			System.out.println("Selected item is not correct");
			}
			
			//Entering first name,lastName and zip code
			WebElement firstName = driver.findElement(By.name("firstName"));
			WebElement lastName = driver.findElement(By.name("lastName"));
			WebElement postalCode = driver.findElement(By.name("postalCode"));
			WebElement continueButton = driver.findElement(By.name("continue"));
			
			firstName.sendKeys("Latika");
			lastName.sendKeys("Joshi");
			postalCode.sendKeys("441156");
			continueButton.click();

			WebElement finishButton = driver.findElement(By.id("finish"));
			finishButton.click();
			
			WebElement thankYouMsg =driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
			
			if (thankYouMsg.getText().equals("Thank you for your order!"))
			{
			System.out.println("Thank you msg is displayed......Logging out");
			
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(500);
			driver.findElement(By.id("logout_sidebar_link")).click();
			}
			
			else 
			{
			System.out.println("Thank you msg is not displayed....Please check");
			}
}

}
