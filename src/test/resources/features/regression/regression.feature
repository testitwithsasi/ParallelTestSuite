@regression
Feature: Regression test example

  Scenario: Verify logout
    Given user is logged in
    When user logs out
    Then user is on login page after logout
