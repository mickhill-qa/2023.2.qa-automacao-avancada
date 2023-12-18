package steps;

import io.cucumber.java.pt.*;
import pages.EdiCadastroPage;
import runner.base_class.BaseSteps;

public class EdiCadastroSeuBarrigaSteps extends BaseSteps {
    EdiCadastroPage paginaCadastro = new EdiCadastroPage();
    @Dado("que o usuario esta na tela de cadastro")
    public void que_o_usuario_esta_na_tela_de_cadastro() {
        paginaCadastro.validaPaginaCadastro();
        screenshot();
    }

    @Quando("o usuario preenche os campos obrigatorios com dados validos")
    public void o_usuario_preenche_os_campos_obrigatorios_com_dados_validos() {
        paginaCadastro.preencherCadastro("Edinete", "@Teste123");
        screenshot();
    }

    @Quando("o usuario preenche os campos obrigatorios com dados invalidos")
    public void oUsuarioPreencheOsCamposObrigatoriosComDadosInvalidos() {
        paginaCadastro.preencherCadastro("", "@1a");
        screenshot();
    }

    @E("o usuario clica no botao Cadastrar")
    public void o_usuario_clica_no_botao_cadastrar() {
        paginaCadastro.clicarBtnCadastrar();
        screenshot();
    }
    @Então("sera apresentada a mensagem {string}")
    public void sera_apresentada_a_mensagem(String mensagem) {
        paginaCadastro.validarMensagem();
        screenshot();
    }
}