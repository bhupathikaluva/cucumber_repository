Feature: library 

  Scenario: verify and validate combination filters
    Given I am at the audiodigest home page to login as prerequsite
    And I click on library tab and validate
    And I select start date and end date validate date filtered results displayed
    Then I enter title or issue id and validate filtered results displayed
    And I select valid speciality and validate filtered results displayed
    And I Select valid status and validate filtered results displayed
    Then I logout user
    
  Scenario: verify and validate user should not add blank playlist
    Given I am at the audiodigest home page to login as prerequsite
    And  I click on library tab and validate
    And I click on add to playlist link and validate popup
    And I click on save button without playlist name and validate
    Then I logout user
    
    
  Scenario: verify and validate user is able to add lecture to archive
    Given I am at the audiodigest home page to login as prerequsite
    And  I click on library tab and validate
    And I click on delete button lecture and validate popup
    And I click on archive button and validate
    And I click on archive tab under library page
    And I validate archived lecture displyed 
    Then I logout user
    
  

 
  Scenario: Verify validate user should not be able to add blank playlist
     
      Given I am at the audiodigest home page to login as prerequsite 
      And I click on library tab on dashboard page
      And I validate Audio Digest library page
      And I click on add to playlist link and validate displayed popup 
      And click on save button and observe the popup message
      Then I logout user
     
  
  Scenario: Verify validate user is able to add new playlist from library page
     
      Given I am at the audiodigest home page to login as prerequsite
      And I click on library tab on dashboard page
      And I validate Audio Digest library page
      And I click on add to playlist link and validate displayed popup 
      And I click on close button on popup and validate
      And I click on add to playlist link and validate displayed popup
      And enter the playlist name in the textbox and click on save button
      And validate display popup and dismiss popup
      Then I logout user 
      
  Scenario: Verify validate sort by newest option in my ibrary page
  
      Given I am at the audiodigest home page to login as prerequsite
      And I click on library tab on dashboard page
      And I validate Audio Digest library page  
      And I click on search by specialty and select specialty
      And I click on sortby dropdown and select newest option and observe results
      Then I logout user
      
      
  Scenario: Verify validate sort by oldest option in my library page
  
      Given I am at the Audio Digest dashboard page with login as prereqist
      And I click on library tab on dashboard page
      And I validate Audio Digest library page 
      And I click on search by specialty and select specialty
      And I click on sortby dropdown and select oldest option and observe results
      Then I logout user
     
    
Scenario: verify and validate navigation of courses under my library section
Given I am at the audiodigest home page to login as prerequsite
And validate courses under my library section
And click on play icon of any course
Then I logout user
 
 
 
Scenario: verify and validate sort by credits option in my library page
Given I am at the audiodigest home page to login as prerequsite
And click on my library
And I select credits option
And verify sort by option as credits and select speciality from specialty dropdown
Then I logout user
    
    
    
