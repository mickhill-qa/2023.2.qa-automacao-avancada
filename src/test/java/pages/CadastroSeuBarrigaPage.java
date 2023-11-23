package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

import java.util.Random;

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
        driver.findElement(btnCadastrar).click();
    }

    public void cadastrarSeuBarriga(String nome, String email, String senha){
        driver.findElement(fieldNome).sendKeys(nome);
        driver.findElement(fieldEmail).sendKeys(email);
        driver.findElement(fieldSenha).sendKeys(senha);
        driver.findElement(btnCadastrar).click();
    }

    public void messageValidation(String message){
        String text = driver.findElement(validaMessage).getText();
        Assert.assertEquals(text, message);
    }

}
