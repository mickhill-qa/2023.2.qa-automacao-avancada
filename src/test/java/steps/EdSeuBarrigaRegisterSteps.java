package steps;

import io.cucumber.java.pt.*;
import pages.EdSeuBarrigaRegisterPage;
import runner.base_class.BaseSteps;

public class EdSeuBarrigaRegisterSteps extends BaseSteps {
    EdSeuBarrigaRegisterPage cadastroSeuBarrigaPage = new EdSeuBarrigaRegisterPage();

    @Dado("que o usuario esteja na tela de cadastros")
    public void que_o_usuario_esteja_na_tela_de_cadastros() {
        cadastroSeuBarrigaPage.ValidaCadastroPage();
    }
    @Quando("o usuario preencher os campos {string}, {string}, {string} e clicar em cadastrar")
    public void o_usuario_preencher_os_campos_e_clicar_em_cadastrar_realizar(String nome, String email, String senha) throws InterruptedException {
        cadastroSeuBarrigaPage.RealizarCadastro(nome, email, senha);
        cadastroSeuBarrigaPage.BtnCadastrar();
    }

    @Entao("o sistema mostrara a {string}")
    public void o_sistema_mostrara_a(String mensagem) {
        cadastroSeuBarrigaPage.ValidaMensagem(mensagem);
    }

    @Quando("o usuario preencher os campos {string}, {string}, {string} e clicar em cadastrar - Sucesso")
    public void o_usuario_preencher_os_campos_e_clicar_em_cadastrar_sucesso(String nome, String email, String senha) throws InterruptedException {
        cadastroSeuBarrigaPage.SucessoCadastrar(nome, email, senha);
    }

    @Entao("o sistema mostrara a mensagem {string}")
    public void o_sistema_mostrara_a_msg_sucesso(String mensagem) {
        cadastroSeuBarrigaPage.ValidaMensagem(mensagem);
    }
}