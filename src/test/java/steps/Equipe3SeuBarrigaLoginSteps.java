package steps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Equipe3HackathonSeuBarrigaLoginPage;
import runner.base_class.BaseSteps;

import static org.junit.Assert.assertTrue;

public class Equipe3SeuBarrigaLoginSteps extends BaseSteps {

    Equipe3HackathonSeuBarrigaLoginPage loginPage = new Equipe3HackathonSeuBarrigaLoginPage();

    @Given("the SeuBarriga login page is loaded")
    public void the_seu_barriga_login_page_is_loaded() {
        loginPage.entrar();
        assertTrue(loginPage.verificarSeEstouNapagina());
        screenshot();
    }

    @When("the user inserts valid credentials {string} and {string} and clicks on the login button")
    public void the_user_inserts_valid_credentials_and_clicks_on_the_login_button(String _username, String _password) {
        loginPage.fillUsername(_username);
        loginPage.fillPassword(_password);
        loginPage.botao_login();
        screenshot();
    }

    @Then("the system will redirect you to the home page")
    public void the_system_will_redirect_you_to_the_home_page() {
        assertTrue(loginPage.homePageIsLoaded());
        screenshot();
    }

    @When("the user leaves either {string} and-or {string} empty and tries to login")
    public void theUserLeavesEitherAndOrEmptyAndTriesToLogin(String _username, String _password) {
        loginPage.fillUsername(_username);
        loginPage.fillPassword(_password);
        loginPage.botao_login();
        screenshot();
    }

    @Then("the system a message that says all the fields are required")
    public void theSystemAMessageThatSaysAllTheFieldsAreRequired() {
        assertTrue(loginPage.homePageIsLoaded2());
        screenshot();
    }

    @When("the user inserts an invalid {string} and~or {string} and clicks on")
    public void theUserInsertsAnInvalidAndOrAndClicksOn(String _username, String _password) {
        loginPage.fillUsername(_username);
        loginPage.fillPassword(_password);
        loginPage.botao_login();
        screenshot();
    }

    @Then("the system shows a message informing the error")
    public void theSystemShowsAMessageInformingTheError() {
        assertTrue(loginPage.homePageIsLoaded2());
        screenshot();
    }
}

