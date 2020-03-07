$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/TestCase.feature");
formatter.feature({
  "line": 2,
  "name": "DemoWebShop Website",
  "description": "",
  "id": "demowebshop-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DemoWebShop"
    }
  ]
});
formatter.scenario({
  "line": 155,
  "name": "",
  "description": "",
  "id": "demowebshop-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 154,
      "name": "@TC19_Demo"
    }
  ]
});
formatter.step({
  "line": 156,
  "name": "launch the chrome8 browser",
  "keyword": "Given "
});
formatter.step({
  "line": 157,
  "name": "open the app page8",
  "keyword": "When "
});
formatter.step({
  "line": 158,
  "name": "subscribe to newsletter",
  "keyword": "Then "
});
formatter.step({
  "line": 159,
  "name": "user closes the chrome8 browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo_News_Letter_Definition.launch_The_Chrome8_Browser()"
});
formatter.result({
  "duration": 6725219678,
  "status": "passed"
});
formatter.match({
  "location": "Demo_News_Letter_Definition.open_The_App_Page8()"
});
formatter.result({
  "duration": 13240438139,
  "status": "passed"
});
formatter.match({
  "location": "Demo_News_Letter_Definition.subscribe_To_Newsletter()"
});
formatter.result({
  "duration": 6623952146,
  "status": "passed"
});
formatter.match({
  "location": "Demo_News_Letter_Definition.user_Closes_The_Chrome8_Browser()"
});
formatter.result({
  "duration": 2063962933,
  "status": "passed"
});
});