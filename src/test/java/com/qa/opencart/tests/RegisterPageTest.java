package com.qa.opencart.tests;
//Test
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ExcelUtil;
import com.qa.opencart.utils.Xls_Reader;

public class RegisterPageTest extends BaseTest{
//	Object data[][] = null;
	Xls_Reader reader= new Xls_Reader();
	
	@BeforeClass
	public void regSetup() {
		//regPage = loginPage.navigateToRegisterPage();
	}
	
	
	public String getRandomEmailId() {
		return "openauto"+System.currentTimeMillis()+"@open.com";
	}
	
	
	/*
	@DataProvider
	public Object[][] getUserRegData() {
		return new Object[][] {
			{"Pooja", "agrawal", "9090909090", "pooja@123", "yes"},
			{"Shubham", "gupta", "9090909011", "shubh@123", "no"},
			{"mitaj", "kumar", "9090909012", "mitaj@123", "yes"},
		};
	}
	
	
	 * @DataProvider public Object[][] getUserRegSheetData() { return
	 * ExcelUtil.getTestData(AppConstants.REGISTER_SHEET_NAME); }
	 * 
	 * 
	 * @Test(dataProvider = "getUserRegSheetData") public void
	 * userRegisterTest(String firstName, String lastName, String telephone, String
	 * password, String subscribe) {
	 * Assert.assertTrue(regPage.registerUser(firstName, lastName,
	 * getRandomEmailId(), telephone, password, subscribe));
	 * 
	 * }
	 */
	
	
	@Test
	public void resetPage() {

		String firstName=reader.getTestData("OpenCartTestData","register","Reset_001","firstname");
		String lastName=reader.getTestData("OpenCartTestData","register","Reset_001","lastname");
		String userName=reader.getTestData("OpenCartTestData","login","Login_1","username");
		String password=reader.getTestData("OpenCartTestData","login","Login_1","password");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(userName);
		System.out.println(password);
		
		
		
		
	}
	
	

}