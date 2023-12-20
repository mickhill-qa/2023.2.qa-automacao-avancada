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
        screenshot();
    }
    @When("the user leaves either {string} and-or {string} empty and tries to login")
    public void the_user_leaves_either_and_or_empty_and_tries_to_login(String email, String senha) {
        loginPage.fillUsername(email);
        loginPage.fillPassword(senha);
        loginPage.botao_login();
        screenshot();
    }
    @When("the user inserts an invalid {string} and~or {string} and clicks on")
    public void the_user_inserts_an_invalid_and_or_and_clicks_on(String email, String senha) {
        loginPage.fillUsername(email);
        loginPage.fillPassword(senha);
        loginPage.botao_login();
        screenshot();
    }
    @Then("the system will redirect you to the home page")
    public void the_system_will_redirect_you_to_the_home_page() {
        Assert.assertTrue(loginPage.verificação_login_sucess());
        screenshot();
    }
    @Then("the system shows a {string} that says the fields that are mandatory")
    public void the_system_brings_a_that_says_the_fields_that_are_mandatory(String mensagem) {
        Assert.assertTrue(loginPage.email_senha_obrigatorio(mensagem));
        screenshot();
    }
    @Then("the system shows a message informing the error")
    public void the_system_shows_a_message_informing_the_error() {
        Assert.assertTrue(loginPage.no_sucess());
        screenshot();
    }
}