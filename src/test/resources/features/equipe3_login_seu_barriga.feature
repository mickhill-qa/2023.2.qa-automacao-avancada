Feature: Team 3 - Heroku Login

  Background: The user is already registered on the system and will try to login

  Scenario: 001 - Login (Positive)
    Given the login page is loaded
    When the user inserts valid credentials and clicks on the login button
    Then the system will redirect you to the home page

  Scenario Outline: 002/003 - Login (Invalid) - Fields are Required
    Given the login page is loaded
    When the user inserts an invalid "<username>" and "<password>" and clicks on the login button
    Then the system a message that says all the fields are required
    Examples:
      | username  | password |
      |                     |    12345       |
      | itlins@yopmail.com  |                |

  Scenario Outline: 004/005/006 - Login (Invalid) Invalid credentials
    Given the login page is loaded
    When the user inserts an invalid "<username>" and~or "<password>" and clicks on the login button
    Then the system shows the error message
    Examples:
      | username  | password |
      | TomSmith  | SuperSecretPassword! |
      | tomsmith  |     invalidpassword  |
      | TomSmith  |     invalidpassword  |