package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.JoaquimNetoInvoiceListEcorePage;
import pages.JoaquimNetoLoginEcorePage;
import runner.base_class.BaseSteps;

public class JoaquimNetoEcoreLoginSteps extends BaseSteps {

    JoaquimNetoLoginEcorePage  pageLogin = new JoaquimNetoLoginEcorePage();

    JoaquimNetoInvoiceListEcorePage paginaListaFatura = new JoaquimNetoInvoiceListEcorePage();

    @Dado("que o usuario esta na pagina de Login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        pageLogin.abrir();
    }

    @Quando("o usuario prenecher as credenciais de login")
    public void o_usuario_prenecher_as_credenciais_de_login() {
        pageLogin.preencherUsername("demouser");
        pageLogin.preencherPassword("abc123");
        pageLogin.clicarBtnLogin();
    }

    @Entao("o sistema redireciona para pagina lista de faturas")
    public void o_sistema_redireciona_para_pagina_lista_de_faturas() {
        Assert.assertTrue(paginaListaFatura.estouAqui());
    }

    @Quando("o usuario prenecher as credenciais {string} e {string}")
    public void o_usuario_prenecher_as_credenciais_e(String string, String string2) {
        pageLogin.preencherUsername(string);
        pageLogin.preencherPassword(string2);
        pageLogin.clicarBtnLogin();

    }

    @Entao("o sistema apresenta mensagem de erro: {string}")
    public void o_sistema_apresenta_mensagem_de_erro(String string) {
    }
}