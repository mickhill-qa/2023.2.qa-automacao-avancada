package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class IngridLoginEcorePage extends BasePage {
    private String url = " https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/";
    private By userName = By.name("username");
    private By userPassword = By.name("password");
    private By btnLogin = By.id("btnLogin");
    private By errorMessage = By.xpath("//div[@class='alert alert-danger mt-3']");

    public void open(){
        driver.get(url);
    }

    public void sendUsername(String _username){
        driver.findElement(userName).sendKeys(_username);
    }

    public void sendPassword(String _password){
        driver.findElement(userPassword).sendKeys(_password);
    }

    public void clickBtnLogin(){
        driver.findElement(btnLogin).click();
    }

    public String getErrorMessage(){
        String message = driver.findElement(errorMessage).getText();
        return message;
    }
}