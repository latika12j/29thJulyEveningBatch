package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String TCName = result.getName();
		Reporter.log("TestCase "+TCName+" Completed Successfully");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Test Case "+result.getName()+" is skipped,please check dependent method",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test Case "+result.getName()+" is Failed",true);
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test Case "+result.getName()+" execution started",true);
		
	}
}
