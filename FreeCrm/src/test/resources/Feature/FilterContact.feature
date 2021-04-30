Feature: filter contacts
Description: This feature will test filtering contacts functionality

Background: User should be Logged In
Given user directs to the login page
When user enters username and password in their respective fields
Then user should login and see home page 

@filter
Scenario: User filters the contacts with single valid filter
When user filters a contact with valid condition
Then the contacts which satisfy the condition should be displayed

@filter
Scenario: User filters the contacts with single invalid filter
When user filters a contact with invalid condition
Then no contacts should be displayed

@filter
Scenario: User filters the contacts with multiple valid filter
When user filters a contact with valid conditions
Then the contacts which satisfy the conditions should be displayed

@filter
Scenario: User filters the contacts with multiple invalid filter
When user filters a contact with invalid conditions
Then user should not see any contacts

@filter
Scenario: user adds filter condition and clicks on clear filter
When user tries to filter contacts with a condition and then clicks on clear filter
Then all the contacts should be displayed

@filter
Scenario: user filters a contact and then clicks on actions
When user filters contacts with valid condition and then delete it 
Then contacts should be displayed in the bin