package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class SeuBarrigaCadastroPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/cadastro";

    private By inputNome = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By btnCadastrar = By.cssSelector("input[value='Cadastrar']");

    private By textNotificacao = By.cssSelector("div[role='alert']");

    public void open() {
        driver.get(url);
    }

    public void preNome(String _nome) {
        driver.findElement(inputNome).sendKeys(_nome);
    }

    public void preEmail(String _email) {
        driver.findElement(inputEmail).sendKeys(_email);
    }

    public void preSenha(String _senha) {
        driver.findElement(inputSenha).sendKeys(_senha);
    }

    public void clicarCadastro() {
        driver.findElement(btnCadastrar).click();
    }


    public String pegarNotificacao() {
        waitElementVisible(textNotificacao, 5);
        return driver.findElement(textNotificacao).getText();
    }

}
