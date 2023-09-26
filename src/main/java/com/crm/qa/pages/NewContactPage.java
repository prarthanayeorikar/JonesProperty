package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class NewContactPage extends TestBase {

	@FindBy(xpath="Contactslink")
	WebElement contactlabel;
	
	
	@FindBy(xpath="//select[@name='title']")
	WebElement selectDropDrown;
	
	@FindBy(id="first_name")
	WebElement UserFirstName;	
	
	@FindBy(id="middle_initial")
	WebElement UserLastName;	
	
	@FindBy(id="client_lookup")
	WebElement Clientlookup;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement saveButton;
	
	
	
	public NewContactPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	public void createNewContatct(String title,String FirstName,String MiddleName,String LastName, String Company) {
		Select select=new Select(driver.findElement(By.xpath("//select[@name='title']")));
		select.selectByValue(title);
		driver.findElement(By.id("first_name")).sendKeys(FirstName);
		driver.findElement(By.id("middle_initial")).sendKeys(MiddleName);
		driver.findElement(By.id("surname")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(Company);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	}
	public By UserSelectionLocator(String name) {
		By locator=By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']");
	return locator;
	
	}
	
	public void selectContact(String name) {
		driver.findElement(UserSelectionLocator(name)).click();
	}
	public void createNewDeal(String title, String title2, String clientlookup2, String amount, String addmore) {
		// TODO Auto-generated method stub
		
	}
}