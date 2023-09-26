package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class NewDealPage extends TestBase {
	
	@FindBy(id="title")
		WebElement title;

	@FindBy(name="client_lookup")
		WebElement clientlookup;
	
	@FindBy(id="amount")
	   WebElement amount;
	
	@FindBy(name="addmore")
	WebElement addmore;
	
	@FindBy(id="quantity")
	
	WebElement quantity;

	public NewDealPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public void createNewDeal(String title,String Company,String amount,String contact,String quantity)
	{
		driver.findElement(By.cssSelector("a[title='New Deal']")).click();
		driver.findElement(By.id("title")).sendKeys(title);
		driver.findElement(By.name("client_lookup")).sendKeys(Company);
		driver.findElement(By.id("amount")).sendKeys(amount);
		driver.findElement(By.name("contact_lookup")).sendKeys(contact);
		driver.findElement(By.id("quantity")).sendKeys(quantity);
		
	}
	


}
