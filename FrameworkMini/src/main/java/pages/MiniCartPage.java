package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MiniCartPage extends BasePage {

    @FindBy(xpath = "//div[@id = 'cart']")
    private WebElement miniCartButton;

    @FindBy(xpath = "//table[@class='table table-striped']//a[text() = 'Samsung SyncMaster 941BW']")
    private WebElement samsungSyncMasterInCart;

    @FindBy(xpath = "//table[@class='table table-striped']//a[text() = 'Apple Cinema 30\"']")
    private WebElement appleCinemaInCart;

    @FindBy(xpath = "//table[@class='table table-striped']//a[text() = 'MacBook']")
    private WebElement macBookInCart;

    @FindBy(xpath = "//table[@class='table table-striped']//a[text() = 'MacBook Air']")
    private WebElement macBookAirInCart;

    public WebElement getMiniCartButton() {
        wait.until(ExpectedConditions.visibilityOf(miniCartButton));
        return miniCartButton;
    }

    public WebElement getSamsungSyncMasterInCard() {
        wait.until(ExpectedConditions.visibilityOf(samsungSyncMasterInCart));
        return samsungSyncMasterInCart;
    }

    public WebElement getAppleCinemaInCard() {
        wait.until(ExpectedConditions.visibilityOf(appleCinemaInCart));
        return appleCinemaInCart;
    }

    public WebElement getMacBookInCard() {
        wait.until(ExpectedConditions.visibilityOf(macBookInCart));
        return macBookInCart;
    }

    public WebElement getMacBookAirInCard() {
        wait.until(ExpectedConditions.visibilityOf(macBookAirInCart));
        return macBookAirInCart;
    }
}
