package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class JoseWinnyEcoreInvoiceDetailsPage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
    private By hotelName = By.cssSelector("body > section > div > h4");
    private By invoiceNumber = By.cssSelector("h6");
    public void validarMudancaDePagina() {
        String urlAtual = driver.getCurrentUrl();
        Assert.assertTrue(urlAtual.contains(url));
    }
    public void validarHotelName(String _textoEsperado) {
        waitElementVisible(hotelName,10);
        String textoEncontrado = driver.findElement(hotelName).getText();
        Assert.assertEquals(_textoEsperado,textoEncontrado);
    }
    public void validarNumeroDeInvoice(String _valorEsperado) {
        String textoEncontrado = driver.findElement(invoiceNumber).getText();
        Assert.assertTrue(textoEncontrado.contains(_valorEsperado));
    }

}
