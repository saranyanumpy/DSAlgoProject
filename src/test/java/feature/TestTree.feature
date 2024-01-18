Feature: Tree Page Feature

Scenario: Overview of Trees Page

Given User entering into DsAlgo portal page with "<username>" and "<password>" fields in the url "https://dsportalapp.herokuapp.com/login"
 When User submitting Data Structures dropdown 
 Then The User is in the Tree home page

When User clicks on Overview of Trees button
Then User should be directed to next page

When User clicks to Try Here button to work further
Then User should be redirected to next page

When User submitting the file
And Working on the Run button
Then Result is displayed 


When User goes back
And User clicks on Terminologies button
Then User should be redirected to Terminologies page

When User clicks on Try Here button to work on Terminologies
Then User should be redirected to next page

When User passing the file
And Working on the Run button for Terminologies
Then Result is displayed on the console for Terminologies

When User goes back to Tree
And User clicks on Types of Trees button
Then User should be redirected to Types of Trees page

When User clicks on Try Here button to work on Types of Trees
Then User should be redirected to Types of Trees page

When User passing the file to Types of Trees
And Working on the Run button for Types of Trees
Then Result is displayed on the console for Types of Trees

When User goes back to Tree page
And User clicks on Tree Traversals
Then User should be redirected to Tree Traversals

When User clicks on Try Here button to work on Tree Traversals
Then User should be redirected to Tree Traversals

When User passing the file to Tree Traversals
And Working on the Run button for Tree Traversals
Then Result is displayed on the console for Tree Traversals

When User navigate back to Tree page
And User clicks on Traversals-Illustration
Then User should be redirected to Traversals-Illustration

When User clicks on Try Here button to work on Traversals-Illustration
Then User should be redirected to Traversals-Illustration

When User passing the file to Traversals-Illustration
And Working on the Run button for Traversals-Illustration
Then Result is displayed on the console for Traversals-Illustration

And Quit the browser
 Examples:
    | username		 | password   |
    | winterchamps | Testwinter1!  |
   