package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class JoseWinnyEcoreInvoiceListPage extends BasePage {
        private String url = "automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
        private By invoiceLink = By.cssSelector("a[href='/invoice/0']");
        public boolean validarMudancaDePagina() {
            String urlAtual = driver.getCurrentUrl();
            return urlAtual.contains(url);
        }
        public void clicarNoPrimeiroLink(){
            driver.findElement(invoiceLink).click();
        }

}
