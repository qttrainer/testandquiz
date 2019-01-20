package testbase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Page;


public class TestListners  extends SetUp implements ITestListener{
	
	Page page = new Page();

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestResult result) 
	{
		// TODO Auto-generated method stub
		
		ExtentTest child = classLevelLogger.get().createNode(result.getName());
		testLevelLogger.set(child);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult TestName) {
		// TODO Auto-generated method stub
		//testLogger().log(Status.FAIL, "This test case got failed");
		testLogger().fail("This test case got failed");
		extent.flush();
		
		page.takeScreenshoot(TestName.getName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		testLogger().skip("This test case got skipped");
		extent.flush();
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		testLogger().pass("This test case got passed");
		extent.flush();
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
