@invoice_details
@resetBrowser
Feature: Invoice details

  Scenario: Validate invoice details
    Given Have a successful login with the credentials provided
    And Page Invoice List is shown
    When Click the Invoice Details link for the first item presented in the screen
    Then The application opens the Invoice Details screen
    Then Validate the information presented




