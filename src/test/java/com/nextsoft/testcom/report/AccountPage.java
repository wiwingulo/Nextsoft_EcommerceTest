package com.nextsoft.testcom.report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountPage {
	
	protected WebDriver driver;
	
	//button order history and details
	@FindBy(xpath="//span[normalize-space()='Order history and details']")
	private WebElement btnOrderHistory;
	
	@FindBy(xpath = "//span[normalize-space()='Cupang Simanjuntak']")
	private WebElement username;
	
	public AccountPage(WebDriver driver) {
		this.driver =  driver;
	}
	//fungsi click button order history and details dan return ke OrderHistoryDetailsPage
	public OrderHistoryTable clickOrderHistoryTable() {
		btnOrderHistory.click();
		OrderHistoryTable orderHistoryTable = PageFactory.initElements(driver, OrderHistoryTable.class);
		return orderHistoryTable ;
	}
	public String getUsername() {

		return username.getText();
	}

}
