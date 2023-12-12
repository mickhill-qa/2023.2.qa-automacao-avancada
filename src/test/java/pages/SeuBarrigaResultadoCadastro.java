package pages;

import runner.base_class.BasePage;

public class SeuBarrigaResultadoCadastro extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/cadastrarUsuario";

    public Boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }
}
