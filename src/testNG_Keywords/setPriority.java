package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class setPriority 
{

  @Test(priority=1)
  public void login() 
  {
	  Reporter.log("Login Test Code", true);
  }
  
  //This method depends on login Method
  //This method's execution will be skipped because login() method will fail
  @Test(priority=2,dependsOnMethods = {"login"})
  public void checkMail() 
  {
	  Reporter.log("Check Mail Test Code", true);
  }
  
  //This method depends on login and checkMail methods
  //This method's execution will be skipped from execution because login() method will fail
  @Test(priority=3,dependsOnMethods = {"login"})
  public void logout() 
  {
	  Reporter.log("Log Out Test Code", true);
  }
  
  //This is an independent method.So it will be executed
  @Test(priority=4)
  public void checkLoginValidations() 
  {
	  Reporter.log("Check Login Validations Test Code", true);
  }
  
 
}
