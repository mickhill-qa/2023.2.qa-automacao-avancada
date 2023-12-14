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
        pageHeroLogin.validaMsg().contains( "You logged into a secure area!");

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

//    @Dado("que o usuario realizou o login com sucesso")
//    public void que_o_usuario_realizou_o_login_com_sucesso() {
//
//    }

    @Dado("que o usuario nao esta logado")
    public void que_o_usuario_nao_esta_logado() {
        pageHeroLogin.UserLogin("");
        pageHeroLogin.PassLogin("");
    }

    @Quando("o usuario tentar acessar o sistema pela url da area segura")
    public void o_usuario_tentar_acessar_o_sistema_pela_url_da_area_segura() {

    }

    @Entao("o sistema deve redirecionar o usuario para a pagina de login")
    public void o_sistema_deve_redirecionar_o_usuario_para_a_pagina_de_login() {

    }
    @E("o sistema deve exibir a mensagem {string}")
    public void o_sistema_deve_exibir_a_mensagem(String string) {

    }
}

