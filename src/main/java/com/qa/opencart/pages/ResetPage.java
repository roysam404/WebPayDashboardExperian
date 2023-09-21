package com.qa.opencart.pages;

//Test

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

//import selenium.Wait;

public class ResetPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	// Locators  
  	//Login_button
  	@FindBy(how = How.XPATH, using = "//button[@id='login-button']") 
  	private WebElement btn_Login;	
	

	public ResetPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
//	public int getSearchResultsCount() {
//		return eleUtil.waitForElementsVisible(productsResults, AppConstants.MEDIUM_TIME_OUT).size();
//	}
	
//	public ProductInfoPage selectProduct(String productName) {
//		eleUtil.clickElementWhenReady(By.linkText(productName), AppConstants.MEDIUM_TIME_OUT);
//		return new ProductInfoPage(driver);
//	}
	
//	public void clickOnLoginBtn() {
//		btn_Login.click();	
//		Wait.untilPageLoadComplete(driver);
//	}
	
	

}

