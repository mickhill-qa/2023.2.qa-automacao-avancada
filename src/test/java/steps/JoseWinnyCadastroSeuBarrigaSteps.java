package steps.josewinny;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import pages.josewinny.JoseWinnyCadastroSeuBarrigaPage;
import pages.josewinny.JoseWinnyLoginSeuBarrigaPage;
import runner.base_class.BaseSteps;

public class JoseWinnyCadastroSeuBarrigaSteps extends BaseSteps {
    JoseWinnyCadastroSeuBarrigaPage paginaCadastro = new JoseWinnyCadastroSeuBarrigaPage();
    JoseWinnyLoginSeuBarrigaPage paginaLogin = new JoseWinnyLoginSeuBarrigaPage();
    @Dado("que o usuario esta na pagina de cadastro e nao esta cadastrado")
    public void que_o_usuario_esta_na_pagina_de_cadastro_e_nao_esta_cadastrado() {
       paginaCadastro.abrir();
       screenshot();
    }
    @Quando("nao preenche o campo nome")
    public void nao_preenche_o_campo_nome() {
        screenshot();
    }
    @E("nao preenche o campo email")
    public void nao_preenche_o_campo_email() {
        screenshot();
    }
    @E("nao preenche o campo senha")
    public void nao_preenche_o_campo_senha() {
        screenshot();
    }
    @Quando("preenche o campo nome com {string}")
    public void preenche_o_campo_nome(String _nome) {
        paginaCadastro.preencherNome(_nome);
        screenshot();
    }
    @E("preenche o campo email com {string}")
    public void preenche_o_campo_email(String _email) {
        paginaCadastro.preencherEmail(_email);
        screenshot();
    }
    @E("preenche o campo senha com {string}")
    public void preenche_o_campo_senha(String _senha) {
        paginaCadastro.preencherSenha(_senha);
        screenshot();
    }
    @E("clica no botão de Cadastrar")
    public void clica_no_botao_cadastrar() {
    paginaCadastro.clicarCadastro();
    }
    @Entao("o sistema exibe a mensagem de {string}")
    public void o_sistema_exibe_a_mensagem(String _mensagem) {
        paginaCadastro.pegarTodasNotificacoes();
        Assert.assertTrue(paginaCadastro.contemMensagem(_mensagem));
        screenshot();
    }

}
