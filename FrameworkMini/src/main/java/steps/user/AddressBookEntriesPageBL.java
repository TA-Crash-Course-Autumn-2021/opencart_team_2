package steps.user;

import org.testng.Assert;
import pages.user.AddressBookEntriesPage;

public class AddressBookEntriesPageBL {

    private AddressBookEntriesPage addressBookEntriesPage;

    public AddressBookEntriesPageBL() {
        addressBookEntriesPage = new AddressBookEntriesPage();
    }

    public AddAddressPageBL clickOnNewAddressButton() {
        addressBookEntriesPage.getNewAddressButton().click();
        return new AddAddressPageBL();
    }

    public void verifyAlertAddAddress() {
        String expectedMessage = "Your address has been successfully added";
        Assert.assertEquals(addressBookEntriesPage.getAlertAddAddress().getText(), expectedMessage, "Incorrect page title");
    }
}
