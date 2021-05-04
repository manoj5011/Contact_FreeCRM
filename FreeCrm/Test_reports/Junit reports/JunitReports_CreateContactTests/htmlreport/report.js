$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/CreateContact.feature");
formatter.feature({
  "line": 1,
  "name": "Create a contact",
  "description": "Description: This feature will test creating a contact functionality",
  "id": "create-a-contact",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 2685420700,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_enters_username_and_password_in_the_fields()"
});
formatter.result({
  "duration": 1086573300,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1186590000,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User fills the required fields",
  "description": "",
  "id": "create-a-contact;user-fills-the-required-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@create"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enters first name, last name and clicks on save",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user should see the contact on the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_enters_first_name_last_name_and_clicks_on_save()"
});
formatter.result({
  "duration": 10754135500,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_see_the_contact_on_the_dashboard()"
});
formatter.result({
  "duration": 768909900,
  "status": "passed"
});
formatter.after({
  "duration": 67697800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "User does not fills the required fields",
  "description": "",
  "id": "create-a-contact;user-does-not-fills-the-required-fields",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@create"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user user enters \u003cfirst name\u003e and clicks on save",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user should see see a error message",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "create-a-contact;user-does-not-fills-the-required-fields;",
  "rows": [
    {
      "cells": [
        "first name"
      ],
      "line": 20,
      "id": "create-a-contact;user-does-not-fills-the-required-fields;;1"
    },
    {
      "cells": [
        "Ravi"
      ],
      "line": 21,
      "id": "create-a-contact;user-does-not-fills-the-required-fields;;2"
    },
    {
      "cells": [
        ""
      ],
      "line": 22,
      "id": "create-a-contact;user-does-not-fills-the-required-fields;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 2017953100,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_enters_username_and_password_in_the_fields()"
});
formatter.result({
  "duration": 1385360800,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1122789400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User does not fills the required fields",
  "description": "",
  "id": "create-a-contact;user-does-not-fills-the-required-fields;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@create"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user user enters Ravi and clicks on save",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user should see see a error message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Ravi",
      "offset": 17
    }
  ],
  "location": "CreateContact.user_user_enters_first_name_and_clicks_on_save(String)"
});
formatter.result({
  "duration": 5422601900,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_see_see_a_error_message()"
});
formatter.result({
  "duration": 64133700,
  "status": "passed"
});
formatter.after({
  "duration": 97040000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 1980869700,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_enters_username_and_password_in_the_fields()"
});
formatter.result({
  "duration": 1585584000,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 2133543800,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "User does not fills the required fields",
  "description": "",
  "id": "create-a-contact;user-does-not-fills-the-required-fields;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@create"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user user enters  and clicks on save",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user should see see a error message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 17
    }
  ],
  "location": "CreateContact.user_user_enters_first_name_and_clicks_on_save(String)"
});
formatter.result({
  "duration": 893743100,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_see_see_a_error_message()"
});
formatter.result({
  "duration": 25358300,
  "status": "passed"
});
formatter.after({
  "duration": 157112300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 1825458200,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_enters_username_and_password_in_the_fields()"
});
formatter.result({
  "duration": 1067355300,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1757070100,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User enters valid data in the fields",
  "description": "",
  "id": "create-a-contact;user-enters-valid-data-in-the-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@create"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user enters valid first name,last name,email id,phone number,address_street,address_city,address_state,address_code,address_country,birthday_day,birthday_month,birthday_year and click on save",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user should see the contact on the contacts dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_enters_valid_first_name_last_name_email_id_phone_number_address_street_address_city_address_state_address_code_address_country_birthday_day_birthday_month_birthday_year_and_click_on_save()"
});
formatter.result({
  "duration": 23273535600,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_see_the_contact_on_the_contacts_dashboard()"
});
formatter.result({
  "duration": 1359612900,
  "status": "passed"
});
formatter.after({
  "duration": 102401400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 1946256900,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_enters_username_and_password_in_the_fields()"
});
formatter.result({
  "duration": 1211421300,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1142973300,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "User enters invalid data in the fields",
  "description": "",
  "id": "create-a-contact;user-enters-invalid-data-in-the-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@create"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user enters invalid first name,last name,email id,phone number,address_street,address_city,address_state,address_code,address_country,birthday_day,birthday_month,birthday_year and click on save",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user should not see the contact on the contacts dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_enters_invalid_first_name_last_name_email_id_phone_number_address_street_address_city_address_state_address_code_address_country_birthday_day_birthday_month_birthday_year_and_click_on_save()"
});
formatter.result({
  "duration": 17449975700,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_not_see_the_contact_on_the_contacts_dashboard()"
});
formatter.result({
  "duration": 1420752000,
  "error_message": "java.lang.AssertionError: null\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.assertNotEquals(Assert.java:1157)\r\n\tat org.testng.Assert.assertNotEquals(Assert.java:1162)\r\n\tat StepDefinition.CreateContact.user_should_not_see_the_contact_on_the_contacts_dashboard(CreateContact.java:229)\r\n\tat ✽.Then user should not see the contact on the contacts dashboard(src/test/resources/Feature/CreateContact.feature:32)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 130888200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 36,
  "name": "User clicks on cancel after filling the fields",
  "description": "",
  "id": "create-a-contact;user-clicks-on-cancel-after-filling-the-fields",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@create"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "user gives data \u003cfirst name\u003e,\u003clast name\u003e,\u003cemail\u003e,\u003cbirthday_day\u003e,\u003cbirthday_month\u003e,\u003cbirthday_year\u003e and clicks on cancel",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user should not see the contacts",
  "keyword": "Then "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "create-a-contact;user-clicks-on-cancel-after-filling-the-fields;",
  "rows": [
    {
      "cells": [
        "first name",
        "last name",
        "email",
        "birthday_day",
        "birthday_month",
        "birthday_year"
      ],
      "line": 41,
      "id": "create-a-contact;user-clicks-on-cancel-after-filling-the-fields;;1"
    },
    {
      "cells": [
        "Ram",
        "Sai",
        "saimanoj@gmail.com",
        "1",
        "March",
        "2020"
      ],
      "line": 42,
      "id": "create-a-contact;user-clicks-on-cancel-after-filling-the-fields;;2"
    },
    {
      "cells": [
        "Mounika",
        "Mummidi",
        "saimanoj@gmail.com",
        "e",
        "March",
        "1929278326"
      ],
      "line": 43,
      "id": "create-a-contact;user-clicks-on-cancel-after-filling-the-fields;;3"
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 44,
      "id": "create-a-contact;user-clicks-on-cancel-after-filling-the-fields;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 2101438200,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_enters_username_and_password_in_the_fields()"
});
formatter.result({
  "duration": 1389386100,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1072581100,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "User clicks on cancel after filling the fields",
  "description": "",
  "id": "create-a-contact;user-clicks-on-cancel-after-filling-the-fields;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@create"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "user gives data Ram,Sai,saimanoj@gmail.com,1,March,2020 and clicks on cancel",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user should not see the contacts",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Ram",
      "offset": 16
    },
    {
      "val": "Sai",
      "offset": 20
    },
    {
      "val": "saimanoj@gmail.com",
      "offset": 24
    },
    {
      "val": "1",
      "offset": 43
    },
    {
      "val": "March",
      "offset": 45
    },
    {
      "val": "2020",
      "offset": 51
    }
  ],
  "location": "CreateContact.user_gives_data_first_name_last_name_email_birthday_day_birthday_month_birthday_year_and_clicks_on_cancel(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 8701453000,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_not_see_the_contacts()"
});
formatter.result({
  "duration": 1173108700,
  "status": "passed"
});
formatter.after({
  "duration": 79072700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 1836885600,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_enters_username_and_password_in_the_fields()"
});
formatter.result({
  "duration": 1211805000,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1121096100,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "User clicks on cancel after filling the fields",
  "description": "",
  "id": "create-a-contact;user-clicks-on-cancel-after-filling-the-fields;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@create"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "user gives data Mounika,Mummidi,saimanoj@gmail.com,e,March,1929278326 and clicks on cancel",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user should not see the contacts",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Mounika",
      "offset": 16
    },
    {
      "val": "Mummidi",
      "offset": 24
    },
    {
      "val": "saimanoj@gmail.com",
      "offset": 32
    },
    {
      "val": "e",
      "offset": 51
    },
    {
      "val": "March",
      "offset": 53
    },
    {
      "val": "1929278326",
      "offset": 59
    }
  ],
  "location": "CreateContact.user_gives_data_first_name_last_name_email_birthday_day_birthday_month_birthday_year_and_clicks_on_cancel(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 3475246900,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_not_see_the_contacts()"
});
formatter.result({
  "duration": 1179755300,
  "status": "passed"
});
formatter.after({
  "duration": 80292200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContact.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 1942853100,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_enters_username_and_password_in_the_fields()"
});
formatter.result({
  "duration": 2378912200,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1104876700,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "User clicks on cancel after filling the fields",
  "description": "",
  "id": "create-a-contact;user-clicks-on-cancel-after-filling-the-fields;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@create"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "user gives data ,,,,, and clicks on cancel",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user should not see the contacts",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 16
    },
    {
      "val": "",
      "offset": 17
    },
    {
      "val": "",
      "offset": 18
    },
    {
      "val": "",
      "offset": 19
    },
    {
      "val": "",
      "offset": 20
    },
    {
      "val": "",
      "offset": 21
    }
  ],
  "location": "CreateContact.user_gives_data_first_name_last_name_email_birthday_day_birthday_month_birthday_year_and_clicks_on_cancel(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 4747227600,
  "status": "passed"
});
formatter.match({
  "location": "CreateContact.user_should_not_see_the_contacts()"
});
formatter.result({
  "duration": 1118860100,
  "status": "passed"
});
formatter.after({
  "duration": 78477900,
  "status": "passed"
});
});