package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import runner.base_class.BaseSteps;

public class Grupo1HerokuapLoginStep extends BaseSteps {
    @Dado("que o usuario esta na Pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {

    }

    @Quando("o usuario preencher o Username “tomsmith”")
    public void o_usuario_preencher_o_username_tomsmith() {

    }

    @Quando("o usuário preencher password com “SuperSecretPassword!”")
    public void o_usuário_preencher_password_com_super_secret_password() {

    }

    @Entao("o sistema apresenta a mensagem “You logged into a secure area!”")
    public void o_sistema_apresenta_a_mensagem_you_logged_into_a_secure_area() {
    }

    @Quando("o usuario não preencher o Username")
    public void o_Usuario_Não_Preencher_OU_sername() {
    }
    @Entao("o sistema apresenta a mensagem “Your username is required field!”")
    public void o_sistema_apresenta_a_mensagem_your_username_is_required_field() {

    }
    @Quando("o usuario preencher o Username “tomsmitherrado”")
    public void o_usuario_preencher_o_username_tomsmitherrado() {
    }
    @Entao("o sistema apresenta a mensagem “Your username and password is invalid!”")
    public void o_sistema_apresenta_a_mensagem_your_username_and_password_is_invalid() {
    }
    @Quando("o usuario não preencher o password")
    public void o_usuario_não_preencher_o_password() {
    }
    @Entao("o sistema apresenta a mensagem “Your password is required field!”")
    public void o_sistema_apresenta_a_mensagem_your_password_is_required_field() {
    }
    @Quando("o usuário preencher password com “SuperSecretPassworderrado!”")
    public void o_usuário_preencher_password_com_super_secret_passworderrado() {
   }

    @Entao("o sistema apresenta a mensagem “Your username and password is required field!”")
    public void o_sistema_apresenta_a_mensagem_your_username_and_password_is_required_field() {
    }
    @Dado("que o usuario realizou o login com sucesso")
    public void que_o_usuario_realizou_o_login_com_sucesso() {
    }
    @Quando("o usuario clica no botao logout")
    public void o_usuario_clica_no_botao_logout() {
    }
    @Entao("o sistema retorna para a tela inicial")
    public void o_sistema_retorna_para_a_tela_inicial() {
    }
    @Entao("a mensagem de sucesso “You logged into a secure area!” nao esta visivel")
    public void a_mensagem_de_sucesso_you_logged_into_a_secure_area_nao_esta_visivel() {
    }

}

