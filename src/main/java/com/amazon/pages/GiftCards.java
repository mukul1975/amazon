package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseFile;

public class GiftCards extends BaseFile{
	
	@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-progressive-subnav']/div[@id='nav-subnav']/a[1]/span[1]")
	WebElement text;
	@FindBy(how=How.XPATH,using="//i[@class='a-icon a-icon-checkbox']")
	WebElement checkbox;
	
	public GiftCards() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean logovalidated() {
		return text.isDisplayed();
	}
	
	public void clickOnCheckbox() {
		checkbox.click();
	}

}
