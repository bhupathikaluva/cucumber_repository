
Feature: login functionality

  Scenario: login with valid credentials
    Given I am at the audio digest Home Page
    And I accept the cookies
    And I click on the profile Login
    And I will be navigate to login page
    When I fill the account username textbox with "<username>"
		When I fill the password textbox with "<password>"
		And I click the Login button
		Then I should be appear dashboard page
		

    Examples:
        |  username  |  password  |
        |  Admin     |  admin123  |
