Feature: search options

Scenario: verify and validate of speciality results
    Given I am at the audiodigest home page to login as prerequsite
    And I enter speciality in search by speciality option
    And  I validate search results
    Then I logout user 
    
    
  Scenario: verify and validate combination filters
    Given I am at the audiodigest home page to login as prerequsite
    And I search by family medicine speciality and validate results
    And  I click on cross icon user keyword and validate
    Then I logout user
    
    //
    
  Scenario: Verify to validate search enter a topic filter
   Given I am at the audiodigest home page to login as prerequsite
   And enter coursename on searchbox and validate courses panel
   And enter type of disease on topic filter and validate 
   And select type of disease on search results and validate
   And click on cross icon and verify the results
   Then I logout user
   
   
  Scenario: Verify to validate search enter a institution filter
   Given I am at the audiodigest home page to login as prerequsite
   And enter coursename on searchbox and validate courses panel
   And click on cross icon and verify the results 
   And enter institute name in institution and validate 
   And select institute name in institution and verify lectures
   And click on cross icon and verify the results
   Then I logout user
   