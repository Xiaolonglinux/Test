package com.growingio.web.pageobject;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;

import com.growingio.web.driver.Browser;
// import com.growingio.web.element.Element;
import com.growingio.web.pageobject.GrowingIO首页;

public class 关于我们 {

	// 判断浏览器的title 为“ GrowingIO - 关于我们” Test能打开网页

	public static void click() throws Exception { // 点击关于我们
		GrowingIO首页.关于我们().click();

		String title = "GrowingIO - 关于我们";
		Browser.getTitle().equals(title);
	}

}
