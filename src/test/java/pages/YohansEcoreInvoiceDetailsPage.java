package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

import java.util.ArrayList;

public class YohansEcoreInvoiceDetailsPage extends BasePage {
    private String invoiceDetailListPageUrl = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
    private String invoiceDetailsPageUrl = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/invoice/0";

    private By hotelNameText = By.cssSelector("h4.mt-5");
    private By invoiceDateText = By.xpath("/html/body/section/div/ul/li[1]");
    private By dueDateText = By.xpath("/html/body/section/div/ul/li[2]");
    private By invoiceNumberText = By.cssSelector("h6.mt-2");
    private By bookingCodeText = By.cssSelector("div.container>table.table>tbody>tr:nth-child(1)>td:nth-child(2)");
    private By customerDetailsText = By.cssSelector("div.container>div");
    private By roomText = By.cssSelector("div.container>table.table>tbody>tr:nth-child(2)>td:nth-child(2)");
    private By checkInText = By.cssSelector("div.container>table.table>tbody>tr:nth-child(5)>td:nth-child(2)");
    private By checkOutText = By.cssSelector("div.container>table.table>tbody>tr:nth-child(6)>td:nth-child(2)");
    private By totalStayCountText = By.cssSelector("div.container>table.table>tbody>tr:nth-child(3)>td:nth-child(2)");
    private By totalStayAmountText = By.cssSelector("div.container>table.table>tbody>tr:nth-child(4)>td:nth-child(2)");
    private By depositNowText = By.cssSelector("body > section > div > table:nth-child(12) > tbody > tr > td:nth-child(1)");
    private By taxEVatText = By.cssSelector("body > section > div > table:nth-child(12) > tbody > tr > td:nth-child(2)");
    private By totalAmountText = By.cssSelector("body > section > div > table:nth-child(12) > tbody > tr > td:nth-child(3)");


    public String getHotelNameText(){
        return driver.findElement(hotelNameText).getText();
    }
    public String getInvoiceDateText(){
        return driver.findElement(invoiceDateText).getText();
    }
    public String getDueDateText(){
        return driver.findElement(dueDateText).getText();
    }
    public String getInvoiceNumberText(){
        return driver.findElement(invoiceNumberText).getText();
    }
    public String getBookingCodeText(){ return driver.findElement(bookingCodeText).getText(); }
    public String getCustomerDetailsText(){ return driver.findElement(customerDetailsText).getText(); }
    public String getRoomText(){ return driver.findElement(roomText).getText(); }
    public String getCheckInText(){ return driver.findElement(checkInText).getText(); }
    public String getCheckOutText(){
        return driver.findElement(checkOutText).getText();
    }
    public String getTotalStayCountText(){ return driver.findElement(totalStayCountText).getText(); }
    public String getTotalStayAmountText(){ return driver.findElement(totalStayAmountText).getText(); }
    public String getDepositNowText(){ return driver.findElement(depositNowText).getText(); }
    public String getTaxEVatText(){
        return driver.findElement(taxEVatText).getText();
    }
    public String getTotalAmountText(){
        return driver.findElement(totalAmountText).getText();
    }

    public boolean isInvoiceDetailsPage(){ return driver.getCurrentUrl().equals(this.invoiceDetailsPageUrl); }

    public void switchContext(){
        ArrayList<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

}
