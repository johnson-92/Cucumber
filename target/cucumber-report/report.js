$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/PRATHEEP A/eclipse-workspace/Testing1/features/Add.feature");
formatter.feature({
  "name": "To test add traffic plan",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To check the customer tariff plan",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user should be telecom homepage and click the add tariff plan",
  "keyword": "Given "
});
formatter.step({
  "name": "User should fill the required info and click submit \"\u003cRental\u003e\",\"\u003cLocMin\u003e\",\"\u003cInterMin\u003e\",\"\u003cSmsPack\u003e\",\"\u003cMinCharge\u003e\",\"\u003cInterCharge\u003e\",\"\u003cSmsCharge\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Validate if the tariff is added or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Rental",
        "LocMin",
        "InterMin",
        "SmsPack",
        "MinCharge",
        "InterCharge",
        "SmsCharge"
      ]
    },
    {
      "cells": [
        "199",
        "50",
        "25",
        "200",
        "20",
        "30",
        "12"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To check the customer tariff plan",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user should be telecom homepage and click the add tariff plan",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_user_should_be_telecom_homepage_and_click_the_add_tariff_plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should fill the required info and click submit \"199\",\"50\",\"25\",\"200\",\"20\",\"30\",\"12\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_fill_the_required_info_and_click_submit(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate if the tariff is added or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.validate_if_the_tariff_is_added_or_not()"
});
formatter.result({
  "status": "skipped"
});
});