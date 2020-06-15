package com.TestScript;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.POM_login.Home_POM;
import com.Utility.TestBase;

public class Home_TestScript extends TestBase{
	
	Home_POM objectOfHome;
	
	
	@BeforeTest
	public void setup() {
		objectOfHome = new Home_POM(TestBase.driver);
	}
	@Test
	public void homepage() {
		objectOfHome.setcredential(userid, password);
		System.out.println("home button clicked");
		
	}

}
