package pages.administration.currencies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class EditCurrenciesPage extends BasePage {

    @FindBy(id = "input-title")
    WebElement currencyTitleInput;

    @FindBy(id = "input-code")
    WebElement codeInput;

    @FindBy(id = "input-symbol-left")
    WebElement symbolLeftInput;

    @FindBy(id = "input-symbol-right")
    WebElement symbolRightInput;

    @FindBy(id = "input-decimal-place")
    WebElement decimalPlacesInput;

    @FindBy(id = "input-value")
    WebElement valueInput;

    @FindBy(id = "input-status")
    WebElement statusPopupMenu;

    @FindBy(xpath = "//*[@data-original-title='Save']")
    WebElement saveCurrencyButton;

    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
    WebElement alertSuccessAddCurrency;

    public WebElement getCurrencyTitleInput() {
        return currencyTitleInput;
    }

    public WebElement getCodeInput() {
        return codeInput;
    }

    public WebElement getSymbolLeftInput() {
        return symbolLeftInput;
    }

    public WebElement getSymbolRightInput() {
        return symbolRightInput;
    }

    public WebElement getDecimalPlacesInput() {
        return decimalPlacesInput;
    }

    public WebElement getValueInput() {
        return valueInput;
    }

    public WebElement getStatusPopupMenu() {
        return statusPopupMenu;
    }

    public WebElement getStatusAble(int value) { // 0 (Disabled) or 1 (Enabled)
        return driver.findElement(By.xpath("//*[@id='input-status']//option[@value = '" + value + "']"));
    }

    public WebElement getSaveCurrencyButton() {
        return saveCurrencyButton;
    }

    public WebElement getAlertSuccessAddCurrency() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAddCurrency));
        return alertSuccessAddCurrency;
    }
}
