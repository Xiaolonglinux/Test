package com.growingio.web.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 邮箱页面 {

	public static Element 用户名() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='username']"));
		return new Element(element);
	}

	public static Element 密码() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='password']"));
		return new Element(element);
	}

	public static Element 登录() throws Exception {
		WebElement element = Browser
				.FindElement(By
						.xpath(".//*[@id='tblMid']/tbody/tr[7]/td/table/tbody/tr[3]/td/input[1]"));
		return new Element(element);

	}

	// 重设密码
	public static Element 重设密码1() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='divBdy']/div/div/div[4]/a/font/span"));
		return new Element(element);

	}

	// 邮件 链接（网站）
	public static Element website() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='divBdy']/div/div/div[6]"));
		//.//*[@id='divBdy']/div/div/div[6]
		//.//*[@id='divBdy']/div/div/div[6]
		return new Element(element);
	}

	// https://www.growingio.com/invitations/606ac5bcc57664ec 

	// 收件箱第首封邮件
	public static Element 首封邮件() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='divBdy']/div/div/div[4]/a/font/span"));
		return new Element(element);

	}

	// 登录邮箱
	public static void longin(String name, String password) throws Exception {
		
		用户名().sendKeys(name);
		密码().sendKeys(password);
		// 点击登录
		登录().click();

	}

}
