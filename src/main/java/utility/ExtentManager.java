package utility;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

	private static ExtentReports extent;
	//private static ExtentTest test;
	private static ExtentHtmlReporter htmlReporter;
	private static String filePath = "C:/Users/hp/Desktop/extentreport.html";


	public static ExtentReports GetExtent() {
		if (extent != null) {
			return extent;
		} else {
			extent = new ExtentReports();
			extent.attachReporter(getHtmlReporter());
			extent.setSystemInfo("Host Name", "Ashutosh Upadhyay");
			
			extent.setAnalysisStrategy(AnalysisStrategy.CLASS);
			return extent;
		}
	}

	public static ExtentHtmlReporter getHtmlReporter() {

		
	//"user.dir") + "//test-output//happyReport.html"
		htmlReporter = new ExtentHtmlReporter("C:/Users/hp/Desktop/extentreport.html");
		/*htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle(" Automation Report");
		htmlReporter.config().setReportName("Automation");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);*/
		
		htmlReporter.setAppendExisting(false);
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"\\src\\test\\resources\\ReportsConfig.xml");

		return htmlReporter;
	}


}
