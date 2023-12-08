package pages;

import runner.base_class.BasePage;

public class MarcelaInvoiceListEcorePage extends BasePage {
    private String url = "automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";

    public boolean estouAqui()
    {
        String urlAtual = driver.getCurrentUrl();
        if(urlAtual.contains(url))
            return true;
        else
            return false;
    }
}
