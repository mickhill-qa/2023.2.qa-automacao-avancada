package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Grupo1HomeSeuBarrigaPage extends BasePage {
    private By validaHome = By.className("alert");
    public String validaHome(){
       return driver.findElement(validaHome).getText();
    }
    public String getErro()
    {
        waitElementVisible(validaHome,5);
        return driver.findElement(validaHome).getText();
    }

}
