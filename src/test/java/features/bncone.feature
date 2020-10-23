	Feature: BNC Login
	As a user I want login into BNC
	
	Scenario: BNC simple login 
	Given the user is at the login page
	When the user enters the company code
	And the user enters the user code 
	And the user	enters the access key 
	And the user clicks on Accept button
	Then the BNC home page is displayed
