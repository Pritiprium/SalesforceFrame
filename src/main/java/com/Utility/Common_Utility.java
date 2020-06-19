package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.Listner.Report_Utility;

public class Common_Utility extends Report_Utility {
	
	public String Valid_userid;
	public String Valid_password;
	public String Invalid_userid;
	public String Invalid_password;
	
//	@DataProvider(name = "testData")
//	public Object[][] datafromExcel() throws Exception{
//		String sfile = System.getProperty("user.dir") + "\\src\\main\\resources\\DataforCredn.xls";
//		return  readData_FromExcel(sfile);	
//	}
//	public Object[][] readData_FromExcel(String sfile) throws Exception{
//		HSSFWorkbook excelbook = new HSSFWorkbook(new FileInputStream(sfile));
//		HSSFSheet excelsheet = excelbook.getSheet("Sheet1");	
//		return null;		
//	}
	public void dataforCredential() throws Exception {
		String sfile = System.getProperty("user.dir") + "\\src\\main\\resources\\DataforCredn.xls";
		FileInputStream fi = new FileInputStream(sfile);
		HSSFWorkbook excelbook = new HSSFWorkbook(fi);
		HSSFSheet excelsheet = excelbook.getSheet("Sheet1");
		HSSFRow row1 = excelsheet.getRow(0); // \\src\\main\\java\\com\\Utility\\DataforCredn.xls
		HSSFRow row2 = excelsheet.getRow(1);
		HSSFRow row3 = excelsheet.getRow(2);
		HSSFRow row4 = excelsheet.getRow(3);
		Valid_userid = row1.getCell(1).getStringCellValue();
		Valid_password = row2.getCell(1).getStringCellValue();
		Invalid_userid = row3.getCell(1).getStringCellValue();
		Invalid_password = row4.getCell(1).getStringCellValue();
		excelbook.close();
	}
	
	public void loadlog4jPropertyFile(String spathOflog4j) throws Exception{
		FileInputStream fi = new FileInputStream(spathOflog4j);
		Properties prop = new Properties();
		prop.load(fi);
		PropertyConfigurator.configure(prop);
		
	}

	
	public String Takescreenshot() throws Exception {
		String pathDestiImage = System.getProperty("user.dir")+"\\ScreenShot\\"+new SimpleDateFormat("'image_'YYYYMMddHHmm'.png'").format(new Date());
			TakesScreenshot ts = (TakesScreenshot)(TestBase.driver);
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(pathDestiImage);
			FileUtils.copyFile(source, destination);		
			return pathDestiImage;
	}
	

}
