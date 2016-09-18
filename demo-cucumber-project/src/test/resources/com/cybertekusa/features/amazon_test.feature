Feature: Check out functionality

Background: test setup
	Given I go to Amazon
	   Given I go to Amazon	
	And I search for "book"

Scenario: check out multiple stuff
	And I select my stuff from the results
	When I add bunch of stuff to my cart
	Then I should be able to see all on the cart

Scenario: check out single stuff
	And I select my "book" from the results
	When I add my "book" to my cart
	Then I should be able to see "book" on the cart
	
