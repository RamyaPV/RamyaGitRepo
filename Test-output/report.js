$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "ServiceNow Homepage",
  "description": "",
  "id": "servicenow-homepage",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate ServiceNow HomePage_contact details",
  "description": "",
  "id": "servicenow-homepage;validate-servicenow-homepage-contact-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@FunctionTest1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launches the ServiceNow URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the Homepage title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on contact button on Homepage and fill the \"\u003cFirstName\u003e\" and \"\u003cLastName\u003e\" and \"\u003cBusinessEmailID\u003e\" and \"\u003cCompany\u003e\" and \"\u003cPhoneNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser.",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "servicenow-homepage;validate-servicenow-homepage-contact-details;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "BusinessEmailID",
        "Company",
        "PhoneNumber"
      ],
      "line": 10,
      "id": "servicenow-homepage;validate-servicenow-homepage-contact-details;;1"
    },
    {
      "cells": [
        "Ramya",
        "vijay",
        "pvrabcd12@gmail.com",
        "abc",
        "1234563854"
      ],
      "line": 11,
      "id": "servicenow-homepage;validate-servicenow-homepage-contact-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Validate ServiceNow HomePage_contact details",
  "description": "",
  "id": "servicenow-homepage;validate-servicenow-homepage-contact-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@FunctionTest1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launches the ServiceNow URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the Homepage title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on contact button on Homepage and fill the \"Ramya\" and \"vijay\" and \"pvrabcd12@gmail.com\" and \"abc\" and \"1234563854\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser.",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.user_launches_the_ServiceNow_URL()"
});
formatter.result({
  "duration": 18947138900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.verify_the_Homepage_title()"
});
formatter.result({
  "duration": 11126923000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ramya",
      "offset": 50
    },
    {
      "val": "vijay",
      "offset": 62
    },
    {
      "val": "pvrabcd12@gmail.com",
      "offset": 74
    },
    {
      "val": "abc",
      "offset": 100
    },
    {
      "val": "1234563854",
      "offset": 110
    }
  ],
  "location": "HomePageStepDef.click_on_contact_button_on_Homepage_and_fill_the_and_and_and_and(String,String,String,String,String)"
});
formatter.result({
  "duration": 16060250700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.close_the_browser()"
});
formatter.result({
  "duration": 508574200,
  "status": "passed"
});
});