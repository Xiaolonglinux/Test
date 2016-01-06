package com.growingio.web.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class GrowingIO主页 {

	// 定位主页元素
	// 用户
	public static Element user() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[1]/a/div"));
		return new Element(element);
	}

}
