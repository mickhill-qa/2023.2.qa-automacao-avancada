package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;
import runner.support.Utils;

import java.util.ArrayList;
import java.util.List;

public class EdiListEcorePage extends Utils {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";

    private By linkDetails = By.xpath("(//a)[2]");
    private By clickInvoiceDetails = By.cssSelector("div.row > div.col.border > a");

    public boolean invoiceList() {
        String urlAtual = driver.getCurrentUrl();
        if (urlAtual.contains(url))
            return true;
        else
            return false;
    }
    public void clikLinkInvoiceDetails(){
        click_LinkDetails(clickInvoiceDetails);
        getNewTab();
    }
}
