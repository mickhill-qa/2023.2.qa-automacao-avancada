package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CadastroSeuBarrigaPage;
import pages.CadastroSeuBarrigaResulPage;
import pages.GooglePesquisaPage;
import pages.GoogleResultadosPesquisaPage;
import runner.base_class.BaseSteps;

import java.util.List;

public class CadastroSeuBarrigaSteps extends BaseSteps {
    CadastroSeuBarrigaPage cadastroPage = new CadastroSeuBarrigaPage();
    CadastroSeuBarrigaResulPage paginaResultados = new CadastroSeuBarrigaResulPage();

    @Dado("que o usuario esta na pagina de cadastro")
    public void que_o_usuario_esta_na_pagina_de_cadastro() {
        cadastroPage.abrir();
        screenshot();
    }

    @Quando("o usuario preeche o campo Usuário com {string}")
    public void o_usuario_preeche_o_campo_username_com(String _nome) {
        cadastroPage.preencherCampoNome(_nome);
        screenshot();
    }
    @Quando("o usuario preeche o campo com Email com {string}")
    public void o_usuario_preeche_o_campo_email_com(String _email) {
        cadastroPage.preencherCampoEmail(_email);
        screenshot();
    }
    @Quando("o usuario preeche o campo com Senha com {string}")
    public void o_usuario_preeche_a_pequisa_com(String _senha) {
        cadastroPage.preencherCampoSenha(_senha);
        screenshot();
    }

    @Quando("o usuario clica no botao Cadastrar")
    public void o_usuario_clica_no_botao_pesquisar() {
        cadastroPage.clicarBtnCadastrar();
    }

    @Entao("o sistema redireciona para a pagina de login")
    public void o_sistema_redireciona_para_a_pagina_de_login() {
        Assert.assertTrue(paginaResultados.verificarSeEstouNapagina());
        screenshot();
    }

    @Entao("o sistema exibe uma mensagem Usuário inserido com sucesso")
    public void o_sistema_exibe_uma_mensagem_de_sucesso() {
        String valor = paginaResultados.getMsgResult();
        Assert.assertEquals(valor, "Usuário inserido com sucesso");
    }
    @Entao("o sistema exibe uma mensagem de erro Endereço de email já utilizado")
    public void o_sistema_exibe_uma_mensagem_de_erro() {
        String valor = paginaResultados.getMsgResult();
        Assert.assertEquals(valor, "Endereço de email já utilizado");
    }
}
