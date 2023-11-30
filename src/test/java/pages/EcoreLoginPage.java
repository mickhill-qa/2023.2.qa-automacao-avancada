package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runner.base_class.BasePage;

import static java.awt.SystemColor.text;

public class EcoreLoginPage extends BasePage {

    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/";
    private By inputName = By.xpath("//input[@name='username']");
    private By inputPassword = By.xpath("//input[@name='password']");
    private By btnLogin = By.id("btnLogin");
    public void open() { driver.get(url); }
    public void tofillinName(String _name) { driver.findElement(inputName).sendKeys(_name); }
    public void tofillinPassword(String _password) { driver.findElement(inputPassword).sendKeys(_password); }
    public void clickLogin() { driver.findElement(btnLogin).click();}
    public void pressEnter() { actions.sendKeys(Keys.ENTER).perform();}

}
