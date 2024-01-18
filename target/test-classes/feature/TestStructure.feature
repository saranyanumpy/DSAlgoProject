@tag1

Feature: Launching the DataStucture module
  Scenario: Login and landing in Data Structure page
 
  Given User Signed into DsAlgo portal page with "<username>" and "<password>" fields in the url "https://dsportalapp.herokuapp.com/login"
  When User clicks GetStarted Data Structures button
  Then The User is in the DataStructure home page
   
  When User click Time Complexity button 
  Then It should go to data structure time-complexity page
  
  When User Submits on Try Here button
  Then User should be redirected to next page

  When User read from a file
  And Clicks on the Run button
  Then Result is in the console
  
 
  Examples:
    | username		 | password   |
    | winterchamps | Testwinter1!  |
   