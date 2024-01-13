package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse 
{
public static void main(String[] args) throws InterruptedException 
	{
String expectedresult="TOP CBSE,CISCE and CAIE SCHOOLS IN INDIA_VIBYOR HIGH";

WebDriver driver=new ChromeDriver();

driver.get("https://www.vibgyorhigh.com/");
Thread.sleep(2000);

String actualresult=driver.getTitle();

if(expectedresult.equals(actualresult))
{
System.out.println("Title is matching and Test Case is passed");
}
else
{
System.out.println("Title is not matching and Test Case is failed");
}
	}

}

