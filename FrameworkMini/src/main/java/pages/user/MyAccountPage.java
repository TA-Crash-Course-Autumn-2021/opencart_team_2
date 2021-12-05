package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//*[text()='Change your password']")
    WebElement changePasswordLink;

    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
    WebElement successChangePasswordAlert;

    @FindBy(xpath = "//*[@class='text-danger']")
    WebElement dangerChangePasswordAlert;

    @FindBy(xpath = "//*[@class='list-group']//*[contains(@href,'edit')]")
    private WebElement editAccountButton;

    @FindBy(xpath = "//*[@class='list-group']//*[contains(@href,'address')]")
    private WebElement editAddressButton;

    @FindBy(xpath = ".//*[contains(@href,'logout')]")
    private WebElement logoutButton;

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getChangePasswordLink() {
        return changePasswordLink;
    }

    public WebElement getSuccessChangePasswordAlert() {
        return successChangePasswordAlert;
    }

    public WebElement getDangerChangePasswordAlert() {
        return dangerChangePasswordAlert;
    }

    public WebElement getEditAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(editAccountButton));
        return editAccountButton;
    }

    public WebElement getAddressButton() {
        return editAddressButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }
}
