package steps;

import io.cucumber.java.pt.*;
import pages.SeuBarrigaCadastroPage;
import runner.base_class.BaseSteps;

public class CadastroComErroSteps extends BaseSteps {

    SeuBarrigaCadastroPage paginaCadastro1 = new SeuBarrigaCadastroPage();

    @Dado("que o usuario esteja na pagina de cadastro do site seu barriga")
    public void que_o_usuario_esteja_no_site_https_seubarriga_wcaquino_me_cadastro() {
        paginaCadastro1.abrir();
    }
    @E("preencha os campos Nome, Email")
    public void preencha_os_campos_nome_email() {
        paginaCadastro1.preencherCampoEmail("teste1.ramosmaciel@gmail.com");
        paginaCadastro1.preencherCampoNome("Anderson Ramos Maciel");
    }
    @E("e deixe o campo Senha em branco")
    public void e_deixe_o_campo_senha_em_branco() {
        paginaCadastro1.preencherCampoSenha("");

    }
    @Entao("devera aparecer uma mensagem informando que houve erro no cadastro")
    public void devera_aparecer_uma_mensagem_informando_que_houve_erro_no_cadastro() {
        paginaCadastro1.validaMsgCadastro();
    }


}
