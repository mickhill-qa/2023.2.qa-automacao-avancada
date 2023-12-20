package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runner.base_class.BasePage;

public class Gupo4SrBarrigaLoginPage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/login";
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By botaoEntrar = By.cssSelector("button[type='submit']");
    private By msgAlert = By.cssSelector(".alert.alert-danger");

    public void openSrBarriga() {
        driver.get(url);
    }
    public void preencheEmail(String _email) {
        driver.findElement(campoEmail).sendKeys(_email);
    }
    public void preencheSenha(String _senha) {
        driver.findElement(campoSenha).sendKeys(_senha);
    }
    public void clicaEntrar() {
        driver.findElement(botaoEntrar).click();
    }

    public void apertarEnter() {
        driver.findElement(campoSenha).sendKeys(Keys.ENTER);
    }
    public String pegarMsgAlerta() {
        return  driver.findElement(msgAlert).getText();
    }
}
