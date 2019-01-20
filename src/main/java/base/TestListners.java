package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class TestListners implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestResult result) 
	{
		// TODO Auto-generated method stub
		System.out.println("1 start");
		ExtentTest child = Page.classLevelLogger.get().createNode(result.getName());
		Page.testLevelLogger.set(child);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult TestName) {
		// TODO Auto-generated method stub
		//testLogger().log(Status.FAIL, "This test case got failed");
		Page.testLogger().fail("This test case got failed");
		Page.extent.flush();
		
		Page.takeScreenshoot(TestName.getName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		Page.testLogger().skip("This test case got skipped");
		Page.extent.flush();
		
	}

	public void onTestStart(ITestResult arg0) {
		ExtentTest child = Page.classLevelLogger.get().createNode(arg0.getName());
		Page.testLevelLogger.set(child);
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		Page.testLogger().pass("This test case got passed");
		Page.extent.flush();
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(2);
		
	}

	
	
}
