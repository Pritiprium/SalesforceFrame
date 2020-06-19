package com.Listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.Utility.Common_Utility;
import com.Utility.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestListner extends Report_Utility implements ITestListener {

	public Report_Utility objectOfReport = new Report_Utility();
	public Common_Utility oCmnUtil = new Common_Utility();
	public static ExtentReports reports = Report_Utility.CreateReport();
	public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + "  : test Started");
		logger = reports.startTest(result.getMethod().getMethodName() + " Test Started");
		test.set(logger);
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " : Test case passed");
		logger.log(LogStatus.INFO, result.getMethod().getMethodName() + "Test case Success");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " test case failed");
		try {
			// oCmnUtil.Takescreenshot();
			logger.log(LogStatus.FAIL, result.getMethod().getMethodName() + " Test Failed "
					+ logger.addScreenCapture(oCmnUtil.Takescreenshot()));
		} catch (Exception e) {
			System.out.println("exception occur" + e);
			// e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + ": test case skiped");
		logger.log(LogStatus.SKIP, result.getName() + " Test skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName() + ": test suite started");
		// objectOfReport.CreateReport();
	}

	public void onFinish(ITestContext context) {
		EndTestCase();
		EndReport();

	}

}
