Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open test6
    And user is on login page test6
    When user enters <username> and <password> test6
    And user click login button test6
    Then user is navigated to home page test6

    Examples: 
      | username | password             |
      | practice | SuperSecretPassword! |
      | practice | SuperSecretPassword! |