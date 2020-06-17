package com.Listner_Report;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.Utility.Common_Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Report_Utility {

	public static ExtentReports reports;
	public static ExtentTest logger;

	public static ExtentReports CreateReport() {
		String UniqueDnT = new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm''").format(new Date());
		String filepath = System.getProperty("user.dir") + "//ExtentReport//Report_" + UniqueDnT + ".html";
		return reports = new ExtentReports(filepath);
	}

	public void CreatTest(String TestcaseName) {
		logger = reports.startTest(TestcaseName);
	}

	public void EndTestCase() {
		reports.endTest(logger);
	}

	public void EndReport() {
		reports.flush();
	}

}
