package com.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContentManagementElements {
	@FindBy(xpath="//a[@class='nav-link']//i//following-sibling::p[text()[normalize-space()='Content management']]")
	public WebElement contentMenubtn;
	@FindBy(xpath="//p[text()[normalize-space()='Topics (pages)']]")
	public WebElement topicsbtn;
	@FindBy(xpath="//p[text()[normalize-space()='Message templates']]")
	public WebElement messageTemplates;
	@FindBy(xpath="//p[text()[normalize-space()='News items']]")
	public WebElement newsitemsbtn;
	@FindBy(xpath="//p[text()[normalize-space()='News comments']]")
	public WebElement newscommentsbtn;
	@FindBy(xpath="//p[text()[normalize-space()='Blog posts']]")
	public WebElement blogspostsbtn;
	@FindBy(xpath="//p[text()[normalize-space()='Blog comments']]")
	public WebElement blogComments;
	@FindBy(xpath="//p[text()[normalize-space()='Polls']]")
	public WebElement pollsbtn;
	@FindBy(xpath="//p[text()[normalize-space()='Forums']]")
	public WebElement forumsbtn;
	

}
