package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.base_class.BasePage;

public class CadastroSeuBarrigaPage extends BasePage {
    private By fieldNome = By.id("nome");
    private By fieldEmail = By.id("email");
    private By fieldSenha = By.id("senha");
    private By btnCadastrar = By.className("btn");
    private By validaMessage = By.className("alert");



    public void ValidaCadastroPage(){
        driver.get("https://seubarriga.wcaquino.me/cadastro");
    }

    public void RealizarCadastro(String nome, String email, String senha){
        driver.findElement(fieldNome).sendKeys(nome);
        driver.findElement(fieldEmail).sendKeys(email);
        driver.findElement(fieldSenha).sendKeys(senha);

    }

    public void BtnCadastrar(){
        waitElementVisible(btnCadastrar, 1);
        driver.findElement(btnCadastrar).click();
    }

    public void ValidaMensagem(String mensagem){
        String texto = driver.findElement(validaMessage).getText();
        Assert.assertEquals(texto, mensagem);
    }





}
