package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class ChangePasswordPage extends BasePage {
    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmInput;

    @FindBy(xpath = "//*[@value='Continue']")
    private WebElement continueButton;

    public WebElement getPasswordConfirmInput() {
        return passwordConfirmInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

}
