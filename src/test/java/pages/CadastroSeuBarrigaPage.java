package pages;

import org.junit.Assert;
import runner.base_class.BasePage;
import org.openqa.selenium.By;

public class CadastroSeuBarrigaPage extends BasePage {

    String url = "https://seubarriga.wcaquino.me/login";
    By newUserModal = By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a");
    By inputName = By.xpath("//*[@id=\"nome\"]");
    By inputEmail = By.xpath("//*[@id=\"email\"]");
    By inputPassword = By.xpath("//*[@id=\"senha\"]");
    By singUpButton = By.xpath("/html/body/div[2]/form/input");
    By singUpSucessMessange = By.xpath("/html/body/div[1]");

    public void openPage() {
        driver.get(url);
    }

    public void openSingup() {
        driver.findElement(newUserModal).click();
    }

    public void setName(String _name){
        driver.findElement(inputName).sendKeys(_name);
    }

    public void setEmail(String _email){
        driver.findElement(inputEmail).sendKeys(_email);
    }

    public void setPassword(String _password){
        driver.findElement(inputPassword).sendKeys(_password);
    }

    public void clickSingUp() {
        driver.findElement(singUpButton).click();
    }

    public String singUpVerify() {
        String txt = driver.findElement(singUpSucessMessange).getText();
        return txt;
    }
}
