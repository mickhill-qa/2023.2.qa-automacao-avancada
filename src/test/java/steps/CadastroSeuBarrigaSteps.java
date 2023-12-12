package steps;
import io.cucumber.java.ca.Quan;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.CadastroSeuBarrigaPage;
import runner.base_class.BaseSteps;
import com.github.javafaker.Faker;

public class CadastroSeuBarrigaSteps  extends BaseSteps {

    CadastroSeuBarrigaPage paginaCadastro = new CadastroSeuBarrigaPage();
    private Faker faker = new Faker();
    private String emailAleatorio;
    private String senhaAleatoria;
    private String nomeAleatorio;

    @Dado("que o usuario esta na pagina de cadastro")
    public void que_o_usuario_esta_na_pagina_de_cadastro() {
        paginaCadastro.abrir();
        screenshot();
    }

    @Quando("o usuario preenche o campo nome com um nome")
    public void o_usuario_preenche_o_nome_com_um_nome() {
        nomeAleatorio = faker.name().fullName();
        paginaCadastro.preencherCampoNome(nomeAleatorio);
        screenshot();
    }

    @Quando("o usuario preenche o campo email com um email")
    public void o_usuario_preenche_o_campo_email_com_um_email() {
        emailAleatorio = faker.internet().emailAddress();
        paginaCadastro.preencherCampoEmail(emailAleatorio);
        screenshot();
    }

    @E("o usuario preenche o campo senha com uma senha")
    public void o_usuario_preenche_a_senha_com_uma_senha() {
        senhaAleatoria = faker.internet().password();
        paginaCadastro.preencherCampoSenha(senhaAleatoria);
        screenshot();
    }

    @E("o usuario clica no botao CADASTRAR")
    public void o_usuario_clica_no_botao_cadastrar() {
        paginaCadastro.clicarBtnCadastrar();
    }

    @Entao("o sistema apresenta uma mensagem de sucesso")
    public void o_sistema_apresenta_uma_mensagem_de_sucesso() {
        boolean blnExibiuMensagemSucesso = paginaCadastro.verificarMensagemSucesso();
        Assert.assertTrue("Não exibiu a mensagem de sucesso", blnExibiuMensagemSucesso);
    }

   @Quando("o usuario não preeche o campo email com um email valido {string}")
    public void o_usuario_nao_preeche_o_email_com_email_valido(String _email) {
        paginaCadastro.preencherCampoEmail(_email);
        screenshot();
    }

    @Entao("o sistema apresenta uma mensagem de campo obrigatorio")
    public void o_sistema_apresenta_uma_mensagem_de_campo_obrigatorio()  {
        boolean blnExibiuMensagemEmailObrigatorio = paginaCadastro.emailObrigatorio();
        Assert.assertTrue("Não exibiu mensagem de campo obrigatorio", blnExibiuMensagemEmailObrigatorio);
    }
}
