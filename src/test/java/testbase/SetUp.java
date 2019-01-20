package testbase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utility.ExtentManager;

public class SetUp {
	
	protected static ExtentReports extent;
    public static ThreadLocal<ExtentTest> classLevelLogger = new ThreadLocal<ExtentTest>();
    public static ThreadLocal<ExtentTest> testLevelLogger = new ThreadLocal<ExtentTest>();

   @BeforeSuite
    public void beforeSuit()
    {
	   System.out.println("in before suite");
    	if(extent==null)
    	{
    		System.out.println("in before suite");
    		extent = ExtentManager.GetExtent();
    	}
    }
    
   @BeforeClass
    public void beforeClass()
    {
	   System.out.println("in before claSS");
	ExtentTest parent = extent.createTest(getClass().getName());
	classLevelLogger.set(parent);
	
    }
   
   public static ExtentTest testLogger()
	{
		return testLevelLogger.get();
	}

}
