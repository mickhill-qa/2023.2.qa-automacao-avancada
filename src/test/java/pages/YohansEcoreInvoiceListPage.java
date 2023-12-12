package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;

import java.util.List;

public class YohansEcoreInvoiceListPage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
    private By invoiceDetailPageButtonLinkList = By.cssSelector("div.row > div.col.border > a");
    public boolean isInvoiceListPage(){
        return (driver.getCurrentUrl().equals(this.url));
    }
    public void clickLinkInvoiceDetails(int index){
        List<WebElement> invoiceDetailLinkList = driver.findElements(invoiceDetailPageButtonLinkList);
        invoiceDetailLinkList.get(index -1).click();
    }
}
