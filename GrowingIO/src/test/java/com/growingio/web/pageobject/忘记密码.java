package com.growingio.web.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;
import com.growingio.web.pageobject.登录页面;
public class 忘记密码 {
       // 邮箱
	public static Element email() throws Exception
	{
		WebElement element = Browser.FindElement(By.xpath("html/body/div[1]/div/div/div/form/div/input"));
		return new Element(element);		
	}
	// 发送
	public static Element  send() throws Exception
	{
		WebElement element = Browser.FindElement(By.xpath("html/body/div[1]/div/div/div/form/button"));
		return new Element(element);
	
	}
	public static void  forgotpassword (String email) throws Exception
	{	
		// 点击忘记密码按钮
	      登录页面.忘记密码().click();
	      // 输入Email
	   email().sendKeys(email);	   
   // 点击发送
	   send().click();		
	}
	
}
