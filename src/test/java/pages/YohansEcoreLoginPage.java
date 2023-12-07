package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class YohansEcoreLoginPage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app";
    private By usernameInput = By.name("username");
    private By passwordInput = By.name("password");
    private By loginButton = By.id("btnLogin");
    private By errorTextMessage = By.xpath("/html/body/div/div[1]");

    public void openPage ()
    {
        driver.get(this.url);
    }
    public void fillUsernameField(String username){
        driver.findElement(this.usernameInput).sendKeys(username);
    }
    public void fillPasswordField(String password){
        driver.findElement(this.passwordInput).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(this.loginButton).click();
    }
    public boolean isLoginPage(){
        return (driver.getCurrentUrl().equals(this.url));
    }
    public String getErrorMessage(){
        waitElementVisible(errorTextMessage,5);
        if (driver.findElement(errorTextMessage).isDisplayed()){
            return driver.findElement(errorTextMessage).getText();
        }
        return null;
    }
}
