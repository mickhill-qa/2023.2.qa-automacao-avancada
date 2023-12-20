package steps;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.LoginGrupo2XPTOPage;
import runner.base_class.BaseSteps;

public class LoginGrupo2XPTOStep  extends BaseSteps{
	
	LoginGrupo2XPTOPage login = new LoginGrupo2XPTOPage();
	
	@Dado("que o usuario esta na tela de login")
	public void que_o_usuario_esta_na_tela_de_login() {
		
	  login.abrir();
	  screenshot();
	}

	@Quando("ele insere no botao as credenciais {string} e {string}")
	public void ele_insere_no_botao_as_credenciais_e(String email, String senha) throws InterruptedException {
	    
		login.preencherEmail(email);
		login.preencherSenha(senha);
		Thread.sleep(2000);
		screenshot();
	}

	@Quando("clica no botao Entrar")
	public void clica_no_botao_entrar() {
	   login.entrar();
	   screenshot();
	}

	@Então("o sistema deve apresentado a area de login")
	public void o_sistema_deve_apresentado_a_area_de_login() throws InterruptedException {
		Thread.sleep(2000);
	    Assert.assertTrue(login.verificarSeEstouNaPaginaHome());
	       screenshot();
	}

	@Então("o sistema exibe a mensagem {string}")
	public void o_sistema_exibe_a_mensagem(String alert) throws InterruptedException {
		Thread.sleep(2000);
		String msn = login.alertSucesso();
		 Assert.assertEquals(msn, alert);
	        screenshot();
		
	}

	@Quando("ele insere no botao as credencias {string} e {string}")
	public void ele_insere_no_botao_as_credencias_e(String email, String senha) {
	    
		login.preencherEmail(email);
		login.preencherSenha(senha);
		
		
	}

	@Então("a pagina deve ser mantido")
	public void a_pagina_deve_ser_mantido() throws InterruptedException {
		Thread.sleep(2000);
	    Assert.assertTrue(login.verificarSeEstouNaPaginaLogin());
	       screenshot();
	}

	@Quando("clica no botao Enter")
	public void clica_no_botao_enter() {
	   
		 login.entrar();
	}

	@Então("o sistema deve ser apresentado uma pagina")
	public void o_sistema_deve_ser_apresentado_uma_pagina() throws InterruptedException {
	
		Thread.sleep(2000);
		  Assert.assertTrue(login.verificarSeEstouNaPaginaLogin());
		  screenshot();
	}

	@Então("a pagina deve se manter")
	public void a_pagina_deve_se_manter() throws InterruptedException {
		
		Thread.sleep(2000);
		   Assert.assertTrue(login.verificarSeEstouNaPaginaHome());
	       screenshot();
	}
	
	@Então("o sistema exibe a mensagem de execao {string}")
	public void o_sistema_exibe_a_mensagem_de_execao(String alert) throws InterruptedException {
		Thread.sleep(2000);
		String msn = login.alertDanger();
		 Assert.assertEquals(msn, alert);
	        screenshot();
	}
	
	@Então("a pagina deve deve em login")
	public void a_pagina_deve_deve_em_login() throws InterruptedException {
		Thread.sleep(2000);
		  Assert.assertTrue(login.verificarSeEstouNaPaginaLogin());
		  screenshot();
	}

}
