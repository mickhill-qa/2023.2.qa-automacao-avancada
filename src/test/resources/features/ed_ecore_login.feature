Feature: Ed - Ecore Login

  Scenario: TC001 - Login (Positive)
    Given the login page is loaded
    When the user inserts valid credentials and clicks on the login button
    Then the system will redirect the user to the invoice list

Feature: Ed - Ecore invalid login credentials
  Scenario Outline: TC002 - Login (Negative)

    Given the login page is loaded
    When the user inserts an invalid "<username>" or "<password>" and clicks on the login button
    Then the system shows the error message

    Examples:
      | username  | password |
      | Demouser  | abc123   |
      | demouser_ | xyz      |
      | demouser  | nananana |
      | Demouser  | abc123   |