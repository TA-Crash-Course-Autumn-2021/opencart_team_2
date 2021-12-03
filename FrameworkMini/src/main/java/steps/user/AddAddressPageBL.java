package steps.user;

import models.CheckoutModel;
import pages.user.AddAddressPage;
import repository.CheckoutModelRepository;

public class AddAddressPageBL {

    private AddAddressPage addAddressPage;

    public AddAddressPageBL() {
        addAddressPage = new AddAddressPage();
    }

    public AddressBookEntriesPageBL addNewAddres() {
        CheckoutModel checkoutModel = CheckoutModelRepository.getCheckoutModel();

        inputFirstName(checkoutModel.getFirstName());
        inputLastName(checkoutModel.getLastName());
        inputAddress1(checkoutModel.getAddress1());
        inputCity(checkoutModel.getCity());
        inputPostCode(checkoutModel.getPostCode());
        chooseRegionState(checkoutModel.getRegion_state());
        clickOnContinueButton();
        return new AddressBookEntriesPageBL();
    }

    private void inputFirstName(String firstName) {
        addAddressPage.getFirstNameInput().clear();
        addAddressPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        addAddressPage.getLastNameInput().clear();
        addAddressPage.getLastNameInput().sendKeys(lastName);
    }
    private void inputAddress1(String address1) {
        addAddressPage.getAddress1Input().clear();
        addAddressPage.getAddress1Input().sendKeys(address1);
    }
    private void inputCity(String city) {
        addAddressPage.getCityInput().clear();
        addAddressPage.getCityInput().sendKeys(city);
    }
    private void inputPostCode(String postCode) {
        addAddressPage.getPostCodeInput().clear();
        addAddressPage.getPostCodeInput().sendKeys(postCode);
    }

    private void clickRegionState() {
        addAddressPage.getRegion_StateInput().click();
    }

    private void chooseRegionState(int value) {
        clickRegionState();
        addAddressPage.chooseRegionState(value).click();
    }

    private void clickOnContinueButton() {
        addAddressPage.getContinueButton().click();
    }
}
