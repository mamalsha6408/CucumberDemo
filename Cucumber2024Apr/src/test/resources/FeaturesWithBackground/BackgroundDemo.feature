Feature: Check home page functionality bg

  Background: user is logged in
    Given user is in logging page testbg
    When user enter username and password testbg
    And clicks on login button testbg
    Then user is navigated to home page

  Scenario: check logout link
    When user clicks on welcome link testbg
    Then logout link is displayed testbg

  Scenario: verify quick launch toolbar is present
    When user clicks on dashboard link testbg
    Then quick launch toolbar is displayed testbg
