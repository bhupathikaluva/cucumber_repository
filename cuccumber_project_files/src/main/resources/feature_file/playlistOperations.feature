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
    And I click on playlist tab and validate
    And I create playlist and validate
    And I navigate to library tab and add course to playlist
    And I navigate to dasboard page and validate playlist
    Then I logout user
    
    
   Scenario: validate user is able to delete custom playlist
   Given I am at the audiodigest home page to login as prerequsite
    And I click on playlist tab and validate
    And I click on My playlist
    And I delete playlist and validate
    Then I logout user
    
   Scenario: validate user is able to delete custom playlist   
    Given I am at the audiodigest home page to login as prerequsite
    And I click on playlist tab and validate
    And I click on create playlist
    And I enter existing playlistname and validate
    Then I logout user
    
    #janu feature files
    
    Scenario: Verify validate user are able to add new playlist
   
    Given I am at the audiodigest home page to login as prerequsite 
    And I click on playlists tab on dashboard page
    And I validate Audio Digest playlists page
    And I click on create playlist
    And I validate Audio Digest create playlist popup
    And enter new playlist name and click on create button 
    Then I logout user

 
  Scenario: Verify validate status on my playlist screen
    
     Given I am at the audiodigest home page to login as prerequsite 
     And I click on playlists tab on dashboard page
     And I validate Audio Digest playlists page
     And I click on any playlist     
     Then observe the status of that playlist and logout
     Then I logout user
    
    
    
  Scenario: Verify validate my playlists group section
  
     Given I am at the audiodigest home page to login as prerequsite
     And I click on playlists tab on dashboard page
     And I validate Audio Digest playlists page 
     And I click on Myplaylist group section and validate
     Then I logout user
     
     
     
  Scenario: Verify validate audio digest created playlists section
  
     Given I am at the audiodigest home page to login as prerequsite
     And I click on playlists tab on dashboard page
     And I validate Audio Digest playlists page 
     And I click on AudioDigest playlist group section and validate
     Then I logout user

Scenario: verify validate display of user created playlist displayed on dashboard
Given I am at the audiodigest home page to login as prerequsite
And I click on playlist tab and validate
And I click on create playlist
Then I validate the playlistpop is displayed
And I enter playlist name 
And I click on create button
And I navigate to library tab and add course to playlist
And I navigate to dasboard page and validate playlist
Then I logout user


    
Scenario: verify validate playall functionality when palylist lecture
Given I am at the audiodigest home page to login as prerequsite
And I click on playlist tab and validate
And I click on create playlist
And I enter the name of the playlist and click on create
And I click on library tab and add two lecture to the newly created playlist
And navigate back to playlist tab
And I click on play all icon of newly created playlist and validate
Then I logout user
   
   
   
   
   
   
   
   
    
    
    
    
    
  
  
  
  