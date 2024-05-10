Feature: feature to test login functionality
	@smokeTest
  Scenario: check login functionality with valid credentials
    Given user is on login page
    When user enter username nad password
    And clicks on login button
    Then user is navigated to the homepage
