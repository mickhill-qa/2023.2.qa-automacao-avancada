Feature: Ed - Ecore Login

  Scenario: TC001 - Login (Positive)
    Given the login page is loaded
    When the user inserts valid credentials and clicks on the login button
    Then the system will redirect the user to the invoice list
