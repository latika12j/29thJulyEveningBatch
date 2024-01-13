package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Annotations_Eg_1 
{
  @Test
  public void UserNameField() 
  {
	  Reporter.log("Entering User Name...", true);
  }
  
  @Test
  public void PasswordField() 
  {
	  Reporter.log("Entering Password..", true);
  }
  
  @BeforeMethod
  public void login()  
  {
	  Reporter.log("Logging in..", true);
  }

  @AfterMethod
  public void logout () 
  {
	  Reporter.log("Logging out..", true);

  }

  @BeforeClass
  public void openBrowser() 
  {
	  Reporter.log("Opening Browser", true);
  }

  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("Closing Browser", true);
  }

}
