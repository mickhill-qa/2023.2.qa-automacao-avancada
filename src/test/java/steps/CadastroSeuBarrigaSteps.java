package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;
import runner.base_class.BaseSteps;
import java.util.Random;

public class CadastroSeuBarrigaSteps extends BaseSteps {
    CadastroPage paginaCadastro = new CadastroPage();

    @Dado("que o usuario esteja na tela de cadastro")
    public void que_o_usuario_esteja_na_tela_de_cadastro() {
        paginaCadastro.validaPaginaCadastro();
    }

    @Quando("preencher os campos {string}, {string}, {string} e clicar no botao Cadastrar")
    public void preencher_os_campos_e_clicar_no_botao_cadastrar(String nome, String email, String senha) {
        paginaCadastro.preencherCadastro(nome, email, senha);
        paginaCadastro.clicarBtnCadastrar();
    }

    @Entao("o sistema mostrara a {string}")
    public void o_sistema_mostrara_a(String mensagem) {
        paginaCadastro.validarCadastro();
    }

}