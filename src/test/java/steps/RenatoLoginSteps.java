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

    @Given("Have the main page loaded \\(https:\\/\\/automation-sandbox-python-mpywqjbdza-uc.a.run.app)")
    public void have_the_main_page_loaded_https_automation_sandbox_python_mpywqjbdza_uc_a_run_app() {
        renatoLoginPage.open("https://automation-sandbox-python-mpywqjbdza-uc.a.run.app");
    }
    @When("Fill the following fields and click the button Login")
    public void fill_the_following_fields_and_click_the_button_login() {
        renatoLoginPage.fillTheFields("demouser", "abc123");
    }
    @Then("The application should redirect the user to the page Invoice List.")
    public void the_application_should_redirect_the_user_to_the_page_invoice_list() {
        String msgScreen = renatoInvoicePage.validateTheInvoiceListPage();
        Assert.assertEquals("Invoice List", msgScreen);
        renatoInvoicePage.logout();
    }
    @When("Fill the following fields {string} and {string} and click the button Login")
    public void fill_the_following_fields_and_and_click_the_button_login(String email, String password) {
        renatoLoginPage.fillTheFields(email, password);
    }
    @Then("The application shows the {string}")
    public void the_application_shows_the(String string) {
        String msgError = renatoLoginPage.msgError();
        Assert.assertEquals("Wrong username or password.", msgError);
    }


}
