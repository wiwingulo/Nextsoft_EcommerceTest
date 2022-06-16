package com.nextsoft.testcom.report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontPage {
	
	protected WebDriver driver;
	//button sign in
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement signIn;
	
	public FrontPage(WebDriver driver) {
		this.driver = driver;
	}
	//fungsi click sign in dan return ke SignInPage
	public SignInPage clickSignIn() {

		signIn.click();

		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

		return signInPage;
	}
	
}
	