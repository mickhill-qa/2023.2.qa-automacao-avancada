package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Grupo5SecureAreaPage extends BasePage {
    private String url = "https://the-internet.herokuapp.com/secure";
    private By mensagemRetornada = By.id("flash");

    public Boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }

    public String pegarMensagemRetornada()
    {
        waitElementVisible(mensagemRetornada,5);
        return driver.findElement(mensagemRetornada).getText();
    }


}
