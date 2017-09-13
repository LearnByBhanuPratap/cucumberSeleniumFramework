@tag
Feature: Login to application

@tag1
Scenario: Login to application
Given navigate to application
	When user click on sign in link
  And enter email address
	And enter password
	And click on sign in button
	Then Login is successful
	


