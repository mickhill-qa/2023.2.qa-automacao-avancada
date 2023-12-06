package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EdiListEcorePage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";

    public boolean invoiceList() {
        String urlAtual = driver.getCurrentUrl();
        if (urlAtual.contains(url))
            return true;
        else
            return false;

    }

    public void clickInvoice() {
        WebElement invoiceLink = driver.findElement(By.xpath("(//a)[2]"));
        invoiceLink.click();

    }

    public void validarNovaAba() {
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
    }

}
