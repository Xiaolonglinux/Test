package com.growingio.web.environment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Firefox implements IDriver 
{
	 public WebDriver CreateWebDriver(int WaiteSecond)
     {
		 FirefoxProfile profile = new FirefoxProfile();
		 WebDriver driver = new FirefoxDriver(profile);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(WaiteSecond,TimeUnit.SECONDS);
         return driver;
     }
}
