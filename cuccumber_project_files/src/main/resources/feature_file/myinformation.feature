Feature: my information

Scenario: verify profile updated data after refresh
    Given I am at the audiodigest home page to login as prerequsite
    And I navigate to my information page and validate
    And I fill the required data info
    And I click on save button and validate
    And I refresh the page 
    And I validate the all the feilds data not corrupt after refresh
    Then I logout user
    