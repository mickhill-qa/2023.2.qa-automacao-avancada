package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.CadastroSeuBarrigaPage;
import runner.base_class.BaseSteps;
import runner.support.Utils;

public class CadastroSEuBarrigaSteps extends Utils {
    CadastroSeuBarrigaPage seuBarrigaPage = new CadastroSeuBarrigaPage();
    @Dado("que o usuario esteja na tela de Cadastro")
    public void que_o_usuario_esteja_na_tela_de_cadastro() {
        seuBarrigaPage.validaTelaCadastro();
    }

    @Quando("o usuario preenche os dados necessarios para o cadastro com sucesso")
    public void o_usuario_preenche_os_dados_necessarios_para_o_cadastro_com_sucesso() {
        seuBarrigaPage.cadastrarSeuBarriga(nomeRandom(), emailRandom(), senhaRandom());
    }

    @Quando("o usuario preenche os campos Email e Senha e deixa o campo Nome em branco")
    public void o_usuario_preenche_os_campos_email_e_senha_e_deixa_o_campo_nome_em_branco() {
        seuBarrigaPage.cadastrarSeuBarriga(null, emailRandom(), senhaRandom());
    }

    @Quando("o usuario preenche os campos Nome e Senha e deixa o Email nome em branco")
    public void o_usuario_preenche_os_campos_nome_e_senha_e_deixa_o_email_nome_em_branco() {
        seuBarrigaPage.cadastrarSeuBarriga(nomeRandom(), null, senhaRandom());
    }

    @Quando("o usuario preenche os campos Nome e Email e deixa o campo Senha nome em branco")
    public void o_usuario_preenche_os_campos_nome_e_email_e_deixa_o_senha_nome_em_branco() {
        seuBarrigaPage.cadastrarSeuBarriga(nomeRandom(), emailRandom(), null);
    }

    @Entao("o sistema mostrarar a mensagem {string}")
    public void o_sistema_mostrarar_a_mensagem(String message) {
        String text = seuBarrigaPage.messageValidation(message);
        Assert.assertEquals(text, message);
        screenshot();
        System.out.println(text);
    }



}
