Feature: Test the login functinality of OrangeHrm

Scenario: Test Login Functionality of OrangeHrm application

Given The user is a registered user
When users enters username and password
And user clicks on login 
Then OrangeHrm renders Homepage