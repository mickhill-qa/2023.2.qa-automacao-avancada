package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EdInvoiceDetailsPage;
import pages.EdInvoiceEcorePage;
import runner.base_class.BaseSteps;

public class EdEcoreInvoiceSteps extends BaseSteps {

    EdInvoiceEcorePage InvoiceListPage = new EdInvoiceEcorePage();
    EdInvoiceDetailsPage edInvoiceDetailsPage = new EdInvoiceDetailsPage();

    @When("the invoice details link is clicked")
    public void theLinkIsClicked() throws InterruptedException {
        InvoiceListPage.ClickOnInvoiceDetailsLink();
        Thread.sleep(2000);
    }

    @And("the system shows the invoice details on another tab")
    public void theSystemShowsTheInvoiceDetailsOnAnotherTab() {
        InvoiceListPage.SwitchTab();
        Assert.assertTrue(InvoiceListPage.ValidInvoiceUrl());

    }

    @And("the invoice details list shows the Hotel Name field as {string}")
    public void theInvoiceDetailsListShowsTheHotelNameFieldAs(String expectedHotelName) {
        edInvoiceDetailsPage.validateHotelName(expectedHotelName);
    }

    @And("the invoice details list shows the invoice date as {string}")
    public void theInvoiceDetailsListShowsTheInvoiceDateAs(String expectedInvoiceDate) {
        String actualInvoiceDate = edInvoiceDetailsPage.getInvoiceDate();
        Assert.assertEquals(expectedInvoiceDate, actualInvoiceDate);
    }

    @And("the invoice details list shows the due date as {string}")
    public void theInvoiceDetailsListShowsTheDueDateAs(String expectedDueDate) {
        String actualDueDate = edInvoiceDetailsPage.getDueDate();
        Assert.assertEquals(expectedDueDate, actualDueDate);
    }

    @And("the invoice details is shown as {string}")
    public void theInvoiceDetailsListShowsTheInvoiceNumberAs(String expectedInvoiceNumber) {
        String actualInvoiceNumber = edInvoiceDetailsPage.getInvoiceNumber();
        Assert.assertEquals(expectedInvoiceNumber, actualInvoiceNumber);
    }

    @And("the booking code matches {string}")
    public void theBookingCodeMatches(String expectedBookingCode) {
        String actualBookingCode = edInvoiceDetailsPage.getBookingCode();
        Assert.assertEquals(expectedBookingCode, actualBookingCode);
    }

    @And("the customer details are displayed as {string}")
    public void theCustomerDetailsAreDisplayedAs(String expectedCustomerDetails) {
        String actualCustomerDetails = edInvoiceDetailsPage.getCustomerDetails().trim();
        String expectedDetails = expectedCustomerDetails.trim();

        Assert.assertTrue("Actual customer details: " + actualCustomerDetails + " does not contain expected: " + expectedDetails,
                actualCustomerDetails.toLowerCase().contains(expectedDetails.toLowerCase()));
    }

    @And("the room is displayed as {string}")
    public void theRoomIsDisplayedAs(String expectedRoom) {
        String actualRoom = edInvoiceDetailsPage.getRoom();
        Assert.assertEquals(expectedRoom, actualRoom);
    }

    @And("the check in date is shown as {string}")
    public void theCheckInDateIsShownAs(String expectedCheckIn) {
        String actualCheckIn = edInvoiceDetailsPage.getCheckIn();
        Assert.assertEquals(expectedCheckIn, actualCheckIn);
    }

    @And("the check out date is shown as {string}")
    public void theCheckOutDateIsShownAs(String expectedCheckOut) {
        String actualCheckOut = edInvoiceDetailsPage.getCheckOut();
        Assert.assertEquals(expectedCheckOut, actualCheckOut);
    }

    @And("the total stay count matches {string}")
    public void theTotalStayCountMatches(String expectedTotalStayCount) {
        String actualTotalStayCount = edInvoiceDetailsPage.getTotalStayCount();
        Assert.assertEquals(actualTotalStayCount, expectedTotalStayCount);
    }

    @And("the total stay amount matches {string}")
    public void theTotalStayAmountMatches(String expectedTotalStayAmount) {
        String actualTotalStayAmount = edInvoiceDetailsPage.getTotalStayAmount();
        Assert.assertEquals(actualTotalStayAmount, expectedTotalStayAmount);
    }

    @And("the required deposit is {string}")
    public void theRequiredDepositIs(String expectedDeposit) {
        String actualDeposit = edInvoiceDetailsPage.getDepositNow();
        Assert.assertEquals(actualDeposit,expectedDeposit);
    }

    @And("the tax is {string}")
    public void theTaxIs(String expectedTax) {
        String actualTax = edInvoiceDetailsPage.getTax();
        Assert.assertEquals(actualTax, expectedTax);
    }

    @And("the total amount is {string}")
    public void theTotalAmountIs(String expectedTotalAmount) {
        String actualTotalAmount = edInvoiceDetailsPage.getTotalAmount();
        Assert.assertEquals(actualTotalAmount, expectedTotalAmount);
    }
}
