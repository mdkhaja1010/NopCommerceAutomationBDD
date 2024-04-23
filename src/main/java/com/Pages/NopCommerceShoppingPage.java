package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.PageElements.NopCommerceShoppingElements;
import com.Utilities.ReusableUtils;

public class NopCommerceShoppingPage extends NopCommerceShoppingElements {
	private final WebDriver webDriver;

    private ReusableUtils reusableUtils;
    
    public NopCommerceShoppingPage(WebDriver webDriver) {
    	this.webDriver=webDriver;
    	reusableUtils=new ReusableUtils(webDriver);
    	PageFactory.initElements(webDriver, this);	
    }
    public void customersmenulist() {
    	reusableUtils.clickElement(customersMenu);
    }
    public void clikcustomer() {
    	reusableUtils.clickElement(customers);
    }
    public void addingNewCustbtn() {
    	reusableUtils.clickElement(addNewBtn);
    }
    public void enteringUserDetails() {
    	reusableUtils.updateElementValue(emailText, "abc@gmail.com");
    	reusableUtils.updateElementValue(passwordText, "12345678");
    	reusableUtils.updateElementValue(firstNametext, "Demo");
    	reusableUtils.updateElementValue(lastnametext,"Test");
    	//reusableUtils.updateElementValue(genderradiobtn, null);
    	reusableUtils.clickElement(genderradiobtn);
    	
    }
    public void savingcustomer() {
    	reusableUtils.clickElement(savebtn);
    }
    public void loginToNopCommerce(String strAppURL ) {
    	reusableUtils.gotoURL(strAppURL);
    	
    }
    public void enterValidCredentials() {
    	//reusableUtils.clearElementText(email);
    	reusableUtils.updateElementValue(email, "admin@yourstore.com");
    	reusableUtils.updateElementValue(password, "admin");
    	reusableUtils.clickElement(loginbutton);
    }

}
