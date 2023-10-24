Feature: Login

  Scenario: Success login
    Given User is on Swag Labs login page
    When User input username
    And User input password
    And User click login button
    Then User navigated to Homepage

  Scenario: Failed login
    Given User is on Swag Labs login page
    When User input username
    And User input invalid password
    And User click login button
    Then User get error message
