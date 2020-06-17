package com.TestScript;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM_login.ForgotPass_POM;
import com.Utility.TestBase;

@Listeners(com.Listner_Report.TestListner.class)

public class ForgotPass_TestScript extends TestBase {

	ForgotPass_POM obOfFoPOM;

	@BeforeTest
	public void setup() {
		obOfFoPOM = new ForgotPass_POM(TestBase.driver);
	}

	@Test
	public void Login_forgotPassword() {
		obOfFoPOM.forgotpassword();
	}

}
