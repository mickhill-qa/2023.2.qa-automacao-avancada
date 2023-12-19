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
    public void the_user_inserts_valid_credentials_and_clicks_on_the_login_button(String _username, String _password) {
        loginPage.preencherEmail(_username);
        loginPage.preencherSenha(_password);
        loginPage.botao_login();
        screenshot();
    }
    @Then("the system will redirect you to the home page")
    public void the_system_will_redirect_you_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
    }
}

