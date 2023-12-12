package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.YohansEcoreInvoiceListPage;
import pages.YohansEcoreLoginPage;
import runner.base_class.BaseSteps;

public class YohansEcoreLoginSteps extends BaseSteps {
    YohansEcoreLoginPage loginPage = new YohansEcoreLoginPage();
    YohansEcoreInvoiceListPage invoiceListPage = new YohansEcoreInvoiceListPage();

    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        loginPage.openPage();
    }

    @Quando("o usuario preencher os campos com {string} e {string}")
    public void oUsuarioPreencherOsCamposComE(String username, String password) {
        loginPage.fillUsernameField(username);
        loginPage.fillPasswordField(password);
        loginPage.clickLoginButton();
    }

    @Entao("o sistema redireciona para a pagina de lista de faturas")
    public void o_sistema_redireciona_para_a_pagina_de_lista_de_faturas() {
        Assert.assertTrue(invoiceListPage.isInvoiceListPage());
        Assert.assertFalse(loginPage.isLoginPage());
    }

    @Entao("o sistema mostra a mensagem de erro {string}")
    public void oSistemaMostraAMensagemDeErro(String errorMessage) {
        if(loginPage.isLoginPage()){
            String pageErrorMessage = loginPage.getErrorMessage();
            Assert.assertEquals(pageErrorMessage, errorMessage);
        }
        Assert.assertFalse(loginPage.isLoginPage());
    }
}
