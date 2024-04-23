package com.StepDefinitions;


import com.DriverManagers.ConfigFileManager;
import com.Pages.PromotionsPage;
import com.Utilities.DriverUtilis;

import io.cucumber.java.en.*;

public class PromotionsPageDefs {
	PromotionsPage promo;
	DriverUtilis driverutilities;
	public PromotionsPageDefs(DriverUtilis driverutilities) {
		this.driverutilities=driverutilities;
		promo=this.driverutilities.getBasePage().getPromotionsPage();
	}
	/*@Given("Launch Nop Commerce Application")
	public void launch_nop_commerce_application() {
		  String strAppURL= ConfigFileManager.getInstance().getReadConfig().getApplicationURL();
		  promo.loginToNopCommerce(strAppURL);
	}*/
	
/*	@And("Enter the valid credentials for accessiong NopCommerceApplication")
	public void enter_the_valid_credentials_for_accessiong_nop_commerce_application() {
	    nop.enterValidCredentials();
	}*/

	@And("Enter the promotions Module")
	public void enter_the_promotions_module() {
		promo.clickpromotionsmenu();
	   
	}

	@And("Click on the discountsbtn")
	public void click_on_the_discountsbtn() {
		promo.clkcDiscount();
	    
	}

	@And("Click on the affilaties button")
	public void click_on_the_affilaties_button() {
		promo.clkaffliates();


	}

	@And("Click on the news letter button")
	public void click_on_the_news_letter_button() {
		promo.clknewsLetter();
	    
	}

	@Then("Clik on the compaings button")
	public void clik_on_the_compaings_button() {
		promo.clkCompaings();
	   
	}

}
