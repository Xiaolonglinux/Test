package com.growingio.web.driver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;
import com.growingio.web.environment.IDriver;
import com.growingio.web.environment.Remote;
import com.growingio.web.environment.RemoteCapabilities;
import com.growingio.web.util.Global;
import com.growingio.web.util.Log;

public class Browser 
{
	public static WebDriver Driver = null;  
	private static int timeout;
	
    public static void createWebDriver(IDriver driver, int WaitTime)
    {
    	timeout = WaitTime;
        Driver = driver.CreateWebDriver(WaitTime);
    }

    public static void createWebDriver(Remote Remote, RemoteCapabilities remoteCapabilities, int WaitTime)
    {
    	timeout = WaitTime;
        Driver = Remote.CreateWebDriver(remoteCapabilities,WaitTime);
    }

    public static void quit()
    {
        Driver.quit();
    }

    public static String getTitle()
    {
        try
        {
            String title = Driver.getTitle();
            return title;
        }
        catch(Exception ex)
        {
            return "";
        }
    }

    public static WebDriverWait wait(int seconds)
    {
    	return new WebDriverWait(Driver, seconds);
    }

    public static void waitByCondition(int seconds,final boolean condition)
    {
        Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        wait(seconds).until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				return !condition;
			  }
			});
        Driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
    }

    public static void goTo(String url)
    {
        Driver.get(url);
    }

    public static void TakeScreenshot()
    {
    	TakeScreenshot(new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date()));
    }
    
    public static void TakeScreenshot(String name)
    {
    	try
        {
    		String outPutFilePath = "result\\" +Global.Time +"\\Screenshot";
    		File file = new File(outPutFilePath);
    		if(!file.exists()){
    			file.mkdirs();
    		}
            File screenShotFile = ((TakesScreenshot) Browser.Driver).getScreenshotAs(OutputType.FILE);
        	String fullPaht = outPutFilePath +"\\" +name+ ".png";
        	FileUtils.copyFile(screenShotFile, new File(fullPaht));
        }
        catch (Exception ex)
        {
            Log.LogException(ex);
        }
    }

    public static void TakeErrorScreenshot()
    {
    	String outPutFilePath = "result\\" +Global.Time +"\\Screenshot";
        Log.DoLog("==============================");
        String now = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
        Browser.TakeScreenshot(now);
        Log.DoLog("Current URL: " + Browser.Driver.getCurrentUrl());
		Log.DoLog("Error Screenshot:" + outPutFilePath +"\\" +now+ ".png");
        Log.DoLog("==============================");
    }

    public static WebElement FindElement(By by)
    {
        try
        {
        	WebElement element = Browser.Driver.findElement(by);
            return element;
        }
        catch (Exception ex)
        {
            Log.LogException(ex);
            return null;
        }
    }
    
    public static WebElement FindElement(By by, int WaitTime)
    {
        try
        {
            Browser.Driver.manage().timeouts().implicitlyWait(WaitTime, TimeUnit.SECONDS);
            WebElement element = Browser.Driver.findElement(by);
            return element;
        }
        catch (Exception ex)
        {
            Log.LogException(ex);
            return null;
        }
        finally
        {
        	Browser.Driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        }
    }
    
    public static List<WebElement> FindElements(By by)
    {
        try
        {
            List<WebElement> elements = Browser.Driver.findElements(by);
            return elements;
        }
        catch (Exception ex)
        {
            Log.LogException(ex);
            return null;
        }
    }
    
    public static List<WebElement> FindElements(By by,int WaitTime)
    {
        try
        {
        	Browser.Driver.manage().timeouts().implicitlyWait(WaitTime, TimeUnit.SECONDS);
            List<WebElement> elements = Browser.Driver.findElements(by);
            return elements;
        }
        catch (Exception ex)
        {
            Log.LogException(ex);
            return null;
        }
        finally
        {
        	Browser.Driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        }
    }
}
