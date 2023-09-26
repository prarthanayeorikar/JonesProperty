package com.crm.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CalendarPage;
import com.crm.qa.pages.CallPage;
import com.crm.qa.pages.CampaignsPage;
import com.crm.qa.pages.CasesPage;
import com.crm.qa.pages.CombinedFormPage;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.DocsPage;
import com.crm.qa.pages.EmailPage;
import com.crm.qa.pages.FormsPage;
import com.crm.qa.pages.FullSearchFormPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewContactPage;
import com.crm.qa.pages.PrintPage;
import com.crm.qa.pages.ReportsPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.pages.TextSMSPage;
import com.qa.utils.TestUtil;


public class HomePageTest extends TestBase {
	HomePage  objHomePage=new HomePage();
	LoginPage ObjLoginPage=new LoginPage();
	TestUtil objTestUtil=new TestUtil();
	ContactPage objContactPage=new ContactPage();
	DealsPage objDealsPage=new DealsPage();
	NewContactPage objNewContactPage= new NewContactPage();
	CompaniesPage objCompaniesPage=new CompaniesPage();
	CalendarPage objCalendarPage=new CalendarPage();
	TasksPage objTasksPage=new TasksPage();
	CasesPage objCasesPage=new CasesPage();
	CallPage objCallPage=new CallPage();
	EmailPage objEmailPage=new EmailPage();
	TextSMSPage objTextSMSPage=new TextSMSPage();
	PrintPage objPrintPage=new PrintPage();
	CampaignsPage objCampaignsPage=new CampaignsPage();
	DocsPage objDocsPage = new DocsPage();
	FormsPage objFormsPage=new FormsPage();
	ReportsPage objReportsPage=new ReportsPage();
	FullSearchFormPage objFullSearchFormPage=new FullSearchFormPage();
	CombinedFormPage objCombinedFormPage=combinedFormPage();
	
	public HomePageTest() throws IOException {
		super();
		
		
	}
	private CombinedFormPage combinedFormPage() {
		// TODO Auto-generated method stub
		return null;
	}
	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		ObjLoginPage=new LoginPage();
		//store procesure
		objHomePage	=ObjLoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	 @Test(priority=1)
	public void verifyHome() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyHomeLink();
	}
	@Test(priority=2)
	public void verifyCalendar() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyCalendarLink();
		 
	}
	@Test(priority=3)
	public void verifyCompaniesLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyCompaniesLink();
	}
	@Test(priority=4)
	public void verifyContactsLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyContactsLink();
	}
	@Test(priority=5)
	public void verifyTasksLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyTasksLink();
	}
	@Test(priority=6)
	public void verifyCasesLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyCasesLink();
	}
	@Test(priority=7)
	public void verifyCallLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyCallLink();
	}
	@Test(priority=8)
	public void verifyEmailLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyEmailLink();
	}
	@Test(priority=9)
	public void verifyPrintLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyPrintLink();
	}
	@Test(priority=10)
	public void verifyCampaignsLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyCampaignsLink();
	}
	@Test(priority=11)
	public void verifyDocsLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyDocsLink();
	}
	@Test(priority=12)
	public void verifyFormsLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyFormsLink();
	}
	@Test(priority=13)
	public void verifyReportsLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyReportsLink();
	}
	@Test(priority=14)
	public void verifyTextSMSLink() {
		objTestUtil.frame("mainpanel");
		objHomePage.verifyTextSMSLink();
		
		//
	}@Test(priority=15)
	 public void clickonContacts() throws IOException {
		 objTestUtil.frame("mainpanel");
		 objContactPage = objHomePage.clickonContactsLink();
		 
	 }
	@Test(priority=16)
	public void clickonDealsLink () throws IOException {
		objTestUtil.frame("mainpanel");
		objDealsPage = objHomePage.clickonDealsLink();
	}
	@Test(priority=17)
	public void clickOnNewContacts1() throws IOException {
		objTestUtil.frame("mainpanel");
		objHomePage.moveToElement(objHomePage.Contacts);
		
		objNewContactPage = objHomePage.clickOnNewContact();
	}
	@Test(priority=18)
	public void clickOnCompanies() throws IOException {
		objTestUtil.frame("mainpanel");
		objCompaniesPage=objHomePage.clickOnCompanies();
	}
	@Test(priority=19)
	
	public void clickOnCalendarLink() throws IOException {
		objTestUtil.frame("mainpanel");
		objCalendarPage =objHomePage.clickOnCalendar();
	}
	@Test(priority=20)
	public void clickOnTasksLink() throws IOException {
		objTestUtil.frame("mainpanel");
		objTasksPage =objHomePage.clickOnTasks();
	}
	@Test(priority=21)
	public void clickOnCasesLink() throws IOException {
		objTestUtil.frame("mainpanel");
		objCasesPage=objHomePage.clickOnCases();
	}
	@Test(priority=22)
	public void clickOnCallLink() throws IOException {
		objTestUtil.frame("mainpanel");
		objCallPage=objHomePage.clickOnCall();	
	}
	@Test(priority=23)
	public void clickOnEmailLink() throws IOException {
		objTestUtil.frame("mainpanel");
		objEmailPage=objHomePage.clickOnEmail();
	}
	@Test(priority=24)
	public void clickOnTextSMSLink () throws IOException {
		objTestUtil.frame("mainpanel");
		objTextSMSPage=objHomePage.clickOnTextSMS();
	}
	@Test(priority=25)
	public void clickOnPrint() throws IOException {
		objTestUtil.frame("mainpanel");
		objPrintPage=objHomePage.clickOnPrint();
	}
	@Test(priority=26)
	public void clickOnCampaigns() throws IOException {
		objTestUtil.frame("mainpanel");
		objCampaignsPage=objHomePage.clickOnCampaigns();
	}
	@Test(priority=27)
	public void clickOnDocs() throws IOException {
		objTestUtil.frame("mainpanel");
		objDocsPage=objHomePage.clickOnDocs();
	}
	@Test(priority=28)
	public void clickOnForms() throws IOException {
		objTestUtil.frame("mainpanel");
		objFormsPage=objHomePage.clickOnForms();
		
	}
	@Test(priority=29)
	public void clickOnReports() throws IOException {
		objTestUtil.frame("mainpanel");
		objReportsPage	=objHomePage.clickOnReports();
		
	}
	
	
	public void clickOnNewContacts() throws IOException {
	objTestUtil.frame("mainpanel");
		objHomePage.moveToElement(objHomePage.Contacts);
		
	objNewContactPage = objHomePage.clickOnNewContact();
	}
	@Test(priority=30)
	public void clickOnCombinedForm() throws IOException {
		objTestUtil.frame("mainpanel");
		objHomePage.moveToElement(objHomePage.Contacts);
		objCombinedFormPage=objHomePage.clickOnCombinedForm();
		
	}
	@Test(priority=31)
	
	public void FullSearchFormPage() throws IOException {
		objTestUtil.frame("mainpanel");
		objHomePage.moveToElement(objHomePage.Contacts);
		objFullSearchFormPage=objHomePage.clickOnFullSearchForm();
	}
	
}

