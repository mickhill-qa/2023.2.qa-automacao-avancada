package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.LmcInvoiceDetailsEcore2Page;
import pages.LmcInvoiceDetailsEcorePage;
import runner.base_class.BaseSteps;

public class LmcInvoiceDetailsEcoreSteps extends BaseSteps {

    LmcInvoiceDetailsEcorePage ide = new LmcInvoiceDetailsEcorePage();
    LmcInvoiceDetailsEcore2Page ide2 = new LmcInvoiceDetailsEcore2Page();

    @Dado("que o usuario ja esta logado no sistema")
    public void que_o_usuario_ja_esta_logado_no_sistema() throws InterruptedException {
        ide.abrir();
    }
    @Quando("o usuario clica no link invoice details")
    public void o_usuario_clica_no_link_invoice_details() throws InterruptedException {
        ide2.click_no_invoice_link();
    }
    @Entao("o sistema retorna a lista de faturas")
    public void o_sistema_retorna_a_lista_de_faturas() throws InterruptedException {
        Assert.assertTrue(ide2.hotel_name());
        Assert.assertTrue(ide2.invoiceDate_dueDate());
        Assert.assertTrue(ide2.invoice_number());
        Assert.assertTrue(ide2.booking_code());
        Assert.assertTrue(ide2.room());
        Assert.assertTrue(ide2.totalStayCount());
        Assert.assertTrue(ide2.totalStayAmount());
        Assert.assertTrue(ide2.checkIn_checkOut());
        Assert.assertTrue(ide2.customerDetails());
        Assert.assertTrue(ide2.depositNOW());
        Assert.assertTrue(ide2.tax_vat());
        Assert.assertTrue(ide2.totalAmount());
    }
}
