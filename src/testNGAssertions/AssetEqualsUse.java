package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssetEqualsUse 
{
  @Test
  public void TestAssertEqualsUse() 
  {
	  String x="Mumbai";
	  String y="Mumbai";
	  String z="Pune";
	  
	  //Verify x and y are equal
	  //Assert.assertEquals(x, y);
	  
	  //verify x and z are not equal
	  //Assert.assertNotEquals(y, z, "y and z are not equal,Test Case is Passed");
	  
	  Assert.assertNotEquals(x, y, "x and y are not equal,Test Case is Failed");
  }
}
