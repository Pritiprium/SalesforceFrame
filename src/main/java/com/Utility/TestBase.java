package com.Utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Listner_Report.ExtentReport_Utility;
import com.Listner_Report.TestListner;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase {

	public static WebDriver driver;
	public Browser_utility objectOfBrwsrUtils = new Browser_utility();
	public String userid;
	public String password;
	ExtentReport_Utility obReport = new ExtentReport_Utility();
	TestListner objectTestListner = new TestListner();

	@BeforeSuite
	public void intialsetup() throws Exception {
		/*objectOfBrwsrUtils.dataforCredential();
		userid = objectOfBrwsrUtils.userid;
		password = objectOfBrwsrUtils.password;*/

	}

	@BeforeTest
	public void launchbrowsr() throws Exception {

		objectOfBrwsrUtils.launchbrwsr();
		//sending credential before every test.
		objectOfBrwsrUtils.dataforCredential();
		userid = objectOfBrwsrUtils.userid;
		password = objectOfBrwsrUtils.password;
//		obReport.CreatReport();
//		obReport.CreatTest("Demo Test");
//		obReport.logger.log(LogStatus.INFO, "browser Successfully launched");

	}

	@AfterTest
	public void closebrowser() {
		objectOfBrwsrUtils.Tearoff();
//		obReport.EndTestCase();
//		obReport.EndReport();
	}
}
