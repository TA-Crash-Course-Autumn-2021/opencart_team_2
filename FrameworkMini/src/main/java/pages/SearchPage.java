package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//img[@title = 'MacBook Air']/../../../div//div[@class='button-group']//button[contains(@onclick,'cart.add')]")
    private WebElement buttonAddToCartMacBookAir;

    @FindBy(xpath = "//img[@title = 'MacBook']/../../../div//div[@class='button-group']//button[text()]")
    private WebElement buttonAddToCartMacBook;

    @FindBy(xpath = "//img[@title = 'Samsung SyncMaster 941BW']/../../../div//div[@class='button-group']//button[text()]")
    private WebElement buttonAddToCartSamsungSyncMaster941BW;

    @FindBy(xpath = "//img[contains(@title, 'Apple Cinema 30')]/../../../div//div[@class='button-group']//button[contains(@onclick,'cart.add')]")
    private WebElement buttonAddAppleCinema30;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement alertSuccessAdd;

    public WebElement getAddToCartMacBookAirButton() {
        return buttonAddToCartMacBookAir;
    }

    public WebElement getAddToCartMacBookButton() {
        return buttonAddToCartMacBook;
    }

    public WebElement getAddToCartSamsungSyncMaster941BWButton() {
        return buttonAddToCartSamsungSyncMaster941BW;
    }

    public WebElement getAlertSuccessAdd() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAdd));
        return alertSuccessAdd;
    }

    public WebElement getAddToCartAppleCinema30() {
        return buttonAddAppleCinema30;
    }
}
