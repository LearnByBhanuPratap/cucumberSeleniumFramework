#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template


Feature: Login to facebook
Keywords Summary : This test will verify login related scenarios to FACAEBOOK.COM
Scenario: Login with valid credentials
Given User navigated to FACEBOOK.COM
When user enter Username as "USER1" and Password "PASSWORD"
And user click on login button
Then login should be successful


Scenario: Login with invalid credentials
Given User navigated to FACEBOOK.COM
When user enter Username as "USER2" and Password "PASSWORD"
And user click on login button
Then login should not be successful


