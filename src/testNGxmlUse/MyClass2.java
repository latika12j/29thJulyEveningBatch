package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 
{
  @Test(groups="Regression")
  public void Tc5() 
  {
	  Reporter.log("Test Case5 is Running", true); 
  }


@Test(groups="Regression")
public void Tc6() 
{
	  Reporter.log("Test Case6 is Running", true); 
}


@Test(groups="Regression")
public void Tc7() 
{
	  Reporter.log("Test Case7 is Running", true); 
}


@Test(groups="Sanity")
public void Tc8() 
{
	  Reporter.log("Test Case8 is Running", true); 
}
}

