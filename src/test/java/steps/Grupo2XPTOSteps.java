package steps;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Grupo2XPTOPage;
import runner.base_class.BaseSteps;

public class Grupo2XPTOSteps extends BaseSteps {
    Grupo2XPTOPage pagina = new Grupo2XPTOPage();

    @Dado("que o usuario esta na tela de login")
    public void que_o_usuario_esta_na_tela_de_login() {
        pagina.abrir();
        screenshot();
    }

    @Quando("ele insere no botao as credencias {string} e {string}")
    public void ele_insere_no_botao_as_credenciais(String _username, String _password) {
        pagina.preencherUsername(_username);
        pagina.preencherPassword(_password);
        screenshot();
    }

    @Quando("clica no botao Login")
    public void clica_no_botao_Login(){
        pagina.clicarOuEnter(true);
    }

    @Entao("o sistema deve ser apresentado uma pagina")
    public void o_sistema_deve_ser_apresentado_uma_pagina() {
        Assert.assertTrue(pagina.verificarSeEstouNaPaginaHome());
        screenshot();
    }

    @Entao("o sistema exibe a mensagem {string}")
    public void o_sistema_exibe_a_mensagem(String _message) {
        String message = pagina.pegarMensagem();
        Assert.assertEquals(message, _message);
        screenshot();
    }

    @Quando("ele insere no botão as credenciais {string} e {string}")
    public void ele_insere_no_botao_as_credencias(String _username, String _password) {
        pagina.preencherUsername(_username);
        pagina.preencherPassword(_password);
        screenshot();
    }

    @Entao("a pagina deve ser mantido a mesma")
    public void a_pagina_deve_ser_mantido_a_mesma() {
        Assert.assertTrue(pagina.verificarSeEstouNaPaginaLogin());
        screenshot();
    }

    @Quando("clica no botao Enter")
    public void clica_no_botao_Enter() {
        pagina.clicarOuEnter(false);
    }

   @Quando("ele insere no botao as credenciais {string} e {string}")
   public void ele_insere_no_botao_as_credenciais_e(String _username, String _password) {
	   pagina.preencherUsername(_username);
       pagina.preencherPassword(_password);
       screenshot();
   }

}

