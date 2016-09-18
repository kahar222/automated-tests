@smoke_test, @regression, @cart_test
Feature: demo test
Scenario: verify demo test runs
	Given I go to Amazon
	When I search for stuff
	Then I should be able to see stuff
@skip
Scenario: checkout stuff 
	Given I go to Amazon	
	And I search for stuff
	When I select my stuff from the results
	Then I should be able to checkout my stuff