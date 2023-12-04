package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class IngridSeuBarrigaResultadoCadastroPage extends BasePage {
    private String url = "https:/seubarriga.wcaquino.me/cadastrarUsuario";
    private By mensagemSucesso = By.cssSelector("div.alert.alert-success");
    private By mensagemError = By.cssSelector("div.alert.alert-danger");

    public Boolean verificarSeEstouNaPagina(){
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }
    public String getMensagemSucesso(){
        String text = driver.findElement(mensagemSucesso).getText();
        return text;
    }
    public String getMensagemError(){
        String text = driver.findElement(mensagemError).getText();
        return text;
    }
}
