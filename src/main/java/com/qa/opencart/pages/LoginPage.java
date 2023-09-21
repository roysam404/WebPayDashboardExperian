package com.qa.opencart.pages;

//Test
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	// Locators
	// Login title text
	private By txt_Login = By.xpath("//input[@value='Login']");;

	// Login Button
	private By btn_Login = By.xpath("//button[@id='login-button']");;

	// Email_address_box
	private By input_Email = By.xpath("//input[@id='Email']");

	// Email_address_box
	private By input_Password = By.xpath("//input[@id='Password']");

	// Forgot Password
	private By btn_ForgotPassword = By.xpath("//a[@class='btn-link']");

	// Password Reset Text
	private By txt_ResetPassword = By.xpath("//h2[text()='Password Reset']//following-sibling::p");

	// reset_password_button
	private By btn_ResetPassword = By.xpath("//button[@class='btn btn-success']");

	// invalid_credentials_message
	private By txt_InvalidCredentialsMessage = By.xpath("//div[@class='width-per-100']");

	// forgot_password_email
	private By txt_ForgotPasswordEmail = By.id("//div[@class='width-per-100']");

	// password_reset_message
	private By txt_PasswordResetMessage = By.xpath("//div[@class='width-per-100']");

	// Return to Login Button
	private By btn_ReturnToLogin = By.xpath("//a[normalize-space()=\\\"Return to login\\\"]");

	// 2. public Page Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eleUtil = new ElementUtil(driver);

	}

	// 3. public Page actions/methods

	@Step("....getting login page title....")
	public String getLoginPageTitle() {
		String title = eleUtil.waitForTitleIs(AppConstants.LOGIN_PAGE_TITLE, AppConstants.SHORT_TIME_OUT);
		System.out.println("Login Page title is: " + title);
		return title;
	}

	@Step("....getting login page url....")
	public String getLoginPageURL() {
		String url = eleUtil.waitForURLContains(AppConstants.LOGIN_PAGE_URL_FRACTION, AppConstants.SHORT_TIME_OUT);
		System.out.println("Login Page url is: " + url);
		return url;
	}

	@Step("....is forgot pwd link exist or not....")
	public boolean isForgotPwdLinkExist() {
		return eleUtil.waitForElementVisible(txt_ForgotPasswordEmail, AppConstants.MEDIUM_TIME_OUT).isDisplayed();
	}
	
	public String getErrorMessage() {
		eleUtil.waitForElementVisible(txt_InvalidCredentialsMessage, AppConstants.MEDIUM_TIME_OUT);
		return eleUtil.doElementGetText(txt_InvalidCredentialsMessage);
	}
	

	@Step("login to app with username: {0} and password: {1}")
	public void doLogin(String username, String pwd) {
		System.out.println("App creds are: " + username + ":" + pwd);
		eleUtil.waitForElementVisible(input_Email, AppConstants.MEDIUM_TIME_OUT).clear();
		eleUtil.waitForElementVisible(input_Password, AppConstants.MEDIUM_TIME_OUT).clear();
		eleUtil.waitForElementVisible(input_Email, AppConstants.MEDIUM_TIME_OUT).sendKeys(username);
		eleUtil.doSendKeys(input_Password, pwd);
		eleUtil.doClick(btn_Login);		
	}

//	@Step("navigating to register page....")
//	public RegisterPage navigateToRegisterPage() {
//		eleUtil.waitForElementVisible(registerLink, AppConstants.SHORT_TIME_OUT).click();
//		return new RegisterPage(driver);
//	}

}
