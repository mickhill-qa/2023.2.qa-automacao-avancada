package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.IngridInvoiceEcorePage;
import pages.IngridLoginEcorePage;
import runner.base_class.BaseSteps;

public class IngridEcoreLoginSteps extends BaseSteps {
    IngridLoginEcorePage loginPage = new IngridLoginEcorePage();
    IngridInvoiceEcorePage invoicePage = new IngridInvoiceEcorePage();

    @Dado("que o usuario esta na pagina de login")
    public void given_user_in_login_page(){
       loginPage.open();
       screenshot();
    }

    @Quando("o usuario insere {string} no campo de usuario")
    public void when_user_insert_on_username(String _username){
        loginPage.sendUsername(_username);
        screenshot();
    }

    @Quando("insere {string} no campo senha")
    public void when_user_insert_on_password(String _password){
        loginPage.sendPassword(_password);
        screenshot();
    }

    @Quando("o usuario clicar no botao LOGIN")
    public void when_user_clicks_on_login_button(){
        loginPage.clickBtnLogin();
    }

    @Entao("o sistema mostra uma lista de faturas")
    public void show_invoice_list_page(){
        Boolean isInvoiceListPage = invoicePage.isInvoiceListUrl();
        Assert.assertTrue(isInvoiceListPage);
    }

    @Entao("o sistema mostra uma mensagem de erro {string}")
    public void show_error_message(String _error){
        String message = loginPage.getErrorMessage();
        Assert.assertEquals(message, _error);
    }

}

