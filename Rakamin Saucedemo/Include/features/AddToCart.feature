Feature: Add to Cart

  Scenario: User can view product added to the cart
    Given User is on Homepage
    When User click add to cart
    And User click cart
    Then User can view the items added to the cart
    