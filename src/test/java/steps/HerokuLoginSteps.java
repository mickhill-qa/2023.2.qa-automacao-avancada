package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HerokuLoginPage;

import static org.junit.Assert.assertTrue;
import static runner.base_class.BaseSteps.screenshot;

public class HerokuLoginSteps {
    HerokuLoginPage loginPage = new HerokuLoginPage();

    @Given("the login page is loaded")
    public void the_login_page_is_loaded() {
        loginPage.getUrl();
        screenshot();
    }
    @When("the user inserts an invalid {string} and {string} and clicks on the login button")
    public void the_user_inserts_an_invalid_and_and_clicks_on_the_login_button(String _username, String _password) {
        loginPage.fillUsername(_username);
        loginPage.fillPassword(_password);
        loginPage.loginBtnClick();
        screenshot();
    }
    @Then("the system shows the error message")
    public void the_system_shows_the_error_message() {
        assertTrue(loginPage.errorMessageIsShown());
        screenshot();
    }

    @When("the user inserts valid credentials {string} and {string} and clicks on the login button")
    public void theUserInsertsValidCredentialsAndAndClicksOnTheLoginButton(String username, String password) {
        loginPage.fillUsername(username);
        loginPage.fillPassword(password);
        loginPage.loginBtnClick();
        screenshot();
    }

    @Then("the system will redirect you to a secure area")
    public void theSystemWillShowASuccessMessage() {
        assertTrue(loginPage.securePageIsLoaded());
        screenshot();
    }

    @Then("the system a message that says all the fields are required")
    public void theSystemAMessageThatSaysAllTheFieldsAreRequired() {
        assertTrue(loginPage.errorMessageRequiresAllFields());
        screenshot();
    }

    @When("the user inserts an invalid {string} and~or {string} and clicks on the login button")
    public void theUserInsertsAnInvalidAndOrAndClicksOnTheLoginButton(String username, String password) {
        loginPage.fillUsername(username);
        loginPage.fillPassword(password);
        loginPage.loginBtnClick();
        screenshot();
    }
}
