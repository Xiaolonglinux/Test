package com.growingio.web.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 用户管理 {
	// 项目管理
	public static Element 项目管理() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='growingio-root']/div/ul/li[2]/a"));
		return new Element(element);
	}

	// 添加APP/
	public static Element 添加() throws Exception {
		WebElement element = Browser
				.FindElement(By
						.xpath(".//*[@id='growingio-root']/div/div/div/div[2]/div/div[1]/button"));
		return new Element(element);
	}

	public static Element 邀请成员() throws Exception {
		WebElement element = Browser
				.FindElement(By
						.xpath(".//*[@id='growingio-root']/div/div/div/div[3]/div/div[1]/button"));
		return new Element(element);
	}

	// 邀请成员弹框（编辑框） ， 输入邮箱
	public static Element 输入框() throws Exception {
		WebElement element = Browser.FindElement(By.name("email"));
		return new Element(element);
	}

	// 下一步(定位出错)
	public static Element 下一步() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[3]/div/div[2]/div/div/div[3]/button"));
		return new Element(element);
	}

	// 发送定位
	public static Element 发送() throws Exception {

		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[3]/div/div[2]/div/div/div[5]/button"));

		return new Element(element);
	}

	// 添加 操作
	// 添加弹框定位
	public static Element 姓名() throws Exception {

		WebElement element = Browser
				.FindElement(By
						.xpath("html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/input"));
		return new Element(element);
	}

	public static Element Android() throws Exception {

		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='android']"));
		return new Element(element);
	}

	public static Element iOS() throws Exception {

		WebElement element = Browser.FindElement(By.xpath(".//*[@id='ios']"));
		return new Element(element);
	}

	public static Element js() throws Exception {

		WebElement element = Browser.FindElement(By.xpath(".//*[@id='js']"));
		return new Element(element);
	}

	public static Element WebURL() throws Exception {

		WebElement element = Browser
				.FindElement(By
						.xpath("html/body/div[2]/div/div[2]/div/div/div[2]/form/div[3]/input"));
		return new Element(element);
	}

	// 确认添加按钮
	public static Element sureadd() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[2]/div/div[2]/div/div/div[3]/button[1]"));
		return new Element(element);
	}

	// 确认添加操作
	public static void add(String name, String url) throws Exception {
		// 点击项目管理
		项目管理().click();
		// 点击添加
		添加().click();
		姓名().sendKeys(name);
		// 选择类别
		// Android().click();(默认选中Android)
		iOS().click();
		WebURL().sendKeys(url);
		// 点击确认
		sureadd().click();
	}

	// 发送
	public static void 邀请成员发送(String email) throws Exception {
		// 点击项目管理
		// 项目管理().click();
		// 点击邀请成员
		// 界面跳转没有出现
		邀请成员().click();
		// 输入邮箱地址
		输入框().sendKeys(email);
		//
		下一步().click();
		// 发送
		发送().click();
	}
}
