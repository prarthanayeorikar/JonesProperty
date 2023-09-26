package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase
{

	// declrization of web element
	//a[text()='Home']
	@FindBy(xpath="//a[text()='Home']")
	WebElement Home ;
	
	//a[text()='Calendar']
	@FindBy(xpath ="//a[text()='Calendar']")
	WebElement Calendar ;
	
	//a[text ()='Companies']
	@FindBy(xpath="//a[text ()='Companies']")
	WebElement Companies;
	
	 //a[text() ='Contacts']
	@FindBy(xpath=" //a[text() ='Contacts']")
	public
	WebElement Contacts;
	
	
	
	//a[text()='Deals']
	@FindBy(xpath="//a[text()='Deals']")
	public
	WebElement Deals;
	
	 //a[text()='Tasks']
	@FindBy(xpath=" //a[text()='Tasks']")
	WebElement Tasks;
	
	//a[text()='Cases']
	@FindBy(xpath="//a[text()='Cases']")
	WebElement Cases;
	
	//a[text()='Call']
	@FindBy(xpath="//a[text()='Call']")
	WebElement Call;
	
	//a[text()='Email']
	@FindBy(xpath="//a[text()='Email']")
	WebElement Email;
	
	//a [text()='Text/SMS']
	@FindBy(xpath="//a [text()='Text/SMS']")
	WebElement TextSMS;
	
	//a[text()='Print']
	@FindBy(xpath="//a[text()='Print']")
	WebElement Print ;
	
	//a[text()='Campaigns']
	@FindBy(xpath="//a[text()='Campaigns']")
	WebElement Campaigns;
	
	//a[text()='Docs']
	@FindBy(xpath="//a[text()='Docs']")
	WebElement Docs;
	
	//a[text()='Forms']
	@FindBy(xpath="//a[text()='Forms']")
	WebElement Forms;
	
	//a[text()='Reports']
	@FindBy(xpath="//a[text()='Reports']")
	WebElement Reports;
	
	//New Contact
	@FindBy(xpath="//a[text()='New Contact']")
	WebElement NewContact;
	
	//Combined Form
	@FindBy(xpath="(//a[text()='Combined Form'])[1]")
	WebElement CombinedForm;
	
	//a[text()='Full Search Form'])[1]
	@FindBy(xpath="(//a[text()='Full Search Form'])[1]")
	 WebElement FullSearchForm;
	
    //a[text()='New Deal']
	@FindBy(xpath="//a[text()='New Deal']")
	public
	WebElement NewDeal;
	
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	// Actions 
	//1
	public void verifyHomeLink() {
		Home.isDisplayed();
	}
	//2
	public void verifyCalendarLink() {
		Calendar.isDisplayed();
	}
	//3
	public void  verifyCompaniesLink() {
		Companies.isDisplayed();
	}
	//4
	public void verifyContactsLink() {
		Contacts.isDisplayed();
	}
	//5
	
	public void verifyDealsLink() {
		Deals.isDisplayed();
	}
	//6
	public void verifyTasksLink() {
		Tasks.isDisplayed();
	}
	//7
	public void verifyCasesLink() {
		Cases.isDisplayed();
		
	}
	//8
	public void verifyCallLink() {
		Call.isDisplayed();
	}
	//9
	public void verifyEmailLink() {
		Email.isDisplayed();
	}
	//14
	public void verifyTextSMSLink(){
		TextSMS.isDisplayed();
		
	}
	public void verifyPrintLink() {
		Print.isDisplayed();
	}
	//10
	public void verifyCampaignsLink() {
		Campaigns.isDisplayed();
	}
	//11
	public void verifyDocsLink() {
		Docs.isDisplayed();
	}
	//12
	public void verifyFormsLink() {
		Forms.isDisplayed();
	}
	//13
	public void verifyReportsLink() {
		Reports.isDisplayed();
	}
	
	
	
	
	
	public ContactPage clickonContactsLink() throws IOException {
		Contacts.click();
		return new ContactPage();//here we have return object of contact page becz 
		//when we click contact link its will navigate to us on contact page thats 
		//that why to maintain page channing we have return that respective class 
		
		
	}
	public DealsPage clickonDealsLink() throws IOException {
		Deals.click();
		return new DealsPage();
	}
	
	public void moveToElement(WebElement element) {
		Actions action =new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public NewContactPage clickOnNewContact() throws IOException {
		NewContact.click();
		return new NewContactPage();
	}
	public CompaniesPage clickOnCompanies() throws IOException {
		Companies.click();
		return new CompaniesPage();
		
	}
	public CalendarPage  clickOnCalendar() throws IOException {
		Calendar.click();
		return new CalendarPage();
	}
	public TasksPage clickOnTasks() throws IOException {
		Tasks.click();
		return new TasksPage();
	}
	public CasesPage clickOnCases() throws IOException {
		Cases.click();
		return new CasesPage();
	}
	public CallPage clickOnCall() throws IOException {
		Call.click();
		return new CallPage();
	}
	public EmailPage clickOnEmail() throws IOException {
		Email.click();
		return new EmailPage();
	}
	public TextSMSPage clickOnTextSMS() throws IOException{
		TextSMS.click();
		return new TextSMSPage();
	}
	public PrintPage clickOnPrint() throws IOException {
		Print.click();
		return new PrintPage();
	}
	public CampaignsPage clickOnCampaigns() throws IOException {
		Campaigns.click();
		return new CampaignsPage();
	}
	public DocsPage clickOnDocs() throws IOException {
		Docs.click();
		return new DocsPage();
	}
	public FormsPage clickOnForms() throws IOException {
		Forms.click();
		return new FormsPage();
	}
	public ReportsPage clickOnReports() throws IOException {
		Reports.click();
		return new ReportsPage();
	}
     public CombinedFormPage clickOnCombinedForm() throws IOException {
		CombinedForm.click();
		return new CombinedFormPage();
     }
     public FullSearchFormPage clickOnFullSearchForm() throws IOException {
    	 FullSearchForm .click();
    	 return new FullSearchFormPage();
     }
     public NewDealPage clickOnNewDeal() throws IOException {
    	 NewDeal.click();
 		return new NewDealPage();
 	}
     


	
		

     
     
	
	
}	


