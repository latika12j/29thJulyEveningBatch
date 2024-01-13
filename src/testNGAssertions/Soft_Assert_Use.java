package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Use 
{
  @Test
  public void test_Case_1() 
  {
	  SoftAssert soft=new SoftAssert();
	  
	  String actResult="Mumbai";
	  String expResult="Pune";
	  
	  soft.assertEquals(actResult, expResult,"Actual and Expected Results dont match,Test Case Failed");
	  
	 boolean actResult1=false;
	 soft.assertTrue(actResult1,"Boolean Value of variable is False,Test Case Failed");
	 
	 soft.assertAll();	 
	 
  }
}
