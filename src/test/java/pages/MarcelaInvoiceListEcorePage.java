package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;
import java.util.List;

public class MarcelaInvoiceListEcorePage extends BasePage {
    private String url = "automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
    private By linkInvoiceDetails = By.cssSelector("div.row > div.col.border > a");

    public boolean estouAqui()
    {
        String urlAtual = driver.getCurrentUrl();
        if(urlAtual.contains(url))
            return true;
        else
            return false;
    }

    public void clickInvoiceDetails(int index)
    {
        List<WebElement> element = driver.findElements(linkInvoiceDetails);
        element.get(index -1).click();
    }
}
