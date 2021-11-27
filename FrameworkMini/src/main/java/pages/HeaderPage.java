package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {

    @FindBy(xpath = "//*[@class='btn btn-default btn-lg']")
    private WebElement buttonSearchHeader;

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(name = "search")
    private WebElement search;

    @FindBy(id = "wishlist-total")
    private WebElement wishListButton;

    @FindBy(xpath = "//*[@class='btn btn-link dropdown-toggle']")
    private WebElement currencyButton;

    @FindBy(name = "UAH")
    private WebElement UAHButton;

    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']//strong")
    private WebElement symbolСurrentCurrency;

    @FindBy(xpath = "//a[text()='MacBook']/../following-sibling::p[@class='price']")
    private WebElement priceMacbook;

    @FindBy(xpath = "//a[text()='MacBook']/../following-sibling::p[@class='price']//span[@class='price-tax']")
    private WebElement taxMacbook;

    public WebElement getButtonSearchHeader() {
        return buttonSearchHeader;
    }

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getSearch() {
        return search;
    }

    public WebElement getWishListButton() {
        wait.until(ExpectedConditions.visibilityOf(wishListButton));
        return wishListButton;
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'login') and @class='list-group-item']"));
    }

    public WebElement getCurrencyButton() {
        return currencyButton;
    }

    public WebElement getUAHButton() {
        return UAHButton;
    }

    public WebElement getSymbolСurrentCurrency() {
        return symbolСurrentCurrency;
    }

    public WebElement getPriceMacbook() {
        return priceMacbook;
    }

    public WebElement getTaxMacbook() {
        return taxMacbook;
    }

}