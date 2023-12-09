@invoice_details
@resetBrowser
Feature: Invoice details

  Scenario: Validate invoice details
    Given Have a successful login with the credentials provided
    And Page Invoice List is shown
    When Click the Invoice Details link for the first item presented in the screen
    Then The application opens the Invoice Details screen
    And validate the hotel name information
    And validate the Invoice Date information
    And validate the Due Date information
    And validate the Invoice Number information
    And validate the Booking Code information
    And validate the Customer Details information
    And validate the Room information
    And validate the Check In information
    And validate the Check Out information
    And validate the Total Stay Count information
    And validate the Total Stay Amount information
    And validate the Deposit Now information
    And validate the Tax Vat information
    And validate the Total Amount information



