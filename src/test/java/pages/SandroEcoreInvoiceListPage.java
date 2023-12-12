package pages;

import org.openqa.selenium.By;
import runner.support.Actions;

public class SandroEcoreInvoiceListPage extends Actions {

    private By linkInvoiceDetails = By.xpath("(//a)[2]");


    public String validaUrl(){
        String url = get_url();
        return url;
    }

    public void clikLinkInvoiceDetails(){
        click_link(linkInvoiceDetails);
        getNewTab();
    }

}
