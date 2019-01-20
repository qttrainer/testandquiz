package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utility.ExtentManager;

public class Page {

	public static Properties OR = new Properties();
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static WebDriver driver;
	
	protected static ExtentReports extent;
    public static ThreadLocal<ExtentTest> classLevelLogger = new ThreadLocal<ExtentTest>();
    public static ThreadLocal<ExtentTest> testLevelLogger = new ThreadLocal<ExtentTest>();

	
	public Page() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\workspace\\testandquiz\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.testandquiz.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000L, TimeUnit.MILLISECONDS);
			// PageFactory.initElements(driver, this);
			extent = ExtentManager.GetExtent();
		
		}
		PageFactory.initElements(driver, this);
		System.out.println(this.getClass().getName());
		beforeClass();
		
	}

	public static void quit() {
		driver.quit();
	}

	public void click(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	public static void takeScreenshoot(String TestName)
	{
		try
		{
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"//Screenshoot"+TestName +".png");
		FileUtils.copyFile(file, destination);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@BeforeClass
	   public  void beforeClass()
	   {
		 
		ExtentTest parent = extent.createTest(getClass().getName());
		classLevelLogger.set(parent);
		System.out.println("before class called");
		
	   }

	public static ExtentTest testLogger()
	{
		return testLevelLogger.get();
	} 

	}


