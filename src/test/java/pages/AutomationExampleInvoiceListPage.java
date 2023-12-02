package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

import java.util.ArrayList;

public class AutomationExampleInvoiceListPage extends BasePage {
    //mapping
    private String urlInvoiceList = "tbody";
    private By invoiceListTitle = By.xpath("//h2[contains(text(), \"Invoice List\")]");
    private By firstInvoiceLink = By.cssSelector("a[href='/invoice/0']");

    //Elements TesCase 03
    private By hotelName = By.xpath("//h4[contains(text(), 'Rendezvous Hotel')]");
    private By invoiceDate = By.xpath("//li[contains(text(), '14/01/2018')]");
    private By dueDate = By.xpath("//li[contains(text(), '15/01/2018')]");
    private By invoiceNumber = By.xpath("//h6[contains(text(),'Invoice #110')]");
    private By bookingCode = By.cssSelector("td:nth-child(2)");
    private By customerDetails = By.xpath("//div[contains(text(), 'JOHNY SMITH')]");
    private By room = By.cssSelector(("tr:nth-child(2) td:nth-child(2)"));
    private By chekIn = By.cssSelector(("tr:nth-child(5) td:nth-child(2)"));
    private By chekOut = By.cssSelector(("tr:nth-child(6) td:nth-child(2)"));
    private By totalStayCount = By.cssSelector(("tr:nth-child(3) td:nth-child(2)"));
    private By totalStayAmount = By.cssSelector(("tr:nth-child(4) td:nth-child(2)"));
    private By depositNow = By.cssSelector(("tr:nth-child(4) td:nth-child(2)"));
    private By taxEVAT = By.cssSelector(("tbody:nth-child(2) tr:nth-child(1) td:nth-child(2)"));
    private By totalAmount = By.cssSelector(("tbody:nth-child(2) tr:nth-child(1) td:nth-child(3)"));


    //acctions
    public String getTittleInvoiceList() {
        waitElementVisible(invoiceListTitle, 5);
        return driver.findElement(invoiceListTitle).getText();
    }
    public void clickFirstInvoiceLink(){
        waitElementVisible(firstInvoiceLink, 4);
        driver.findElement(firstInvoiceLink).click();
    }
    public void switchWindow(){
        ArrayList<String> abas = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(abas.get(1));
    }

    public String getHotelName(){
        return  driver.findElement(hotelName).getText();
    }
    public String getInvoiceDate(){
        return  driver.findElement(invoiceDate).getText();
    }

    public String getDueDate(){
        return driver.findElement(dueDate).getText();
    }
    public String getInvoiceNumber(){
        return driver.findElement(invoiceNumber).getText();
    }
    public String getBookingCode(){
        return driver.findElement(bookingCode).getText();
    }

    public String getCustomerDetails() {
        return driver.findElement(customerDetails).getText();
    }

    public String getRoom(){
        return driver.findElement(room).getText();
    }
    public String getChekin() {
        return driver.findElement(chekIn).getText();
    }
}
