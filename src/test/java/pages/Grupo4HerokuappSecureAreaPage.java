package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Grupo4HerokuappSecureAreaPage extends BasePage {
    private By msgConfirmed = By.id("flash");

    public String pegaMensagem() {
        waitElementVisible(msgConfirmed,5);
        return driver.findElement(msgConfirmed).getText();
    }
    public String pegarUrl() { return driver.getCurrentUrl(); }
}
