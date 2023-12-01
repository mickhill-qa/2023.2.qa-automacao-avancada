package pages;

import runner.base_class.BaseSteps;
import runner.support.Actions;

public class SandroEcoreInvoiceListPage extends BaseSteps {
    Actions actions = new Actions();
    public String validaUrl(){
        String url = actions.get_url();
        return url;
    }




}
