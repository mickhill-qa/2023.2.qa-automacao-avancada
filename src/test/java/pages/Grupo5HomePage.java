package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Grupo5HomePage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/logar";
    private By successMessage = By.className("alert");
    public Boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }
    public String pegarMensagemRetornada()
    {
        waitElementVisible(successMessage,5);
        return driver.findElement(successMessage).getText();
    }
}
