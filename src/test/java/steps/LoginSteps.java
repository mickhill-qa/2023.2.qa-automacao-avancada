package steps;

import pages.HomePage;
import pages.LoginPage;
import runner.base_class.BaseSteps;
import io.cucumber.java.pt.*;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    LoginPage LoginUsuario = new LoginPage();
    HomePage HomeUsuario = new HomePage();


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
        LoginUsuario.submeterLogin();
        screenshot();
    }
    @Entao("sistema deve apresentar lista de invoice")
    public void sistema_deve_apresentar_lista_de_invoice() {
        HomeUsuario.getUrlHome();
        HomeUsuario.getTextHome();
        screenshot();
    }

}
