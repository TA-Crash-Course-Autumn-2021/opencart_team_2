package pages;

import org.openqa.selenium.By;
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

    @FindBy(id = "wishlist-total")
    private WebElement wishListButton;

    @FindBy(name = "search")
    private WebElement search;

    //доступ
    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }
    public WebElement getSearch() {
        return search;
    }
    //доступ
    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getWishListButton() {
        wait.until(ExpectedConditions.visibilityOf(wishListButton));
        return wishListButton;
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'login') and @class='list-group-item']"));
    }
}