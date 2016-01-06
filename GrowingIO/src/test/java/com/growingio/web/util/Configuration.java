package com.growingio.web.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration 
{
	public static String get(String key)
	{
    	Properties config = new Properties();
		try {
			FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+"//src//config//CONFIG.properties");
			config.load(fn);
			return config.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
