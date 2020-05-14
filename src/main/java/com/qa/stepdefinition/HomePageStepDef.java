package com.qa.stepdefinition;

import com.qa.pages.ServiceNow_HomePage;
import com.qa.utility.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDef extends TestBase {
	
	ServiceNow_HomePage hp;
	
	@Given("^User launches the ServiceNow URL$")
	public void user_launches_the_ServiceNow_URL() throws Throwable {
	    TestBase.initialization();
	}

	@Then("^verify the Homepage title$")
	public void verify_the_Homepage_title() throws Throwable {
		 hp=new ServiceNow_HomePage();
		hp.validateHomepagelogo();
		   
	}

	@Then("^click on contact button on Homepage and fill the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_on_contact_button_on_Homepage_and_fill_the_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	   hp.contactusvalidation(arg1, arg2, arg3, arg4, arg5);
	}

	@Then("^close the browser\\.$")
	public void close_the_browser() throws Throwable {
	    driver.close();
	}

}