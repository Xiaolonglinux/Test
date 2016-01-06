package com.growingio.web.environment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Remote
{
	public WebDriver CreateWebDriver(RemoteCapabilities remoteCapabilities,int WaiteSecond)
    {
        URL commandExecutorUri = null;
		try {
			commandExecutorUri = new URL("http://ondemand.saucelabs.com/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("username", remoteCapabilities.username);
        capabilities.setCapability("accessKey", remoteCapabilities.accessKey);
        capabilities.setCapability("name", remoteCapabilities.testName);
        capabilities.setCapability(CapabilityType.BROWSER_NAME, remoteCapabilities.browserName);
        capabilities.setCapability("version", remoteCapabilities.browserVersion);
        capabilities.setCapability("platform", remoteCapabilities.platform);
        WebDriver driver = new RemoteWebDriver(commandExecutorUri, capabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(WaiteSecond,TimeUnit.SECONDS);
        return driver;
    }
}
