$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Calculator.feature");
formatter.feature({
  "name": "This feature would be calculating Addition and Subtraction of two numbers",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "This scenario is to add the list of numbers",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "name": "I add the numbers \u003cnum1\u003e and \u003cnum2\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I should get the result as \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "num1",
        "num2",
        "result"
      ]
    },
    {
      "cells": [
        "2",
        "3",
        "5"
      ]
    },
    {
      "cells": [
        "7",
        "9",
        "16"
      ]
    }
  ]
});
formatter.scenario({
  "name": "This scenario is to add the list of numbers",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CalcStepDefs.i_have_a_calculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the numbers 2 and 3",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CalcStepDefs.i_add_the_numbers_and(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the result as 5",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CalcStepDefs.i_should_get_the_result_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to add the list of numbers",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CalcStepDefs.i_have_a_calculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add the numbers 7 and 9",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CalcStepDefs.i_add_the_numbers_and(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the result as 16",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CalcStepDefs.i_should_get_the_result_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});