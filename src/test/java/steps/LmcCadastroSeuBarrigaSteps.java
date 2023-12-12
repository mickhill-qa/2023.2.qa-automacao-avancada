package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.LmcCadastroBarrigaPage;
import runner.base_class.BaseSteps;

public class LmcCadastroSeuBarrigaSteps extends BaseSteps {

    LmcCadastroBarrigaPage page = new LmcCadastroBarrigaPage();

    @Dado("que o usuario acesse a pagina")
    public void que_o_usuario_acesse_a_pagina() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        page.abrir_pagina();
        Assert.assertTrue(page.verificarSeEstouNapagina());
    }
    @Quando("o usuario fazer o cadastro com {string}")
    public void o_usuario_fazer_o_cadastro_com(String senha) throws InterruptedException {
        page.preencher_campos(senha);

    }
    @Entao("o sistema retorna uma mensagem de sucesso")
    public void o_sistema_retorna_uma_mensagem_de_sucesso() throws InterruptedException {
        page.verificacao();
        screenshot();
    }
    @Entao("o sistema retorna uma mensagem de erro")
    public void o_sistema_retorna_uma_mensagem_de_erro() throws InterruptedException {
        page.verifica_senha_em_branco();
        screenshot();
    }





}
