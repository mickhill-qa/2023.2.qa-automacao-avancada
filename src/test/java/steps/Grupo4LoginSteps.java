package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.Grupo4HerokuappLoginPage;
import pages.Grupo4HerokuappSecureAreaPage;
import runner.base_class.BaseSteps;

public class Grupo4LoginSteps extends BaseSteps {

    Grupo4HerokuappLoginPage loginPage = new Grupo4HerokuappLoginPage();
    Grupo4HerokuappSecureAreaPage homePage = new Grupo4HerokuappSecureAreaPage();

    //Cenario 1
    @Dado ("que o usuario esteja na pagina de autenticacao")
    public void que_o_usuario_esteja_na_pagina_de_autenticacao() {
        loginPage.abreNavegador();
        screenshot();
    }
    @Quando("o usuario preencher os campos de com as credencias: {string} e {string}")
    public void o_usuario_preencher_os_campos_de_com_as_credencias_e(String user, String password) {
        loginPage.preencheUsername(user);
        loginPage.preenchePassword(password);
        screenshot();
    }
    @E("o usuario clique no botao login")
    public void o_usuario_clique_no_botão_login() {
        loginPage.clicaLogin();
    }

    @Entao("o usuario deve ser redirecionado para a pagina Secure Area")
    public void o_usuario_deve_ser_redirecionado_para_a_pagina_secure_area() {
        Assert.assertEquals(homePage.pegarUrl(), "https://the-internet.herokuapp.com/secure");
    }
    @E("o sistema deve exibir a mensagem {string}")
    public void o_sistema_deve_exibir_a_mensagem(String msg) {
        Assert.assertTrue(homePage.pegaMensagem().contains(msg));
        screenshot();
    }

    //Cenario 2
    @Entao("o usuario nao deve ser redirecionado para a pagina Secure Area")
    public void o_usuario_nao_deve_ser_redirecionado_para_a_pagina_secure_area() {
        Assert.assertEquals(loginPage.pegarUrl(), "https://the-internet.herokuapp.com/login");
    }

    @E("o sistema deve exibir a mensagem de erro {string}")
    public void o_sistema_deve_exibir_a_mensagem_de_erro(String msg) {
        Assert.assertTrue(loginPage.validaErroLogin().contains(msg));
        screenshot();
    }

    //Cenario 3
    //Utiliza todos os Steps do cenários 1 e 2

    //Cenario 4
    //Utiliza todos os Steps do cenário 1 e 2

    //Cenario 5
    //Utiliza todos os steps do cenário 1 e 2
}
