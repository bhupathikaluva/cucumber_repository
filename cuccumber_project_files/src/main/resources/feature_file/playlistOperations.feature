Feature: playlist_operations

  Scenario: rename playlist name
    Given I want to login audiodigest web as prerequisite
    And I validate the dashboard page is displayed
    And I click on playlist button 
    And I validate playlist page
    And I click on myplaylist
    And I click on renameplaylist
    Then I validate the playlistpop window is displayed
    And I enter playlist name
    When I click on update
    Then I validate the playlistname

  Scenario: create playlist and verify in dashboard
  
    Given I want to login audiodigest web as prerequisite
    And I validate the dashboard page is displayed
    And I click on playlist button 
    And I validate playlist page
    And I click create playlist
    And I enter playlist name
    And I click library
    Then I validate library page
    And I click course add to playlist
    And I validate the add to course pop up is displayed
    And I click on audio play check box and save
    Then I click on dasboard 
    And I validate the dash board page
    Then I validate the play list name
    
    
    
    
    
  
  
  
  