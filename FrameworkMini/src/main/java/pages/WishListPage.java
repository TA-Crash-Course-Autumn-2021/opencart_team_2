package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WishListPage extends BasePage{
    @FindBy(xpath ="//img[@title='MacBook']/../../../td/button[@data-original-title='Add to Cart']") //"//div[@id='account-wishlist']//a[text()='MacBook']/../../td/button[@data-original-title='Add to Cart']")
    private WebElement buttonAddToCartMacBook;

    @FindBy(xpath = "//div[@id='account-wishlist']//a[text()='iPhone']/../../td/button[@data-original-title='Add to Cart']")//(xpath = "//img[@title = 'MacBook Air']/../../../td//td[@class='text-right']//button[contains(@onclick,'cart.add')]")
    private WebElement buttonAddToCartIPhone;

    @FindBy(xpath = "//div[@id='account-wishlist']//a[text()='Samsung SyncMaster 941BW']/../../td/button[@data-original-title='Add to Cart']")//(xpath = "//img[@title = 'MacBook Air']/../../../td//td[@class='text-right']//button[contains(@onclick,'cart.add')]")
    private WebElement buttonAddToCartSamsungSyncMaster941BW;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement alertSuccessAdd;

    public WebElement getAlertSuccessAdd() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAdd));
        return alertSuccessAdd;
    }

    public WebElement getButtonAddToCartMacBook() {
        wait.until(ExpectedConditions.visibilityOf(buttonAddToCartMacBook));
        return buttonAddToCartMacBook;
    }

    public WebElement getButtonAddToCartIPhoneButton() {
       // wait.until(ExpectedConditions.visibilityOf(buttonAddToCartIPhone));
        return buttonAddToCartIPhone;
    }

    public WebElement getButtonAddToCartSamsungSyncMaster941BW() {
     //   wait.until(ExpectedConditions.visibilityOf(buttonAddToCartSamsungSyncMaster941BW));
        return buttonAddToCartSamsungSyncMaster941BW;
    }
    @FindBy(xpath = "//a[@title='Shopping Cart']")
    private WebElement shoppingCartButton;

    public WebElement getShoppingCartButton() {
           wait.until(ExpectedConditions.visibilityOf(shoppingCartButton));
        return shoppingCartButton;
    }
}






// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@onclick='cart.add('41');']"))));
//  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//a[text()='iMac']"))));
//  return driver.findElement(By.xpath(".//*[@class='text-right' and @onclick='cart.add('41');']"));