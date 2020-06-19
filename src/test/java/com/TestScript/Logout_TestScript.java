package com.TestScript;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.POM_login.Logout_POM;
import com.Utility.TestBase;

@Listeners(com.Listner.TestListner.class)

public class Logout_TestScript extends TestBase {

	Logger log = Logger.getLogger(Login_Testscript.class);
	Logout_POM objectOfLogout;

	@BeforeTest
	public void setup() {
		objectOfLogout = new Logout_POM(TestBase.driver);
	}

//	@Test(priority = 1)
//	public void login_forlogoutPage() {
//		objectOfLogout.setcredential(userid, password);
//		log.info("login Success");
//	}
//	@Test(priority = 2)
//	public void Button_clicked() {
//		objectOfLogout.login_Button_clicked();
//	}

	@Test(priority = 3)
	public void logout() throws Exception {
		WebElement logoutbtn = objectOfLogout.logouttab();
		System.out.println(logoutbtn.getText());
		assertEquals(logoutbtn.getText(), "Logout");
		logoutbtn.click();
		log.info("logout successfully");
	}

}
