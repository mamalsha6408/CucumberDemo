Feature: feature to test google search functionality

Scenario: alidate google search is working

	Given browser is open
	And user in google search page
	When user enters a text in search box
	And hits enter
	Then user is navigated to search result page 

