package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Extentreports.reports;
import resource.base;

public class Listeners extends base implements ITestListener {

	ExtentReports jai = reports.getextentreports();
	
	ThreadLocal<ExtentTest> threadsafe=new ThreadLocal<ExtentTest>();
	
	
	
	ExtentTest extenttest;

	public WebDriver driver;

	public void onTestStart(ITestResult result) {

		String testname = result.getName();

		extenttest = jai.createTest(testname + "Test Started");
		
		
		threadsafe.set(extenttest);

	}

	public void onTestSuccess(ITestResult result) {

		String testname = result.getName();

		//extenttest.log(Status.PASS, testname + "Test Sucess");
		
		threadsafe.get().log(Status.PASS, testname + "Test Sucess");

	}

	public void onTestFailure(ITestResult result) {

		String testmethodname = result.getName();

		//extenttest.fail(result.getThrowable());
		
		threadsafe.get().fail(result.getThrowable());
		
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());

		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			String decent = takescreenshot(testmethodname, driver);

			//extenttest.addScreenCaptureFromPath(decent, testmethodname);
			
			threadsafe.get().addScreenCaptureFromPath(decent, testmethodname);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

		jai.flush();

	}

}
