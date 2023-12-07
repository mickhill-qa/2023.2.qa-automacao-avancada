package pages;

import runner.base_class.BasePage;

public class YohansEcoreInvoiceListPage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";

    public boolean isInvoiceListPage(){
        return (driver.getCurrentUrl().equals(this.url));
    }
}
