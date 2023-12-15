package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Grupo1HerokuappLoginPage extends BasePage {
    private String Url_acesso = "https://the-internet.herokuapp.com/login";
    private By campo_username = By.id("username");
    private By campo_password = By.id("password");
    private By btn_login = By.className("radius");
    private By valida_msg = By.id("flash");
    private String url_areasegura = "https://the-internet.herokuapp.com/secure";

    public void abrir() {
        driver.get(Url_acesso);
    }

    public void validaPage() {
        String urlAtual = driver.getCurrentUrl();
        Assert.assertEquals(urlAtual, Url_acesso);
    }

    public void UserLogin(String username) {
        driver.findElement(campo_username).sendKeys(username);
    }

    public void PassLogin(String password) {
        driver.findElement(campo_password).sendKeys(password);
    }

    public void clickBtnLogin() {
        driver.findElement(btn_login).click();
    }

    public String validaMsg() {
       return driver.findElement(getValida_msg()).getText();

    }

    public void acessoSemLogar() {
        driver.get(url_areasegura);
    }

    public By getValida_msg() {
        return valida_msg;
    }

    public void setValida_msg(By valida_msg) {
        this.valida_msg = valida_msg;
    }
}

