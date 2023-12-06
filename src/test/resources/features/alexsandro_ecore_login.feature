#language: en
Feature: Login Positive

  Scenario: Login Success
    Given for the user to access the login page
    When the user the fields with valid data
    And the user clicks on Login
    Then the page is logged in

  Scenario: Login Negative
    Given for the user to access the login page
    When the user the fields with invalid data
    And the user clicks on Login
    Then the system shows the error message: "Wrong username or password"