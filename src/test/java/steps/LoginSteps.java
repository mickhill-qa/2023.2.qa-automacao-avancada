package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.InvoicePage;
import pages.LoginPage;
import runner.base_class.BaseSteps;

public class LoginSteps extends BaseSteps {

    LoginPage loginPage = new LoginPage();
    InvoicePage invoicePage = new InvoicePage();

    @Given("Have the main page loaded \\(https:\\/\\/automation-sandbox-python-mpywqjbdza-uc.a.run.app)")
    public void have_the_main_page_loaded_https_automation_sandbox_python_mpywqjbdza_uc_a_run_app() {
        loginPage.open("https://automation-sandbox-python-mpywqjbdza-uc.a.run.app");
    }
    @When("Fill the following fields and click the button Login")
    public void fill_the_following_fields_and_click_the_button_login() {
        loginPage.fillTheFields("demouser", "abc123");
    }
    @Then("The application should redirect the user to the page Invoice List.")
    public void the_application_should_redirect_the_user_to_the_page_invoice_list() {
        String msgScreen = invoicePage.validateTheInvoiceListPage();
        Assert.assertEquals("Invoice List", msgScreen);
        invoicePage.logout();
    }

    @When("Fill the following fields {string} and {string} and click the button Login")
    public void fill_the_following_fields_and_and_click_the_button_login(String email, String password) {
        loginPage.fillTheFields(email, password);
    }

    @Then("The application shows the {string}")
    public void the_application_shows_the(String string) {
        String msgError = loginPage.msgError();
        Assert.assertEquals("Wrong username or password.", msgError);
    }
}
