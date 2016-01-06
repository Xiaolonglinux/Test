package com.growingio.web.pageobject;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.growingio.web.robot.*;
import java.awt.Robot;
import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 看板 {
	public static Element 看板btn() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[1]/div[3]/ul/li[4]"));
		return new Element(element);
	}

	public static Element 看板1() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div[2]/div[1]"));
		return new Element(element);
	}

	// 订阅

	public static Element 订阅btn() throws Exception {
		WebElement element = Browser
				.FindElement(By
						.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/span[1]"));
		return new Element(element);
	}
	// 删除
	public static Element 编辑btn() throws Exception {
		WebElement element = Browser
				.FindElement(By
						.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/span[2]/span"));
		return new Element(element);

	}

	// 删除
	public static Element 删除btn() throws Exception {
		WebElement element = Browser
				.FindElement(By
						.xpath(".//*[@id='viewport']/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/span[2]/svg"));
		return new Element(element);

	}

	// 编辑
	public static Element 编辑() throws Exception {
		WebElement element = Browser
				.FindElement(By
						.xpath("html/body/div[3]/div/div[2]/div/div/div[3]/div[3]/a/i"));
		return new Element(element);
	}


	// 确认

	public static Element 确认() throws Exception {
		WebElement element = Browser.FindElement(By.xpath(""));
		return new Element(element);

	}

	public static Element 取消() throws Exception {
		WebElement element = Browser.FindElement(By.xpath(""));
		return new Element(element);

	}
	public static robot robot() throws Exception {
		
		return new robot();
	}
	// 点击看板，点击单图
	public static void 看板2() throws Exception {
		
		看板btn().click();
		// 点击看板图
		看板1().click();
		// 点击编辑
		编辑btn().click();
		// 点击回车
	    Robot bot = new Robot();
		robot.pressKey(bot);
		
	}

}
