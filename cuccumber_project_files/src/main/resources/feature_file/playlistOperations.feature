Feature: playlist_operations

  Scenario: rename playlist name
    Given I am at the audiodigest home page to login as prerequsite
    And I click on playlist tab and validate
    And I click on myplaylist and rename playlist
    Then I validate the playlistpop is displayed
    And I enter playlist name and update
    And I validate the updated playlistname
    Then I logout user

  Scenario: verify user able to create playlist and verify in dashboard
  
    Given I am at the audiodigest home page to login as prerequsite
    And I click on playlist button and validate
    And I create playlist and validate
    And I navigate to library tab and validate
    And I click on add to playlist and validate
    And I click on playlist name check box and save
    And I navigate to dasboard page and validate
    And I validate the playlist name
    Then I logout user
    
    
   Scenario: validate user is able to delete custom playlist
   Given I am at the audiodigest home page to login as prerequsite
    And I click on playlist tab and validate
    And I click on My playlist
    And I delete playlist and validate
    Then I logout user
   
   
   
   
   
   
    
    
    
    
    
  
  
  
  