package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.EdInvoiceEcorePage;
import pages.EdLoginEcorePage;
import runner.base_class.BaseSteps;


public class EdEcoreLoginSteps extends BaseSteps {

    EdLoginEcorePage loginPage = new EdLoginEcorePage();
    EdInvoiceEcorePage invoiceListPage = new EdInvoiceEcorePage();

    @Given("the login page is loaded")
    public void the_login_page_is_loaded() {
        loginPage.open();
    }

    @When("the user inserts valid credentials \\({string} and {string})  and clicks on the login button")
    public void the_user_inserts_valid_credentials_and_and_clicks_on_the_login_button(String string, String string2) {
        loginPage.fillUsernameField(string);
        loginPage.fillPasswordField(string2);
        loginPage.LoginBtnClick();
    }
    @Then("the system will redirect the user to the invoice list")
    public void the_system_will_redirect_the_user_to_the_invoice_list() {
            Assert.assertTrue(invoiceListPage.ValidInvoiceListPage());
    }

    @When("the user inserts an invalid {string} or {string} and clicks on the login button")
    public void the_user_inserts_invalid_credentials(String username, String password) {
        loginPage.fillUsernameField(username);
        loginPage.fillPasswordField(password);
        loginPage.LoginBtnClick();
    }
    @Then("the system shows the error message")
    public void the_system_shows_the_error_message() {
        String actualErrorMessage = loginPage.getFailedLoginMessage();
        String expectedErrorMessage = "Wrong username or password.";
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
