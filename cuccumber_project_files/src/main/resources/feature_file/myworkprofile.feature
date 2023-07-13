Feature: Workprofile 

Scenario: verify and validate adding for licensure with selecting
    Given I am at the audiodigest home page to login as prerequsite
    And I click on the profile dropdown to navigate workprofile
    And  I add state to verify feilds
    And I add state without selecting any state and validate
    Then I logout user 
