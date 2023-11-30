package steps;
import io.cucumber.java.en.*;
import pages.AutomationExampleInvoiceListPage;
import pages.AutomationExampleLoginPage;

public class InvoiceDetailsSteps {
    AutomationExampleLoginPage loginPage = new AutomationExampleLoginPage();
    AutomationExampleInvoiceListPage invoiceListPage = new AutomationExampleInvoiceListPage();
    @Given("that the user is logged into the system and the user is on the Invoice List screen")
    public void that_the_user_is_logged_into_the_system_and_the_user_is_on_the_invoice_list_screen() {
        loginPage.abrir();
        loginPage.fillUsernameAndPasswordFields("demouser", "abc123");
        loginPage.clickButton();
    }
    @When("the user clicks on the first invoice details link displayed on the screen")
    public void the_user_clicks_on_the_first_invoice_details_link_displayed_on_the_screen() {
        invoiceListPage.clickFirstInvoiceLink();
    }
    @Then("the user should be redirected to the invoice details screen")
    public void the_user_should_be_redirected_to_the_invoice_details_screen() {
        invoiceListPage.switchWindow();
    }
    @Then("the system should match the data provided in the table.")
    public void the_system_should_match_the_data_provided_in_the_table() {
    }
}
