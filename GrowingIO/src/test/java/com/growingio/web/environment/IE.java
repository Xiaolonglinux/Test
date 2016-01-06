package com.growingio.web.environment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IE implements IDriver
{
	public WebDriver CreateWebDriver(int WaiteSecond)
    {
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);	
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(WaiteSecond,TimeUnit.SECONDS);
        return driver;
    }
}
