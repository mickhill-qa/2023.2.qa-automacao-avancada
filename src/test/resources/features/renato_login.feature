#language: en
@resetBrowser
Feature: Login


  Scenario: Validate successful authentication with provided credentials (Positive)
    Given the main page is loaded (https://automation-sandbox-python-mpywqjbdza-uc.a.run.app)
    When I fill the required fields and click the Login button
    Then the application should redirect the user to the Invoice List page.

  Scenario Outline: Validate application denial for user login with invalid credentials (Negative)
    Given the main page is loaded (https://automation-sandbox-python-mpywqjbdza-uc.a.run.app)
    When I fill the following fields <email> and <password> and click the Login button
    Then the application should display the message "Wrong username or password."

    Examples:
      | email       | password   |
      | "Demouser"  | "abc123"   |
      | "demouser_" | "xyz"      |
      | "demouser"  | "nananana" |

