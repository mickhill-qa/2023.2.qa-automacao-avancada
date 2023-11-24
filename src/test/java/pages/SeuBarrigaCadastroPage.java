package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class SeuBarrigaCadastroPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/cadastro";
    private By inputNome = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By btnCadastrar = By.cssSelector("input[value='Cadastrar']");
    private By mensagem = By.xpath("//div[starts-with(@class, 'alert alert-')]");

    public String validarMensagem() {
        String text = driver.findElement(mensagem).getText();
        return text;
    }

    public void abrir() {
        driver.get(url);
    }

    public void clicarbtnCadastrar() {
        driver.findElement(btnCadastrar).click();
    }

    public void preencherCamposCadastro(String nome, String email, String senha) {
        driver.findElement(inputNome).sendKeys(nome);
        driver.findElement(inputEmail).sendKeys(email);
        driver.findElement(inputSenha).sendKeys(senha);
    }
}
