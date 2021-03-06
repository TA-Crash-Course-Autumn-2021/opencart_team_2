package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage extends BasePage{

    @FindBy(id = "input-payment-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-payment-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-payment-address-1")
    private WebElement address1;

    @FindBy(id = "input-payment-postcode")
    private WebElement postcode;

    @FindBy(id = "input-payment-city")
    private WebElement city;

    @FindBy(xpath = "//select[contains(@id, 'input-payment-country')]")
    private WebElement country;


    @FindBy(xpath = "//select[contains(@id, 'input-payment-zone')]")
    private WebElement region_state;

    @FindBy(xpath = ".//*[@id='button-account']")
    private WebElement continue1Button;


    @FindBy(xpath = ".//*[@value='Continue']")
    private WebElement continue2Button;

    @FindBy(xpath = ".//*[@id='button-guest']")
    private WebElement continue2GuestButton;

    @FindBy(xpath = ".//*[@id='button-shipping-address']")
    private WebElement continue3Button;

    @FindBy(xpath = ".//*[@id='button-shipping-method']")
    private WebElement continue4Button;

    @FindBy(xpath = ".//*[@id='button-payment-method']")
    private WebElement continue5Button;

    @FindBy(xpath = "//*[@name='payment_address' and @value='new']")
    private WebElement chooseStep2Button;

    @FindBy(xpath = "//*[@type = 'radio' and @value = 'existing' and @name='shipping_address']")
    WebElement chooseStep3Button;

    @FindBy(xpath = "//*[@type = 'radio' and @value = 'flat.flat' and @name='shipping_method']")
    WebElement chooseStep4Button;


    @FindBy(xpath = "//*[@type = 'radio' and @value = 'cod' and @name='payment_method']")
    WebElement chooseStep5Button;

    @FindBy(name = "agree")
    private WebElement  terms_conditions;

    @FindBy(xpath = ".//*[@id='button-confirm']")
    private WebElement confirmOrderButton;

    @FindBy(id = "input-payment-email")
    private WebElement emailInput;

    @FindBy(id = "input-payment-telephone")
    private WebElement telephoneInput;

    @FindBy(xpath = "//*[@name='account' and @value='guest']")
    private WebElement chooseGuestCheckoutButton;

    public WebElement getFirstNameInput() {
        wait.until(ExpectedConditions.visibilityOf(firstNameInput));
        return firstNameInput;
    }
    public WebElement getChooseGuestCheckoutButton() {
        wait.until(ExpectedConditions.visibilityOf(chooseGuestCheckoutButton));
        return chooseGuestCheckoutButton;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getAddress1Input() {
        return address1;
    }

    public WebElement getCityInput() {
        return city;
    }

    public WebElement getPostCodeInput() {
        return postcode;
    }

    public WebElement getRegion_StateInput() {
        wait.until(ExpectedConditions.visibilityOf(region_state));
        return region_state;
    }

    public WebElement getCountryInput() {
        wait.until(ExpectedConditions.visibilityOf(country));
        return country;
    }

    public WebElement chooseRegionState(int value) {
        return driver.findElement(By.xpath("//select[contains(@id, 'input-payment-zone')]//option[@value = '" + value + "']"));
    }

    public WebElement getContinue1Button() {
        return continue1Button;
    }

    public WebElement getContinue2Button() {
        return continue2Button;
    }

    public WebElement getContinue2GuestButton() {
        return continue2GuestButton;
    }

    public WebElement getContinue3Button() {
        return continue3Button;
    }

    public WebElement getContinue4Button() {
        return continue4Button;
    }

    public WebElement getContinue5Button() {
        return continue5Button;
    }

    public WebElement getChooseStep2Button() {
        wait.until(ExpectedConditions.visibilityOf(chooseStep2Button));
        return chooseStep2Button;
    }

    public WebElement getChooseStep3Button() {
        wait.until(ExpectedConditions.visibilityOf(chooseStep3Button));
        return chooseStep3Button;
    }

    public WebElement getChooseStep4Button() {
        wait.until(ExpectedConditions.visibilityOf(chooseStep4Button));
        return chooseStep4Button;
    }

    public WebElement getChooseStep5Button() {
        wait.until(ExpectedConditions.visibilityOf(chooseStep5Button));
        return chooseStep5Button;
    }

    public WebElement getConfirmOrderButton() {
        wait.until(ExpectedConditions.visibilityOf(confirmOrderButton));
        return confirmOrderButton;
    }

    public WebElement chooseCountry(int value) {
        return driver.findElement(By.xpath("//select[contains(@id, 'input-payment-country')]//option[@value = '" + value + "']"));
    }

    public WebElement getStep() {
        return driver.findElement(By.xpath(".//*[(@href='#collapse-shipping-address')]"));
    }

    public WebElement getTerms_conditions() {
        return terms_conditions;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    @FindBy(xpath = "//*[text()='Carbon tax:']")
    private WebElement newTax;

    public WebElement getNewTax() {
        wait.until(ExpectedConditions.visibilityOf(newTax));
        return newTax;
    }
}
