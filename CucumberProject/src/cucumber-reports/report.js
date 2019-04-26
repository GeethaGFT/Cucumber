$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Invalid User Scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Invalid"
    }
  ]
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
  "name": "The URL of TestMe App",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_URL_of_TestMe_App()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the invalid data",
  "rows": [
    {
      "cells": [
        "aaa",
        "Password123"
      ]
    },
    {
      "cells": [
        "Lalitha",
        "yyy"
      ]
    },
    {
      "cells": [
        "123",
        "456"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_enters_the_invalid_data(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in loginpage",
  "rows": [
    {
      "cells": [
        "1"
      ]
    },
    {
      "cells": [
        "1"
      ]
    },
    {
      "cells": [
        "1"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_is_in_loginpage(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});