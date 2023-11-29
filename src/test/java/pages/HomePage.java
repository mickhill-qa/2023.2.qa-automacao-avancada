package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class HomePage extends BasePage {

    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
    private By textInvoiceList = By.xpath("//h2[normalize-space()='Invoice List']");

    public void getUrlHome () {
        driver.get(url);
    }

    public void getTextHome() {
        driver.findElement(textInvoiceList).getText();
    }
}
