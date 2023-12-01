package steps;

import io.cucumber.java.pt.*;
import pages.MickHillLoginEcorePage;
import runner.base_class.BaseSteps;

public class MickHillEcoreLoginSteps extends BaseSteps
{
    /**
     * Paginas
     * */
    MickHillLoginEcorePage pageLogin = new MickHillLoginEcorePage();

    /**
     * Steps
     * */
    @Dado("que o usuario esta na pagina de autenticacao")
    public void que_o_usuario_esta_na_pagina_de_autenticacao()
    {
        pageLogin.abrir();
    }

    @Quando("o usuario prenecher as credenciais validas")
    public void o_usuario_prenecher_as_credenciais_validas()
    {
        pageLogin.preencherUsername("demouser");
        pageLogin.preencherPassword("abc123");
        pageLogin.clicarBtnLogin();
    }

    @Entao("o sistema redireciona para a lista de faturas")
    public void o_sistema_redireciona_para_a_lista_de_faturas() throws InterruptedException
    {
        Thread.sleep(4000);
    }
}
