Feature: library 

  #Scenario: verify and validate combination filters
    #Given I am at the audiodigest home page to login as prerequsite
    #And I click on library tab and validate
    #And I select start date and end date validate date filtered results displayed
    #Then I enter title or issue id and validate filtered results displayed
    #And I select valid speciality and validate filtered results displayed
    #And I Select valid status and validate filtered results displayed
    #Then I logout user
    
  #Scenario: verify and validate user should not add blank playlist
    #Given I am at the audiodigest home page to login as prerequsite
    #And  I click on library tab and validate
    #And I click on add to playlist link and validate popup
    #And I click on save button without playlist name and validate
    #Then I logout user
    
    
  Scenario: verify and validate user is able to add lecture to archive
    Given I am at the audiodigest home page to login as prerequsite
    And  I click on library tab and validate
    And I click on delete button lecture and validate popup
    And I click on archive button and validate
    And I click on archive tab under library page
    And I validate archived lecture displyed 
    Then I logout user
    
    
    
