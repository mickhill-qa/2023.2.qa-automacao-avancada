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
        String msgRetorno = driver.findElement(mensagemRetornada).getText();
        String msgTratada = msgRetorno.trim().replaceAll("\\s+$", "")
                .replaceAll("×$", "").replaceAll("\\n$", "");
        return msgTratada;
    }
}
