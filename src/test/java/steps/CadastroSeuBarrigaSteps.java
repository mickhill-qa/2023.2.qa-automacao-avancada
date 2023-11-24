package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.CadastroPage;
import runner.base_class.BaseSteps;

import java.util.Random;

public class CadastroSeuBarrigaSteps extends BaseSteps {

    CadastroPage cadastroPage = new CadastroPage();

    @Dado("que o usuario acesse o site, renato")
    public void que_o_usuario_acesse_o_site() {
        cadastroPage.validaPaginaCadastro();
    }

    @Quando("preencher os campos nome , email , senha e clicar no botao Cadastrar, renato")
    public void preencher_os_campos_nome_email_senha_e_clicar_no_botao_cadastrar() {
        Random rand = new Random();
        String nome = "Renato";
        String email = "renato" + rand.nextInt() + "@teste.com";
        String senha = "123456";

        cadastroPage.preencherCadastro(nome, email, senha);

    }

    @Quando("preencher os campos nome e email, deixar o campo senha em branco e clicar no botao Cadastrar, renato")
    public void preencher_os_campos_nome_e_email_deixar_o_campo_senha_em_branco_e_clicar_no_botao_cadastrar() {
        cadastroPage.preencherCadastroSemSenha("Renato", "testando@testesemsenha.com");
    }
    @Entao("o sistema mostrara a mensagem de erro, renato")
    public void o_sistema_mostrara_a_mensagem_de_erro() {
        cadastroPage.validarCadastro();
    }
    @Entao("o sistema mostrara a mensagem {string}, renato")
    public void o_sistema_mostrara_a_mensagem_renato(String _text) {
        cadastroPage.validarErroDoCadastro();
    }

}
