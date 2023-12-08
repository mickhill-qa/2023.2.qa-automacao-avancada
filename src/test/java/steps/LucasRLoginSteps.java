package steps;

import pages.LucasRHomePage;
import pages.LucasRLoginPage;
import runner.base_class.BaseSteps;
import io.cucumber.java.pt.*;
import org.junit.Assert;

public class LucasRLoginSteps extends BaseSteps {

    LucasRLoginPage LoginUsuario = new LucasRLoginPage();
    LucasRHomePage HomeUsuario = new LucasRHomePage();



    @Dado("que o usuario esteja na tela de login")
    public void que_o_usuario_esteja_na_tela_de_login() {
        LoginUsuario.abrir();
    }
    @Quando("o usuario preeche Username com {string}")
    public void o_usuario_preeche_username_com(String _username) {
        LoginUsuario.preencherUsername(_username);
    }
    @Quando("o usuario preenche Password com {string}")
    public void o_usuario_preenche_password_com(String _password) {
        LoginUsuario.preencherPassword(_password);
    }
    @Quando("o usuario clica no botao login")
    public void o_usuario_clica_no_botao_login() {
        screenshot();
        LoginUsuario.submeterLogin();
    }
    @Entao("sistema deve apresentar lista de invoice")
    public void sistema_deve_apresentar_lista_de_invoice() {
        Assert.assertTrue(HomeUsuario.getUrlHome());
        screenshot();
    }

    @Entao("sistema deve apresentar alerta com a mensagem Wrong username or password")
    public void sistema_deve_apresentar_alerta_com_a_mensagem_Wrong_username_or_password() {
        Assert.assertEquals("Wrong username or password.",LoginUsuario.getAlertaLoginSenhaIncoreto());
        screenshot();
    }

}
