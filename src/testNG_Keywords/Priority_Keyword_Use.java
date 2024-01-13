package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Keyword_Use 
{
	@Test
	public void loginTest() 
	{
		Reporter.log("Login successfull",true);
	}

	@Test(priority = 0)
	public void registerTest() 
	{
		Reporter.log("Register successfull",true);
	}

	@Test(priority = -1)
	public void sendEmail() 
	{
		Reporter.log("Sent email successfully",true);
	}

	@Test(priority = 1)
	public void checkCalendar() 
	{
		Reporter.log("Calendar checked successfully",true);
	}

	@Test
	public void enterPassword() 
	{
		Reporter.log("Enter Password successfull",true);
	}

	@Test(priority = 1)
	public void logoutTest() 
	{
		Reporter.log("Logout successfull",true);
	}
}
