Feature: security of contacts
Description: This feature will test security of contacts functionality

Background: User should be Logged In
Given user navigate to the login page of freeCRM
When user enters username and password in respective fields
Then user should login and view the home page

@security
Scenario: user tries to access a private contact
When added user ties to access a private contact
Then user should be able to view/access/edit/delete the contact

@security
Scenario: user tries to access a private contact
When non added user ties to access a private contact
Then user should not be able to view/access/edit/delete the contact

@security
Scenario: user tries to access a public contact
When user ties to access a public contact
Then all user should be able to view/access/edit/delete the contact