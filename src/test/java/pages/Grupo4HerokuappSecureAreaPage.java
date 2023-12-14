package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Grupo4HerokuappSecureAreaPage extends BasePage {
    private String url = "https://the-internet.herokuapp.com/secure";
    private By msgError = By.id("#flash");
    private By btnLogout = By.cssSelector("#content > div > a");
    public void abreNavegador() {
        driver.get(url);
    }

    public String pegaMensagem() {
        waitElementVisible(msgError,5);
        return driver.findElement(msgError).getText();
    }
    public void clicarLogout() {
        driver.findElement(btnLogout).click();
    }
}
