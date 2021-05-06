$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/EditContact.feature");
formatter.feature({
  "line": 1,
  "name": "Edit a contact",
  "description": "Description: This feature will test editing a contact functionality",
  "id": "edit-a-contact",
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
  "name": "user goes to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login",
  "keyword": "Then "
});
formatter.match({
  "location": "EditContact.user_goes_to_the_login_page()"
});
formatter.result({
  "duration": 3253795000,
  "status": "passed"
});
formatter.match({
  "location": "EditContact.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1247486501,
  "status": "passed"
});
formatter.match({
  "location": "EditContact.user_should_login()"
});
formatter.result({
  "duration": 1171292900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User edits the required fields",
  "description": "",
  "id": "edit-a-contact;user-edits-the-required-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@edit"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user edits required fields and clicks on save",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user should see an edited contact",
  "keyword": "Then "
});
formatter.match({
  "location": "EditContact.user_edits_required_fields_and_clicks_on_save()"
});
formatter.result({
  "duration": 10189433700,
  "status": "passed"
});
formatter.match({
  "location": "EditContact.user_should_see_an_edited_contact()"
});
formatter.result({
  "duration": 712285201,
  "status": "passed"
});
formatter.after({
  "duration": 113400,
  "status": "passed"
});
formatter.after({
  "duration": 49100,
  "status": "passed"
});
formatter.after({
  "duration": 20901,
  "status": "passed"
});
formatter.after({
  "duration": 63400,
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
  "name": "user goes to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login",
  "keyword": "Then "
});
formatter.match({
  "location": "EditContact.user_goes_to_the_login_page()"
});
formatter.result({
  "duration": 1978603699,
  "status": "passed"
});
formatter.match({
  "location": "EditContact.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1889106301,
  "status": "passed"
});
formatter.match({
  "location": "EditContact.user_should_login()"
});
formatter.result({
  "duration": 1507751700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User edits non required fields",
  "description": "",
  "id": "edit-a-contact;user-edits-non-required-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@edit"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user edits non required fields and clicks on save",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user should view an edited contact",
  "keyword": "Then "
});
formatter.match({
  "location": "EditContact.user_edits_non_required_fields_and_clicks_on_save()"
});
formatter.result({
  "duration": 12325791701,
  "status": "passed"
});
formatter.match({
  "location": "EditContact.user_should_view_an_edited_contact()"
});
formatter.result({
  "duration": 683827900,
  "status": "passed"
});
formatter.after({
  "duration": 65400,
  "status": "passed"
});
formatter.after({
  "duration": 72300,
  "status": "passed"
});
formatter.after({
  "duration": 37100,
  "status": "passed"
});
formatter.after({
  "duration": 51001,
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
  "name": "user goes to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login",
  "keyword": "Then "
});
formatter.match({
  "location": "EditContact.user_goes_to_the_login_page()"
});
formatter.result({
  "duration": 2047295600,
  "status": "passed"
});
formatter.match({
  "location": "EditContact.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1122316000,
  "status": "passed"
});
formatter.match({
  "location": "EditContact.user_should_login()"
});
formatter.result({
  "duration": 1219003399,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User does not edit any fields",
  "description": "",
  "id": "edit-a-contact;user-does-not-edit-any-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@edit"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user does not edit any field and clicks on save",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user should view an non edited contact",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user does not edit any field and clicks on cancel",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user should see an non edited contact",
  "keyword": "Then "
});
formatter.match({
  "location": "EditContact.user_does_not_edit_any_field_and_clicks_on_save()"
});
formatter.result({
  "duration": 9034479500,
  "status": "passed"
});
formatter.match({
  "location": "EditContact.user_should_view_an_non_edited_contact()"
});
formatter.result({
  "duration": 614143600,
  "status": "passed"
});
formatter.match({
  "location": "EditContact.user_does_not_edit_any_field_and_clicks_on_cancel()"
});
formatter.result({
  "duration": 7951113400,
  "status": "passed"
});
formatter.match({
  "location": "EditContact.user_should_see_an_non_edited_contact()"
});
formatter.result({
  "duration": 116524600,
  "status": "passed"
});
formatter.after({
  "duration": 33700,
  "status": "passed"
});
formatter.after({
  "duration": 14700,
  "status": "passed"
});
formatter.after({
  "duration": 10699,
  "status": "passed"
});
formatter.after({
  "duration": 14000,
  "status": "passed"
});
});