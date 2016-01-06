package com.growingio.web.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 网易邮箱 {
	    //账号
		public static Element 账号() throws Exception {
			WebElement element = Browser.FindElement(By
					.xpath(".//*[@id='accname']"));
			return new Element(element);
		}

		// 密码
		public static Element 密码() throws Exception {
			WebElement element = Browser.FindElement(By
					.xpath(".//*[@id='accpwd']"));
			return new Element(element);
		}
		public static Element 收件箱() throws Exception {
			WebElement element = Browser.FindElement(By
					.xpath(".//*[@id='_mail_component_35_35']"));
			return new Element(element);
		}
		public static Element 邮件() throws Exception {
			WebElement element = Browser.FindElement(By
					.xpath(".//*[@id='1451879122047_411tbiKQfl8lTbaOFwgAAsa1451879130238Dom']/div/div[1]"));
			return new Element(element);
		}
	
		public static Element 网址() throws Exception {
			WebElement element = Browser.FindElement(By
					.xpath("html/body/p[6]"));
			return new Element(element);
		}
		public static Element 登录() throws Exception {
			WebElement element = Browser.FindElement(By
					.xpath("html/body/section/div/div/div[2]/div[2]/form[1]/div[4]/button"));
			return new Element(element);
		}
		// 登录网易邮箱
		public static void login(String name, String password) throws Exception {
			
			账号().sendKeys(name);
			密码().sendKeys(password);
			// 点击登录
			登录().click();
			收件箱().click();
			邮件().click();
			// 得到网址

		}
		
		
		
		
		
		
		
		
		
		
		

}
