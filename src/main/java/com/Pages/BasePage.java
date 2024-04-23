package com.Pages;

import org.openqa.selenium.WebDriver;

public class BasePage{

    private final WebDriver webDriver;
    private NopCommerceShoppingPage nop;
    private PromotionsPage promo;
    private ContentManagementElementPage page;
    public BasePage(WebDriver webDriver){

        this.webDriver=webDriver;
    }


    public NopCommerceShoppingPage getNopCommerceShoppingPage()
    {
        return (nop == null)? nop =new NopCommerceShoppingPage(webDriver):nop;
    }
    public PromotionsPage getPromotionsPage()
    {
    	return (promo == null)? promo =new PromotionsPage(webDriver):promo;
    }
    public ContentManagementElementPage getProContentManagementElementPage()
    {
    	return (page == null)? page=new ContentManagementElementPage(webDriver):page;
    }
    
}

