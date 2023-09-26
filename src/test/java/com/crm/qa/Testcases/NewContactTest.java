package com.crm.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewContactPage;
import com.qa.utils.TestUtil;

public class NewContactTest extends TestBase {
	HomePage  objHomePage=new HomePage();
	LoginPage ObjLoginPage=new LoginPage();
	TestUtil objTestUtil=new TestUtil();
	ContactPage objContactPage=new ContactPage();
	NewContactPage objNewContactPage= new NewContactPage();
	String sheetName = "contacts";
	
	public NewContactTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		ObjLoginPage = new LoginPage();
		objHomePage = new HomePage();
		objHomePage = ObjLoginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@DataProvider
	public Object[][] UserData() {
		//sheet  name
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(priority = 3, dataProvider = "UserData")
	public void createNewContact(String title, String FirstName,String MiddleName, String LastName, String Company) throws IOException {

		objTestUtil.frame("mainpanel");
		objHomePage.moveToElement(objHomePage.Contacts);
		objNewContactPage = objHomePage.clickOnNewContact();
		
		objNewContactPage.createNewContatct(title, FirstName, MiddleName, LastName, Company);
		//objHomePage.clickOnNewContact();
		objNewContactPage.selectContact("Amol Dombale");
		objNewContactPage.selectContact("Kiran Gujar");
		objNewContactPage.selectContact("prasad kotwal");
	}

}
