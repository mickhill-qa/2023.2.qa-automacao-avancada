package pages;

import runner.base_class.BasePage;

public class JoseWinnyEcoreInvoiceListPage extends BasePage {
        private String url = "automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";
        public boolean validarMudancaDePagina() {
            String urlAtual = driver.getCurrentUrl();
            return urlAtual.contains(url);
        }

}
