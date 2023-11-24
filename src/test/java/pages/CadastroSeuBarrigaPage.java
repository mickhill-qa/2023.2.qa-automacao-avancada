package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

import java.util.Random;

import static runner.base_class.BaseSteps.screenshot;

public class CadastroSeuBarrigaPage extends BasePage {
    Random random = new Random();
    private By fieldNome = By.id("nome");
    private By fieldEmail = By.id("email");
    private By fieldSenha = By.id("senha");
    private By btnCadastrar = By.className("btn");
    private By validaMessage = By.className("alert");

    public void validaTelaCadastro(){
        driver.get("https://seubarriga.wcaquino.me/cadastro");
    }
    public void cadastrarSucesso(String nome, String email, String senha){
        nome = "Teste Automation" + random.nextInt();
        email = "testeautomation" + random.nextInt() + "@seubarriga.com";
        senha = "S" + random.nextInt() + "!";

        driver.findElement(fieldNome).sendKeys(nome);
        driver.findElement(fieldEmail).sendKeys(email);
        driver.findElement(fieldSenha).sendKeys(senha);
        screenshot();
        driver.findElement(btnCadastrar).click();
    }

    public void cadastrarSeuBarriga(String nome, String email, String senha){
        driver.findElement(fieldNome).sendKeys(nome);
        driver.findElement(fieldEmail).sendKeys(email);
        driver.findElement(fieldSenha).sendKeys(senha);
        screenshot();
        driver.findElement(btnCadastrar).click();
    }

    public String messageValidation(String message){
        message = driver.findElement(validaMessage).getText();
        return message;
    }

}
