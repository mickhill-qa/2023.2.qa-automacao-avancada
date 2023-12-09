package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class RenatoLoginPage extends BasePage {

    private By username = By.cssSelector("input[name='username']");
    private By password = By.cssSelector("input[name='password']");
    private By btnLogin = By.id("btnLogin");
    private By msgError = By.className("alert");

    public void open(String url){
        driver.get(url);
    }
    public void fillTheFields(String _username, String _password){
        driver.findElement(username).sendKeys(_username);
        driver.findElement(password).sendKeys(_password);
        driver.findElement(btnLogin).click();
    }

    public String msgError(){
        String msg = driver.findElement(msgError).getText();
        return msg;
    }



}
