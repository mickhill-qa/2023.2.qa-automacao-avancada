package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.CadastroSeuBarrigaPage;
import pages.SeuBarrigaResultadoCadastro;

import static runner.base_class.BaseSteps.screenshot;

public class CadastroSeuBarrigaSteps {

    CadastroSeuBarrigaPage paginaCadastro = new CadastroSeuBarrigaPage();
    SeuBarrigaResultadoCadastro paginaResultado = new SeuBarrigaResultadoCadastro();

    @Dado("que o usuario esta na pagina do site seu barriga")
    public void que_o_usuario_esta_na_pagina_do_site_seu_barriga() {
        paginaCadastro.abrir();
        screenshot();
    }
    @Quando("o usuario preenche o campo Nome com {string}")
    public void o_usuario_preenche_o_campo_nome_com(String _nome){
        paginaCadastro.preencherCampoNome(_nome);
        screenshot();
    }

    @E("o usuario preenche o campo Email com uma conta valida sendo {string}")
    public void o_usuario_preenche_o_campo_email_com_uma_conta_valida_sendo(String _email) {
        paginaCadastro.preencherCampoEmail(_email);
        screenshot();
    }
    @Quando("o usuario preenche o campo Email com uma conta valida {string}")
    public void o_usuario_preenche_o_campo_email_com_uma_conta_valida(String _email) {
        paginaCadastro.preencherCampoEmail(_email);
        screenshot();
    }
    @Quando("o usuario informa uma senha valida com {string}")
    public void o_usuario_informa_uma_senha_valida_com(String _senha) {
        paginaCadastro.preencherCampoSenha(_senha);
        screenshot();
    }
    @Quando("usuario clica no botão cadastrar")
    public void usuario_clica_no_botão_cadastrar() {
        paginaCadastro.clicarBtnCadastrar();
        screenshot();
    }
    @Entao("o usuário deve ser redirecionado")
    public void o_usuário_deve_ser_redirecionado() {
        Assert.assertTrue(paginaResultado.verificarSeEstouNapagina());
        screenshot();
    }

    @Entao("o usuario deve permanecer na pagina de cadastro")
    public void o_usuario_deve_permanecer_na_pagina_de_cadastro() {
        Assert.assertFalse(paginaResultado.verificarSeEstouNapagina());
        screenshot();
    }

}
