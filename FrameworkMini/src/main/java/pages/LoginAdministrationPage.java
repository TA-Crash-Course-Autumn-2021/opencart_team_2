package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginAdministrationPage extends BasePage {

    @FindBy(id = "input-username")
    WebElement usernameInput;

    @FindBy(id = "input-password")
    WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement loginButton;

    public WebElement getUsernameInput() {
        return usernameInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
