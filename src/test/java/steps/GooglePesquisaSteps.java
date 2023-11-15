package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.GooglePesquisaPage;
import pages.GoogleResultadosPesquisaPage;
import runner.base_class.BaseSteps;
import java.util.List;

public class GooglePesquisaSteps extends BaseSteps {
    GooglePesquisaPage paginaPesquisa = new GooglePesquisaPage();
    GoogleResultadosPesquisaPage paginaResultados = new GoogleResultadosPesquisaPage();

    @Dado("que o usuario esta na pagina de pesquisa")
    public void que_o_usuario_esta_na_pagina_de_pesquisa() {
        paginaPesquisa.abrir();
        screenshot();
    }

    @Quando("o usuario preeche a pequisa com {string}")
    public void o_usuario_preeche_a_pequisa_com(String _pesquisa) {
        paginaPesquisa.preencherCampoPesquisa(_pesquisa);
        screenshot();
    }

    @Quando("o usuario clica no botao PESQUISAR")
    public void o_usuario_clica_no_botao_pesquisar() {
        paginaPesquisa.clicarBtnPesquisar();
    }

    @Entao("o sistema redireciona para a pagina de resultado")
    public void o_sistema_redireciona_para_a_pagina_de_resultado() {
        Assert.assertTrue(paginaResultados.verificarSeEstouNapagina());
        screenshot();
    }

    @Entao("o sistema mostra um numero de pesquisa")
    public void o_sistema_mostra_um_numero_de_pesquisa() {
        Integer valor = paginaResultados.getStatusResultados();
        Assert.assertTrue(valor > 0);
    }

    @Entao("o sistema mostra uma lista de links")
    public void o_sistema_mostra_uma_lista_de_links() {
        List<WebElement> lista = paginaResultados.getListaLinks();
        Assert.assertTrue(lista.size() > 0);
    }
}
