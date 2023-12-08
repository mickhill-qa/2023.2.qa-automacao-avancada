package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import runner.base_class.BaseSteps;

public class IvanAlvesEcoreLogin extends BaseSteps{
	
	@Dado("que o usuario esta na pagina de login")
	public void que_o_usuario_esta_na_pagina_de_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Quando("preencher os campos {string}, {string} com credenciais valida")
	public void preencher_os_campos_com_credenciais_valida(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Quando("clicar no botao login")
	public void clicar_no_botao_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Entao("o aplicativo deve redirecionar o usuario para a pagina Lista de faturas")
	public void o_aplicativo_deve_redirecionar_o_usuario_para_a_pagina_lista_de_faturas() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Quando("preencher os campos {string}, {string} com credenciais invalidas")
	public void preencher_os_campos_com_credenciais_invalidas(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@Entao("o sistema mostrara a mensagem de alerta {string}")
	public void o_sistema_mostrara_a_mensagem_de_alerta(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
