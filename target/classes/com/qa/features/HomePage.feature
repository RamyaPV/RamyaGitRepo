Feature: ServiceNow Homepage

Scenario: Validate ServiceNow HomePage_contact details

Given User launches the ServiceNow URL
Then verify the Homepage title
Then click on contact button on Homepage and fill the details
Then close the browser.
@FunctionTest2
Scenario: Validate the solutionspage
Given user is in homepage
When user mousehover the solutions tab and selects the product
