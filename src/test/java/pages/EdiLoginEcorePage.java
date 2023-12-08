package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runner.base_class.BasePage;

public class EdiLoginEcorePage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app";
    private By inputUsername = By.name("username");
    private By inputPassword = By.name("password");
    private By btnLogin = By.id("btnLogin");
    private By mensagem = By.className("alert");

    public void abrir() {
        driver.get(url);
    }
    public void setInputUsername(String _username) { driver.findElement(inputUsername).sendKeys(_username);}
    public void setInputPassword(String _password) {
        driver.findElement(inputPassword).sendKeys(_password);
    }
    public void clickBtnLogin() {
        driver.findElement(btnLogin).click();
    }
    public String validaMensagem(String Texto) {
        waitElementVisible(mensagem,2);
        return driver.findElement(mensagem).getText();
    }
}

