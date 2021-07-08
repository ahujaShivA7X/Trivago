$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Trivago.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "Navigate to a Weekend Trivago and View deals",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Buy an article successfully",
  "description": "",
  "id": "login;buy-an-article-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Go to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the name of the destination",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on View Deal",
  "keyword": "Then "
});
formatter.match({
  "location": "Weekend.go_to_the_website()"
});
formatter.result({
  "duration": 6117442400,
  "status": "passed"
});
formatter.match({
  "location": "Weekend.enter_the_name_of_the_destination()"
});
formatter.result({
  "duration": 3328595700,
  "status": "passed"
});
formatter.match({
  "location": "Weekend.click_on_View_Deal()"
});
formatter.result({
  "duration": 2396401700,
  "status": "passed"
});
});