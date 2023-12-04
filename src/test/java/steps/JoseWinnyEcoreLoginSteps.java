package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.JoseWinnyEcoreInvoiceListPage;
import pages.JoseWinnyEcoreLoginPage;
import runner.base_class.BaseSteps;

public class JoseWinnyEcoreLoginSteps extends BaseSteps {
    JoseWinnyEcoreLoginPage loginPage = new JoseWinnyEcoreLoginPage();
    JoseWinnyEcoreInvoiceListPage invoiceListPage = new JoseWinnyEcoreInvoiceListPage();

    @Dado("que um usuario esta na pagina de autenticacao")
    public void que_um_usuario_esta_na_pagina_de_autenticacao(){
        loginPage.abrir();
    }

    @Quando("preenche as credenciais {string} e {string}")
    public void preenche_as_credenciais(String _username, String _password) {
        loginPage.preencherUsername(_username);
        loginPage.preencherPassword(_password);
        loginPage.clicarBtnLogin();
    }

    @Entao("o sistema redireciona para a Invoice List")
    public void o_sistema_redireciona_para_a_invoice_list() {
        invoiceListPage.validarMudancaDePagina();
    }

    @Entao("o sistema exibe a mensagem de erro: {string}")
    public void o_sistema_exibe_a_mensagem_de_erro(String _msgEsperada) {
        String msgEncontrada = loginPage.pegarMensagemDeErro();
        Assert.assertEquals(msgEncontrada,_msgEsperada);
    }
}
