package pages.josewinny;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class LoginSeuBarrigaPage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/login";
    private By textNotificacao = By.cssSelector("div[role='alert']");
    public Boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }

    public String pegarNotificacao() {
        waitElementVisible(textNotificacao, 5);
        return driver.findElement(textNotificacao).getText();
    }

    public Boolean validaNotificacao(String _mensagem) {
        waitElementVisible(textNotificacao, 5);
        String mensagemCapturada = driver.findElement(textNotificacao).getText();
        return _mensagem == mensagemCapturada;
    }
}
