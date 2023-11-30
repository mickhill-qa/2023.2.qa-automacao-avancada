package steps;

import org.junit.Assert;
import io.cucumber.java.pt.*;
import runner.base_class.BaseSteps;
import pages.IvanAlvesCadastroSeuBarrigaPage;
public class IvanAlvesCadastroSeuBarrigaSteps  extends BaseSteps {
	
	IvanAlvesCadastroSeuBarrigaPage cadastro = new IvanAlvesCadastroSeuBarrigaPage();
	
	@Dado("que estou acessando a acessando página de cadastro do seubarriga.wcaquino.me")
	public void que_estou_acessando_a_acessando_página_de_cadastro_do_seubarriga_wcaquino_me() {
		cadastro.abrir();
        screenshot();
	}

	@Quando("digitar nome completo {string}")
	public void digitar_nome_completo(String _nome) {
	  cadastro.preencherCampoNome(_nome);
	  screenshot();
	}

	@Quando("digitar o email válido {string}")
	public void digitar_o_email_válido(String _email) {
	  cadastro.preencherCampoEmail(_email);
	  screenshot();
		
	}

	@Quando("digitar Senha válida {string}")
	public void digitar_senha_válida(String string) {
	    cadastro.preencherCampoSenha(string);
	    screenshot();
	}

	@Quando("Clico em cadastrar")
	public void clico_em_cadastrar() {
	   cadastro.clicarBtnPesquisar();
	   screenshot();
	}

	@Entao("deve retornar mensagem {string}")
	public void deve_retornar_mensagem(String string) {
		
		String alerta =  cadastro.alertSucesso();
		Assert.assertEquals(string, alerta);
		screenshot();
	}

	@Dado("que estou acessando a página de cadastro do seubarriga.wcaquino.me")
	public void que_estou_acessando_a_página_de_cadastro_do_seubarriga_wcaquino_me() {
		cadastro.abrir();
        screenshot();
	}

}
