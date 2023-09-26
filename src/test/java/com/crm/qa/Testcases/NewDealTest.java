package com.crm.qa.Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewContactPage;
import com.crm.qa.pages.NewDealPage;
import com.qa.utils.TestUtil;

public class NewDealTest extends TestBase{
	public NewDealTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	HomePage  objHomePage;
	LoginPage ObjLoginPage;
	TestUtil objTestUtil=new TestUtil();
	ContactPage objContactPage;
	NewContactPage objNewContactPage;
	NewDealPage ObjNewDealPage;
	String sheetName="NewDeals";
	NewDealTest objNewDealTest;
	
	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		ObjLoginPage=new LoginPage();
		objHomePage	=ObjLoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		objNewContactPage= new NewContactPage();
		ObjNewDealPage=new NewDealPage();
		objNewDealTest=new NewDealTest();
		
	}
	@DataProvider
	public Object[][] NewDealsData() {
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	@Test
 public void moveToElementNew() {
	objTestUtil.frame("mainpanel");
	objHomePage.moveToElement(objHomePage.Deals);
	driver.findElement(By.cssSelector("a[title='New Deal']")).click();
}

	
	public void createNewDeal(String title,String Company,String amount,String contact,String quantity) throws IOException 
	{

		objTestUtil.frame("mainpanel");
		objHomePage.moveToElement(objHomePage.NewDeal);
		ObjNewDealPage.createNewDeal( title,  Company, amount,  contact,quantity);
		
		//((NewContactPage) ObjNewDealPage).createNewDeal(title, title, clientlookup, amount, addmore);
		//objHomePage.clickOnNewContact();

}
}