package steps;

import io.cucumber.java.pt.*;
import pages.SeuBarrigaCadastroPage;
import runner.base_class.BaseSteps;

public class CadastroSeuBarrigaSteps extends BaseSteps {

    SeuBarrigaCadastroPage paginaCadastro = new SeuBarrigaCadastroPage();

    @Dado("que o usuario esteja na pagina de cadastro do site do seu barriga")
    public void que_o_usuario_esteja_no_site_https_seubarriga_wcaquino_me_cadastro() {
        paginaCadastro.abrir();
    }
    @E("preencha os campos Nome, Email e Senha conforme as obrigatoriedades de cada campo")
    public void preencha_os_campos_nome_email_e_senha_conforme_as_obrigatoriedades_de_cada_campo() {

        paginaCadastro.preencherCampoEmail("teste1.ramosmaciel@gmail.com");
        paginaCadastro.preencherCampoNome("Anderson Ramos Maciel");
        paginaCadastro.preencherCampoSenha("And3rson123@");
    }
    @E("clique no botao cadastrar")
    public void clique_no_botao_cadastrar() {

        paginaCadastro.clicarBtnCadastrar();

    }
    @Entao("devera aparecer uma mensagem informado que o cadastro foi realizado")
    public void devera_aparecer_uma_mensagem_informado_que_o_cadastro_foi_realizado() throws InterruptedException {

        Thread.sleep(1000);
        paginaCadastro.validaMsgCadastroSucesso();
    }
}
