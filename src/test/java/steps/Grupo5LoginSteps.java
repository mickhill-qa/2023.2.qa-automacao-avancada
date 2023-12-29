package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.Grupo5LoginPage;
import pages.Grupo5SecureAreaPage;
import runner.base_class.BaseSteps;

public class Grupo5LoginSteps extends BaseSteps
{
    Grupo5LoginPage paginaLogin = new Grupo5LoginPage();
    Grupo5SecureAreaPage paginaSegura = new Grupo5SecureAreaPage();

    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        paginaLogin.abrir();
        Assert.assertTrue(paginaLogin.verificarSeEstouNapagina());
        screenshot();
    }
    @Quando("o usuario preenche o campo username com {string} e o campo password com {string}")
    public void o_usuario_preenche_o_campo_username_com_e_o_campo_password_com(String _username, String _password) {
        paginaLogin.preencherUsername(_username);
        paginaLogin.preencherPassword(_password);
        paginaLogin.clicarBtnLogin();
    }
    @Entao("o sistema redireciona para a security area")
    public void o_sistema_redireciona_para_a_security_area() {
        Assert.assertTrue(paginaSegura.verificarSeEstouNapagina());
        screenshot();
    }
    @Entao("apresenta a mensagem {string}")
    public void apresenta_a_mensagem(String _msg) {
        Assert.assertEquals(_msg, paginaSegura.pegarMensagemRetornada());
        screenshot();
    }

    @Quando("o usuario preenche os campos username com {string} e password com {string}")
    public void o_usuario_preenche_os_campos_username_com_e_password_com(String _username, String _password) {
        paginaLogin.preencherUsername(_username);
        paginaLogin.preencherPassword(_password);
    }
    @Quando("pressiona a tecla Enter")
    public void pressiona_a_tecla_enter() {
        paginaLogin.pressionarEnter();
    }

    @Entao("o sistema exibe a mensagem de erro: {string}")
    public void o_sistema_exibe_a_mensagem_de_erro(String _msgErro) {
        Assert.assertEquals(_msgErro, paginaLogin.pegarMensagemRetornada());
        screenshot();
    }

}
