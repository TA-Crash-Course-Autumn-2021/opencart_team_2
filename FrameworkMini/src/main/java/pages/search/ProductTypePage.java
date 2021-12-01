package pages.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import pages.containers.ProductContainer;

import java.util.List;
import java.util.stream.Collectors;

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

    @FindBy(id = "button-cart")
    private WebElement inputButtonAddToCart;

    public WebElement getInputButtonAddToCart() {
        wait.until(ExpectedConditions.visibilityOf(inputButtonAddToCart));
        return inputButtonAddToCart;
    }

    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']//strong")
    private WebElement symbolСurrentCurrency;

    @FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']/../following-sibling::p[@class='price']")
    private WebElement priceSamsungSyncMaster941BW;

    @FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']/../following-sibling::p[@class='price']//span[@class='price-tax']")
    private WebElement taxSamsungSyncMaster941BW;

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

    public WebElement getSymbolСurrentCurrency() {
        return symbolСurrentCurrency;
    }

    public WebElement getPriceSamsungSyncMaster941BW() {
        return priceSamsungSyncMaster941BW;
    }

    public WebElement getTaxSamsungSyncMaster941BW() {
        return taxSamsungSyncMaster941BW;
    }

    @FindBy(xpath = "//*[contains(@class, 'product-layout product-grid')]")
    List<WebElement> products;

    public List<ProductContainer> getProducts() {
        return products.stream().map(ProductContainer::new).collect(Collectors.toList());
    }
}
