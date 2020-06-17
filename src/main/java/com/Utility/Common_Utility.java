package com.Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Listner_Report.Report_Utility;

public class Common_Utility extends Report_Utility {
	
	public String Takescreenshot() throws Exception {
		String pathDestiImage = System.getProperty("user.dir")+"\\ScreenShot\\"+new SimpleDateFormat("'image_'YYYYMMddHHmm'.png'").format(new Date());
			TakesScreenshot ts = (TakesScreenshot)(TestBase.driver);
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(pathDestiImage);
			FileUtils.copyFile(source, destination);
			
			return pathDestiImage;
	}
	

}
