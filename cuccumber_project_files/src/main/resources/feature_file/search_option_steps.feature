Feature: search options

Scenario: 
    Given I am at the audiodigest home page to login as prerequsite
    And I enter speciality in search by speciality option
    And  I validate search results
    Then I logout
    
    
  Scenario: verify and validate combination filters
    Given I am at the audiodigest home page to login as prerequsite
    And I search by family medicine speciality and validate results
    And  I click on cross icon user keyword and validate
    Then I logout