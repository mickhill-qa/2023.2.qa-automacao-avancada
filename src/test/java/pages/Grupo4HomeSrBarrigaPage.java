package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class Grupo4HomeSrBarrigaPage extends BasePage {
    private By sucessTxt = By.cssSelector("div[role='alert']");

         public String verefyLogin () {
            String text = driver.findElement(sucessTxt).getText();
            return text;
         }
}
