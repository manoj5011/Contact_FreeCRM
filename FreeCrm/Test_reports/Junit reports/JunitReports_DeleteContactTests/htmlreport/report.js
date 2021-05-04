$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/DeleteContact.feature");
formatter.feature({
  "line": 1,
  "name": "Delete a contact",
  "description": "Description: This feature will test deleting a contact functionality",
  "id": "delete-a-contact",
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
  "name": "user goes to the login page of freeCRM",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see logout option",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteContact.user_goes_to_the_login_page_of_freeCRM()"
});
formatter.result({
  "duration": 2798451800,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.user_enters_username_and_password_in_the_login_page()"
});
formatter.result({
  "duration": 1222804400,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.user_should_login_and_see_logout_option()"
});
formatter.result({
  "duration": 1202917399,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User deletes a particular contact",
  "description": "",
  "id": "delete-a-contact;user-deletes-a-particular-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@delete"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user deletes a particular contact",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "contact should move to the bin",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteContact.user_deletes_a_particular_contact()"
});
formatter.result({
  "duration": 1528496501,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.contact_should_move_to_the_bin()"
});
formatter.result({
  "duration": 6937711699,
  "status": "passed"
});
formatter.after({
  "duration": 103400,
  "status": "passed"
});
formatter.after({
  "duration": 40400,
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
  "name": "user goes to the login page of freeCRM",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see logout option",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteContact.user_goes_to_the_login_page_of_freeCRM()"
});
formatter.result({
  "duration": 2594618401,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.user_enters_username_and_password_in_the_login_page()"
});
formatter.result({
  "duration": 1809448299,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.user_should_login_and_see_logout_option()"
});
formatter.result({
  "duration": 1216514701,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User deletes multiple contacts",
  "description": "",
  "id": "delete-a-contact;user-deletes-multiple-contacts",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@delete"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user selects multiple contacts and clicks on delete",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "contacts should move to the bin",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteContact.user_selects_multiple_contacts_and_clicks_on_delete()"
});
formatter.result({
  "duration": 6784302099,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.contacts_should_move_to_the_bin()"
});
formatter.result({
  "duration": 6431139400,
  "status": "passed"
});
formatter.after({
  "duration": 66399,
  "status": "passed"
});
formatter.after({
  "duration": 28600,
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
  "name": "user goes to the login page of freeCRM",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see logout option",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteContact.user_goes_to_the_login_page_of_freeCRM()"
});
formatter.result({
  "duration": 2009742900,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.user_enters_username_and_password_in_the_login_page()"
});
formatter.result({
  "duration": 1243905400,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.user_should_login_and_see_logout_option()"
});
formatter.result({
  "duration": 1155691100,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "user tries to delete a contact then clicks on cancel",
  "description": "",
  "id": "delete-a-contact;user-tries-to-delete-a-contact-then-clicks-on-cancel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@delete"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user selects to delete a contact and then click on cancel",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "contact should not move to the bin",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteContact.user_selects_to_delete_a_contact_and_then_click_on_cancel()"
});
formatter.result({
  "duration": 995230400,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.contact_should_not_move_to_the_bin()"
});
formatter.result({
  "duration": 6399872200,
  "status": "passed"
});
formatter.after({
  "duration": 55700,
  "status": "passed"
});
formatter.after({
  "duration": 26800,
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
  "name": "user goes to the login page of freeCRM",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should login and see logout option",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteContact.user_goes_to_the_login_page_of_freeCRM()"
});
formatter.result({
  "duration": 1882562500,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.user_enters_username_and_password_in_the_login_page()"
});
formatter.result({
  "duration": 1257138600,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.user_should_login_and_see_logout_option()"
});
formatter.result({
  "duration": 1162964500,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "user tries to delete multiple contact then clicks on cancel",
  "description": "",
  "id": "delete-a-contact;user-tries-to-delete-multiple-contact-then-clicks-on-cancel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@delete"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user selects multiple contacts to delete and then click on cancel",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "contacts should not move to the bin",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteContact.user_selects_multiple_contacts_to_delete_and_then_click_on_cancel()"
});
formatter.result({
  "duration": 6207406299,
  "status": "passed"
});
formatter.match({
  "location": "DeleteContact.contacts_should_not_move_to_the_bin()"
});
formatter.result({
  "duration": 6458763099,
  "status": "passed"
});
formatter.after({
  "duration": 60400,
  "status": "passed"
});
formatter.after({
  "duration": 26200,
  "status": "passed"
});
});