Feature: Checkout

  Scenario: User can checkout several items
    Given User is on Homepage
    When User click add to cart item 1
    And User click add to cart item 2
    And User click cart button
    And User click checkout button
    And User input first name
    And User input last name
    And User input postal code
    And User click continue
    And User click finish
    Then User can view thank you message
    