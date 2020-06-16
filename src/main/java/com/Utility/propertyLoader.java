package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

public class propertyLoader {
	
	public void loadlog4jPropertyFile(String spathOflog4j) throws Exception{
		FileInputStream fi = new FileInputStream(spathOflog4j);
		Properties prop = new Properties();
		prop.load(fi);
		PropertyConfigurator.configure(prop);
		
	}

}
