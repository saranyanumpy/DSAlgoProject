@tag1

Feature: Launching the Website
  Scenario: Navigate to Homepage and Check Page Title
    Given User launches Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And User clicks on "Get started" button
    Then Page Title should be "NumpyNinja"
    
    And Quit the driver