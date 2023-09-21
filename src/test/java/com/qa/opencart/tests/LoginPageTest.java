package com.qa.opencart.tests;
//Test
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.Xls_Reader;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

//@Listeners(ExtentReportListener.class)



@Epic("EPIC - 100: Desgin of the login page for PayDashboard app")
@Story("US - 200: implement login page features for PayDashboard app")
public class LoginPageTest extends BaseTest {
	Xls_Reader reader= new Xls_Reader();
	
	
	@Description("login Page Specific Data Test......")
	@Severity(SeverityLevel.NORMAL)
	@Test
	//@Test(priority = 5, enabled = false)
	public void loginPageSpecificDataTest() {
		String actTitle = loginPage.getLoginPageTitle();		
		Assert.assertEquals(actTitle, AppConstants.LOGIN_PAGE_TITLE);
		String userName=reader.getTestData("LoginTestData","Login","Login_2","username");
		String password=reader.getTestData("LoginTestData","Login","Login_2","password");
		String message=reader.getTestData("LoginTestData","Login","Login_2","Message");
		loginPage.doLogin(userName, password);
		String actual_Message=loginPage.getErrorMessage();
		Assert.assertEquals(actual_Message, message);
	}
	
	@Description("login Page Specific Data Test......")
	@Severity(SeverityLevel.NORMAL)
	@Test
	//@Test(priority = 5, enabled = false)
	public void loginPageSpecificDataTest2() {
		String actTitle = loginPage.getLoginPageTitle();		
		Assert.assertEquals(actTitle, AppConstants.LOGIN_PAGE_TITLE);
		String userName=reader.getTestData("LoginTestData","Login","Login_1","username");
		String password=reader.getTestData("LoginTestData","Login","Login_1","password");
		String message=reader.getTestData("LoginTestData","Login","Login_1","Message");
		loginPage.doLogin(userName, password);
		String actual_Message=loginPage.getErrorMessage();
		Assert.assertEquals(actual_Message, message);
	}

	/*
	 * @Description("login Page All Data Test......")
	 * 
	 * @Severity(SeverityLevel.NORMAL)
	 * 
	 * @Test public void loginPageURLTest() { String actURL =
	 * loginPage.getLoginPageURL();
	 * Assert.assertTrue(actURL.contains(AppConstants.LOGIN_PAGE_URL_FRACTION));
	 * 
	 * }
	 * 
	 * @Description("check forgot pwd link exist on login page......")
	 * 
	 * @Severity(SeverityLevel.CRITICAL)
	 * 
	 * @Test public void isForgotPwdLinkExistTest() {
	 * Assert.assertTrue(loginPage.isForgotPwdLinkExist()); }
	 * 
	 * @Description("check user is able to login to open cart with valid credentials......"
	 * )
	 * 
	 * @Severity(SeverityLevel.BLOCKER)
	 * 
	 * @Test public void loginTest() { //accPage =
	 * loginPage.doLogin(prop.getProperty("username"),
	 * prop.getProperty("password"));
	 * Assert.assertEquals(accPage.isLogoutLinkExist(), true); }
	 * 
	 * @Description("checking Experian test")
	 * 
	 * @Severity(SeverityLevel.MINOR)
	 * 
	 * @Test(priority = 6, enabled = false) public void sanityTest() {
	 * Assert.assertEquals(true, true); }
	 */

}
