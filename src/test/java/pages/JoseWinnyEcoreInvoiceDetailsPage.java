package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class JoseWinnyEcoreInvoiceDetailsPage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/invoice/0";
    private By hotelName = By.cssSelector("h4.mt-5");
    private By invoiceNumber = By.cssSelector("h6.mt-2");
    private By invoceDate = By.cssSelector("div > ul > li:nth-child(1)");
    private By dueDate = By.cssSelector("div > ul > li:nth-child(2)");
    private By bookingCode = By.cssSelector("table:nth-child(8) > tbody > tr:nth-child(1) > td:nth-child(2)");
    private By room = By.cssSelector("table:nth-child(8) > tbody > tr:nth-child(2) > td:nth-child(2)");
    private By totalStayCount = By.cssSelector("table:nth-child(8) > tbody > tr:nth-child(3) > td:nth-child(2)");
    private By totalStayAmount = By.cssSelector("table:nth-child(8) > tbody > tr:nth-child(4) > td:nth-child(2)");
    private By checkIn = By.cssSelector("table:nth-child(8) > tbody > tr:nth-child(5) > td:nth-child(2)");
    private By checkOut = By.cssSelector("table:nth-child(8) > tbody > tr:nth-child(6) > td:nth-child(2)");

    private By customerDetails = By.cssSelector("div > div");
    private By depositNow = By.cssSelector("table:nth-child(12) > tbody > tr > td:nth-child(1)");
    private By taxEVate = By.cssSelector("table:nth-child(12) > tbody > tr > td:nth-child(2)");
    private By totalAmount = By.cssSelector("table:nth-child(12) > tbody > tr > td:nth-child(3)");
    public void validarMudancaDePagina() {
        String urlAtual = driver.getCurrentUrl();
        Assert.assertTrue(urlAtual.contains(url));
    }
    public void validarHotelName(String _textoEsperado) throws InterruptedException {
        Thread.sleep(2000);
        String textoEncontrado = driver.findElement(hotelName).getText();
        Assert.assertEquals(_textoEsperado,textoEncontrado);
    }
    public void validarNumeroDeInvoice(String _valorEsperado) {
        String textoEncontrado = driver.findElement(invoiceNumber).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarInvoiceDate(String _valorEsperado) {
        String textoEncontrado = driver.findElement(invoceDate).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarDueDate(String _valorEsperado) {
        String textoEncontrado = driver.findElement(dueDate).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarBookingCode(String _valorEsperado) {
        String textoEncontrado = driver.findElement(bookingCode).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarRoom(String _valorEsperado) {
        String textoEncontrado = driver.findElement(room).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarTotalStayCount(String _valorEsperado) {
        String textoEncontrado = driver.findElement(totalStayCount).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarTotalStayAmount(String _valorEsperado) {
        String textoEncontrado = driver.findElement(totalStayAmount).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarCheckIn(String _valorEsperado) {
        String textoEncontrado = driver.findElement(checkIn).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarCheckOut(String _valorEsperado) {
        String textoEncontrado = driver.findElement(checkOut).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarCustomerDetails(String _valorEsperado) {
        String textoEncontrado = driver.findElement(customerDetails).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarDepositNow(String _valorEsperado) {
        String textoEncontrado = driver.findElement(depositNow).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarTaxEVate(String _valorEsperado) {
        String textoEncontrado = driver.findElement(taxEVate).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
    public void validarTotalAmount(String _valorEsperado) {
        String textoEncontrado = driver.findElement(totalAmount).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }
}

