package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseFile;

public class BestSeller extends BaseFile{
	
	@FindBy(xpath="//a[text()='Best Sellers']")
	WebElement bestseller;
	
	@FindBy(id="zg_banner_text_wrapper")
	WebElement logo;
	
	public BestSeller() {
		PageFactory.initElements(driver, BestSeller.this);
	}
	
	public BestSeller clickOnBestSeller() {
		bestseller.click();
		return new BestSeller();
	}
	
	public boolean logo() {
		return logo.isDisplayed();
	}

}
