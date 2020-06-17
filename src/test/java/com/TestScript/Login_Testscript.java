package com.TestScript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM_login.Login_POM;
import com.Utility.TestBase;
import com.Utility.propertyLoader;

@Listeners(com.Listner_Report.TestListner.class)
public class Login_Testscript extends TestBase {

	Logger log = Logger.getLogger(Login_Testscript.class);

	Login_POM objectOfL_POM;

	@BeforeTest
	public void setup() throws Exception {
		objectOfL_POM = new Login_POM(TestBase.driver);

	}

	@Test(priority = 1)
	public void login_To_Sfdc() {
		objectOfL_POM.setcredential(userid, password);
		
		log.info("credendial passed");
		assertNotNull(driver.findElement(By.xpath("//label[@class='fl pr db tn3']")));
		assertEquals(driver.findElement(By.xpath("//label[@class='fl pr db tn3']")).getText(), "Remember me");
		assertNotEquals(driver.findElement(By.xpath("//label[@class='fl pr db tn3']")).getText(), "abc");
	}

	@Test(priority = 2)
	public void login_Button_clicked() {
		objectOfL_POM.loginbtn();

		log.info("login success");

		
	}

}
