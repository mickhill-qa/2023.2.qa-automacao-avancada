package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import pages.SeuBarrigaCadastroPage;
import runner.base_class.BaseSteps;

public class CadastroSeuBarrigaSteps extends BaseSteps {
    SeuBarrigaCadastroPage paginaCadastro = new SeuBarrigaCadastroPage();
    @Dado("que o usuário esteja na tela de cadastro")
    public void que_o_usuário_esteja_na_tela_de_cadastro() {
        paginaCadastro.abrir();
        screenshot();
    }
    @Dado("preencha os campos obrigatóriAo com dados válidos")
    public void preencha_os_campos_obrigatório_com_dados_válidos() {
       paginaCadastro.preencherCamposCadastro();
    }
    @Quando("clicar em Cadastrar")
    public void clicar_em_cadastrar() {
    }
    @Então("a mensagem {string} deve ser exibida")
    public void a_mensagem_deve_ser_exibida(String string) {
    }

    @Dado("preencha o campo Nome e email com dados válidos")
    public void preencha_o_campo_nome_e_email_com_dados_válidos() {
    }
    @Dado("o campo Senha com valor fora do padrão")
    public void o_campo_senha_com_valor_fora_do_padrão() {
    }

    @Então("a mensagem {string} não deve ser exibida")
    public void a_mensagem_não_deve_ser_exibida(String string) {
    }

}
