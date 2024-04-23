package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.PageElements.PromotionsPageElements;
import com.Utilities.ReusableUtils;

public class PromotionsPage extends PromotionsPageElements {
	private final WebDriver webDriver;

    private ReusableUtils reusableUtils;
    
    public PromotionsPage(WebDriver webDriver) {
    	this.webDriver=webDriver;
    	reusableUtils=new ReusableUtils(webDriver);
    	PageFactory.initElements(webDriver, this);	
    }
   
    public void clickpromotionsmenu() {
    	reusableUtils.clickElement(promotionBtn);
    }
    public void clkcDiscount() {
    	reusableUtils.clickElement(discounts);
    }
    public void clkaffliates() {
    	reusableUtils.clickElement(affiliates);
    }
    public void clknewsLetter() {
    	reusableUtils.clickElement(newsLetter);
    }
    public void clkCompaings() {
    	reusableUtils.clickElement(compaigns);
    }
	/*
	 * public void loginToNopCommerce(String strAppURL ) {
	 * reusableUtils.gotoURL(strAppURL);
	 * 
	 * }
	 */
  
    
    
}
