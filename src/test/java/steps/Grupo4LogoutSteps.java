package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.Grupo4HerokuappLoginPage;
import pages.Grupo4HerokuappSecureAreaPage;
import runner.base_class.BaseSteps;

public class Grupo4LogoutSteps extends BaseSteps {
    Grupo4HerokuappLoginPage loginpage = new Grupo4HerokuappLoginPage();
    Grupo4HerokuappSecureAreaPage securePage = new Grupo4HerokuappSecureAreaPage();

    @Quando("o usuario clicar no botão de logout")
    public void o_usuario_clicar_no_botão_de_logout() {
        securePage.clicarLogout();
        screenshot();
    }
    @Entao("o usuario deve ser redirecionado para a pagina de login")
    public void o_usuario_deve_ser_redirecionado_para_a_pagina_de_login() {
        Assert.assertEquals(loginpage.pegarUrl(),"https://the-internet.herokuapp.com/login");
        screenshot();
    }
    @Entao("o sistema deve exibir a mensagem {string}")
    public void o_sistema_deve_exibir_a_mensagem(String _msg) {
        Assert.assertEquals(securePage.pegaMensagem(), _msg);
        screenshot();
    }

    @Dado("que o usuario esteja na tela de autenticacao e nao efetue login no sistema")
    public void queOUsuarioEstejaNaTelaDeAutenticacaoENaoEfetueLoginNoSistema() {
        loginpage.abreNavegador();
        screenshot();
    }

    @Quando("o usuario acessar a url da secure area")
    public void oUsuarioAcessarAUrlDaSecureArea() {
        securePage.abreNavegador();
        screenshot();
    }
}
