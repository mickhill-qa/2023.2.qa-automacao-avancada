package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.base_class.BasePage;
import steps.Hooks;

import java.util.Random;

public class CadastroPage extends BasePage {

    private By btnNovoUsuario = By.xpath ("//*[@id=bs-example-navbar-collapse-1]/ul/li[2]/a");

    private By campoNome = By.id("nome");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By btnCadastrar = By.className("btn");
    private By mensagem = By.cssSelector("alert alert-success");
    public void validaPaginaCadastro() {
        driver.get("https://seubarriga.wcaquino.me/cadastro");
    }
    public void preencherCadastro(String nome, String email, String senha) {
        driver.findElement(campoNome).sendKeys(nome);
        driver.findElement(campoEmail).sendKeys(email);
        driver.findElement(campoSenha).sendKeys(senha);

    }
    public void clicarBtnCadastrar() {
        driver.findElement(btnCadastrar).click();
    }
    public void validarCadastro() {
        driver.findElements(mensagem);

    }
}