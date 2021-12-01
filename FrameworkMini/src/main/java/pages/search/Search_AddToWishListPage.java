package pages.search;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class Search_AddToWishListPage extends BasePage {
    @FindBy(xpath="//img[@title = 'Canon EOS 5D']/../../../div//div[@class='button-group']//button[contains(@onclick,'wishlist.add')]")//"//img[@title = 'Canon EOS 5D']/../../../div//div[@class='button-group']//button[contains(@onclick,'wishlist.add')]")
    private WebElement buttonAddToWishListCanonEOS5D;
    @FindBy(xpath ="//img[@title = 'iPhone']/../../../div//div[@class='button-group']//button[contains(@onclick,'wishlist.add')]")
    private WebElement buttonAddToWishListIPhone;
    @FindBy(xpath ="//img[@title = 'Samsung SyncMaster 941BW']/../../../div//div[@class='button-group']//button[contains(@onclick,'wishlist.add')]")
    private WebElement buttonAddToWishListSamsungSyncMaster941BW;
    @FindBy(xpath ="//img[@title = 'MacBook']/../../../div//div[@class='button-group']//button[contains(@onclick,'wishlist.add')]")
    private WebElement buttonAddToWishListMacBook;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement alertSuccessAdd;

    public WebElement getAddToWishListCanonEOS5DButton() {
        wait.until(ExpectedConditions.visibilityOf(buttonAddToWishListCanonEOS5D));
        return buttonAddToWishListCanonEOS5D;
    }
    public WebElement getAddToWishListIPhoneButton() {
        wait.until(ExpectedConditions.visibilityOf(buttonAddToWishListIPhone));
        return buttonAddToWishListIPhone;
    }
    public WebElement getAddToWishListSamsungSyncMaster941BWButton() {
        wait.until(ExpectedConditions.visibilityOf(buttonAddToWishListSamsungSyncMaster941BW));
        return buttonAddToWishListSamsungSyncMaster941BW;
    }
    public WebElement getAddToWishListMacBookButton() {
        wait.until(ExpectedConditions.visibilityOf(buttonAddToWishListMacBook));
        return buttonAddToWishListMacBook;
    }
    public WebElement getAlertSuccessAdd() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAdd));
        return alertSuccessAdd;
    }
}
