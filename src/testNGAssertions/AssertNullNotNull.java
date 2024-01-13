package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull 
{
  @Test
  public void TestAssertNullNotNull() 
  {
	  String q="Latika";
	  String p=null;

	  // Verify q is not null
	  // Assert.assertNotNull(q, "q value is null.Test Case failed");
	  
	  //Verify p is null
	  //Assert.fail();
	  //Assert.assertNull(p, "p value is not null,Test Case failed");
	  
	  Assert.assertNotNull(p, "p value is null.Test Case failed");
  }
}
