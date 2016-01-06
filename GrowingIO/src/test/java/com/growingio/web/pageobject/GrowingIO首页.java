package com.growingio.web.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class GrowingIO首页 {

	// 定位首页元素
	public static Element login() throws Exception {
		WebElement element = Browser.FindElement(By.xpath("//a[text()='登录']"));
		return new Element(element);
	}

	// 左上角的logo
	public static Element logo() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/nav/div/a"));
		return new Element(element);
	}

	public static Element 产品特色() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='menu']/li[1]/a"));
		return new Element(element);
	}
	// 技术论坛
	public static Element 技术论坛() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='menu']/li[2]/a"));
		return new Element(element);
	}

	public static Element 加入我们() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='menu']/li[3]/a"));
		return new Element(element);
	}

	public static Element 关于我们() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='menu']/li[4]/a"));
		return new Element(element);
	}

	public static Element 登录() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='menu']/li[5]/a"));
		return new Element(element);
	}

	public static Element 申请试用1() throws Exception {
		WebElement element = Browser
				.FindElement(By.xpath("//a[text()='申请试用']"));// 导航栏中
		return new Element(element);

	}

	public static Element 手机号码() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='landing']/div/form/div/input[1]"));
		return new Element(element);
	}

	public static Element 邮箱() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='landing']/div/form/div/input[2]"));
		return new Element(element);
	}

	public static Element 密码() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='landing']/div/form/div/input[3]"));
		return new Element(element);

	}

	public static Element 申请试用2() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='landing']/div/form/button"));
		return new Element(element);
	}

	// 申请试用3
	public static Element 申请试用3() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/div/div[3]/div/div[2]/div/a"));
		return new Element(element);
	}

	// 主站case方法Test
	public static void 产品特色1() throws Exception {
		// 点击产品特色
		产品特色().click();
		// 判断网页下滑
	}

	// 验证申请试用2
	public static void 申请2试用(String mobile, String email, String password)
			throws Exception {

		手机号码().sendKeys(mobile);
		邮箱().sendKeys(email);
		密码().sendKeys(password);
		申请试用2().click();
	}

	public static void 技术论坛1() throws Exception {
		// 点击左上角的logo
		logo().click();
		// 点击产品特色
		技术论坛().click();
		// 判断网页下滑

	}
	// 填写iPhone number、Email、password；
	// public static void 新用户申请1 (String moblie,String email,String password)
	// throws Exception
	// {
	// 注册页面.手机().sendKeys(moblie);
	// 注册页面.姓名().sendKeys(moblie);
	// 注册页面.邮箱().sendKeys(moblie);
	// }

}
