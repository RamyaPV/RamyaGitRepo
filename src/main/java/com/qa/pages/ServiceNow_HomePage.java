package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.utility.TestBase;



public class ServiceNow_HomePage extends TestBase {
	
	@FindBy(xpath="//img[@id='logo-now']")
	WebElement servicenow_logo;
	@FindBy(xpath="//div[@class='sn-float-nav-btn sn-contact-us-btn gable-green']//div[ contains(text(),'Contact')]")
	WebElement contactus;
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;
	@FindBy(xpath="//input[@name='email']")
	WebElement businessemail;
	@FindBy(xpath="//input[@name='company']")
	WebElement company;
	@FindBy(xpath="//input[@name='phone']")
	WebElement phonenumber;
	@FindBy(xpath="//button[@type='button' and contains(text(),'Contact Us')]")
	WebElement contactusbtn;
	
	

	public ServiceNow_HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void validateHomepagelogo() throws InterruptedException
	{
		Thread.sleep(5000);
		
		boolean logodispalyed=servicenow_logo.isDisplayed();
		
		System.out.println(logodispalyed);
	
	}
	
	public void contactusvalidation() throws InterruptedException
	{
		contactus.click();
		Thread.sleep(3500);
		Select dropdown=new Select (driver.findElement(By.xpath("//select[@class='field-size-top-large validateMessageCapture']")));
		dropdown.selectByValue("Speak with a ServiceNow Account Executive");
		firstname.sendKeys("Ramya");
		lastname.sendKeys("vijay");
		businessemail.sendKeys("pvramya89@gmail.com");
		company.sendKeys("cts");
		phonenumber.sendKeys("9600173638");
		Thread.sleep(3500);
		Select dropdown1=new Select(driver.findElement(By.xpath("//select[@name='jobLevel']")));
		dropdown1.selectByValue("Architect");
		Select drop=new Select(driver.findElement(By.xpath("//select[@name='jobRole']")));
		drop.selectByVisibleText("Cloud Operations");
		
		Select drop2=new Select(driver.findElement(By.xpath("//select[@name='jobFunction']")));
		drop2.selectByVisibleText("Cloud Operations");
		
		//scrollintoview
		
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
	WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		je.executeScript("arguments[0].scrollIntoView(true)", country);
	
		Select countrydrop=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		countrydrop.selectByVisibleText("IN - India");
		
		Select dropdown3=new Select(driver.findElement(By.xpath("//select[@name='state']")));
		dropdown3.selectByValue("Tamil Nadu");
		
		Select dropdown4=new Select(driver.findElement(By.xpath("//select[@name='iAmInterestedIn']")));
		dropdown4.selectByVisibleText("IT Operations Management");
		
		contactusbtn.click();
		
		
		
		
	}
}
