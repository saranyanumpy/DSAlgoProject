@tag1

Feature: Launching the Queue module
  Scenario: Login and landing in Queue page
 
  Given User logged into DsAlgo portal page with "<username>" and "<password>" fields in the url "https://dsportalapp.herokuapp.com/login"
  When User clicks Data Structures dropdown 
  Then The User is in the Queue structure home page
   
  When User clicks on Implementation of Queue in Python link
  Then User Should be redirected to correct Queue page
  When User clicks on Try Here button
  Then User should be redirected to next page
  When I have a Word document with code
  And I execute the code in the Try Editor
  Then Result is displayed on the console
  Then Go back to previous page
  
   Given User Should be redirected to correct Queue page
  When User clicks on Implementation using collections.Deque
  Then User Should be redirected to correct Implementation using using collections.deque
  When User submit on Try Here 
  Then User should be redirected to the next page
  When User enters the text in the TextEditor by reading the doc
  And Clicks on the Run button to see the results by executing it
  Then Result should be displayed on the console 
  Then Navigate to previous page
  

  Given User Should be redirected to correct Queue page
  When User clicks on Implementation using array link
  Then User Should be redirected to correct Implementation using array page
  When User submit on Try Here button
  Then User should be redirected to the next page
  When User enters the text in the TextEditor by reading the document
  And Clicks on the Run button to execute and see the results
  Then Result is displayed on the console 
  Then Navigate to previous page
  
  Given User Should be redirected to correct Queue page
  When User clicks on Practice link
  Then Move back again
  And Driver is quitting
  
   Examples:
    | username		 | password   |
    | winterchamps | Testwinter1!  |
   