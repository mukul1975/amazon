package com.amazon.testpages;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.base.BaseFile;
import com.amazon.pages.GiftCards;
import com.amazon.pages.HomePageObject;

public class GiftCardsPageTest extends BaseFile{
	
	HomePageObject homepage;
	GiftCards giftcard;
	
	@BeforeTest
	public void getBrowser() {
		browser();
		homepage=new HomePageObject();
		homepage.clickongiftcards();
		giftcard=new GiftCards();
		 
	}
	@Test(priority=1)
	public void textTest() {
		Assert.assertTrue(giftcard.logovalidated());
	}
	
	@Test(priority=2)
	public void checkBoxCheck() {
		giftcard.clickOnCheckbox();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
