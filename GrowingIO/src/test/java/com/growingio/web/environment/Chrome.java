package com.growingio.web.environment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chrome implements IDriver
{
	public WebDriver CreateWebDriver(int WaiteSecond)
    {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		DesiredCapabilities profile = new DesiredCapabilities();
		WebDriver driver = new ChromeDriver(profile);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(WaiteSecond,TimeUnit.SECONDS);
        return driver;
    }
}
