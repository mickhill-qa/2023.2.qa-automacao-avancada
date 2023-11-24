package josewinny.pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;


public class CadastroSeuBarrigaPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/cadastro";
    private By inputNome = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By btnCadastrar = By.className("btn");
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

    public Boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }

    public Boolean validaNotificacao(String _mensagem) {
        waitElementVisible(textNotificacao, 5);
        String mensagemCapturada = driver.findElement(textNotificacao).getText();
        return _mensagem == mensagemCapturada;
    }


}
