package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(name = "search")
    private WebElement search;

    @FindBy(id = "wishlist-total")
    private WebElement wishListButton;

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
}