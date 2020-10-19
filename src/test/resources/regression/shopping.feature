# new feature
# Tags: optional

Feature: Validate Shopping Cart

  @001
  Scenario: Validate shopping cart
    Given Launch Application
    When Click on search icon on homepage and type "Rice" and press enter
    And Add item into shopping cart
    When Click on checkout button
    And Enter billing details and click on Proceed to Paypal button
    Then verify you get the error message saying you need to accept

  @002
  Scenario: Validate Order Tracking
    Given Launch Application
    When Click on Order Tracking link on homepage footer
    And Enter Order ID and Billing Email and click on Track button
    Then You get an error message

