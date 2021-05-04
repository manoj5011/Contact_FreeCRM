$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/RecoverContact.feature");
formatter.feature({
  "line": 1,
  "name": "Recover contacts",
  "description": "Description: This feature will test recovering contacts functionality",
  "id": "recover-contacts",
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
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in login page of freeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see the home page of freeCRM",
  "keyword": "Then "
});
formatter.match({
  "location": "RecoveryContact.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 4151383000,
  "status": "passed"
});
formatter.match({
  "location": "RecoveryContact.user_enters_username_and_password_in_login_page_of_freeCRM()"
});
formatter.result({
  "duration": 2506610500,
  "status": "passed"
});
formatter.match({
  "location": "RecoveryContact.user_should_login_and_see_the_home_page_of_freeCRM()"
});
formatter.result({
  "duration": 1229656799,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "user tries to recover a contact",
  "description": "",
  "id": "recover-contacts;user-tries-to-recover-a-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@recover"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user tries to recover a contact from the bin",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "contact should be visible on dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "RecoveryContact.user_tries_to_recover_a_contact_from_the_bin()"
});
formatter.result({
  "duration": 12911008800,
  "status": "passed"
});
formatter.match({
  "location": "RecoveryContact.contact_should_be_visible_on_dashboard()"
});
formatter.result({
  "duration": 1179485600,
  "status": "passed"
});
formatter.after({
  "duration": 130900,
  "status": "passed"
});
formatter.after({
  "duration": 31699,
  "status": "passed"
});
formatter.after({
  "duration": 92699,
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
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in login page of freeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see the home page of freeCRM",
  "keyword": "Then "
});
formatter.match({
  "location": "RecoveryContact.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 2263977899,
  "status": "passed"
});
formatter.match({
  "location": "RecoveryContact.user_enters_username_and_password_in_login_page_of_freeCRM()"
});
formatter.result({
  "duration": 2726070001,
  "status": "passed"
});
formatter.match({
  "location": "RecoveryContact.user_should_login_and_see_the_home_page_of_freeCRM()"
});
formatter.result({
  "duration": 1815131401,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "user tries to recover multiple contacts",
  "description": "",
  "id": "recover-contacts;user-tries-to-recover-multiple-contacts",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@recover"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user tries to recover multiple contacts from the bin",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "contacts should be visible on dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "RecoveryContact.user_tries_to_recover_multiple_contacts_from_the_bin()"
});
formatter.result({
  "duration": 12881280700,
  "status": "passed"
});
formatter.match({
  "location": "RecoveryContact.contacts_should_be_visible_on_dashboard()"
});
formatter.result({
  "duration": 1163602200,
  "status": "passed"
});
formatter.after({
  "duration": 67400,
  "status": "passed"
});
formatter.after({
  "duration": 20900,
  "status": "passed"
});
formatter.after({
  "duration": 48900,
  "status": "passed"
});
});