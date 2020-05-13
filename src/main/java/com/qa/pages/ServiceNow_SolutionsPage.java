package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

public class ServiceNow_SolutionsPage extends TestBase {
	
	@FindBy(xpath="//li[@rel='solutionsNav']")
	WebElement solutions;
	
	@FindBy(xpath="//li[@rel='employee-workflows']//a[text()='Employee Workflows']")
	WebElement empworkflow;
	
	@FindBy(xpath="//li[@rel='hr-service-delivery']//a[text()='HR Service Delivery']")
	WebElement hrservice;
	
	public ServiceNow_SolutionsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void mousehoverandclick() throws InterruptedException
	{
		Thread.sleep(3500);
		Actions act=new Actions(driver);
		
		act.moveToElement(solutions).perform();
	
		act.moveToElement(empworkflow).click(hrservice).build().perform();
		
		String title=driver.getTitle();
		System.out.println("The user is in Page :" + title);
		
	}
	

}
