Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given browser is open test3
    And user is on login page test3
    When user enters username and password test3
    And user click login button test3
    Then user is navigated to home page test3
