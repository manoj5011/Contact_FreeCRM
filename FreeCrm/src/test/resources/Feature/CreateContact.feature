Feature: Create a contact
Description: This feature will test creating a contact functionality

Background: User is Logged In
Given user navigates to the login page
When user enters username and password in the fields
Then user should login and should be on home page

Scenario: User fills the required fields
When user enters first name, last name and clicks on save
Then user should see the contact on the dashboard

Scenario Outline: User does not fills the required fields
When user user enters <first name> and clicks on save
Then user should see see a error message

Examples:
|first name|
|manoj     |
|          |

Scenario Outline: User enters valid data in the fields
When user user enters <first name>,<last name>,<email id>,<phone number>,<address_street>,<address_city>,<address_state>,<address_code>,<address_country>,<birthday_day>,<birthday_month>,<birthday_year> and click on save
Then user should see the contact on the contacts dashboard

Examples:
|first name  |last name       |email id                  |phone number|address_street|address_city|address_state|address_code|address_country|birthday_day|birthday_month|birthday_year|
|Siddarth    |Mummidi         |                          |            |              |            |             |            |               |            |              |             |
|Manoj       |Marisetti       |saimanoj@gmail.com        |            |              |            |             |            |               |            |              |             |
|Shyam       |Pydi            |                          |9182820148  |              |            |             |            |               |            |              |             |
|Chaitanya   |Revu            |                          |            |              |            |             |            |               |2           |March         |2012         |
|Gopi        |Chand           |                          |            |Road no:8A    |Hyderabad   |Telengana    |500089      |India          |            |              |             |


Scenario Outline: User enters invalid data in the fields
When user user gives invalid <first name>,<last name>,<phone number>,<address_street>,<address_city>,<address_state>,<address_code>,<address_country>,<birthday_day>,<birthday_month>,<birthday_year> and clicks on save
Then user should not see the contact on dashboard

Examples:
|first name  |last name       |phone number|address_street|address_city|address_state|address_code|address_country|birthday_day|birthday_month|birthday_year|
| @#$123%^   |*(&^$725        |            |              |            |             |            |               |            |              |             |         
|Mohan       |Pydi            |964263      |              |            |             |            |               |            |              |             |
|Kiran       |Revu            |            |              |            |             |            |               |e           |March         |1929278326   |
|Kalyan      |Chand           |            | $%01@        |*9765       |+_987hs      |manoj       |India          |            |              |             |

Scenario Outline: User clicks on cancel after filling the fields
When user user gives data <first name>,<last name>,<email>,<birthday_day>,<birthday_month>,<birthday_year> and clicks on cancel
Then user should not see the contacts 

Examples:
|first name  |last name       |email                      |birthday_day|birthday_month|birthday_year|    
|Ram         |Sai             |                           |            |              |             |
|Mounika     |Mummidi         |saimanoj@gmail.com         |e           |March         |1929278326   |
|            |                |                           |            |              |             |
 



