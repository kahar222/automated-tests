Feature: Check out tons of stuff 
	As a customer, 
	I should be able to check out so much stuff
	so that my so much stuff is available for purchase
	

Scenario Outline: Verify users can check out 
	Given I go to Amazon	
	And I search for "<item>"
	And I select my "<book_name>" from the results
	When I add my "<book_name>" to my cart
	Then I should be able to see "<book_name>" on the cart	
	Examples:
	|item  |book_name 			|
	| book | Selenium cookbook  |
	| book | Head First Java	|
	| book | Think Java			|
	| book | Another java book  |
	| book | Selenium cookbook  |
	| book | Head First Java	|
	| book | Think Java			|
	| book | Another java book  |
	| book | Selenium cookbook  |
	| book | Head First Java	|
	| book | Think Java			|
	| book | Another java book  |
	| book | Selenium cookbook  |
	| book | Head First Java	|
	| book | Think Java			|
	| book | Another java book  |
	| book | Selenium cookbook  |
	| book | Head First Java	|
	| book | Think Java			|
	| book | Another java book  |
