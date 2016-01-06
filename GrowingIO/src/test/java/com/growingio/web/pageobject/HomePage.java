package com.growingio.web.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class HomePage   // 页面元素、方法
{
	public static Element News() throws Exception
	{
		WebElement element = Browser.FindElement(By.xpath("//a[text()='新闻']"));
		return new Element(element);
	}
	
	public static Element Forum() throws Exception
	{
		WebElement element = Browser.FindElement(By.xpath("//a[text()='贴吧']"));
		return new Element(element);
		
	}
	
	public static Element Music() throws Exception
	{
		WebElement element = Browser.FindElement(By.xpath("//a[text()='音乐']"));
		return new Element(element);
	}
	
	public static Element Picture() throws Exception
	{
		WebElement element = Browser.FindElement(By.xpath("//a[text()='图片']"));
		return new Element(element);
	}
	
	public static Element Video() throws Exception
	{
		WebElement element = Browser.FindElement(By.xpath("//a[text()='视频']"));
		return new Element(element);
	}
	
	public static Element Map() throws Exception
	{
		WebElement element = Browser.FindElement(By.xpath("//a[text()='地图']"));
		return new Element(element);
	}
	
	// 方法可以写在home page ，在step调用
	
	public static Element login() throws Exception
	{
		WebElement element = Browser.FindElement(By.xpath("//a[text()='登录']"));
		return new Element(element);		
	}
	// 输入账号
	public static Element account() throws Exception
	{
		WebElement element = Browser.FindElement(By.id("email"));
		return new Element(element);		
	}
	// 输入密码
	public static Element password() throws Exception
	{
		WebElement element = Browser.FindElement(By.name("password"));
		return new Element(element);		
	}

	
}
