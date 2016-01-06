package com.growingio.web.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.growingio.web.driver.Browser;
import com.growingio.web.element.Element;

public class 重设密码 {
	
	public static Element 密码() throws Exception
	{
		WebElement element = Browser.FindElement(By.name("password"));
		return new Element(element);			
	}	
	public static Element 确认() throws Exception
	{
		WebElement element = Browser.FindElement(By.xpath("html/body/div[1]/div/div/div/form/div[2]/input"));
		return new Element(element);	
		
	}
	
	public static Element setpassword()throws Exception
	{
		WebElement element = Browser.FindElement(By.xpath("html/body/div[1]/div/div/div/form/button"));
		return new Element(element);	
		
	}

public static void 重置(String password) throws Exception
{
	
	密码().sendKeys(password);
 	确认().sendKeys(password);
 	setpassword().click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
