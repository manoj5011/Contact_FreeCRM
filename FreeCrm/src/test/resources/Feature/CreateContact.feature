Feature: Create a contact
Description: This feature will test creating a contact functionality

Background: User is Logged In
Given user navigates to the login page
When user enters username and password in the fields
Then user should login and should be on home page

@create
Scenario: User fills the required fields
When user enters first name, last name and clicks on save
Then user should see the contact on the dashboard

@create
Scenario Outline: User does not fills the required fields
When user user enters <first name> and clicks on save
Then user should see see a error message

Examples:
|first name|
|Ravi      |
|          |

@create
Scenario: User enters valid data in the fields
When user enters valid first name,last name,email id,phone number,address_street,address_city,address_state,address_code,address_country,birthday_day,birthday_month,birthday_year and click on save
Then user should see the contact on the contacts dashboard

@create
Scenario: User enters invalid data in the fields
When user enters invalid first name,last name,email id,phone number,address_street,address_city,address_state,address_code,address_country,birthday_day,birthday_month,birthday_year and click on save
Then user should not see the contact on the contacts dashboard


@create
Scenario Outline: User clicks on cancel after filling the fields
When user gives data <first name>,<last name>,<email>,<birthday_day>,<birthday_month>,<birthday_year> and clicks on cancel
Then user should not see the contacts 

Examples:
|first name  |last name       |email                      |birthday_day|birthday_month|birthday_year|    
|Ram         |Sai             |saimanoj@gmail.com         |1           |March         |2020         |
|Mounika     |Mummidi         |saimanoj@gmail.com         |e           |March         |1929278326   |
|            |                |                           |            |              |             |
 



