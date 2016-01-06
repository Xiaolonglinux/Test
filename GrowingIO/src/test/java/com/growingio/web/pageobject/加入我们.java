package com.growingio.web.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 加入我们 {

	public static Element 我能搞定ios() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='dev']/div[1]/a"));
		return new Element(element);
	}

	public static Element 我能搞定android() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='joinus']/div/div/div[2]/div[1]/div[1]/a"));
		return new Element(element);
	}
	public static Element 研发部() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='joinus']/div/div/div[1]/ul/li[1]/a"));
		return new Element(element);
	}

	public static Element 数据分析部() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='joinus']/div/div/div[1]/ul/li[2]/a"));
		return new Element(element);
	}

	public static Element 产品部() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='joinus']/div/div/div[1]/ul/li[3]/a"));
		return new Element(element);
	}

	public static Element 市场部() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='joinus']/div/div/div[1]/ul/li[4]/a"));
		return new Element(element);
	}
	// 点击左侧按钮
	public static void click() throws Exception {
		研发部().click();
		数据分析部().click();
		产品部().click();
		市场部().click();		
	}

}
