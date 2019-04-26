$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/AdminAddPdt.feature");
formatter.feature({
  "name": "add the product to TestMeApp Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as Admin scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "url of TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "AdminLogin.url_of_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin enters the data",
  "keyword": "When "
});
formatter.match({
  "location": "AdminLogin.admin_enters_the_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminLogin.admin_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});