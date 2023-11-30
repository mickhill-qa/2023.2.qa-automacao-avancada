#language: en
Feature: Login Positive

  Scenario: Login Success
    Given for the user to access the login page
    When the user the fields with valid data
    And the user clicks on Login
    Then the page is logged in