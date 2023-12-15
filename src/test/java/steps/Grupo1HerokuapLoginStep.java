package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.Grupo1HerokuappLoginPage;
import runner.base_class.BaseSteps;

public class Grupo1HerokuapLoginStep extends BaseSteps {

    Grupo1HerokuappLoginPage pageHeroLogin = new Grupo1HerokuappLoginPage();

    @Dado("que o usuario esta na Pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        pageHeroLogin.abrir();
        pageHeroLogin.validaPage();
        screenshot();
    }

    @Quando("o usuario preencher o Username {string}")
    public void o_usuario_preencher_o_username(String username) {

        pageHeroLogin.UserLogin(username);
    }

    @E("o usuário preencher password com {string}")
    public void o_usuário_preencher_password_com(String password) {
        pageHeroLogin.PassLogin(password);
        pageHeroLogin.clickBtnLogin();
        screenshot();

    }

    @Entao("o sistema apresenta a mensagem {string}")
    public void o_sistema_apresenta_a_mensagem(String validamsg) {
        Assert.assertTrue(pageHeroLogin.validaMsg().contains(validamsg));
        screenshot();
    }

    @Quando("o usuario nao preencher o Username")
    public void o_Usuario_Nao_Preencher_OU_sername() {
        pageHeroLogin.UserLogin("");
    }

    @Quando("o usuario nao preencher o password")
    public void o_usuario_nao_preencher_o_password() {
        pageHeroLogin.PassLogin("");
        pageHeroLogin.clickBtnLogin();
    }

    @Dado("que o usuario nao esta logado")
    public void que_o_usuario_nao_esta_logado() {
        pageHeroLogin.UserLogin("");
        pageHeroLogin.PassLogin("");
    }

}

