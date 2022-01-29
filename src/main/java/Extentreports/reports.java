package Extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports  {

	static ExtentReports oops;

	public static ExtentReports getextentreports()

	{
		String reportpath = System.getProperty("user.dir") + "//reports//extentreport.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);

		reporter.config().setReportName("Test Results");
		reporter.config().setDocumentTitle("Amazon Test");

		oops = new ExtentReports();
		oops.attachReporter(reporter);

		oops.setSystemInfo("opertingsystem", "windows10");

		oops.setSystemInfo("Tested by ", "Sai Pattabhi");
		
		return oops;

	}

}
