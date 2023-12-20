package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.Grupo1HomeSeuBarrigaPage;
import pages.Grupo1LoginSeuBarrigaPages;
import runner.base_class.BaseSteps;


public class Grupo1LoginSeuBarrigaSteps extends BaseSteps {
    Grupo1LoginSeuBarrigaPages loginPage = new Grupo1LoginSeuBarrigaPages();
    Grupo1HomeSeuBarrigaPage homePage = new Grupo1HomeSeuBarrigaPage();
    @Dado("que o usuario esta na tela de login")
    public void que_o_usuario_esta_na_tela_de_login() {
        loginPage.validaPaginaLogin();
    }

    @Quando("preencher os campos email e senha com dados validos")
    public void preencher_os_campos_email_e_senha_com_dados_validos() {
        loginPage.preencherLogin("edinetesousa@gmail.com", "123456");
    }

    @Quando("clicar no botao entrar")
    public void clicar_no_botao_entrar() {
        loginPage.clicarBtnLogin();
    }

    @Entao("o sistema mostrara a mensagem de Bem-vindo")
    public void o_sistema_mostrara_a_mensagem_de_Bem_vindo() {
        Assert.assertEquals(homePage.validaHome(), "Bem vindo, Edinete Sousa!");
        screenshot();
    }

    @Quando("o usuario deixar o campo email vazio")
    public void o_usuario_deixar_o_campo_email_vazio() {
        loginPage.setEmail("");
    }

    @Quando("o usuario preeencher o campo senha")
    public void o_usuario_preeencher_o_campo_senha() {
        loginPage.setSenha("123456");
        screenshot();
    }
    @Entao("o sistema mostrara a mensagem {string}")
    public void o_sistema_mostrara_a_mensagem(String mensagem) {
        Assert.assertEquals(loginPage.validaMsgErro(), "Problemas com o login do usuário");
        screenshot();

        {
            String mensagem = loginPage.validaMsgErro();
            Assert.assertEquals(mensagem);
    }
    @Quando("o usuario preencher o campo email")
    public void o_usuario_preencher_o_campo_email() {
        loginPage.setEmail("edinetesousa@gmail.com");
    }

    @Quando("o usuario deixar o campo senha vazia")
    public void o_usuario_deixar_o_campo_senha_vazia() {
        loginPage.setSenha("");
        screenshot();
    }

    @Quando("o usuario preencher o email com dados invalidos")
    public void o_usuario_preencher_o_email_com_dados_invalidos() {
        loginPage.setEmail("edinetesousa.gmail.com");
    }

    @Quando("preencher o campo email")
    public void preencher_o_campo_email() {
        loginPage.setEmail("edinetesousa@gmail.com");
    }

    @Quando("o usuario preencher a senha com dados incorretos")
    public void o_usuario_preencher_a_senha_com_dados_incorretos() {
        loginPage.setSenha("@#$%");
        screenshot();
    }

}
