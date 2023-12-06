package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.LucasNorteEcoreLoginPage;
import runner.base_class.BaseSteps;

public class LucasNorteEcoreLoginSteps extends BaseSteps {

    /**
     * Paginas
     * */
    LucasNorteEcoreLoginPage pageLogin = new LucasNorteEcoreLoginPage();

    /**
     * Steps
     * */
    @Dado("que o usuario esta na pagina de autenticacao")
    public void que_o_usuario_esta_na_pagina_de_autenticacao()
    {
        pageLogin.abrir();
        screenshot();
    }

    @Quando("o usuario prenecher as credenciais {string} e {string}")
    public void oUsuarioPrenecherAsCredenciaisE(String _username, String _password)
    {
        pageLogin.preencherUsername(_username);
        pageLogin.preencherPassword(_password);
        pageLogin.clicarBtnLogin();
    }

    @Entao("o sistema redireciona para a lista de faturas")
    public void o_sistema_redireciona_para_a_lista_de_faturas()
    {

    }

    @Entao("o sistema mostra a mensagem de erro: {string}")
    public void oSistemaMostraAMensagemDeErro(String _msgError)
    {
        String msgNaTela = pageLogin.pegarMensagemDeErro();
        Assert.assertEquals(_msgError, msgNaTela);
    }

}
