package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class SeuBarrigaLoginPage extends BasePage {

    private String url2 = "https://seubarriga.wcaquino.me/login";

    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");

    private By btnEntrar = By.cssSelector("body > div.jumbotron.col-lg-4 > form > button");

    private By textNotificacao = By.cssSelector("div[role='alert']");

    public void open() {
        driver.get(url2);
    }

    public void preEmail(String _email) {
        driver.findElement(inputEmail).sendKeys(_email);
    }

    public void preSenha(String _senha) {
        driver.findElement(inputSenha).sendKeys(_senha);
    }

    public void clicarLogin() {
        driver.findElement(btnEntrar).click();
    }

    public String pegarNotificacao() {
        waitElementVisible(textNotificacao, 5);
        return driver.findElement(textNotificacao).getText();
    }

}
