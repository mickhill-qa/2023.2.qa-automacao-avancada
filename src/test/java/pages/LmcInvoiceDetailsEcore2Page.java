package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class LmcInvoiceDetailsEcore2Page extends BasePage {

    private String Url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/invoice/0";

    private By click_invoice = By.cssSelector("a[href*='invoice/0']");
    private By hotel_name = By.cssSelector("h4[class='mt-5']");
    private By invoice_date = By.xpath("//li[text()=' 14/01/2018']");
    private By due_date = By.xpath("//li[text()=' 15/01/2018']");
    private By invoice_number = By.cssSelector("h6[class='mt-2']");
    private By booking_code = By.xpath("//td[text()='0875']");
    private By Room = By.xpath("//td[text()='Superior Double']");
    private By totalStayCount = By.xpath("//td[text()='1']");
    private By totalStayAmount = By.xpath("//td[text()='$150']");
    private By checkin = By.xpath("//td[text()='14/01/2018']");
    private By checkout = By.xpath("//td[text()='15/01/2018']");
    private By customerDetails = By.xpath("//div[text()='R2, AVENUE DU MAROC']");
    private By depositNow = By.xpath("//td[text()='USD $20.90']");
    private By taxvat = By.xpath("//td[text()='USD $19']");
    private By totalAmount = By.xpath("//td[text()='USD $209']");


    public void click_no_invoice_link() throws InterruptedException {
        driver.get(Url);
        Thread.sleep(2000);
        verificarSeEstouNapagina();
        Thread.sleep(1000);
    }
    public boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(Url);
    }

    public boolean hotel_name() throws InterruptedException {
        String verif = "Rendezvous Hotel";
        String texto = driver.findElement(hotel_name).getText();
        Assert.assertEquals(verif, texto);
        Thread.sleep(1000);
        return true;
    }

    public boolean invoiceDate_dueDate() throws InterruptedException {
        driver.findElement(invoice_date);
        driver.findElement(due_date);
        Thread.sleep(1000);
        return true;
    }

    public boolean invoice_number() throws InterruptedException {
        String verif = "Invoice #110 details";
        String texto = driver.findElement(invoice_number).getText();
        Assert.assertEquals(verif, texto);
        Thread.sleep(1000);
        return true;
    }

    public boolean booking_code() throws InterruptedException {
        driver.findElement(booking_code);
        Thread.sleep(1000);
        return true;
    }

    public boolean room() throws InterruptedException {
        driver.findElement(Room);
        Thread.sleep(1000);
        return true;
    }

    public boolean totalStayCount() throws InterruptedException {
        driver.findElement(totalStayCount);
        Thread.sleep(1000);
        return true;
    }

    public boolean totalStayAmount() throws InterruptedException {
        driver.findElement(totalStayAmount);
        Thread.sleep(1000);
        return true;
    }

    public boolean checkIn_checkOut() throws InterruptedException {
        driver.findElement(checkin);
        driver.findElement(checkout);
        Thread.sleep(1000);
        return true;
    }

    public boolean customerDetails () throws InterruptedException {
        driver.findElement(customerDetails);
        Thread.sleep(1000);
        return true;
    }

    public boolean depositNOW () throws InterruptedException {
        driver.findElement(depositNow);
        Thread.sleep(1000);
        return true;
    }

    public boolean tax_vat () throws InterruptedException {
        driver.findElement(taxvat);
        Thread.sleep(1000);
        return true;
    }

    public boolean totalAmount () throws InterruptedException {
        driver.findElement(totalAmount);
        Thread.sleep(1000);
        return true;
    }
}
