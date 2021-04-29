Feature: Edit a contact
Description: This feature will test editing a contact functionality

Background: User should be Logged In
Given user goes to the login page
When user enters username and password 
Then user should login 

Scenario: User edits the required fields
When user edits required fields and clicks on save
Then user should see an edited contact

Scenario: User edits non required fields
When user edits non required fields and clicks on save
Then user should view an edited contact 

Scenario: User does not edit any fields 
When user does not edit any field and clicks on save
Then user should view an non edited contact 

When user does not edit any field and clicks on cancel
Then user should see an non edited contact 