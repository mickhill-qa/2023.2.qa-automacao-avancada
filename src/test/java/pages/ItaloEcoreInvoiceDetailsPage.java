package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.base_class.BasePage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItaloEcoreInvoiceDetailsPage extends BasePage {

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
    private Map<String, String> bookings = new HashMap<>();
    private Map<String, String> billings = new HashMap<>();


    public Boolean isInvoiceListUrl() {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.contains(invoiceListUrl);
    }

    public Boolean isInvoiceDetailsUrl() {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.contains(invoiceDetailsUrl);
    }

    public void switchToInvoiceDetailsPage() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }

    public String getHotelName() {
        String _hotelName = driver.findElement(hotelName).getText();
        return _hotelName;
    }

    public String getInvoiceNumber() {
        String _invoiceNumber = driver.findElement(invoiceNumber).getText();
        String number = (_invoiceNumber.split(" ")[1]).trim().substring(1);
        return number;
    }

    public String getInvoiceDate() {
        String _invoiceDate = driver.findElement(invoiceDate).getText();
        String date = (_invoiceDate.split(":")[1]).trim();
        return date;
    }

    public String getDueDate() {
        String _dueDate = driver.findElement(dueDate).getText();
        String date = (_dueDate.split(":")[1]).trim();
        return date;
    }

    public String getCustomerDetails() {
        String _customerDetails = driver.findElement(customerDetails).getText();
        String details = _customerDetails.replace("\n", " ");
        return details;
    }

    public void clickInvoiceDetailsLink() {
        driver.findElement(invoiceDetailsLink).click();
    }

    public Map<String, String> getBookingDetails() {
        if (bookings.isEmpty()) {
            WebElement bookingTable = driver.findElement(bookingDetails);
            List<WebElement> rows = bookingTable.findElements(By.tagName("tr"));

            for (WebElement row : rows) {
                List<WebElement> columns = row.findElements(By.tagName("td"));

                for (int i = 0; i < columns.size(); i++) {
                    bookings.put(columns.get(0).getText(), columns.get(1).getText());
                }
            }
        }

        return bookings;
    }

    public Map<String, String> getBillingDetails() {
        if (billings.isEmpty()) {
            WebElement billingTable = driver.findElement(billingDetails);

            List<WebElement> heads = billingTable.findElements(By.tagName("thead"))
                    .get(0)
                    .findElements(By.tagName("td"));

            List<WebElement> lines = billingTable.findElements(By.tagName("tbody"))
                    .get(0)
                    .findElements(By.tagName("td"));

            for (int i = 0; i < heads.size(); i++) {
                billings.put(heads.get(i).getText(), lines.get(i).getText());
            }
        }

        return billings;
    }
}