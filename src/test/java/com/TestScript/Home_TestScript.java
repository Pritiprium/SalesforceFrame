package com.TestScript;

import static org.testng.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Listner.Report_Utility;
import com.POM_login.Home_POM;
import com.Utility.TestBase;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(com.Listner.TestListner.class)

public class Home_TestScript extends TestBase {
	
	Logger log = Logger.getLogger(getClass().getSimpleName());
	Home_POM objectOfHome;

	@BeforeTest
	public void setup() {
		objectOfHome = new Home_POM(TestBase.driver);
	}

//	@Test(priority = 1)
//	public void login_forHomepage() {
//		objectOfHome.setcredential(userid, password);
//		log.info("userid password sent in feild");
//
//	}

	@Test(priority = 2)
	public void homepage_displayed() {
		assertEquals(driver.findElement(By.id("home_Tab")).getText(), "Home");
		objectOfHome.homepg();
		log.info("home button displayed");

	}

}
