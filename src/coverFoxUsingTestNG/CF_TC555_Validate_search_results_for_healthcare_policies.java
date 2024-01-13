package coverFoxUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CF_TC555_Validate_search_results_for_healthcare_policies 
{
	WebDriver driver;
	CoverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxAddressDetailsPage addressDetails;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxHealthPlanResultsPage result;
	
	
	@BeforeClass
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		home= new CoverFoxHomePage(driver);
		healthPlan= new CoverFoxHealthPlanPage(driver);
		addressDetails= new CoverFoxAddressDetailsPage(driver);
		memberDetails= new CoverFoxMemberDetailsPage(driver);
		result= new CoverFoxHealthPlanResultsPage(driver);
		
		Reporter.log("Opening browser..", true);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@BeforeMethod
	public void enterMemberDetails() throws InterruptedException
	{
	Reporter.log("Clicking on gender button ", true);
	home.clickOnFemaleButton();
	Thread.sleep(1000);
	Reporter.log("Clicking on next button ", true);
	healthPlan.clickOnNextButton();
	Thread.sleep(1000);
	Reporter.log("Handling age drop down ", true);
	memberDetails.handleAgeDropDown("28");
	Reporter.log("Clicking on next button ", true);
	memberDetails.clickOnNextButton();
	Thread.sleep(1000);
	Reporter.log("Entering pin code ",true);
	addressDetails.enterPinCode("411048");
	Thread.sleep(5000);
	Reporter.log("Entering mobile number ",true);
	addressDetails.enterMobNum("9049279658");
	Thread.sleep(1000);
	Reporter.log("Clicking on continue button ", true);
	addressDetails.clickOnContinueButton();
	Thread.sleep(1000);
	}

	@Test
	public void validateTestPlansFromTextAndBanners() throws InterruptedException
	{
	Thread.sleep(5000);
	Reporter.log("Fetching number of results from text ", true);
	int textResult = result.availablePlanNumberFromText();
	Thread.sleep(7000);
	Reporter.log("Fetching number of results from Banners ", true);
	int bannerResult = result.availablePlanNumberFromBanners();
	Thread.sleep(1000);
	Assert.assertEquals(textResult, bannerResult,"Text results are not matching with Banner results, TC is failed");
	Reporter.log("TC is passed ", true);

	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
	Reporter.log("Closing browser ", true);
	Thread.sleep(3000);
	driver.close();
	}
	
	
  
}
