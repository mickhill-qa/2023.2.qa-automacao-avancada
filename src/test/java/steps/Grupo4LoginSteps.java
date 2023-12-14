package steps;

import io.cucumber.java.pt.*;
import runner.base_class.BaseSteps;

public class Grupo4LoginSteps extends BaseSteps {

    //Cenário 1
    @Dado ("que o usuario esteja na pagina de autenticacao")
    public void que_o_usuario_esteja_na_pagina_de_autenticacao() {

    }
    @Quando("o usuario preencher os campos de com as credencias: {string} e {string}")
    public void o_usuario_preencher_os_campos_de_com_as_credencias_e(String string, String string2) {

    }
    @E("o usuario clique no botão login")
    public void o_usuario_clique_no_botão_login() {

    }

    @Entao("o usuario deve ser redirecionado para a pagina Secure Area")
    public void o_usuario_deve_ser_redirecionado_para_a_pagina_secure_area() {

    }
    @E("o sistema deve exibir a mensagem {string}")
    public void o_sistema_deve_exibir_a_mensagem(String string) {

    }

    //Cenário 2
    @Entao("o usuario nao deve ser redirecionado para a pagina Secure Area")
    public void o_usuario_nao_deve_ser_redirecionado_para_a_pagina_secure_area() {

    }

    //Cenário 3
    //Utiliza todos os Steps do cenários 1 e 2

    //Cenário 4
    //Utiliza todos os Steps do cenário 1 e 2

    //Cenário 5
    //Utiliza todos os steps do cenário 1 e 2

    //Cenário 6
    @Dado("que o usuario esteja logado no sistema")
    public void que_o_usuario_esteja_logado_no_sistema() {
    }

    @Quando("o usuario acessar a página de login")
    public void o_usuario_acessar_a_página_de_login() {
    }

    @Entao("o usuario nao deve permanecer na pagina Secure Area")
    public void o_usuario_nao_deve_permanecer_na_pagina_secure_area() {
    }
}
