Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open test4
    And user is on login page test4
    When user enters <username> and <password> test4
    And user click login button test4
    Then user is navigated to home page test4

    Examples: 
      | username | password             |
      | practice | SuperSecretPassword! |
      | practice | SuperSecretPassword! |
