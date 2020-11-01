$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("regression/shopping.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "Validate Shopping Cart",
  "description": "",
  "id": "validate-shopping-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16819868,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate shopping cart",
  "description": "",
  "id": "validate-shopping-cart;validate-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@001"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Launch Application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Click on search icon on homepage and type \"Rice\" and press enter",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Add item into shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Enter billing details and click on Proceed to Paypal button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify you get the error message saying you need to accept",
  "keyword": "Then "
});
formatter.match({
  "location": "Shopping_StepDef.launchApplication()"
});
formatter.result({
  "duration": 3074401705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rice",
      "offset": 43
    }
  ],
  "location": "Shopping_StepDef.clickOnSearchIconOnHomepageAndTypeAndPressEnter(String)"
});
formatter.result({
  "duration": 872727890,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.addItemIntoShoppingCart()"
});
formatter.result({
  "duration": 4141187601,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.clickOnCheckoutButton()"
});
formatter.result({
  "duration": 4240529822,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.enterBillingDetailsAndClickOnProceedToPaypalButton()"
});
formatter.result({
  "duration": 5687679392,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.verifyYouGetTheErrorMessageSayingYouNeedToAccept()"
});
formatter.result({
  "duration": 1928470556,
  "status": "passed"
});
formatter.after({
  "duration": 128999,
  "status": "passed"
});
formatter.before({
  "duration": 6702378,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Validate Order Tracking",
  "description": "",
  "id": "validate-shopping-cart;validate-order-tracking",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@002"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Launch Application",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Click on Order Tracking link on homepage footer",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Enter Order ID and Billing Email and click on Track button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "You get an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "Shopping_StepDef.launchApplication()"
});
formatter.result({
  "duration": 4460020483,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.clickOnOrderTrackingLinkOnHomepageFooter()"
});
formatter.result({
  "duration": 2309298336,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.enterOrderIDAndBillingEmailAndClickOnTrackButton()"
});
formatter.result({
  "duration": 2080728812,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.youGetAnErrorMessage()"
});
formatter.result({
  "duration": 25664424,
  "status": "passed"
});
formatter.after({
  "duration": 17612,
  "status": "passed"
});
});