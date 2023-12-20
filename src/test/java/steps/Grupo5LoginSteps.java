package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Grupo5HomePage;
import pages.Grupo5LoginPage;
import runner.base_class.BaseSteps;

public class Grupo5LoginSteps extends BaseSteps {

    Grupo5HomePage homePage = new Grupo5HomePage();

    Grupo5LoginPage loginPage = new Grupo5LoginPage();
    @Dado("que o usuario esteja na tela de login")
    public void que_o_usuario_esteja_na_tela_de_login() {
        loginPage.abrir();
        Assert.assertTrue(loginPage.verificarSeEstouNapagina());
        screenshot();
    }
    @Quando("o usuario preenche o campo email com {string} e o campo senha {string}")
    public void o_usuario_preenche_o_campo_email_com_e_o_campo_senha(String _email, String _senha) {
        loginPage.preencherEmail(_email);
        loginPage.preencherSenha(_senha);
        loginPage.clicarBtnLogin();
    }
    @Quando("o usuario preenche o email com {string} e a senha {string}")
    public void o_usuario_preenche_o_email_com_e_a_senha(String _email, String _senha) {
        loginPage.preencherEmail(_email);
        loginPage.preencherSenha(_senha);
    }
    @Quando("pressiona a tecla ENTER")
    public void pressiona_a_tecla_enter() {
        loginPage.pressionarEnter();
    }
    @Entao("o sistema redireciona para a home page")
    public void o_sistema_redireciona_para_a_home_page() {
        Assert.assertTrue(homePage.verificarSeEstouNapagina());
    }
    @Entao("exibe a mensagem de sucesso {string}")
    public void exibe_a_mensagem(String _message) {
        Assert.assertEquals(_message, homePage.pegarMensagemRetornada());
        screenshot();
    }
    @Entao("exibe a mensagem de erro {string}")
    public void exibe_a_mensagem_de_erro(String _message) {
        Assert.assertEquals(_message, loginPage.pegarMensagemRetornada());
        screenshot();
    }
}
