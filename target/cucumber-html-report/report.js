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
  "duration": 13774808,
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
  "duration": 2624260949,
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
  "duration": 975331295,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.addItemIntoShoppingCart()"
});
formatter.result({
  "duration": 4870883210,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.clickOnCheckoutButton()"
});
formatter.result({
  "duration": 3227151962,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.enterBillingDetailsAndClickOnProceedToPaypalButton()"
});
formatter.result({
  "duration": 6045419855,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.verifyYouGetTheErrorMessageSayingYouNeedToAccept()"
});
formatter.result({
  "duration": 1370994194,
  "status": "passed"
});
formatter.after({
  "duration": 49254,
  "status": "passed"
});
formatter.before({
  "duration": 896354,
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
  "duration": 2061521046,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.clickOnOrderTrackingLinkOnHomepageFooter()"
});
formatter.result({
  "duration": 2406108149,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.enterOrderIDAndBillingEmailAndClickOnTrackButton()"
});
formatter.result({
  "duration": 3408896612,
  "status": "passed"
});
formatter.match({
  "location": "Shopping_StepDef.youGetAnErrorMessage()"
});
formatter.result({
  "duration": 25947040,
  "status": "passed"
});
formatter.after({
  "duration": 17819,
  "status": "passed"
});
});