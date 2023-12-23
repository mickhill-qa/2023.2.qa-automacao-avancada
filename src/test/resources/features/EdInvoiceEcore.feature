@resetBrowser
Feature: Ed - Invoice Ecore
  Scenario: Validate Invoice Details
    Given the login page is loaded
    When the user inserts valid credentials ("demouser" and "abc123")  and clicks on the login button
    Then the system will redirect the user to the invoice list
    When the invoice details link is clicked
    And the system shows the invoice details on another tab
    And the invoice details list shows the Hotel Name field as "Rendezvous Hotel"
    And the invoice details list shows the invoice date as "14/01/2018"
    And the invoice details list shows the due date as "15/01/2018"
    And the invoice details is shown as "Invoice #110 details"
    And the booking code matches "0875"
    And the customer details are displayed as "JOHNY SMITH"
    And the room is displayed as "Superior Double"
    And the check in date is shown as "14/01/2018"
    And the check out date is shown as "15/01/2018"
    And the total stay count matches "1"
    And the total stay amount matches "$150"
    And the required deposit is "USD $20.90"
    And the tax is "USD $19"
    And the total amount is "USD $209"