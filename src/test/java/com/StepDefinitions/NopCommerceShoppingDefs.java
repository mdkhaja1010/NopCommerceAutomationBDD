package com.StepDefinitions;


import com.DriverManagers.ConfigFileManager;
import com.Pages.NopCommerceShoppingPage;
import com.Utilities.DriverUtilis;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NopCommerceShoppingDefs {
	NopCommerceShoppingPage nop;
	DriverUtilis driverutilities;
	public NopCommerceShoppingDefs(DriverUtilis driverutilities) {
		this.driverutilities=driverutilities;
		nop=this.driverutilities.getBasePage().getNopCommerceShoppingPage();
		
	}
	@Given("Launch Nop Commerce Application")
	public void launch_nop_commerce_application() {
		  String strAppURL= ConfigFileManager.getInstance().getReadConfig().getApplicationURL();
		  nop.loginToNopCommerce(strAppURL);
	}

	@And("Enter the valid credentials for accessing NopCommerceApplication")
	public void enter_the_valid_credentials_for_accessing_nop_commerce_application() {
	    nop.enterValidCredentials();
	}

	@And("Enter the Customer Module")
	public void enter_the_customer_module() {
	    nop.customersmenulist();
	}

	@And("Click on the Customers button")
	public void click_on_the_customers_button() {
	   nop.clikcustomer();
	}

	@And("Click on the add new button")
	public void click_on_the_add_new_button() {
	   nop.addingNewCustbtn();
	}

	@And("Click on the enter new user details")
	public void click_on_the_enter_new_user_details() {
	   nop.enteringUserDetails();
	}

	@Then("Click on the save button")
	public void click_on_the_save_button() {
	   nop.savingcustomer();
	}

	
	
	

}
