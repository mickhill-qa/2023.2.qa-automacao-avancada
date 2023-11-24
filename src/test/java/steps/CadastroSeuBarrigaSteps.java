package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroSeuBarrigaPage;
import pages.GoogleResultadosPesquisaPage;
import runner.base_class.BaseSteps;

public class CadastroSeuBarrigaSteps extends BaseSteps {
    
    CadastroSeuBarrigaPage cadastroSeuBarriga = new CadastroSeuBarrigaPage();
    GoogleResultadosPesquisaPage paginaResultados = new GoogleResultadosPesquisaPage();

    @Dado("que o usuario esta na pagina inicial")
    public void que_o_usuario_esta_na_pagina_inicial() {
        throw new io.cucumber.java.PendingException();
    }
    @Quando("o usuario preeche o Nome {string}")
    public void o_usuario_preeche_o_nome(String string) {
        throw new io.cucumber.java.PendingException();
    }
    @Quando("preeche o Email {string}")
    public void preeche_o_email(String string) {
        throw new io.cucumber.java.PendingException();
    }
    @Quando("preeche o Senha {string}")
    public void preeche_o_senha(String string) {
        throw new io.cucumber.java.PendingException();
    }
    @Quando("o usuario clica no botao Cadastrar")
    public void o_usuario_clica_no_botao_cadastrar() {
        throw new io.cucumber.java.PendingException();
    }

//    @Entao("o usuario faz login com sucesso")
//    public void o_usuario_faz_login_com_sucesso() {
//        throw new io.cucumber.java.PendingException();
//    }
    @Entao("o usuario recebe mensagem {string}")
    public void oUsuarioRecebeMensagem(String arg0) {
        throw new io.cucumber.java.PendingException();
    }
}
