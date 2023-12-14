package steps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    WebDriver driver;

    /**
     * Steps
     * */
    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() {
        pageLogin.abrir();
        Assert.assertTrue(pageLogin.verificarSeEstouNapagina());
        screenshot();
    }

    @Quando("o usuario preenche o campo username com {string} e o campo password com {string}")
    public void o_usuario_preenche_o_campo_username_com_e_o_campo_password_com(String _username, String _password) {
        pageLogin.preencherUsername(_username);
        pageLogin.preencherPassword(_password);
        pageLogin.clicarBtnLogin();

    }

    @Quando("o usuario preenche os campos username com {string} e password com {string}")
    public void o_usuario_preenche_os_campos_username_com_e_password_com(String _username, String _password) {
        pageLogin.preencherUsername(_username);
        pageLogin.preencherPassword(_password);
    }

    @E("pressiona a tecla Enter")
    public void pressiona_a_tecla_Enter() {
        pageLogin.pressionarEnter();
    }

    @Entao("o sistema redireciona para a security area")
    public void o_sistema_redireciona_para_a_security_area() {
        Assert.assertTrue(paginaSegura.verificarSeEstouNapagina());
        screenshot();
    }

    @Entao("apresenta a mensagem {string}")
    public void apresenta_a_mensagem(String _msg) {
        Assert.assertTrue(pageLogin.pegarMensagemRetornada().contains(_msg));
    }

    @Entao("o sistema mostra a seguinte mensagem de erro {string}")
    public void o_sistema_mostra_a_seguinte_mensagem_de_erro(String _msg) {
        Assert.assertTrue(paginaSegura.pegarMensagemRetornada().contains(_msg));
    }

}
