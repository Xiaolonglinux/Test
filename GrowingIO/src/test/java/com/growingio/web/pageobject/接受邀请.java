package com.growingio.web.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 接受邀请 {
	
	public static Element 姓名() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/div/div/div[2]/form/div[2]/input"));
		return new Element(element);
	}

	public static Element 电话() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/div/div/div[2]/form/div[3]/input"));
		return new Element(element);
	}
	public static Element 密码() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath(".//*[@id='password']"));
		return new Element(element);
	}
	// 职位，部门 没有定位
	
	

	public static Element 接受邀请btn() throws Exception {
		WebElement element = Browser.FindElement(By
				.xpath("html/body/div[1]/div/div/div[2]/form/div[7]/button"));
		return new Element(element);
	}
   //接受邀请，输入姓名/电话/密码，点击接受邀请
   //填写相关信息 
	public static void addinfo(String name,String phone,String password) throws Exception { // 点击关于我们
		
		姓名().sendKeys(name);
		电话().sendKeys(phone);
		密码().sendKeys(password);
		
	    接受邀请btn().click();
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
