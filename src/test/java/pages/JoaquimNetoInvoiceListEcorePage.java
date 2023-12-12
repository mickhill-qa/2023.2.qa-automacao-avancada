package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class JoaquimNetoInvoiceListEcorePage extends BasePage {
    private String url = "automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";

    private By btnInvoiceDet = By.xpath("/html/body/section/div/div[2]/div[5]/a");
    public void clicarbtnInvoiceDet()
    {
        driver.findElement(btnInvoiceDet).click();
    }
    public boolean estouAqui()
    {
        String urlAtual = driver.getCurrentUrl();
        if(urlAtual.contains(url))
            return true;
        else
            return false;
    }
}
