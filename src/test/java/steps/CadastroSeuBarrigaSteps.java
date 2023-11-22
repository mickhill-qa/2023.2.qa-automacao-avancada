package steps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.CadastroSeuBarrigaPage;
import runner.base_class.BaseSteps;

public class CadastroSeuBarrigaSteps  extends BaseSteps {

    CadastroSeuBarrigaPage paginaCadastro = new CadastroSeuBarrigaPage();

    @Dado("que o usuario esta na pagina de cadastro")
    public void que_o_usuario_esta_na_pagina_de_cadastro() {
        paginaCadastro.abrir();
        screenshot();
    }

    @Quando("o usuario preeche o campo nome com {string}")
    public void o_usuario_preeche_o_nome_com(String _nome) {
        paginaCadastro.preencherCampoNome(_nome);
        screenshot();
    }

    @E("o usuario preeche o campo email com {string}")
    public void o_usuario_preeche_o_email_com(String _email) {
        paginaCadastro.preencherCampoEmail(_email);
        screenshot();
    }

    @E("o usuario preeche o campo senha com {string}")
    public void o_usuario_preeche_a_senha_com(String _senha) {
        paginaCadastro.preencherCampoSenha(_senha);
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
