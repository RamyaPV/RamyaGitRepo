package com.qa.stepdefinition;

import com.qa.pages.ServiceNow_SolutionsPage;
import com.qa.utility.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SolutionsPageStepDef extends TestBase {

	ServiceNow_SolutionsPage solpag;
	
	@Given("^user is in homepage$")
	public void user_is_in_homepage() throws Throwable {
		TestBase.initialization(); 
	}

	@When("^user mousehover the solutions tab and selects the product$")
	public void user_mousehover_the_solutions_tab_and_selects_the_product() throws Throwable {
	   solpag=new ServiceNow_SolutionsPage();
	   solpag.mousehoverandclick();
	}


}
