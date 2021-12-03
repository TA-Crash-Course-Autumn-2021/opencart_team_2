package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AddressBookEntriesPage extends BasePage {

    @FindBy(xpath = ".//*[contains(@href,'address/add')]")
    WebElement newAddressButton;

    @FindBy(xpath = ".//*[@class='alert alert-success alert-dismissible']")
    WebElement alertAddAddress;

    public WebElement getNewAddressButton() {
        return newAddressButton;
    }

    public WebElement getAlertAddAddress() {
        return alertAddAddress;
    }
}
