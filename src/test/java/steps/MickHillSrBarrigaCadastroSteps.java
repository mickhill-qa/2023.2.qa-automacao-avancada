package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.MickHillSrBarrigaCadastroPage;
import runner.base_class.BaseSteps;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MickHillSrBarrigaCadastroSteps extends BaseSteps {
    /**
     * Pagina usadas nos testes
     * */
    MickHillSrBarrigaCadastroPage paginaCadastro = new MickHillSrBarrigaCadastroPage();

    /**
     * Fluxo Base
     * */
    @Dado("que o usuario esta na tela de cadastro, mickhill")
    public void que_o_usuario_esta_na_tela_de_cadastro() {
        paginaCadastro.abrir();
        screenshot();
    }

    @Quando("o usuario preenche os campos obrigatorio com dados validos, mickhill")
    public void o_usuario_preenche_os_campos_obrigatorio_com_dados_validos() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
        String formattedDate = myDateObj.format(myFormatObj);

        String nome = "Teste do Tio Mick";
        String email = "teste@teste." + formattedDate;
        String senha = "1234";

        scenario.log("nome: " + nome);
        scenario.log("email: " + email);
        scenario.log("senha: " + senha);

        paginaCadastro.preencherNome(nome);
        paginaCadastro.preencherEmail(email);
        paginaCadastro.preencherSenha(senha);
        screenshot();
    }

    @E("o usuario clica em Cadastrar, mickhill")
    public void o_usuario_clica_em_cadastrar() {
        paginaCadastro.clicarCadatro();
    }

    @Entao("o sistema exibi a mensagem {string}, mickhill")
    public void o_sistema_exibi_a_mensagem(String _mensagem) {
        String msgTela = paginaCadastro.pegarNotificacao();
        Assert.assertEquals(_mensagem, msgTela);
        screenshot();
    }

    /**
     * Fluxo Alternativo
     * */
    @E("o usuario pressiona ENTER no teclado, mickhill")
    public void o_usuario_pressiona_enter_no_teclado_mickhill() {
        paginaCadastro.pressEnter();
    }
}
