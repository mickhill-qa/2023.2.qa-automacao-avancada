package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class IngridInvoiceEcorePage extends BasePage {
    private final String invoiceListUrl = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
    private final String invoiceDetailsUrl = " https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/invoice/0";
    private By invoiceDetailsLink = By.cssSelector("section > div.container > div:nth-child(3) > div:nth-child(5)  > a");

    private By hotelName = By.cssSelector("body > section > div > h4");
    private By invoiceDate = By.cssSelector("div.container > ul > li:nth-child(1)");
    private By dueDate = By.cssSelector("div.container > ul > li:nth-child(2)");
    private By invoiceNumber = By.cssSelector("section > div > h6");
    private By customerDetails = By.cssSelector("section > div.container > div");
    private By billingDetails = By.xpath("(//table[@class='table'])[2]");
    private By bookingDetails = By.xpath("(//table[@class='table'])[1]");


    public Boolean isInvoiceListUrl() {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.contains(invoiceListUrl);
    }

    public Boolean isInvoiceDetailsUrl() {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.contains(invoiceDetailsUrl);
    }

    public void switchToInvoiceDetailsPage(){
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }

    public String getHotelName() {
        String _hotelName = driver.findElement(hotelName).getText();
        return _hotelName;
    }
    public String getInvoiceNumber(){
        String _invoiceNumber = driver.findElement(invoiceNumber).getText();
        String number = (_invoiceNumber.split(" ")[1]).trim().substring(1);
        return number;
    }

    public String getInvoiceDate(){
        String _invoiceDate = driver.findElement(invoiceDate).getText();
        String date = (_invoiceDate.split(":")[1]).trim();
        return date;
    }

    public String getDueDate(){
        String _dueDate = driver.findElement(dueDate).getText();
        String date = (_dueDate.split(":")[1]).trim();
        return date;
    }

    public String getCustomerDetails(){
        String _customerDetails = driver.findElement(customerDetails).getText();
        String details = _customerDetails.replace("\n", " ");
        return details;
    }

    public void clickInvoiceDetailsLink(){
        driver.findElement(invoiceDetailsLink).click();
    }
}

