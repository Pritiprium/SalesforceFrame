package com.TestScript;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.POM_login.Logout_POM;
import com.Utility.TestBase;

public class Logout_TestScript extends TestBase{
	
	Logout_POM objectOfLogout;
	@BeforeTest
	public void setup() {
		objectOfLogout = new Logout_POM(TestBase.driver);
	}
	@Test
	public void login() {
		objectOfLogout.setcredential(userid, password);
	}
	@Test
	public void logout() {
		objectOfLogout.logouttab();
	}

}
