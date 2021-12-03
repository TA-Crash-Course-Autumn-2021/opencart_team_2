package steps;

import models.CheckoutModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CheckoutPage;
import pages.success.SuccessCheckoutPage;
import repository.CheckoutModelRepository;
import util.DriverUtils;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CheckoutPageBL {
    protected WebDriver driver;
    private CheckoutPage checkoutPage;
    private SuccessCheckoutPage successCheckoutPage;

    public CheckoutPageBL() {
        checkoutPage = new CheckoutPage();
    }

    public CheckoutPageBL checkoutPersonStep2() {
        CheckoutModel checkoutModel = CheckoutModelRepository.getCheckoutModel();
        clickOnChoose2Button();
        inputFirstName(checkoutModel.getFirstName());
        inputLastName(checkoutModel.getLastName());
        inputAddress1(checkoutModel.getAddress1());
        inputCity(checkoutModel.getCity());
        inputPostCode(checkoutModel.getPostCode());
        chooseCountry(checkoutModel.getCountry());
        chooseRegionState(checkoutModel.getRegion_state());
        clickOnContinue2Button();
        return this;
    }

    public CheckoutPageBL checkoutPersonStep3() {
        clickOnChoose3Button();
        clickOnContinue3Button();
        return this;
    }

    public CheckoutPageBL checkoutPersonStep4() {
        clickOnChoose4Button();
        clickOnContinue4Button();
        return this;
    }

    public CheckoutPageBL checkoutPersonStep5() {
        clickOnChoose5Button();
        clickTerms_conditions();
        clickOnContinue5Button();
        return this;
    }

    public CheckoutPageBL checkoutPersonStep6() {
        clickOnConfirmOrderButton();
        try {
            Robot robot = new Robot();
            robot.delay(5000);
            robot.keyPress(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        clickOnConfirmOrderButton();
        successCheckoutPage = new SuccessCheckoutPage();
        return this;
    }

    public CheckoutPageBL checkoutPersonStep1() {
        clickOnGuestCheckoutButton();
        clickOnContinue1Button();
        return this;
    }

    public CheckoutPageBL checkoutPersonStep2ForGuest() {
        CheckoutModel checkoutModel = CheckoutModelRepository.getCheckoutModel();
        inputFirstName(checkoutModel.getFirstName());
        inputLastName(checkoutModel.getLastName());
        inputEmail(checkoutModel.getEmail());
        inputTelephone(checkoutModel.getTelephone());
        inputAddress1(checkoutModel.getAddress1());
        inputCity(checkoutModel.getCity());
        inputPostCode(checkoutModel.getPostCode());
        chooseCountry(checkoutModel.getCountry());
        chooseRegionState(checkoutModel.getRegion_state());
        clickOnContinue2GuestButton();
        return this;
    }


    private void clickCountry() {
        checkoutPage.getCountryInput().click();
    }

    private void chooseCountry(int value) {
        clickCountry();
        checkoutPage.chooseCountry(value).click();
    }

    private void inputFirstName(String firstName) {
        checkoutPage.getFirstNameInput().clear();
        checkoutPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        checkoutPage.getLastNameInput().clear();
        checkoutPage.getLastNameInput().sendKeys(lastName);
    }
    private void inputAddress1(String address1) {
        checkoutPage.getAddress1Input().clear();
        checkoutPage.getAddress1Input().sendKeys(address1);
    }
    private void inputCity(String city) {
        checkoutPage.getCityInput().clear();
        checkoutPage.getCityInput().sendKeys(city);
    }
    private void inputPostCode(String postCode) {
        checkoutPage.getPostCodeInput().clear();
        checkoutPage.getPostCodeInput().sendKeys(postCode);
    }

    private void clickRegionState() {
        checkoutPage.getRegion_StateInput().click();
    }
    private void chooseRegionState(int value) {
        clickRegionState();
        checkoutPage.chooseRegionState(value).click();
    }
    private void clickOnContinue1Button() {
        checkoutPage.getContinue1Button().click();
    }
    private void clickOnContinue2Button() {
        checkoutPage.getContinue2Button().click();
    }
    private void clickOnContinue2GuestButton() {
        checkoutPage.getContinue2GuestButton().click();
    }
    private void clickOnContinue3Button() {
        checkoutPage.getContinue3Button().click();
    }
    private void clickOnContinue4Button() {
        checkoutPage.getContinue4Button().click();
    }
    private void clickOnContinue5Button() {
        checkoutPage.getContinue5Button().click();
    }

    private void clickOnChoose2Button() {
        checkoutPage.getChooseStep2Button().click();
    }

    private void clickOnChoose3Button() {
        checkoutPage.getChooseStep3Button().click();
    }

    private void clickOnChoose4Button() {
        checkoutPage.getChooseStep4Button().click();
    }

    private void clickOnChoose5Button() {
        checkoutPage.getChooseStep5Button().click();
    }


    private void clickTerms_conditions() {
        new DriverUtils().clickOnElementJS(checkoutPage.getTerms_conditions());
    }

    private void clickOnConfirmOrderButton() {
        checkoutPage.getConfirmOrderButton().click();
    }

    private void clickOnGuestCheckoutButton() {
        checkoutPage.getChooseGuestCheckoutButton().click();
    }

    private void inputEmail(String email) {
        checkoutPage.getEmailInput().clear();
        checkoutPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        checkoutPage.getTelephoneInput().clear();
        checkoutPage.getTelephoneInput().sendKeys(telephone);
    }

    public void verifyCheckout() {
        String expectedMessage = "Your order has been placed!";
        Assert.assertEquals(successCheckoutPage.getSuccessTitle2().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyNewTax() {
        String expectedMessage = "Carbon tax:";
        Assert.assertEquals(checkoutPage.getNewTax().getText(), expectedMessage, "Incorrect tax");
    }
}