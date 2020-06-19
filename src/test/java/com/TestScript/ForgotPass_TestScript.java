package com.TestScript;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM_login.ForgotPass_POM;
import com.Utility.TestBase;

@Listeners(com.Listner.TestListner.class)

public class ForgotPass_TestScript extends TestBase {

	Logger log = Logger.getLogger(Login_Testscript.class);
	ForgotPass_POM obOfFoPOM;

	@BeforeTest
	public void setup() {
		obOfFoPOM = new ForgotPass_POM(TestBase.driver);
	}

	@Test
	public void Login_forgotPassword() {
		WebElement forgotmsg = obOfFoPOM.forgotpassword();
		assertEquals(forgotmsg.getText(), "Forgot Your Password?");
		forgotmsg.click();
		log.info("forgot password  is displayed");
	}

}
