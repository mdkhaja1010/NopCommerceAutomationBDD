package com.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PromotionsPageElements {
	@FindBy(xpath="//p[text()[normalize-space() = 'Promotions']]")
	public WebElement promotionBtn;
	@FindBy(xpath="//p[text()[normalize-space() = 'Discounts']]")
	public WebElement discounts;
	@FindBy(xpath="//p[text()[normalize-space() = 'Affiliates']]")
	public  WebElement affiliates;
	@FindBy (xpath="//p[text()[normalize-space() = 'Newsletter subscribers']]")
	public WebElement newsLetter;
	@FindBy (xpath="//p[text()[normalize-space() = 'Campaigns']]")
	public WebElement compaigns;
	
}
