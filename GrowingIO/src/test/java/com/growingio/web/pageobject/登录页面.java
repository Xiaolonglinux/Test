package com.growingio.web.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 登录页面 {

	public static Element email() throws Exception {
		WebElement element = Browser.FindElement(By.xpath(".//*[@id='email']"));
		return new Element(element);
	}

	public static Element password() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/div/div/div/form/div[2]/input"));// 导航栏中
		return new Element(element); // html/body/div[1]/div/div/div/form/div[2]/input
										// html/body/div[1]/div/div/div/form/div[2]/input
	}

	// 登录
	public static Element signin() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/div/div/div/form/button"));
		return new Element(element);
	}

	// 忘记密码
	public static Element 忘记密码() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/div/div/div/form/div[3]/a"));
		return new Element(element);
	}

	// 你的密码已更新, 请登录.
	public static Element 密码已更新() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/div/div/div[1]"));
		return new Element(element);
	}

	// 登录
	public static void 登录(String email, String password) throws Exception {
		email().sendKeys(email);
		password().sendKeys(password);
		signin().click();
	}

}
