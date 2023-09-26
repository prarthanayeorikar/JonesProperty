package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class NewDealPage1 extends TestBase {
	@FindBy(xpath="//input[@id='title']")
	WebElement Newtitle;
	
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement Newcompany;
	
	@FindBy(xpath="//input[@name='contact_lookup']")
	WebElement NewprimaryContact;
	
	@FindBy(xpath="//input[@name='amount']")
	WebElement Newamount;
	
	@FindBy(xpath="//input[@name='quantity']")
	WebElement Newquantity;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement SaveButton;
	
	public NewDealPage1() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void CreateNewDeal(String title,String company,String primaryContact,String amount,String quantity) {
//		driver.findElement(By.xpath("//a[@title='New Deal']")).click();
//		driver.findElement(By.id("title")).sendKeys(title);
//		driver.findElement(By.name("client_lookup")).sendKeys(company);
//		driver.findElement(By.name("contact_lookup")).sendKeys(primaryContact);
//		driver.findElement(By.id("amount")).sendKeys(amount);
//		driver.findElement(By.id("quantity")).clear();
//		driver.findElement(By.id("quantity")).sendKeys(quantity);
		Newtitle.sendKeys(title);
		Newcompany.sendKeys(company);
		NewprimaryContact.sendKeys(primaryContact);
		Newamount.sendKeys(amount);
		Newquantity.clear();
		Newquantity.sendKeys(quantity);
		SaveButton.click();
	}

}


