Feature: Recover contacts
Description: This feature will test recovering contacts functionality

Background: User should be Logged In
Given user is on the login page
When user enters username and password in login page of freeCRM
Then user should login and see the home page of freeCRM

@recover
Scenario: user tries to recover a contact
When user tries to recover a contact from the bin
Then contact should be visible on dashboard

@recover
Scenario: user tries to recover multiple contacts
When user tries to recover multiple contacts from the bin
Then contacts should be visible on dashboard