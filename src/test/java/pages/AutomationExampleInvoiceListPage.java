package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

import java.util.ArrayList;

public class AutomationExampleInvoiceListPage extends BasePage {
    //mapping
    private String urlInvoiceList = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
    private By invoiceListTitle = By.xpath("//h2[contains(text(), \"Invoice List\")]");
    private By firstInvoiceLink = By.cssSelector("a[href='/invoice/0']");
    //Elements TesCase 03
    private By hotelName = By.xpath("//h4[contains(text(), 'Rendezvous Hotel')]");
    private By invoiceDate = By.xpath("//li[contains(text(), ' 14/01/2018')]");
    private By dueDate = By.xpath("//li[contains(text(), ' 15/01/2018')]");
    private By invoiceNumber = By.xpath("//h6[contains(text(),'Invoice #110')]");
    private By BookingCode = By.xpath("");

    //acctions
    public String getTittleInvoiceList() {
        waitElementVisible(invoiceListTitle, 5);
        return driver.findElement(invoiceListTitle).getText();
    }
    public void clickFirstInvoiceLink(){
        waitElementVisible(firstInvoiceLink, 4);
        driver.findElement(firstInvoiceLink).click();
    }
    public void switchWindow(){
        ArrayList<String> abas = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(abas.get(1));

    }
    public void getElementsValidationInvoiceDetails(){

    }

}
