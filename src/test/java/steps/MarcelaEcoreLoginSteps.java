package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.MarcelaInvoiceListEcorePage;
import pages.MarcelaLoginEcorePage;
import pages.MickHillInvoiceListEcorePage;
import pages.MickHillLoginEcorePage;
import runner.base_class.BaseSteps;

public class MarcelaEcoreLoginSteps extends BaseSteps {
    /**
     * Paginas
     */
    MarcelaLoginEcorePage pageLogin = new MarcelaLoginEcorePage();
    MarcelaInvoiceListEcorePage paginaListaFatura = new MarcelaInvoiceListEcorePage();

    /**
     * Steps
     */
    @Dado("que o usuario ta na pagina de autenticacao")
    public void que_o_usuario_ta_na_pagina_de_autenticacao() {
        pageLogin.abrir();
    }

    @Quando("o usuario preenche as credenciais validas")
    public void o_usuario_preenche_as_credenciais_validas() {
        pageLogin.preencherUsername("demouser");
        pageLogin.preencherPassword("abc123");
        pageLogin.clicarBtnLogin();
    }

    @Entao("o sistema redireciona o usuario para a lista de faturas")
    public void o_sistema_redireciona_o_usuario_para_a_lista_de_faturas() {
        Assert.assertTrue(paginaListaFatura.estouAqui());
    }

    @Quando("o usuario preenche os campos com credenciais invalidas")
    public void o_usuario_preenche_os_campos_com_credenciais_invalidas() {
        pageLogin.preencherUsername("Demouser");
        pageLogin.preencherPassword("abc123");
        pageLogin.clicarBtnLogin();
    }

    @Entao("o sistema apresenta uma mensagem de credenciais invalidas")
    public void o_sistema_apresenta_uma_mensagem_de_credenciais_invalidas() {
        boolean blnExibiuMensagemCredenciaisInvalidas = pageLogin.credenciaisInvalidas();
        Assert.assertTrue("Não exibiu mensagem de credenciais invalidas", blnExibiuMensagemCredenciaisInvalidas);
    }


}