#language: en
Feature: Login
  Background:
    Given that the user is on the login page

  Scenario: TC001 - Success Login
    When the user fills in the fields username and password with valid data
    And click the login button
    Then application should redirect the user to the Page Invoice List

  Scenario Outline: TC002 - Unsuccessful login attempt
    When the user fills in the fields username "<username>" and password "<password>" with invalid data
    And click the login button
    Then the application shows the message: "Wrong username or password."
    Examples:
      | username  | password |
      | Demouser  | abc123   |
      | demouser_ | xyz      |
      | demouser  | nananana |