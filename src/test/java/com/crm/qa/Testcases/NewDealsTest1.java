package com.crm.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewDealPage;
import com.qa.utils.TestUtil;


	public class NewDealsTest1 extends TestBase {
		
		LoginPage ObjLoginPage;
		HomePage objhomepage;
		ContactPage objContactPage = new ContactPage();
		DealsPage objDealsPage = new DealsPage();
		//TaskPage objTaskPage = new TaskPage();
		TestUtil framHandler = new TestUtil();
		NewDealPage objNewDealPage;	
		String SheetName="NewDeals";

		public NewDealsTest1() throws IOException {
			super();
		}
		
		@BeforeMethod
		public void setup() throws IOException {
			initilization();
			ObjLoginPage = new LoginPage();
			objhomepage = new HomePage();
			objhomepage = ObjLoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			objNewDealPage=new NewDealPage();
		}
		
		@DataProvider
		public Object[][] DealsTestData() {
			Object data1 [][]=TestUtil.getTestData(SheetName);
			return data1;
		}
		
		@Test(priority=1,dataProvider="DealsTestData")
		public void createNewDeals(String title,String company,String primaryContact,String amount,String quantity) throws IOException {
			framHandler.frame("mainpanel");
			objhomepage.moveToElement(objhomepage.Deals);
			objNewDealPage=objhomepage.clickOnNewDeal();
			objNewDealPage.createNewDeal(title, company, primaryContact, amount, quantity);
		}

	}


