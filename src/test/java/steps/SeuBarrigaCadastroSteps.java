package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.SeuBarrigaCadastroPage;
import runner.base_class.BaseSteps;
import static runner.support.TestDataFactory.getRandomMail;

public class SeuBarrigaCadastroSteps extends BaseSteps {
    SeuBarrigaCadastroPage paginaCadastro = new SeuBarrigaCadastroPage();

    @Dado("que o usuario esta na pagina de cadastro")
    public void que_o_usuario_esta_na_pagina_de_cadastro() {
        paginaCadastro.abrir();
        screenshot();
    }

    @Quando("o usuario clica no botao Cadastrar")
    public void o_usuario_clica_no_botao_cadastrar() {
        paginaCadastro.clicarbtnCadastrar();
        screenshot();
    }

    @Quando("o usuario preenche os campos com dados validos")
    public void o_usuario_preenche_os_campos_com_dados_validos() throws InterruptedException {
        String randomEmail = getRandomMail();
        paginaCadastro.preencherCamposCadastro("Diego Teste", randomEmail, "pwd123" );
        screenshot();
    }

    @Quando("o usuario preenche os campos sem informar um nome")
    public void o_usuario_preenche_os_campos_sem_informar_um_nome() {
        String randomEmail = getRandomMail();
        paginaCadastro.preencherCamposCadastro("", randomEmail, "pwd123" );
        screenshot();
    }

    @Entao("o sistema deve exibir a mensagem {string}")
    public void o_sistema_deve_exibir_a_mensagem_de_sucesso(String _msgsuces) {
        Assert.assertEquals(_msgsuces, paginaCadastro.validarMensagem() );
        screenshot();
    }
}
