package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductTypePage extends BasePage {

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmInput;

    @FindBy(name = "agree")
    private WebElement policy;

    @FindBy(xpath = "//img[@title = 'iMac']/../../../div//div[@class='button-group']//button[text()]")
    private WebElement buttonAddToCartIMac;

    @FindBy(xpath = "//img[@title = 'Samsung SyncMaster 941BW']/../../../div//div[@class='button-group']//button[text()]")
    private WebElement buttonAddToCartSamsungSyncMaster941BW;

    @FindBy(xpath = "//img[@title = 'Samsung Galaxy Tab 10.1']/../../../div//div[@class='button-group']//button[text()]")
    private WebElement buttonAddToCartSamsungGalaxyTab10;

    @FindBy(xpath = "//img[@title = 'Palm Treo Pro']/../../../div//div[@class='button-group']//button[text()]")
    private WebElement buttonAddToCartPalmTreoPro;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement alertSuccessAdd;

    @FindBy(xpath = "//p[text() = 'There are no products to list in this category.']")
    private WebElement subtitleNoProductInCategory;

    public WebElement getAddToCartIMac() {
        return buttonAddToCartIMac;
    }

    public WebElement getAddToCartSamsungSyncMaster941BWButton() {
        return buttonAddToCartSamsungSyncMaster941BW;
    }

    public WebElement getAddToCartSamsungGalaxyTab10() {
        return buttonAddToCartSamsungGalaxyTab10;
    }

    public WebElement getAddToCartPalmTreoPro() {
        return buttonAddToCartPalmTreoPro;
    }

    public WebElement getSubtitleNoProductInCategory() {
        return subtitleNoProductInCategory;
    }

    public WebElement getAlertSuccessAdd() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAdd));
        return alertSuccessAdd;
    }
}
