package com.Listner_Report;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport_Utility {
	
	public ExtentReports reports;
	public  ExtentTest logger;
	
		//String spath = System.getProperty("user.dir")+"\\ExtentReport\\report.xml";
		public  void CreatReport() {
			String UniqueDnT = new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm''").format(new Date());
			String filepath = System.getProperty("user.dir") + "//ExtentReport//Report_" + UniqueDnT + ".html";
			reports = new ExtentReports(filepath);
		}

		public  void CreatTest(String TestcaseName) {
			logger = reports.startTest(TestcaseName);
		}

		public  void EndTestCase() {
			reports.endTest(logger);
		}

		public void EndReport() {
			reports.flush();
		}
	

}
