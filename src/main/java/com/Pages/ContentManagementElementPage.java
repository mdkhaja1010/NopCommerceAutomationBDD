package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageElements.ContentManagementElements;
import com.Utilities.ReusableUtils;

public class ContentManagementElementPage extends ContentManagementElements {
	private final WebDriver webDriver;

    private ReusableUtils reusableUtils;
    public ContentManagementElementPage(WebDriver webDriver) {
    	this.webDriver=webDriver;
    	reusableUtils=new ReusableUtils(webDriver);
    	PageFactory.initElements(webDriver,this);
    	
    }
    public void clkContentmenubtn() {
    	reusableUtils.clickElement(contentMenubtn);
    }
    public void clktopicsbtn() {
    	reusableUtils.clickElement(topicsbtn);
    }
    public void clkMessageTemplates() {
    	reusableUtils.clickElement(messageTemplates);
    }
    public void clknewsItembtn() {
    	reusableUtils.clickElement(newsitemsbtn);
    }
    public void clknewsCommentsbtn() {
    	reusableUtils.clickElement(newscommentsbtn);
    }
    public void clkblogspotbtn() {
    	reusableUtils.clickElement(blogspostsbtn);
    }
    public void clkblogComments() {
    	reusableUtils.clickElement(blogComments);
    }
    public void clkpollsbtn() {
    	reusableUtils.clickElement(pollsbtn);
    }
    public void clkforumbtn() {
    	reusableUtils.clickElement(forumsbtn);
    }

}
