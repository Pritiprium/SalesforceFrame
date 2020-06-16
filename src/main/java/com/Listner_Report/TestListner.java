package com.Listner_Report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Utility.Common_Utility;
import com.relevantcodes.extentreports.LogStatus;

public class TestListner implements ITestListener {
	
	public Report_Utility objectOfReport = new Report_Utility();
	public Common_Utility oCmnUtil = new Common_Utility();
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "  : test Started");
		//objectOfReport.logger.log(LogStatus.INFO,"test started");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " : tset case passed");
		//objectOfReport.logger.log(LogStatus.INFO, "test case passe");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+ "test case failed");
		try {
			oCmnUtil.Takescreenshot();
		} catch (Exception e) {
			System.out.println("exception occur"+e);
			//e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+ ": test case skiped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName()+": test case started");

	}

	public void onFinish(ITestContext context) {
		//objectOfReport.EndTestCase();
		//objectOfReport.EndReport();

	}

}
