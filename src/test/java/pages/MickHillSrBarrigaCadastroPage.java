package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runner.base_class.BasePage;

public class MickHillSrBarrigaCadastroPage extends BasePage {
    private String url = "https://seubarriga.wcaquino.me/cadastro";
    private By inputNome = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By btnCadastrar = By.cssSelector("input[value='Cadastrar']");
    private By textNotificacao = By.cssSelector("div[role='alert']");

    public void abrir() {
        driver.get(url);
    }

    public void preencherNome(String _nome) {
        driver.findElement(inputNome).sendKeys(_nome);
    }

    public void preencherEmail(String _email) {
        driver.findElement(inputEmail).sendKeys(_email);
    }

    public void preencherSenha(String _senha) {
        driver.findElement(inputSenha).sendKeys(_senha);
    }

    public void clicarCadatro() {
        driver.findElement(btnCadastrar).click();
    }

    public void pressEnter() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    public String pegarNotificacao() {
        waitElementVisible(textNotificacao);
        return driver.findElement(textNotificacao).getText();
    }
}
