package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Annotations_Heirarchy 
{
  @Test
  public void testCase1() 
  {
	  System.out.println("This is my First Test Case_1");
  }
  
  @Test
  public void testCase2() 
  {
	  System.out.println("This is my Second Test Case_2");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("Before Method will execute before every test method", true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("After Method will execute after every test method", true);
  }
  

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("Before Class will always execute prior to Before Method and Test Method", true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("After Class will always execute later to After Method and Test method", true); 
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("Before Test will always execute prior to Before Class,Before Method and Test Method", true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("After Test will always execute later to After Method, After Class", true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	 Reporter.log("Before Suite will always execute prior to all annotations or tests in the suite", true); 
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("After suite will always execute at last when all the annotations or test in the suite have run", true);  
  }

}
