Feature: ServiceNow Homepage
@FunctionTest1
Scenario Outline: Validate ServiceNow HomePage_contact details

Given User launches the ServiceNow URL
Then verify the Homepage title
Then click on contact button on Homepage and fill the "<FirstName>" and "<LastName>" and "<BusinessEmailID>" and "<Company>" and "<PhoneNumber>"  
Then close the browser.
Examples:
|FirstName|LastName|BusinessEmailID     |Company|PhoneNumber |
|Ramya    |vijay   |pvrabcd12@gmail.com |abc    |1234563854  |

@FunctionTest2
Scenario: Validate the solutionspage
Given user is in homepage
When user mousehover the solutions tab and selects the product
