package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\RamyaPV\\Desktop\\Selenium\\SeleniumCucumberProject\\src\\main\\java\\com\\qa\\features",
		glue= {"com.qa.stepdefinition"},
		tags= {"@FunctionTest1"},
		format= {"pretty","html:Test-output"}
		)

public class TestRunner {

}
