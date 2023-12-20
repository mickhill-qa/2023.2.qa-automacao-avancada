package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.Grupo4HomeSrBarrigaPage;
import pages.Gupo4SrBarrigaLoginPage;
import runner.base_class.BaseSteps;

public class Grupo4LoginSrBarrigaSteps extends BaseSteps {

    Gupo4SrBarrigaLoginPage loginSrBarrigaPage = new Gupo4SrBarrigaLoginPage();

    Grupo4HomeSrBarrigaPage homeSrBarrigaPage = new Grupo4HomeSrBarrigaPage();

    //Cenario 1
    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        loginSrBarrigaPage.openSrBarriga();
        screenshot();
    }

    @Quando("o usuario preenche o email {string}")
    public void o_usuario_preenche_o_email(String _email) {
        loginSrBarrigaPage.preencheEmail(_email);
    }

    @E("o usuario preeche a senha {string}")
    public void o_usuario_preeche_a_senha(String _password) {
        loginSrBarrigaPage.preencheSenha(_password);
        screenshot();
    }

    @E("aperta o botao de entrar")
    public void aperta_o_botao_de_entrar() {
        loginSrBarrigaPage.clicaEntrar();
        screenshot();
    }

    @Entao("ele redireciona para pagina incial")
    public void ele_redireciona_para_pagina_incial() {
        String txtSucess = homeSrBarrigaPage.verefyLogin();
        Assert.assertTrue(txtSucess.contains("Bem vindo"));
        screenshot();
    }

    //Cenario 2
    @E("aperta a tecla enter")
    public void aperta_a_tecla_enter() {
        loginSrBarrigaPage.apertarEnter();
        screenshot();
    }

    //Cenario 3,4,5 e 6
    @Entao("ele exibe a mensagem de erro {string}")
    public void ele_exibe_a_mensagem_de_erro(String _msgErro) {
        String txtError = loginSrBarrigaPage.pegarMsgAlerta();
        Assert.assertEquals(txtError, _msgErro);
        screenshot();
    }

}
