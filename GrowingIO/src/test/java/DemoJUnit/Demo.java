package DemoJUnit;

import org.junit.Test;

import com.growingio.web.pageobject.HomePage;

public class Demo extends TestBase {

	@Test
	public void testAuto() throws Exception {
		 HomePage.News().click();
         HomePage.Forum().click();
         HomePage.Music().click();
         HomePage.Video().click();
         HomePage.Map().click();
        // HomePage.Picture().click();
	} 
}
