package chromeOptionsClassStudy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUse 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//ChromeOptions is an inbuilt class.We are creating object of ChromeOptions Class.
		ChromeOptions opt=new ChromeOptions();
		
		//Calling Method addArguments and passing parameters
		ChromeOptions optheadless = opt.addArguments("--headless");
		//opt.addArguments("incognito");
		//opt.addArguments("-disable-notifications");
		//opt.addArguments("start-maximized");
		
		//Passing Object of ChromeOptions Class as parameter to Chromedriver
		WebDriver driver=new ChromeDriver(optheadless);
		driver.get("https://vctcpune.com/");
		System.out.println(driver.getTitle());
		
		/*ArrayList<String> al=new ArrayList<>();
		al.add("incognito");
		al.add("start-maximized");
		al.add("-disable-notifications");
		
		opt.addArguments(al);*/
		
		
	}

}
