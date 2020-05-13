$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "ServiceNow Homepage",
  "description": "",
  "id": "servicenow-homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 10,
  "name": "Validate the solutionspage",
  "description": "",
  "id": "servicenow-homepage;validate-the-solutionspage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@FunctionTest2"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is in homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user mousehover the solutions tab and selects the product",
  "keyword": "When "
});
formatter.match({
  "location": "SolutionsPageStepDef.user_is_in_homepage()"
});
formatter.result({
  "duration": 15002918100,
  "status": "passed"
});
formatter.match({
  "location": "SolutionsPageStepDef.user_mousehover_the_solutions_tab_and_selects_the_product()"
});
formatter.result({
  "duration": 12223383500,
  "status": "passed"
});
});