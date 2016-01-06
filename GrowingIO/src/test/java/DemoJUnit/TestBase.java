package DemoJUnit;

import org.junit.*;
import com.growingio.web.driver.Browser;
import com.growingio.web.environment.Chrome;
import com.growingio.web.environment.Firefox;
import com.growingio.web.environment.IE;
import com.growingio.web.environment.Remote;
import com.growingio.web.environment.RemoteCapabilities;
import com.growingio.web.util.Configuration;
import com.growingio.web.util.Log;

public class TestBase{
	
	@BeforeClass
	public static void beforeClass() 
	{
		Log.DoLog("=================Start=================");
		String browser = Configuration.get("browser");
		if (browser.toLowerCase().contains("firefox"))
        {
            Browser.createWebDriver(new Firefox(),30);
        }
        else if (browser.toLowerCase().contains("ie"))
        {
            Browser.createWebDriver(new IE(),30);
        }
        else if (browser.toLowerCase().contains("chrome"))
        {
            Browser.createWebDriver(new Chrome(),30);
        }
        else if (browser.toLowerCase().contains("remote"))
        {
            RemoteCapabilities RemoteCapabilities = new RemoteCapabilities();
            RemoteCapabilities.username = "GrowingIO";
            RemoteCapabilities.accessKey = "232e34f7-0804-4c1d-a8ad-75b389fe7917";
            RemoteCapabilities.testName = "Demo";
            RemoteCapabilities.browserName = "safari";
            RemoteCapabilities.browserVersion = "8.0";
            RemoteCapabilities.platform = "OS X 10.10";
            Browser.createWebDriver(new Remote(),RemoteCapabilities,30);
        }
	}
	
	@Before
	public void beforeTest() 
	{
		Browser.goTo(Configuration.get("testUrl"));
	}
	
	@After
	public void afterTest() 
	{
		// Browser.quit();
	}
	
	@AfterClass
	public static void afterClass() 
	{
		Log.DoLog("=================Done=================");
	}
}
