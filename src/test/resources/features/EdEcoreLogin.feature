Feature: Ed - Ecore Login

  Background: The user is already registered on the system and will try to login

  Scenario: TC001 - Login (Positive)
    Given the login page is loaded
    When the user inserts valid credentials ("demouser" and "abc123")  and clicks on the login button
    Then the system will redirect the user to the invoice list

@resetBrowser
  Scenario Outline: TC002 - Login (Negative)

    Given the login page is loaded
    When the user inserts an invalid "<username>" or "<password>" and clicks on the login button
    Then the system shows the error message

    Examples:
      | username  | password |
      | Demouser  | abc123   |
      | demouser_ | xyz      |
      | demouser  | nananana |