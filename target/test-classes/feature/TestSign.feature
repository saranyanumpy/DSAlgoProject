@tag1
 
  Feature: Test DS Algo login Page Feature
 		Scenario: Test to click login button by giving userid and password
    Given The user opens the url "https://dsportalapp.herokuapp.com/login"
    And User enters "UserName" and "Password" fields
    When The User clicks "Login" button 
    Then It should display as "You are logged in"
    And Close the driver