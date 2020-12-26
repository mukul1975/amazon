package com.amazon.testpages;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.base.BaseFile;
import com.amazon.pages.BestSeller;
import com.amazon.pages.GiftCards;
import com.amazon.pages.HomePageObject;

public class BestSellerPageTest extends BaseFile{
	
HomePageObject homepage;
BestSeller bestsellerpage;
GiftCards giftcard;

	
@BeforeTest
public void getBrowser() {
	browser();
	homepage=new HomePageObject();
	homepage.clickongiftcards();
	giftcard=new GiftCards();
	bestsellerpage= new BestSeller();
	bestsellerpage.clickOnBestSeller();
	 
}
	
	@Test
	public void logoTest() {
		boolean loggo=bestsellerpage.logo();
		Assert.assertTrue(loggo);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
