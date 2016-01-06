package com.growingio.web.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 我的订阅 {
	public static Element   我的订阅btn() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[1]/div[3]/ul/li[1]"));
		return new Element(element);
	}
	public static Element image() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='charts-sort']"));
		return new Element(element);
	}
	public static Element 名称() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[1]/div/ul[2]/li/ul/li[1]"));
		return new Element(element);
	}
	public static Element 更新时间() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[1]/div/ul[2]/li/ul/li[2]"));
		return new Element(element);
	}
	public static Element 创建时间() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[1]/div/ul[2]/li/ul/li[3]"));
		return new Element(element);
	}
	// 点击时间icon 
	
	public static Element 时间icon() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[1]/div/div[1]"));
		//              .//*[@id='viewport']/div[2]/div/div[1]/div/div[1]
	   //               .//*[@id='viewport']/div[2]/div/div[1]/div/div[1]
		return new Element(element);
	}
	public static Element 今天() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[2]/div[3]/ul/li[1]"));
		//              html/body/div[2]/div[3]/ul/li[1]
	              
		return new Element(element);
	}
	public static Element 昨天() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[2]/div[3]/ul/li[2]"));
		//              html/body/div[2]/div[3]/ul/li[2]
		return new Element(element);
	}
	public static Element 过去7天() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[2]/div[3]/ul/li[3]"));
		
		return new Element(element);
	}
	public static Element 过去14天() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[2]/div[3]/ul/li[4]"));
		              
		return new Element(element);
	}
	public static Element 过去30天() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[2]/div[3]/ul/li[5]"));
		              
		return new Element(element);
	}	
	public static void 我的订阅click() throws Exception {
		
	    我的订阅btn().click();
	    // 点击排序的图片
	    image().click();
	    创建时间().click();
//  Thread.currentThread().sleep(5000);
	    
	image().click();
		名称().click();
		
		image().click();
		更新时间().click();
		
		// 点击时间icon
			时间icon().click();
		今天().click();
		Thread.currentThread().sleep(5000);
		时间icon().click();
		昨天().click();
		Thread.currentThread().sleep(5000);
		时间icon().click();
		过去7天().click();
		Thread.currentThread().sleep(5000);
		时间icon().click();
		过去14天().click();
		Thread.currentThread().sleep(5000);
		时间icon().click();
		过去30天().click();
		
	}
}
