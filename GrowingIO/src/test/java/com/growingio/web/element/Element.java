package com.growingio.web.element;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.growingio.web.driver.Browser;
import com.growingio.web.util.Log;

public class Element 
{
	public WebElement Tag;

    public Element(WebElement element) throws Exception
    {
    	if (element == null)
        {
            Browser.TakeErrorScreenshot();   // 截图
            Log.DoLog("WebElement not found, Could not operate on an not existing element!");
            throw new Exception("WebElement not found, Could not operate on an not existing element!");
        }
    	else
    	{
    		Tag = element;	
    	}
    }
        
    private String DiscoverInfo(WebElement webElement)
    {
        return "{TagName:" + webElement.getTagName() + "}; " 
            + "{ID:" + webElement.getAttribute("id") + "}; " 
            + "{Text:" + webElement.getText() + "}";
    }

    public boolean isDisplayed()
    {
        Log.LogAction(DiscoverInfo(Tag), "Is Displayed", new Boolean(Tag.isDisplayed()).toString());
        return Tag.isDisplayed();
    }

    public boolean isEnabled()
    {
        Log.LogAction(DiscoverInfo(Tag), "Is Enabled", new Boolean(Tag.isEnabled()).toString());
        return Tag.isEnabled();
    }

    public Point getLocation()
    {
        Log.LogAction(DiscoverInfo(Tag), "Location", Tag.getLocation().x+","+Tag.getLocation().y);
        return Tag.getLocation();
    }

    public boolean isSelected()
    {
        Log.LogAction(DiscoverInfo(Tag), "Is Selected", new Boolean(Tag.isSelected()).toString());
        return Tag.isSelected();
    }

    public Dimension getSize()
    {
        Log.LogAction(DiscoverInfo(Tag), "Size", "Width:"+Tag.getSize().width+",Height:"+Tag.getSize().height);
        return Tag.getSize();
    }

    public String getTagName()
    {
	    Log.LogAction(DiscoverInfo(Tag), "TagName", Tag.getTagName());
	    return Tag.getTagName();
    }

    public String getText()
    {
        Log.LogAction(DiscoverInfo(Tag), "Text", Tag.getText());
        return Tag.getText();
    }

    public void scrollIntoView()
    {
        Log.LogAction(DiscoverInfo(Tag), "Scroll Into View", null);
        ((JavascriptExecutor) Browser.Driver).executeScript("arguments[0].scrollIntoView();", Tag);
    }

    public void moveToElement()
    {
        Log.LogAction(DiscoverInfo(Tag), "Move To Element", null);
        Actions action = new Actions(Browser.Driver);
        action.moveToElement(Tag).perform();
    }

    public String getAttribute(String value)
    {
        Log.LogAction(DiscoverInfo(Tag), "Get Attribute(" + value + ") Value", Tag.getAttribute(value));
        return Tag.getAttribute(value);
    }

    public String getCssValue(String value)
    {
        Log.LogAction(Tag.getAttribute("Id"), "Get Css(" + value + ") Value", Tag.getCssValue(value));
        return Tag.getCssValue(value);
    }

    public void click()
    {
        Log.LogAction(DiscoverInfo(Tag), "Click", null);
        Tag.click();
    }

    public void actionClick()
    {
        Log.LogAction(DiscoverInfo(Tag), "Action Click", null);
        Actions action = new Actions(Browser.Driver);
        action.click(Tag).perform();
    }

    public void doubleClick()
    {
        Log.LogAction(DiscoverInfo(Tag), "Double Click", null);
        Actions action = new Actions(Browser.Driver);
        action.doubleClick(Tag).perform();
    }

    public void rightClick()
    {
        Log.LogAction(DiscoverInfo(Tag), "Right Click", null);
        Actions action = new Actions(Browser.Driver);
        action.contextClick(Tag).perform();
    }

    public void clear()
    {
        Log.LogAction(DiscoverInfo(Tag), "Clear", null);
        Tag.clear();
    }

    public void sendKeys(String value)
    {
        Log.LogAction(DiscoverInfo(Tag), "Send Keys", value);
        Tag.sendKeys(value);
    }

    public void submit()
    {
        Log.LogAction(DiscoverInfo(Tag), "Submit", null);
        Tag.submit();
    }

    public void selectByText(String value)
    {
        Log.LogAction(DiscoverInfo(Tag), "Select By Text", value);
        Select Select = new Select(Tag);
        Select.selectByVisibleText(value);
    }

    public void selectByValue(String value)
    {
        Log.LogAction(DiscoverInfo(Tag), "Select By Value", value);
        Select Select = new Select(Tag);
        Select.selectByValue(value);
    }

    public void selectByIndex(int index)
    {
        Log.LogAction(DiscoverInfo(Tag), "Select By Index", new Integer(index).toString());
        Select Select = new Select(Tag);
        Select.selectByIndex(index);
    }

    public String setSelectedValue()
    {
        Select Select = new Select(Tag);
        Log.LogAction(DiscoverInfo(Tag), "Get Selected Value", Select.getFirstSelectedOption().getText());
        return Select.getFirstSelectedOption().getText();
    }

    public String[] getAllText()
    {
        Log.LogAction(DiscoverInfo(Tag), "Get All Text", Tag.getText());
        return Tag.getText().split("\r\n");
    }
}
