package com.amazon.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.base.BaseFile;
import com.amazon.pages.GiftCards;
import com.amazon.pages.HomePageObject;

public class HomePageTest extends BaseFile{
	
	HomePageObject homepage;
	
	@BeforeTest
	public void getBrowser() {
		browser();
		homepage=new HomePageObject();
	}
	
//	@Test(priority=1)
//	public void titleCheckTest() {
//		String title=homepage.titleCheck();
//		Assert.assertEquals(title, "titlt","title not match");
		
//	}
	@Test(priority=2)
	public void logoTest() {
		
		boolean logo=homepage.validatedlogo();
		Assert.assertTrue(logo);
	}
	
	@Test(priority=3)
	public void clickOnGiftCardsTest() {
		homepage.clickongiftcards();
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
