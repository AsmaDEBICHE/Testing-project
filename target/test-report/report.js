$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Authentication",
  "description": "",
  "id": "authentication",
  "keyword": "Feature"
});
formatter.before({
  "duration": 135000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "with correct username and wrong password",
  "description": "",
  "id": "authentication;with-correct-username-and-wrong-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I visit the-internet.herokuapp.com/login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter user in the user name correct",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter user in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I press the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the Your username is invalid!",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.i_visit_httptheinternetherokuappcomlogin()"
});
formatter.result({
  "duration": 10345714800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinitions.i_enter_user_in_the_user_name_correct()"
});
formatter.result({
  "duration": 1422058000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinitions.i_enter_user_in_the_password_field()"
});
formatter.result({
  "duration": 108272000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinitions.i_press_the_login_button()"
});
formatter.result({
  "duration": 532776900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinitions.i_should_see_the_your_username_is_invalid()"
});
formatter.result({
  "duration": 15220600,
  "status": "passed"
});
});