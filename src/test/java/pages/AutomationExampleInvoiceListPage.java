package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class AutomationExampleInvoiceListPage extends BasePage {
    //mapping
    private String urlInvoiceList = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
    private By invoiceListTitle = By.xpath("//h2[contains(text(), \"Invoice List\")]");
    //acctions
    public String getTittleInvoiceList() {
        waitElementVisible(invoiceListTitle, 5);
        return driver.findElement(invoiceListTitle).getText();
    }


}
