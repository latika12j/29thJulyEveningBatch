package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGSampleClass_1 
{
  @Test
  public void myMethod() 
  {
	  System.out.println("Hii..This is normal printing statement");
	  Reporter.log("Hii...This is Reporter without Boolean Parameter");
	  Reporter.log("Hii...This is reporter with boolean parameter", true);
  }
}
