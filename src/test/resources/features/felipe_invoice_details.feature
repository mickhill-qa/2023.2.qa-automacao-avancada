#language: en
  Feature: Invoice Details
    @resetBrowser
    Scenario: TC003 - Validate invoice details
      Given that the user is logged into the system and the user is on the Invoice List screen
      When the user clicks on the first invoice details link displayed on the screen
      Then the user should be redirected to the invoice details screen
      And the system should match the data provided in the table.