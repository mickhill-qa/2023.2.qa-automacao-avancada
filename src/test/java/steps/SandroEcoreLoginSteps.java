package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.SandroEcoreInvoiceListPage;
import pages.SandroEcoreLoginPage;
import runner.base_class.BaseSteps;

public class SandroEcoreLoginSteps extends BaseSteps {
    SandroEcoreLoginPage loginPage = new SandroEcoreLoginPage();
    SandroEcoreInvoiceListPage invoiceListPage = new SandroEcoreInvoiceListPage();

    @Dado("que o usuario esta na pagina de Login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        loginPage.abrir();
        screenshot();
    }

    @Quando("o usuario preenhcer os dados necessarios para o Login")
    public void o_usuario_preenhcer_os_dados_necessarios_para_o_login() {
        loginPage.preencherField("demouser", "abc123");
        screenshot();
        loginPage.clicarLogin();
    }

    @Entao("o sistema redireciona para {string}")
    public void o_sistema_redireciona_para(String url) {
        Assert.assertEquals(invoiceListPage.validaUrl(), url);
        screenshot();
    }

    @Quando("o usuario preenhcer o {string} e {string}")
    public void o_usuario_preenhcer_o_e(String username, String password) {
        loginPage.preencherField(username, password);
        screenshot();
        loginPage.clicarLogin();
    }

    @Entao("o sistema ira exibir a mensagem {string}")
    public void o_sistema_ira_exibir_a_mensagem(String message) {
        Assert.assertEquals(loginPage.validaMessageError(), message);
        screenshot();
    }
}
