Feature: check out options on Amazon
	As a customer, 
	I should be able to check out stuff
	so that my stuff is available for purchase
	
Scenario: Check out 3 things at a time
	Given I go to Amazon	
	And I search for "book"
	When I select following books from the results:
	| Head First Java |
	|Selenium cookbook|
	|Think Java		  |
	Then I should have "3" items in my cart

	
Scenario: Check out books by author
	Given I go to Amazon	
	And I search for "book"
	And I select the books I want from the list:
	|Name			  | Author           |
	|Head First Java  | Smart guy 		 |
	|Selenium cookbook| Another smart guy|
	|Think Java		  | Smart guy 		 |
	Then I should have all the items in my cart
	

Scenario: Check out books by author
	Given I go to Amazon	
	And I search for "book"
	And I select the books I want using followinf information:
	|Name			  | Author           |
	|Head First Java  | Smart guy 		 |
	|Selenium cookbook| Another smart guy|
	|Think Java		  | Smart guy 		 |
	Then I should have all the items in my cart