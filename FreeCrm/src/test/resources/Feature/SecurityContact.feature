Feature: security of contacts
Description: This feature will test security of contacts functionality

@security
Scenario: user tries to access a private contact
Given added user logs into the page
When added user tries to access a private contact
Then user should be able to view/access/edit/delete the contact

@security
Scenario: user tries to access a private contact
Given non added user logs into the page
When non added user tries to access a private contact
Then user should not be able to view the contact

@security
Scenario: user tries to access a public contact
Given user logs into the page
When user tries to access a public contact
Then all user should be able to view/access/edit/delete the contact