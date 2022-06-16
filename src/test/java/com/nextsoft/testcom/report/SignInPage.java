package com.nextsoft.testcom.report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	protected WebDriver driver;
	//field email
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	//field password
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	//button sign in
	@FindBy(xpath = "//span[normalize-space()='Sign in']" )
	private WebElement btnSignIn;
	
	public SignInPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	//fungsi login dan return ke AccountPage
	public AccountPage loginValidUser(String username, String user_password) {
		email.sendKeys("rajacupang@email.com");
		password.sendKeys("admin123");
		btnSignIn.click();
		
		return PageFactory.initElements(driver, AccountPage.class);
		
	}
	
}
