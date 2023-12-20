package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runner.base_class.BasePage;

public class Grupo5LoginPage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/login";
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By btnEntrar = By.cssSelector("button[type=submit]");
    private By dangerMessage = By.className("alert");
    public void abrir ()
    {
        driver.get(url);
    }
    public void preencherEmail(String _email)
    {
        driver.findElement(inputEmail).sendKeys(_email);
    }
    public void preencherSenha(String _senha)
    {
        driver.findElement(inputSenha).sendKeys(_senha);
    }
    public void clicarBtnLogin()
    {
        driver.findElement(btnEntrar).click();
    }
    public String pegarMensagemRetornada()
    {
        waitElementVisible(dangerMessage,5);
        return driver.findElement(dangerMessage).getText();
    }
    public Boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }
    public void pressionarEnter() {
        actions.sendKeys(Keys.ENTER).perform();
    }
}
