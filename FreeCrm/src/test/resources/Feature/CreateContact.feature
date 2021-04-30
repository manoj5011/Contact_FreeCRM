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
|Ram       |
|          |

@create
Scenario Outline: User enters valid and invalid data in the fields
When user enters <first name> and <last name> and <email id> and <phone number> and <address_street> and <address_city> and <address_state> and <address_code> and <address_country> and <birthday_day> and <birthday_month> and <birthday_year> and click on save
Then user should see the contact on the contacts dashboard when valid data is given
But user should not see the contact when invalid data is given

Examples:
|first name  |last name       |email id                  |phone number|address_street|address_city|address_state|address_code|address_country|birthday_day|birthday_month|birthday_year|
|Siddarth    |Mummidi         |saimanoj@gmail.com        |9182820148  |Road no:A     |Hyderabad   |Telengana    |500089      |India          |2           |March         |2012         |
|1234        |*(&^$725        |saimanoj                  |964263      |$%01@         |*9765       |+_987hs      |manoj       |India          |e           |March         |1929278326   |


@create
Scenario Outline: User clicks on cancel after filling the fields
When user gives data <first name>,<last name>,<email>,<birthday_day>,<birthday_month>,<birthday_year> and clicks on cancel
Then user should not see the contacts 

Examples:
|first name  |last name       |email                      |birthday_day|birthday_month|birthday_year|    
|Ram         |Sai             |saimanoj@gmail.com         |1           |March         |2020         |
|Mounika     |Mummidi         |saimanoj@gmail.com         |e           |March         |1929278326   |
|            |                |                           |            |              |             |
 



