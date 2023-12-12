package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.LmcLoginEcorePage;
import runner.base_class.BaseSteps;

public class LmcEcoreLoginSteps extends BaseSteps {

    LmcLoginEcorePage lg = new LmcLoginEcorePage();

    @Dado("que o usuario esta na pagina de login")
    public void que_o_usuario_esta_na_pagina_de_login() throws InterruptedException {
        lg.abrir();
        Assert.assertTrue(lg.verificarSeEstouNapagina());

    }
    @Quando("o usuario preencher os campos com informações validas")
    public void o_usuario_preencher_os_campos_com_informações_validas() throws InterruptedException {
        lg.loginsucess();
        lg.botao_logar();
    }
    @Entao("o sistema redireciona para lista de faturas")
    public void o_sistema_redireciona_para_lista_de_faturas() throws InterruptedException {
        Assert.assertTrue(lg.verificacao_sucess());
        screenshot();
    }
    @Quando("o usuario preencher os campos com {string} e {string} invalidos")
    public void o_usuario_preencher_os_campos_com_e_invalidos(String email, String senha) throws InterruptedException {
        lg.login_no_sucess(email,senha);
        lg.botao_logar();
    }
    @Entao("o sistema retorna uma mensagem de Erro")
    public void o_sistema_retorna_uma_mensagem_de_erro() throws InterruptedException {
        Assert.assertTrue(lg.verificacao_no_sucess());
        screenshot();
    }

}
