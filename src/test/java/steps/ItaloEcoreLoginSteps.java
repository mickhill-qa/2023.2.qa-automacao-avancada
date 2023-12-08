package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.ItaloEcoreInvoiceListPage;
import pages.ItaloEcoreLoginPage;
import runner.base_class.BaseSteps;

public class ItaloEcoreLoginSteps extends BaseSteps {

    /**
     * Paginas
     * */
    ItaloEcoreLoginPage pageLogin = new ItaloEcoreLoginPage();
    ItaloEcoreInvoiceListPage pageListaFatura = new ItaloEcoreInvoiceListPage();

    /**
     * Steps
     * */
    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        pageLogin.abrir();
        screenshot();
    }

    @Quando("o usuario preencher as credenciais {string} e {string}")
    public void o_usuario_preencher_as_credenciais(String _username, String _password) {
        pageLogin.preencherUsername(_username);
        pageLogin.preencherPassword(_password);
        pageLogin.clicarBtnLogin();
    }

    @Entao("o sistema encaminha para a lista de faturas")
    public void o_sistema_encaminha_para_a_lista_de_faturas() {
        Assert.assertTrue(pageListaFatura.estouAqui());
        screenshot();
    }

    @Entao("o sistema exibe a mensagem de erro: {string}")
    public void oSistemaMostraAMensagemDeErro(String _msgError) {
        String msgNaTela = pageLogin.pegarMensagemDeErro();
        Assert.assertEquals(_msgError, msgNaTela);
    }

}