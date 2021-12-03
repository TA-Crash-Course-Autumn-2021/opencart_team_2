package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MyAccountInformationPage extends BasePage {

    @FindBy(id = "input-firstname")
    WebElement firstnameInput;

    @FindBy(id = "input-lastname")
    WebElement lastnameInput;

    @FindBy(id = "input-email")
    WebElement emailInput;

    @FindBy(id = "input-telephone")
    WebElement telephoneInput;

    @FindBy(xpath = "//*[@value='Continue']")
    private WebElement continueButton;

    public WebElement getFirstnameInput() {
        return firstnameInput;
    }

    public WebElement getLastnameInput() {
        return lastnameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
