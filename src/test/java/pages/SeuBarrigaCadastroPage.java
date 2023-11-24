package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class SeuBarrigaCadastroPage extends BasePage {
    private String cadastroUrl = "https://seubarriga.wcaquino.me/cadastro";
    private By nameField = By.id("nome");
    private By emailField = By.id("email");
    private By passwordField = By.id("senha");
    private By cadastrarButton = By.xpath("//input[@value='Cadastrar']");
    private By textMessage = By.cssSelector("");
    //metodos de ações
    public void preencherNome(String nome){
        driver.findElement(nameField).sendKeys(nome);
    }
    public void preencherPassword(String senha){
        driver.findElement(passwordField).sendKeys(senha);
    }
    public void preencherEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void preencherCamposCadastro(String email, String senha, String nome){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(nameField).sendKeys(nome);
        driver.findElement(passwordField).sendKeys(senha);
    }

    public void clicarCadastro(){
        driver.findElement(cadastrarButton).click();
    }

    public void abrir() {
        driver.get(cadastroUrl);
    }
}