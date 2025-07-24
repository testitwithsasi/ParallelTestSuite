@smoke
Feature: Smoke test example

  Scenario: Check login
    Given user is on login page
    When user enters valid credentials
    Then user is navigated to home page