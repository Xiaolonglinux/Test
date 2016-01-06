package com.growingio.web.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 概览 {
	
	public static Element 概览btn() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[1]/div[3]/ul/li[2]"));
		return new Element(element);
	}
	
	public static Element 全部() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[1]/div[1]/button[1]"));
		return new Element(element);
	}
	public static Element 网页() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[1]/div[1]/button[2]"));
		return new Element(element);
	}
	public static Element 移动APP() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[1]/div[1]/button[3]"));
		return new Element(element);
	}

	public static Element iOS() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[1]/div[1]/button[4]"));
		return new Element(element);
	}
	public static Element Android() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[1]/div[1]/button[5]"));
		return new Element(element);
	}

	public static Element Seven() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[1]/div[2]/button[1]"));
		return new Element(element);
	}
	public static Element Fourteen() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[1]/div[2]/button[2]"));
		return new Element(element);
	}
	public static Element Twentyeight() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[1]/div[2]/button[3]"));
		return new Element(element);
	}
      // 四站图片
	public static Element 用户使用量() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[2]/div[1]"));
		return new Element(element);
	}

	public static Element 访问用户量() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[2]/div[2]"));
		return new Element(element);
	}
	public static Element 新用户访问量() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[2]/div[3]"));
		return new Element(element);
	}
	public static Element 平均访问时长() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div/div[2]/div[4]"));
		return new Element(element);
	} 
	public static void 概览click() throws Exception{
	// 点击概览、全部、网页、移动App、iOS、Android、 
	  概览btn().click();
	  全部().click();
	  网页().click();
	  移动APP().click();
	  iOS().click();
	  Android().click();
	  //点击上方四张图片
	平均访问时长().click();
	新用户访问量().click();
	访问用户量().click();
	用户使用量().click();
	
	//点击7天、14天、28天
	Twentyeight().click();
    Fourteen().click();
    Seven().click();	
    
	}
}
