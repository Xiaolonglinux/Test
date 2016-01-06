package com.growingio.web.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 注册页面 {
	public static Element 手机() throws Exception {
		WebElement element = Browser.FindElement(By.name("mobile"));
		return new Element(element);
	}

	public static Element 邮箱() throws Exception {
		WebElement element = Browser.FindElement(By.name("email"));
		return new Element(element);
	}

	public static Element 姓名() throws Exception {
		WebElement element = Browser.FindElement(By.name("name"));
		return new Element(element);
	}

	public static Element 密码() throws Exception {
		WebElement element = Browser.FindElement(By.name("password"));
		return new Element(element);
	}

	public static Element 申请试用() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("//button[text()='申请试用']"));
		return new Element(element);
	}

	// 邮件发送成功提示
	public static Element 邮件发送() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/div/div/div[1]"));
		return new Element(element);
	}

	public static void 新用户申请(String mobile, String email, String name,
			String password) throws Exception {
		String emailsend = "验证邮件已发送，请点击邮件中的验证链接或在此输入邮件中的验证码确认注册";
		手机().sendKeys(mobile);
		邮箱().sendKeys(email);
		姓名().sendKeys(name);
		密码().sendKeys(password);
		申请试用().click();
		// 验证邮件发送成功
		邮件发送().getText().equals(emailsend);

	}

}
