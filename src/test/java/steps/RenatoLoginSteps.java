package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RenatoInvoicePage;
import pages.RenatoLoginPage;
import runner.base_class.BaseSteps;

public class RenatoLoginSteps extends BaseSteps {
    RenatoLoginPage renatoLoginPage = new RenatoLoginPage();
    RenatoInvoicePage renatoInvoicePage = new RenatoInvoicePage();

    @Given("the main page is loaded \\(https:\\/\\/automation-sandbox-python-mpywqjbdza-uc.a.run.app)")
    public void the_main_page_is_loaded_https_automation_sandbox_python_mpywqjbdza_uc_a_run_app() {
        renatoLoginPage.open("https://automation-sandbox-python-mpywqjbdza-uc.a.run.app");
    }

    @When("I fill the required fields and click the Login button")
    public void i_fill_the_required_fields_and_click_the_login_button() {
        renatoLoginPage.fillTheFields("demouser", "abc123");
    }

    @Then("the application should redirect the user to the Invoice List page.")
    public void the_application_should_redirect_the_user_to_the_invoice_list_page() {
        String msgScreen = renatoInvoicePage.validateTheInvoiceListPage();
        Assert.assertEquals("Invoice List", msgScreen);
    }
    @When("I fill the following fields {string} and {string} and click the Login button")
    public void i_fill_the_following_fields_and_and_click_the_login_button(String email, String password) {
        renatoLoginPage.fillTheFields(email, password);
    }

    @Then("the application should display the message {string}")
    public void the_application_should_display_the_message(String text) {
        String msgError = renatoLoginPage.msgError();
        Assert.assertEquals(text, msgError);
    }
}
