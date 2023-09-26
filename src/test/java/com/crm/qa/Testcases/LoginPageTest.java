package com.crm.qa.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase  
{
	LoginPage ObjLoginPage;
	HomePage homepage;

	public LoginPageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		ObjLoginPage=new LoginPage();
	}
	@Test(priority=1)
	public void ValidateTilte() {
		String title = ObjLoginPage.verifyTitle();
		Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, and support.");
	}
	@Test(priority=2)
	public void verifyCRMlogo() {
		
		boolean logo = ObjLoginPage.verifycrmlogo();
		Assert.assertTrue(logo);
		
	}
	@Test(priority=3)
	public void verifylinks() {
		ObjLoginPage.verifylinks(ObjLoginPage.getHomeLink());
	}
	@Test(priority=4)
	public void Customerslink() {
		ObjLoginPage.verifylinks(ObjLoginPage.getCustomerslink());
	}
	@Test(priority=5)
	public void Pricinglink() {
		ObjLoginPage.verifylinks(ObjLoginPage.getPricinglink());
	}
	@Test(priority=6)
	public void SignupLink() {
		ObjLoginPage.verifylinks(ObjLoginPage.getSignupLink());
	}
	@Test(priority=7)
	public void ContactLink() {
		ObjLoginPage.verifylinks(ObjLoginPage.getContactLink());
	}
	@Test(priority=8)
	public void FeaturesLink() {
		ObjLoginPage.verifylinks(ObjLoginPage.getFeaturesLink());
	}
	@Test(priority=9)
	public void loginToApplication() throws IOException {
		homepage=ObjLoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}

