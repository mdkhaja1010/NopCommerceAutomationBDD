package com.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NopCommerceShoppingElements {
	@FindBy(css="#Email")
	public WebElement email;
	@FindBy(css="#Password")
	public WebElement password;
	@FindBy(css=".button-1")
	public WebElement loginbutton;
	@FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]")
	public WebElement customersMenu;
	@FindBy(xpath="(//a[@class='nav-link']//p[text()[normalize-space() = 'Customers']])[2]")
	public WebElement customers;
	@FindBy(css="a[class='btn btn-primary']>i.fa-plus-square")
	public WebElement addNewBtn;
	@FindBy(css=".col-md-9>input#Email")
	public WebElement emailText;
	@FindBy(css=".input-group>input#Password")
	public WebElement passwordText;
	@FindBy(css=".col-md-9>input#FirstName")
	public WebElement firstNametext;
	@FindBy(css=".col-md-9>input#LastName")
	public WebElement lastnametext;
	@FindBy(css="div[class='form-check']>input+label[for='Gender_Male']")
	public WebElement genderradiobtn;
	@FindBy(name="save-continue")
	public WebElement savebtn;
	
	
	

}
