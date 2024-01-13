package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass 
{
  @Test(groups="Sanity")
  public void Tc1() 
  {
	  Reporter.log("Test Case1 is Running", true); 
  }


@Test(groups="Sanity")
public void Tc2() 
{
	  Reporter.log("Test Case2 is Running", true); 
}


@Test(groups="Sanity")
public void Tc3() 
{
	  Reporter.log("Test Case3 is Running", true); 
}


@Test(groups="Regression")
public void Tc4() 
{
	  Reporter.log("Test Case4 is Running", true); 
}
}

