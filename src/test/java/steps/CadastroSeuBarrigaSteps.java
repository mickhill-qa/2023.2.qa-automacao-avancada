package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroSeuBarrigaPage;
import runner.base_class.BaseSteps;

public class CadastroSeuBarrigaSteps extends BaseSteps {
    CadastroSeuBarrigaPage cadastroSeuBarrigaPage = new CadastroSeuBarrigaPage();
    @Dado("que o usuario esteja na tela de cadastro")
    public void que_o_usuario_esteja_na_tela_de_cadastro() {
        cadastroSeuBarrigaPage.ValidaCadastroPage();
    }
    @Quando("o usuario preencher os campos {string}, {string}, {string} e clicar em cadastrar")
    public void o_usuario_preencher_os_campos_e_clicar_em_cadastrar(String nome, String email, String senha) {
        cadastroSeuBarrigaPage.RealizarCadastro(nome, email, senha);
        cadastroSeuBarrigaPage.BtnCadastrar();
    }
    @Entao("o sistema mostrara a {string}")
    public void o_sistema_mostrara_a(String mensagem) {
        cadastroSeuBarrigaPage.ValidaMensagem(mensagem);
    }
}
