package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class CadastroSeuBarrigaPage extends BasePage {

    private String url = "https://seubarriga.wcaquino.me/cadastro";
    private By inputNome = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By sendFormulario = By.cssSelector("input[value='Cadastrar']");

    public void abrir() {
        driver.get(url);
    }

    public void escreverNome(String _nome) {
        driver.findElement(inputNome).sendKeys(_nome);
    }

    public void escreverEmail(String _email) {
        driver.findElement(inputEmail).sendKeys(_email);
    }

    public void escreverSenha(String _email) {
        driver.findElement(inputSenha).sendKeys(_email);
    }

    public void submitFormulario() {
        driver.findElement(sendFormulario).click();
    }


}
