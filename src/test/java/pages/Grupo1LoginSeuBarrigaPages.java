package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.base_class.BasePage;
import steps.Hooks;

public class Grupo1LoginSeuBarrigaPages extends BasePage {

    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By btnClicar = By.cssSelector("button[type=submit]");
    private By validaMsg = By.className("alert");

    public void preencherLogin(String email, String senha) {
        driver.findElement(campoEmail).sendKeys(email == null ? "" : email);
        driver.findElement(campoSenha).sendKeys(senha == null ? "" : senha);
    }

    public void setSenha(String senha) {
        driver.findElement(campoSenha).sendKeys(senha == null ? "" : senha);

    }

    public void setEmail(String email) {
        driver.findElement(campoEmail).sendKeys(email == null ? "" : email);
    }

    public void clicarBtnLogin() {
        driver.findElement(btnClicar).click();
    }

    public void validaPaginaLogin() {
        driver.get("https://seubarriga.wcaquino.me/login");
    }

    public String validaMsgErro() {
        return driver.findElement(validaMsg).getText();
    }
}