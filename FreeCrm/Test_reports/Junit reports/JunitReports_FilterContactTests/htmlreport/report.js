$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/FilterContact.feature");
formatter.feature({
  "line": 1,
  "name": "filter contacts",
  "description": "Description: This feature will test filtering contacts functionality",
  "id": "filter-contacts",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "User should be Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user directs to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in their respective fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_directs_to_the_login_page()"
});
formatter.result({
  "duration": 2653131600,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_enters_username_and_password_in_their_respective_fields()"
});
formatter.result({
  "duration": 1146620800,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_should_login_and_see_home_page()"
});
formatter.result({
  "duration": 1841078600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User filters the contacts with single valid filter",
  "description": "",
  "id": "filter-contacts;user-filters-the-contacts-with-single-valid-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@filter"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user filters a contact with valid condition",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the contacts which satisfy the condition should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_filters_a_contact_with_valid_condition()"
});
formatter.result({
  "duration": 981757300,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.the_contacts_which_satisfy_the_condition_should_be_displayed()"
});
formatter.result({
  "duration": 1166169000,
  "status": "passed"
});
formatter.after({
  "duration": 172000,
  "status": "passed"
});
formatter.after({
  "duration": 34400,
  "status": "passed"
});
formatter.after({
  "duration": 127200,
  "status": "passed"
});
formatter.after({
  "duration": 124900,
  "status": "passed"
});
formatter.after({
  "duration": 168200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should be Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user directs to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in their respective fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_directs_to_the_login_page()"
});
formatter.result({
  "duration": 1908177700,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_enters_username_and_password_in_their_respective_fields()"
});
formatter.result({
  "duration": 3190737400,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_should_login_and_see_home_page()"
});
formatter.result({
  "duration": 1165060700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User filters the contacts with single invalid filter",
  "description": "",
  "id": "filter-contacts;user-filters-the-contacts-with-single-invalid-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@filter"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user filters a contact with invalid condition",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "no contacts should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_filters_a_contact_with_invalid_condition()"
});
formatter.result({
  "duration": 850170000,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.no_contacts_should_be_displayed()"
});
formatter.result({
  "duration": 1067059100,
  "status": "passed"
});
formatter.after({
  "duration": 33400,
  "status": "passed"
});
formatter.after({
  "duration": 15100,
  "status": "passed"
});
formatter.after({
  "duration": 22100,
  "status": "passed"
});
formatter.after({
  "duration": 19800,
  "status": "passed"
});
formatter.after({
  "duration": 19300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should be Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user directs to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in their respective fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_directs_to_the_login_page()"
});
formatter.result({
  "duration": 1938974600,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_enters_username_and_password_in_their_respective_fields()"
});
formatter.result({
  "duration": 1226545700,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_should_login_and_see_home_page()"
});
formatter.result({
  "duration": 1197946100,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User filters the contacts with multiple valid filter",
  "description": "",
  "id": "filter-contacts;user-filters-the-contacts-with-multiple-valid-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@filter"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user filters a contact with valid conditions",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "the contacts which satisfy the conditions should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_filters_a_contact_with_valid_conditions()"
});
formatter.result({
  "duration": 1369082700,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.the_contacts_which_satisfy_the_conditions_should_be_displayed()"
});
formatter.result({
  "duration": 1067115200,
  "error_message": "java.lang.AssertionError: null\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.assertNotEquals(Assert.java:1157)\r\n\tat org.testng.Assert.assertNotEquals(Assert.java:1162)\r\n\tat StepDefinition.FilterContact.the_contacts_which_satisfy_the_conditions_should_be_displayed(FilterContact.java:147)\r\n\tat ✽.Then the contacts which satisfy the conditions should be displayed(src/test/resources/Feature/FilterContact.feature:22)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 104300,
  "status": "passed"
});
formatter.after({
  "duration": 11800,
  "status": "passed"
});
formatter.after({
  "duration": 24600,
  "status": "passed"
});
formatter.after({
  "duration": 31700,
  "status": "passed"
});
formatter.after({
  "duration": 22800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should be Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user directs to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in their respective fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_directs_to_the_login_page()"
});
formatter.result({
  "duration": 1947697100,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_enters_username_and_password_in_their_respective_fields()"
});
formatter.result({
  "duration": 1471155700,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_should_login_and_see_home_page()"
});
formatter.result({
  "duration": 1190386400,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User filters the contacts with multiple invalid filter",
  "description": "",
  "id": "filter-contacts;user-filters-the-contacts-with-multiple-invalid-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@filter"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user filters a contact with invalid conditions",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user should not see any contacts",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_filters_a_contact_with_invalid_conditions()"
});
formatter.result({
  "duration": 1427695100,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_should_not_see_any_contacts()"
});
formatter.result({
  "duration": 1073235600,
  "status": "passed"
});
formatter.after({
  "duration": 28300,
  "status": "passed"
});
formatter.after({
  "duration": 10300,
  "status": "passed"
});
formatter.after({
  "duration": 20900,
  "status": "passed"
});
formatter.after({
  "duration": 18500,
  "status": "passed"
});
formatter.after({
  "duration": 19100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should be Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user directs to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in their respective fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_directs_to_the_login_page()"
});
formatter.result({
  "duration": 2743615200,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_enters_username_and_password_in_their_respective_fields()"
});
formatter.result({
  "duration": 1521014100,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_should_login_and_see_home_page()"
});
formatter.result({
  "duration": 1174546000,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "user adds filter condition and clicks on clear filter",
  "description": "",
  "id": "filter-contacts;user-adds-filter-condition-and-clicks-on-clear-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@filter"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user tries to filter contacts with a condition and then clicks on clear filter",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "all the contacts should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_tries_to_filter_contacts_with_a_condition_and_then_clicks_on_clear_filter()"
});
formatter.result({
  "duration": 4075658600,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.all_the_contacts_should_be_displayed()"
});
formatter.result({
  "duration": 1084472000,
  "status": "passed"
});
formatter.after({
  "duration": 37300,
  "status": "passed"
});
formatter.after({
  "duration": 7000,
  "status": "passed"
});
formatter.after({
  "duration": 27100,
  "status": "passed"
});
formatter.after({
  "duration": 18100,
  "status": "passed"
});
formatter.after({
  "duration": 18000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should be Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user directs to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in their respective fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_directs_to_the_login_page()"
});
formatter.result({
  "duration": 2664543300,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_enters_username_and_password_in_their_respective_fields()"
});
formatter.result({
  "duration": 1284979900,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.user_should_login_and_see_home_page()"
});
formatter.result({
  "duration": 1716684800,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "user filters a contact and then clicks on actions",
  "description": "",
  "id": "filter-contacts;user-filters-a-contact-and-then-clicks-on-actions",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@filter"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "user filters contacts with valid condition and then delete it",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "contacts should be displayed in the bin",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterContact.user_filters_contacts_with_valid_condition_and_then_delete_it()"
});
formatter.result({
  "duration": 3573617100,
  "status": "passed"
});
formatter.match({
  "location": "FilterContact.contacts_should_be_displayed_in_the_bin()"
});
formatter.result({
  "duration": 2378430200,
  "status": "passed"
});
formatter.after({
  "duration": 52300,
  "status": "passed"
});
formatter.after({
  "duration": 18000,
  "status": "passed"
});
formatter.after({
  "duration": 33900,
  "status": "passed"
});
formatter.after({
  "duration": 41800,
  "status": "passed"
});
formatter.after({
  "duration": 43700,
  "status": "passed"
});
});