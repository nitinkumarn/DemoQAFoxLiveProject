Feature: Login functionality scenarios

@Login @One
Scenario: Verify whether user is able to login with valid credentials
	Given I launch the application
	And I navigate to Account Login page
	When I login to application using username "nitinkumarsuccess@gmail.com" and password "123456"
	Then I should see that user is able to login successfully

	
@Login @Two
Scenario: Verify whether user is not able to login with invalid credentials
	Given I launch the application
	And I navigate to Account Login page
	When I login to application using username "nitinkumarsuccess@gmail.com" and password "1234567"
	Then I should see an error message that the credentials are invalid
	
	
	@Login @Three
Scenario: Verify whether user is not able to login without providing credentials
	Given I launch the application
	And I navigate to Account Login page
	When I login to application using username "" and password ""
	Then I should see an error message that the credentials are invalid
	
	@Login @Four
Scenario: Verify whether user is able to reset forgot password
	Given I launch the application
	And I navigate to Account Login page
	When I reset the forgotten password for email "nitinkumarsuccess@gmail.com"
	Then I should see a message informing the user that information related to resetting password have been sent to email address