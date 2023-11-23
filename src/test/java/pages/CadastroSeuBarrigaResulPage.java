package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;

import java.util.List;

public class CadastroSeuBarrigaResulPage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/cadastrarUsuario";
    private By formResult = By.xpath("/html/body/div[3]/form");
    private By msgResult = By.xpath("/html/body/div[1]");

    public Boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }

    public String getMsgResult() {
        return driver.findElement(msgResult).getText();
    }

    public WebElement getFormResult() {
        return driver.findElement(formResult);
    }
}
