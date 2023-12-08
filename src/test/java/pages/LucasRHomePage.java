package pages;

import io.cucumber.gherkin.Main;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

import java.util.ArrayList;


public class LucasRHomePage extends BasePage {

    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
    private By textInvoiceList = By.xpath("//h2[normalize-space()='Invoice List']");

    private String urlInvoice = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/invoice/0";

    private By getInvoice = By.cssSelector("a[href='/invoice/0']");

    public Boolean getUrlHome() {
        String urlAtual = driver.getCurrentUrl();
       return urlAtual.contains(url);
    }

    public String getTextHome() {
        waitElementVisible(textInvoiceList, 5);
        return driver.findElement(textInvoiceList).getText();
    }

    public void clickInvoiceDetail(){
        String MainTab = driver.getWindowHandle();
        driver.findElement(getInvoice).click();
        ArrayList<String> Newtabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(Newtabs.get(1));

    }

}
