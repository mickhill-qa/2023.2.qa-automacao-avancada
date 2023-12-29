Feature: Team 3 - SeuBarriga Login

  Background: The user is already registered on the system and will try to login

  @c1
  Scenario: 001 - Login (Positive)
    Given the SeuBarriga login page is loaded
    When the user inserts valid credentials and clicks on the login button
    Then the system will redirect you to the home page

  @c2
  Scenario Outline: 002/003 - Login (Empty) - Fields are Required
    Given the SeuBarriga login page is loaded
    When the user leaves either "<username>" and-or "<password>" empty and tries to login
    Then the system shows a "<message>" that says the fields that are mandatory
    Examples:
      | username            | password       | message                      |
      |                     |    12345       | Email é um campo obrigatório |
      | itlins@yopmail.com  |                | Senha é um campo obrigatório |

  @c3
  Scenario Outline: 004/005/006 - Login (Invalid) Invalid credentials
    Given the SeuBarriga login page is loaded
    When the user inserts an invalid "<username>" and~or "<password>" and clicks on
    Then the system shows a message informing the error
    Examples:
      | username            | password          |
      | itlins@yopmail.com  | 123456!           |
      | itlins@yopmail.co   | 12345             |