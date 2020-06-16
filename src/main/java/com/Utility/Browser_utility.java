package com.Utility;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_utility {

	public String userid;
	public String password;

	public void launchbrwsr() {
		WebDriverManager.chromedriver().setup();
		TestBase.driver = new ChromeDriver();
		TestBase.driver.get("https://login.salesforce.com/");
		TestBase.driver.manage().window().maximize();
	}

	public static void waitforVisiblity(WebElement elefowait) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(elefowait));

	}

	public void dataforCredential() throws Exception {
		String sfile = System.getProperty("user.dir") + "\\src\\main\\resources\\DataforCredn.xls";
		FileInputStream fi = new FileInputStream(sfile);
		HSSFWorkbook excelbook = new HSSFWorkbook(fi);
		HSSFSheet excelsheet = excelbook.getSheet("Sheet1");
		HSSFRow row1 = excelsheet.getRow(0); // \\src\\main\\java\\com\\Utility\\DataforCredn.xls
		HSSFRow row2 = excelsheet.getRow(1);
		userid = row1.getCell(1).getStringCellValue();
		password = row2.getCell(1).getStringCellValue();

	}

	public void Tearoff() {
		TestBase.driver.quit();
	}

}
