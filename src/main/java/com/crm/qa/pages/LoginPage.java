package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;


	public class LoginPage extends TestBase {

		// decleritiozan(WebElement)

		// @FindBy=An annotation used in Page Factory to locate and declear ui element

		// WebElement e1=driver.findElement(By.id());
		// e1. click();

		@FindBy(name = "username") // --driver.findElement(By.id());

		WebElement username;// ---e1.click();

		@FindBy(name = "password")
		WebElement password;

		@FindBy(xpath = "//*[@value=\"Login\"]")
		WebElement loginbutton;

		@FindBy(xpath = "(//*[@class=\"img-responsive\"])[1]")
		WebElement crmlogo;

		@FindBy(xpath = "//a[contains(text(),'Home')]")
		private WebElement homeLink;

		@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
		private WebElement signupLink;

		@FindBy(xpath = "//a[contains(text(),'Pricing')]")
		private WebElement pricinglink;

		@FindBy(xpath = "//a[contains(text(),'Features')]")
		private WebElement FeaturesLink;

		@FindBy(xpath = "//a[contains(text(),'Contact')]")
		private WebElement contactLink;

		@FindBy(xpath = "//a[contains(text(),'Customers')]")
		private WebElement customerslink;

		// Initialization(PageFactory)

		public LoginPage() throws IOException {
			PageFactory.initElements(driver, this);
		}

		// Actions ---Methods

		public String verifyTitle() {
			String title = driver.getTitle();
			return title;
		}

		public boolean verifycrmlogo() {
			return crmlogo.isDisplayed();
		}

		public HomePage login(String un, String pwd) throws IOException {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginbutton.click();
			return new HomePage();
		}

		public boolean verifylinks(WebElement link) {
			return link.isDisplayed();
		}

		public WebElement getHomeLink() {
			return homeLink;
		}

		public void setHomeLink(WebElement homeLink) {
			this.homeLink = homeLink;
		}

		public WebElement getCustomerslink() {
			return customerslink;
		}

		public void setCustomerslink(WebElement customerslink) {
			this.customerslink = customerslink;
		}

		public WebElement getPricinglink() {
			return pricinglink;
		}

		public void setPricinglink(WebElement pricinglink) {
			this.pricinglink = pricinglink;
		}

		public WebElement getSignupLink() {
			return signupLink;
		}

		public void setSignupLink(WebElement signupLink) {
			this.signupLink = signupLink;
		}
		
		public WebElement getContactLink() {
			return contactLink;
		}

		public void setContactLink(WebElement contactLink) {
			this.contactLink = contactLink;
		}
		
		public WebElement getFeaturesLink() {
			return FeaturesLink;
		}

		public void setFeaturesLink(WebElement FeaturesLink) {
			this.FeaturesLink = FeaturesLink;
		}

		public boolean validateCRMlogo() {
			// TODO Auto-generated method stub
			return false;
		}


	}



