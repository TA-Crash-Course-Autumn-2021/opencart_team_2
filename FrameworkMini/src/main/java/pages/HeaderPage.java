package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {

    //локатор по якому ми будемо шукати елемент на сторінці
    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    // .//* - означає знайти мені елемент будь-де
    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    //доступ
    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    //доступ
    public WebElement getRegisterButton() {
        return registerButton;
    }
}