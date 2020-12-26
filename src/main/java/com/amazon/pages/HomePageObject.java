package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseFile;

public class HomePageObject extends BaseFile{
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	WebElement logo;
	
	@FindBy(xpath="//a[contains(text(),'Gift Cards')]")
	WebElement giftcard;
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	public String titleCheck() {
		return driver.getTitle();
	}
	
	public boolean validatedlogo() {
		
		return logo.isDisplayed();
	}
	
	public GiftCards clickongiftcards() {
		 giftcard.click();
		 return new GiftCards();
	}

}
