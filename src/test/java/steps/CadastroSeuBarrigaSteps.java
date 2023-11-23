package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.SeuBarrigaCadastroPage;
import runner.base_class.BaseSteps;



public class CadastroSeuBarrigaSteps extends BaseSteps {

    SeuBarrigaCadastroPage paginaCadastro = new SeuBarrigaCadastroPage();

    @Dado("que o usuario esta na pagina de cadastro {string}")
    public void que_o_usuario_esta_na_pagina_de_cadastro(String string) {
        paginaCadastro.abrir();
    }

    @Quando("o usuario preenche o campo de email com um email ja cadastrado")
    public void o_usuario_preenche_o_campo_de_email_com_um_email_ja_cadastrado() {
        paginaCadastro.preencherCampoEmail("yohans.dev@gmail.com");
    }

    @Quando("preencher corretamente os demais campos")
    public void preencher_corretamente_os_demais_campos() {
        paginaCadastro.preencherCampoNome("Fulano de Tal");
        paginaCadastro.preencherCampoSenha("SenhaMuitoBoa123456");
        screenshot();
    }

    @Quando("clicar no botao cadastrar")
    public void clicar_no_botao_cadastrar() {
        paginaCadastro.clicarBotaoCadastrar();
    }

    @Entao("o sistema mostra uma mensagem de erro ao cadastrar")
    public void o_sistema_mostra_uma_mensagem_de_erro_ao_cadastrar() {
        Assert.assertTrue(paginaCadastro.temMensagemDeErro("Endereço de email já utilizado"));
        Assert.assertTrue(paginaCadastro.ehPaginaCadastro());
        screenshot();
    }

    //--------------------------------------------------------------------------

    @Dado("que o usuario esta na pagina de cadastro {string} 2")
    public void que_o_usuario_esta_na_pagina_de_cadastro2(String string) {
        paginaCadastro.abrir();
    }

    @Quando("o usuario preenche o campo de senha com uma senha invalida")
    public void o_usuario_preenche_o_campo_de_senha_com_uma_senha_invalida() {
        paginaCadastro.preencherCampoSenha("   ");
    }

    @Quando("preencher devidamente os demais campos")
    public void preencher_devidamente_os_demais_campos() {
        paginaCadastro.preencherCampoNome("Fulano de Tal");
        paginaCadastro.preencherCampoEmail("emailteste@teste");
        screenshot();
    }

    @Quando("clicar no botao Cadastrar")
    public void clicar_no_botao_cadastrar2() {
        paginaCadastro.clicarBotaoCadastrar();
    }

    @Entao("o sistema mostra uma mensagem de erro ao cadastrar 2")
    public void o_sistema_mostra_uma_mensagem_de_erro_ao_cadastrar2() {
        screenshot();
        Assert.assertTrue(paginaCadastro.ehPaginaCadastro());
        Assert.assertFalse(paginaCadastro.temMensagemDeErro("Senha invalida"));
    }

}
