package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import pages.SeuBarrigaLoginPage;
import runner.base_class.BaseSteps;



public class LoginSucessoSteps extends BaseSteps {

    SeuBarrigaLoginPage pageLogin = new SeuBarrigaLoginPage();

    @Dado("que o usuario acessa a pagina de login")
    public void que_o_usuario_acessa_a_pagina_de_login() {
        pageLogin.open();
        screenshot();
    }

    @Quando("o usuario preenche os campos com dados")
    public void o_usuario_preenche_os_campos_com_dados() {


        String email = "herlon@teste";
        String senha = "pwd123";


        scenario.log("email: " + email);
        scenario.log("senha: " + senha);


        pageLogin.preEmail(email);
        pageLogin.preSenha(senha);
        screenshot();

    }

    @Quando("o usuario clica em Entrar")
    public void o_usuario_clica_em_cadastrar() { pageLogin.clicarLogin(); }

    @Então("a pagina informa a mensagem {string}")
    public void a_pagina_informa_a_mensagem(String _mensagem) {
        String mensagemTela = pageLogin.pegarNotificacao();
        Assert.assertEquals(_mensagem, mensagemTela);
        screenshot();
    }
}
