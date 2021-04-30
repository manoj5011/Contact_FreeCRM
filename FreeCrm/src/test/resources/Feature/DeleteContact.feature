Feature: Delete a contact
Description: This feature will test deleting a contact functionality

Background: User should be Logged In
Given user goes to the login page of freeCRM
When user enters username and password in the login page
Then user should login and see logout option

@delete
Scenario: User deletes a particular contact
When user deletes a particular contact
Then contact should move to the bin

@delete
Scenario: User deletes multiple contacts
When user selects multiple contacts and clicks on delete
Then contacts should move to the bin

@delete
Scenario: user tries to delete a contact then clicks on cancel
When user selects to delete a contact and then click on cancel
Then contact should not move to the bin

@delete
Scenario:  user tries to delete multiple contact then clicks on cancel
When user selects multiple contacts to delete and then click on cancel
Then contacts should not move to the bin
