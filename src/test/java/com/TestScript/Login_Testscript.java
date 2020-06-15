package com.TestScript;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM_login.Login_POM;
import com.Utility.TestBase;


@Listeners(com.Listner_Report.TestListner.class)
public class Login_Testscript extends TestBase{
	
	
	Login_POM objectOfL_POM ;
	@BeforeTest
	public void setup() {
		objectOfL_POM = new Login_POM(TestBase.driver);
	}
	
	
	@Test
	public void logintosfdc() {
		objectOfL_POM.setcredential(userid, password);
		
	}
	

}
