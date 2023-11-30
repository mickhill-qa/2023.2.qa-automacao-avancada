#language: en

Feature: Login

  Scenario: Validate if the user can authenticate in the application with the credentials provided: Login (Positive)
    Given Have the main page loaded (https://automation-sandbox-python-mpywqjbdza-uc.a.run.app)
    When Fill the following fields and click the button Login
    Then The application should redirect the user to the page Invoice List.


  Scenario Outline: Validate that the application denies the user login with invalid credentials: Login (Negative)
    Given Have the main page loaded (https://automation-sandbox-python-mpywqjbdza-uc.a.run.app)
    When Fill the following fields <email> and <password> and click the button Login
    Then The application shows the <message>

    Examples:
      | email       | password   | message                      |
      | "Demouser"  | "abc123"   | "Wrong username or password." |
      | "demouser_" | "xyz"      | "Wrong username or password." |
      | "demouser"  | "nananana" | "Wrong username or password." |
      | "demouser"  | "abc123"   | "Wrong username or password." |







