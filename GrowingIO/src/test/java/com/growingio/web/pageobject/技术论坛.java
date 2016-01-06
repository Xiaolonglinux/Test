package com.growingio.web.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 技术论坛 {
	// 标题
	public static Element title() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/nav/div/a"));
		return new Element(element);
	}

	// 图片
	public static Element image() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/ul/li[1]/a/div"));
		return new Element(element);
	}

	// 点击图片或者标题打开文章
	public static void imageclick() throws Exception {

		// 点击title/image 打开文章
        image().click();
		
	}

}
