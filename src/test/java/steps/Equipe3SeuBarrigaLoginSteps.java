package steps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Equipe3HackathonSeuBarrigaLoginPage;
import runner.base_class.BaseSteps;

public class Equipe3SeuBarrigaLoginSteps extends BaseSteps {

    Equipe3HackathonSeuBarrigaLoginPage loginPage = new Equipe3HackathonSeuBarrigaLoginPage();

    @Given("the SeuBarriga login page is loaded")
    public void the_seu_barriga_login_page_is_loaded() {
        loginPage.entrar();
        Assert.assertTrue(loginPage.verificarSeEstouNapagina());
        screenshot();
    }
    @When("the user inserts valid credentials and clicks on the login button")
    public void the_user_inserts_valid_credentials_and_clicks_on_the_login_button() {
        loginPage.fillUsername("itlins@yopmail.com");
        loginPage.fillPassword("12345");
        loginPage.botao_login();
    }
    @When("the user leaves either {string} and-or {string} empty and tries to login")
    public void the_user_leaves_either_and_or_empty_and_tries_to_login(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user inserts an invalid {string} and~or {string} and clicks on")
    public void the_user_inserts_an_invalid_and_or_and_clicks_on(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the system will redirect you to the home page")
    public void the_system_will_redirect_you_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the system shows a message informing the error")
    public void the_system_shows_a_message_informing_the_error() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}

