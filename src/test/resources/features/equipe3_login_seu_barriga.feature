Feature: Team 3 - SeuBarriga Login

  Background: The user is already registered on the system and will try to login

  Scenario: 001 - Login (Positive)
    Given the SeuBarriga login page is loaded
    When the user inserts valid credentials "<itlins@yopmail.com>" and "<12345>" and clicks on the login button
    Then the system will redirect you to the home page

  Scenario Outline: 002/003 - Login (Empty) - Fields are Required
    Given the SeuBarriga login page is loaded
    When the user leaves either "<username>" and-or "<password>" empty and tries to login
    Then the system a message that says all the fields are required
    Examples:
      | username  | password |
      |                     |    12345       |
      | itlins@yopmail.com  |                |

  Scenario Outline: 004/005/006 - Login (Invalid) Invalid credentials
    Given the SeuBarriga login page is loaded
    When the user inserts an invalid "<username>" and~or "<password>" and clicks on
    Then the system shows a message informing the error
    Examples:
      | username  | password |
      | itlins@yopmail.com  | 123456! |
      | itlins@yopmail.co  |     12345  |