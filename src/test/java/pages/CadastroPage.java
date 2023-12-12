package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class CadastroPage extends BasePage {
    public void validaPaginaCadastro() {

        driver.get("https://seubarriga.wcaquino.me/cadastro");
    }

    private By campoNome = By.id("nome");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By btnCadastrar = By.className("btn");
    private By mensagem = By.cssSelector("alert alert-success");

    public void preencherCadastro(String nome, String senha) {
    }
    public void clicarBtnCadastrar() {
        driver.findElement(btnCadastrar).click();
    }
    public String validarMensagem() {
        driver.findElements(mensagem);
        return null;
    }
}