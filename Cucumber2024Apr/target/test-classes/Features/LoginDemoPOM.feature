Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open test5
    And user is on login page test5
    When user enters <username> and <password> test5
    And user click login button test5
    Then user is navigated to home page test5

    Examples: 
      | username | password             |
      | practice | SuperSecretPassword! |
      | practice | SuperSecretPassword! |