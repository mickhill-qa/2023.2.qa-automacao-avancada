package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.InvoicePage;
import pages.LoginPage;
import runner.base_class.BaseSteps;

public class InvoiceDetailsSteps extends BaseSteps {

    InvoicePage invoicePage = new InvoicePage();
    LoginPage loginPage = new LoginPage();

    @Given("Have a successful login with the credentials provided")
    public void have_a_successful_login_with_the_credentials_provided() {
        loginPage.open("https://automation-sandbox-python-mpywqjbdza-uc.a.run.app");
        loginPage.fillTheFields("demouser", "abc123");
    }
    @Given("Page Invoice List is shown")
    public void page_invoice_list_is_shown() {
        Assert.assertEquals("Invoice List", invoicePage.validateTheInvoiceListPage());

    }
    @When("Click the Invoice Details link for the first item presented in the screen.")
    public void click_the_invoice_details_link_for_the_first_item_presented_in_the_screen() {
        invoicePage.clickBtnInvoiceDetails();
    }

    @Then("Validate the information presented")
    public void validate_the_information_presented() {


    }
}
