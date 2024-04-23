package com.StepDefinitions;

import com.Pages.ContentManagementElementPage;
import com.Utilities.DriverUtilis;

import io.cucumber.java.en.*;

public class ContentManagemetDefs {
	ContentManagementElementPage page;
	DriverUtilis driverUtilis;
	public ContentManagemetDefs(DriverUtilis driverUtilis) {
		this.driverUtilis=driverUtilis;
		page=this.driverUtilis.getBasePage().getProContentManagementElementPage();
	}
	
	@And("Enter the contents modules")
	public void enter_the_contents_modules() {
	   page.clkContentmenubtn();
	}

	@And("Click on the topics button")
	public void click_on_the_topics_button() {
	   page.clktopicsbtn();
	}

	@And("Click on the message button")
	public void click_on_the_message_button() {
	   page.clkMessageTemplates();
	}

	@And("Click on the newsitem button")
	public void click_on_the_newsitem_button() {
	   page.clknewsItembtn();
	}

	@And("Click on the newscomments button")
	public void click_on_the_newscomments_button() {
	  page.clknewsCommentsbtn();
	}

	@And("Click on the blogspot button")
	public void click_on_the_blogspot_button() {
	   page.clkblogComments();
	}

	@And("Click on the blogscomments button")
	public void click_on_the_blogscomments_button() {
	   page.clkblogComments();
	}

	@And("Click on the polls button")
	public void click_on_the_polls_button() {
	    page.clkpollsbtn();
	}

	@Then("Click on the forums button")
	public void click_on_the_forums_button() {
	    page.clkforumbtn();
	}

}
