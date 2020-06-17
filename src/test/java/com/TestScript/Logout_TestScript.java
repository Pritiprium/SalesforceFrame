package com.TestScript;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.POM_login.Logout_POM;
import com.Utility.TestBase;

@Listeners(com.Listner_Report.TestListner.class)

public class Logout_TestScript extends TestBase {
	Logger log = Logger.getLogger(Login_Testscript.class);
	Logout_POM objectOfLogout;

	@BeforeTest
	public void setup() {
		objectOfLogout = new Logout_POM(TestBase.driver);
	}

	@Test(priority = 1)
	public void login_forlogoutPage() {
		objectOfLogout.setcredential(userid, password);
		log.info("login Success");
	}

	@Test(priority = 2)
	public void Button_clicked() {
		objectOfLogout.login_Button_clicked();
	}

	@Test(priority = 3)
	public void logout() {
		objectOfLogout.logouttab();
		log.info("logout successfully");
	}

}
