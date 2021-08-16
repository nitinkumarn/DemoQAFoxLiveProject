Feature: Registration functionality scenarioes

@Register @one
Scenario: Verify whether user is able to register into the application by providing all the details
	Given I launch the application
	And I navigate to Account registeration page
	When I provide all the below details
	| Firstname | Nitin 										|
	| Last name | Kumar										    |
	| Email     | nitinkumarsuccess@gmail.com                     |
	| Telephone | 7204940016							     	|
	| Password  | 123456 										|
	And I select the privacy policy
	And I click on continue button
	Then I should see that the user account has been created successfully
	
	@Register @Two
	Scenario: Verify Whether user is not allowed to register on skipping the mandatory fields
	Given I launch the application
	And I navigate to Account registeration page
	When I click on continue button
	Then I should see that the user account is not be cretaed
	And I should see the error messages informing the user to fill the mandatory fields
	
