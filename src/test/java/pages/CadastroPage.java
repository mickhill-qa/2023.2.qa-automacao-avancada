package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class CadastroPage extends BasePage {

    private By btnNovoUsuario = By.xpath("//*[@id=bs-example-navbar-collapse-1]/ul/li[2]/a");
    private By campo_nome = By.id("nome");
    private By campo_email = By.id("email");
    private By campo_senha = By.id("senha");
    private By btnCadastrar = By.cssSelector("input[class='btn btn-primary']");
    private By mensagem = By.className("alert");

    public void validaPaginaCadastro() {
        driver.get("https://seubarriga.wcaquino.me/cadastro");
    }

    public void preencherCadastro(String _nome, String _email, String _senha) {
        driver.findElement(campo_nome).sendKeys(_nome);
        driver.findElement(campo_email).sendKeys(_email);
        driver.findElement(campo_senha).sendKeys(_senha);
    }

    public void preencherCadastroSemSenha(String _nome, String _email) {
        driver.findElement(campo_nome).sendKeys(_nome);
        driver.findElement(campo_email).sendKeys(_email);
    }

    public String pegarMensagem() {
        return driver.findElement(mensagem).getText();
    }

    public void clicarBtnCadastrar() {
        driver.findElement(btnCadastrar).click();
    }

}