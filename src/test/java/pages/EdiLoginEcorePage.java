package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runner.base_class.BasePage;

public class EdiLoginEcorePage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app";
    private By inputUsername = By.cssSelector("input[name='username']");
    private By inputPassword = By.cssSelector("input[name='password']");
    private By btnLogin = By.id("btnLogin");
    private By mensagem = By.className("alert");
    private String urlaccount = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";

    public void abrir() {
        driver.get(url);
    }

    public void setInputUsername() {
        driver.findElement(inputUsername).sendKeys("demouser");
    }

    public void setInputPassword() {
        driver.findElement(inputPassword).sendKeys("abc123");
    }

    public void clickBtnLogin() {
        driver.findElement(btnLogin).click();
    }

    public void pressEnter() {
        actions.sendKeys(Keys.ENTER).perform();
    }
    public String validaMensagem(String Texto) {
        Texto = driver.findElement(mensagem).getText();
        return Texto;
    }
}

