package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;
import runner.base_class.BaseSteps;
import java.util.Random;

public class CadastroSeuBarrigaSteps extends BaseSteps {

    CadastroPage cadastroPage = new CadastroPage();

    @Dado("que o usuario acesse o site")
    public void que_o_usuario_acesse_o_site() {
        cadastroPage.validaPaginaCadastro();
    }

    @Quando("preencher os campos nome , email , senha e clicar no botao Cadastrar")
    public void preencher_os_campos_nome_email_senha_e_clicar_no_botao_cadastrar() {
        Random rand = new Random();
        String email = "renato" + rand.nextInt() + "@teste.com";
        cadastroPage.preencherCadastro("Renato", email, "1234");
        cadastroPage.clicarBtnCadastrar();
    }

    @Entao("o sistema mostrara a mensagem de erro")
    public void o_sistema_mostrara_a_mensagem_de_erro() {
        cadastroPage.validarCadastro();
    }

    @Quando("preencher os campos nome e email, deixar o campo senha em branco e clicar no botao Cadastrar")
    public void preencher_os_campos_nome_e_email_deixar_o_campo_senha_em_branco_e_clicar_no_botao_cadastrar() {
        cadastroPage.preencherCadastroSemSenha("Renato", "testando@testapraver.com");
        cadastroPage.clicarBtnCadastrar();
    }

}
