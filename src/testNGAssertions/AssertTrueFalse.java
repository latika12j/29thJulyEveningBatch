package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse 
{
  @Test  
  public void TestTrueFalse() 
  {
	  boolean a=true;
	  boolean b=false;
	  
	  //Verify a is true
	  //Assert.assertTrue(a,"a value is false, TC is failed");
	
	  //Verify b is false
	  //Assert.assertFalse(b, "b is true, TC is failed");
	  
	  Assert.assertTrue(b,"TestCase Failed,b is False");
	  //Assert.assertFalse(a,"TestCase Failed,a is true");
  }
}
