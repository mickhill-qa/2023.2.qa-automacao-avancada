package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.SeuBarrigaCadastroPage;
import pages.SeuBarrigaResultadoCadastroPage;
import runner.base_class.BaseSteps;

public class SeuBarrigaCadastroSteps extends BaseSteps {
    SeuBarrigaCadastroPage paginaCadastro = new SeuBarrigaCadastroPage();
    SeuBarrigaResultadoCadastroPage paginaResultado = new SeuBarrigaResultadoCadastroPage();

    @Dado("que o usuario esta na pagina de cadastro")
    public void que_o_usuario_esta_na_pagina_de_cadastro() {
        paginaCadastro.abrir();
        screenshot();
    }

    @Quando("o usuario preencher {string} no campo nome")
    public void preencher_nome(String _nome){
        paginaCadastro.preencherCampoNome(_nome);
        screenshot();
    }

    @Quando("preencher {string} no campo email")
    public void preencher_email(String _email){
        paginaCadastro.preencherCampoEmail(_email);
        screenshot();
    }

    @Quando("preencher {string} no campo senha")
    public void preencher_senha(String _senha){
        paginaCadastro.preencherCampoSenha(_senha);
        screenshot();
    }

    @Quando("o usuario clica no botao CADASTRAR")
    public void o_usuario_clica_no_botao_cadastrar(){
        paginaCadastro.clicarBtnCadastrar();
    }

    @Entao("o sistema mostra a mensagem {string}")
    public void sistema_mostra_mensagem(String _mensagem){
        String mensagem = paginaResultado.getMensagemSucesso();
        Assert.assertEquals(_mensagem, mensagem);
    }

    @Quando("deixa o campo senha vázio")
    public void deixa_campo_senha_vazio(){
        paginaCadastro.preencherCampoSenha("");
        screenshot();
    }

    @Entao("o sistema mostra a mensagem de erro {string}")
    public void sistema_mostra_mensagem_erro(String _erro){
        String mensagem = paginaResultado.getMensagemError();
        Assert.assertEquals(mensagem, _erro);
    }

}
