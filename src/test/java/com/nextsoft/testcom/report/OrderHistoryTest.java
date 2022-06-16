package com.nextsoft.testcom.report;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OrderHistoryTest {
	
  protected WebDriver driver;
  private JavascriptExecutor jsExe;
  
  @BeforeTest
	public void init() {
		System.setProperty("url", "http://automationpractice.com/index.php/");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(System.getProperty("url"));
		driver.manage().window().maximize();
		jsExe = (JavascriptExecutor) driver;
	}

	@Test(priority = 0)
	public void testLoginWithValidUserAndPassword() {

		FrontPage frontPage = PageFactory.initElements(driver, FrontPage.class);

		AccountPage accountPage = frontPage.clickSignIn().loginValidUser("rajacupang@email.com","admin123");

		jsExe.executeScript("window.scrollBy(0, 100)", "");
		accountPage.clickOrderHistoryTable();

	}

}
