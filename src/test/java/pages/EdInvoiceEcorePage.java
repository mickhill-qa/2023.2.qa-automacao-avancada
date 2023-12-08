package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

import java.util.ArrayList;

public class EdInvoiceEcorePage extends BasePage {
    private String url = "automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
    private String invoiceUrl = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/invoice/0";
    private By InvoiceDetailsLink = By.cssSelector("a[href='/invoice/0'][target='_blank']");


    public boolean ValidInvoiceListPage(){
        String urlAtual = driver.getCurrentUrl();
        if(urlAtual.contains(url))
            return true;
        else
            return false;
    }
    public boolean ValidInvoiceUrl(){
        String urlAtual = driver.getCurrentUrl();
        if(urlAtual.contains(invoiceUrl))
            return true;
        else
            return false;
    }

    public void ClickOnInvoiceDetailsLink(){
        driver.findElement(InvoiceDetailsLink).click();
    }
    public void SwitchTab(){
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}