package pages.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AddAddressPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-address-1")
    private WebElement address1;

    @FindBy(id = "input-city")
    private WebElement city;

    @FindBy(id = "input-postcode")
    private WebElement postcode;

    @FindBy(xpath = "//select[contains(@id, 'input-country')]")
    private WebElement country;

    @FindBy(xpath = "//select[contains(@id, 'input-zone')]")
    private WebElement region_state;

    @FindBy(xpath = ".//*[@value='Continue']")
    private WebElement continueButton;

    public WebElement getFirstNameInput() {
        wait.until(ExpectedConditions.visibilityOf(firstNameInput));
        return firstNameInput;
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

    public WebElement chooseRegionState(int value) {
        return driver.findElement(By.xpath("//option[text() = 'Hertfordshire']"));
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
