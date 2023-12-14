package steps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.Grupo5LoginPage;
import pages.Grupo5SecureAreaPage;
import runner.base_class.BaseSteps;

public class Grupo5LoginSteps extends BaseSteps
{
    /**
     * Paginas
     * */
    Grupo5LoginPage pageLogin = new Grupo5LoginPage();
    Grupo5SecureAreaPage paginaSegura = new Grupo5SecureAreaPage();

    /**
     * Steps
     * */
    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        pageLogin.abrir();
        screenshot();
    }

    @Quando("o usuario preenche o campo username com {string} e o campo password com {string}")
    public void o_usuario_preenche_o_campo_username_com_e_o_campo_password_com(String _username, String _password) {
        pageLogin.preencherUsername(_username);
        pageLogin.preencherPassword(_password);
        pageLogin.clicarBtnLogin();

    }

    @Entao("o sistema redireciona para a security area")
    public void o_sistema_redireciona_para_a_security_area() {
        Assert.assertTrue(paginaSegura.verificarSeEstouNapagina());
        screenshot();

    }

    @Entao("apresenta a mensagem {string}")
    public void apresenta_a_mensagem(String _msgError) {
        String msgNaTela = pageLogin.pegarMensagemRetornada();
        Assert.assertEquals(_msgError, msgNaTela);

    }

}
