$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/SecurityContact.feature");
formatter.feature({
  "line": 1,
  "name": "security of contacts",
  "description": "Description: This feature will test security of contacts functionality",
  "id": "security-of-contacts",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "user tries to access a private contact",
  "description": "",
  "id": "security-of-contacts;user-tries-to-access-a-private-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@security"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "added user logs into the page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "added user ties to access a private contact",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be able to view/access/edit/delete the contact",
  "keyword": "Then "
});
formatter.match({
  "location": "SecurityContact.added_user_logs_into_the_page()"
});
formatter.result({
  "duration": 3776470100,
  "status": "passed"
});
formatter.match({
  "location": "SecurityContact.added_user_ties_to_access_a_private_contact()"
});
formatter.result({
  "duration": 1238958500,
  "status": "passed"
});
formatter.match({
  "location": "SecurityContact.user_should_be_able_to_view_access_edit_delete_the_contact()"
});
formatter.result({
  "duration": 6886208100,
  "status": "passed"
});
formatter.after({
  "duration": 66200,
  "status": "passed"
});
formatter.after({
  "duration": 53900,
  "status": "passed"
});
formatter.after({
  "duration": 18800,
  "status": "passed"
});
formatter.after({
  "duration": 54100,
  "status": "passed"
});
formatter.after({
  "duration": 55100,
  "status": "passed"
});
formatter.after({
  "duration": 54200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "user tries to access a private contact",
  "description": "",
  "id": "security-of-contacts;user-tries-to-access-a-private-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@security"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "non added user logs into the page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "non added user ties to access a private contact",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user should not be able to view the contact",
  "keyword": "Then "
});
formatter.match({
  "location": "SecurityContact.non_added_user_logs_into_the_page()"
});
formatter.result({
  "duration": 4767199800,
  "status": "passed"
});
formatter.match({
  "location": "SecurityContact.non_added_user_ties_to_access_a_private_contact()"
});
formatter.result({
  "duration": 1199321500,
  "status": "passed"
});
formatter.match({
  "location": "SecurityContact.user_should_not_be_able_to_view_access_edit_delete_the_contact()"
});
formatter.result({
  "duration": 1274675400,
  "status": "passed"
});
formatter.after({
  "duration": 25100,
  "status": "passed"
});
formatter.after({
  "duration": 41800,
  "status": "passed"
});
formatter.after({
  "duration": 14200,
  "status": "passed"
});
formatter.after({
  "duration": 21100,
  "status": "passed"
});
formatter.after({
  "duration": 15400,
  "status": "passed"
});
formatter.after({
  "duration": 14300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "user tries to access a public contact",
  "description": "",
  "id": "security-of-contacts;user-tries-to-access-a-public-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@security"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user logs into the page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user ties to access a public contact",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "all user should be able to view/access/edit/delete the contact",
  "keyword": "Then "
});
formatter.match({
  "location": "SecurityContact.user_logs_into_the_page()"
});
formatter.result({
  "duration": 3253495400,
  "status": "passed"
});
formatter.match({
  "location": "SecurityContact.user_ties_to_access_a_public_contact()"
});
formatter.result({
  "duration": 1180535300,
  "status": "passed"
});
formatter.match({
  "location": "SecurityContact.all_user_should_be_able_to_view_access_edit_delete_the_contact()"
});
formatter.result({
  "duration": 6163243500,
  "status": "passed"
});
formatter.after({
  "duration": 32500,
  "status": "passed"
});
formatter.after({
  "duration": 13800,
  "status": "passed"
});
formatter.after({
  "duration": 11000,
  "status": "passed"
});
formatter.after({
  "duration": 18100,
  "status": "passed"
});
formatter.after({
  "duration": 21300,
  "status": "passed"
});
formatter.after({
  "duration": 18500,
  "status": "passed"
});
});