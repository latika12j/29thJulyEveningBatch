package testNGStudy;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listener.class)

public class MyClass2 
{
	@Test
	public void e()
	{
	Reporter.log("e is running", true);
	}
	
	@Test
	public void f()
	{
	Assert.fail();
	Reporter.log("f is running", true);
	}
	
	@Test(dependsOnMethods = {"f"})
	public void g()
	{
	Reporter.log("g is running", true);
	}
	
	@Test
	public void h()
	{
	Reporter.log("h is running", true);
	}
}
