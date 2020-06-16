package com.Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Common_Utility {
	
	public void Takescreenshot() throws Exception {
		String pathDestiImage = System.getProperty("user.dir")+"\\ScreenShot\\"+new SimpleDateFormat("'image_'YYYYMMddHHmm'.png'").format(new Date());
			TakesScreenshot ts = (TakesScreenshot)(TestBase.driver);
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(pathDestiImage);
			FileUtils.copyFile(source, destination);
	}
	

}
