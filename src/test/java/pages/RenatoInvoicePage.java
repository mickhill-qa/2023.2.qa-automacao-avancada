package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class RenatoInvoicePage extends BasePage {

    private By title = By.className("mt-5");
    private By btnLogout = By.className("btn");
    private By btnInvoceDetails = By.cssSelector("a[href='/invoice/0']");

    public String validateTheInvoiceListPage(){
        String msg = driver.findElement(title).getText();
        return msg;
    }
    public void logout(){
        driver.findElement(btnLogout).click();
    }

    public void clickBtnInvoiceDetails(){
        driver.findElement(btnInvoceDetails).click();
    }
}
