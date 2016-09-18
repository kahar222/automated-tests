@smoke_test, @regression, @cart_test
Feature: demo test
Scenario: verify demo test runs
	Given I go to Amazon Website
	When I search for stuff
	Then I should be able to see stuff immediately
@skip
Scenario: checkout stuff 
	Given I go to Amazon Webpage	
	And I search for stuff
	When I select my stuff from the cart
	Then I should be able to checkout my stuff
