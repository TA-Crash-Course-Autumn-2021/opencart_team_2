package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToComparePage extends BasePage {

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement alertSuccessAdd;

    public WebElement getCanonEOS5DButton() {
        return driver.findElement(By.xpath(".//a[text()='Canon EOS 5D']"));
    }

    public WebElement getAddToCompareButton() {
        return driver.findElement(By.xpath(".//*[contains(@data-original-title ,'Compare this Product')]"));
    }

    public WebElement getAddToWishListButton(){
        return driver.findElement(By.xpath(".//*[contains(@data-original-title ,'Add to Wish List')]"));
    }

    public WebElement getIPhoneButton() {
        return driver.findElement(By.xpath(".//a[text()='iPhone']"));
    }

    public WebElement getSamsungSyncMaster941BWButton() {

        return driver.findElement(By.xpath(".//a[text()='Samsung SyncMaster 941BW']"));
    }

    public WebElement getMacBookButton() {
        return driver.findElement(By.xpath(".//a[text()='MacBook']"));
    }

    public WebElement getIPodClassicButton() {
        return driver.findElement(By.xpath(".//a[text()='iPod Classic']"));
    }

    public WebElement getMacBookAirButton() {
        return driver.findElement(By.xpath(".//a[text()='MacBook Air']"));
    }

    public WebElement getIMacButton() {
        return driver.findElement(By.xpath(".//a[text()='iMac']"));
    }

    public WebElement getSamsungGalaxyTab101Button() {
        return driver.findElement(By.xpath(".//a[text()='Samsung Galaxy Tab 10.1']"));
    }

    public WebElement getAppleCinema30Button() {
        return driver.findElement(By.xpath(".//a[text()='Apple Cinema 30\"']"));
    }

    public WebElement getAlertSuccessAdd() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAdd));
        return alertSuccessAdd;
    }
    public  WebElement getProductComparisonMac(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//a[text()='iMac']"))));
        return driver.findElement(By.xpath(".//a[text()='product comparison']"));
    }
    public  WebElement getProductComparisonIPhone(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//a[text()='iPhone']"))));
        return driver.findElement(By.xpath(".//a[text()='product comparison']"));

    }
    public WebElement getAddToShoppingCart(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td//input[@type = 'button' and @value = 'Add to Cart']"))));
        return driver.findElement(By.xpath ("//td//input[@type = 'button' and @value = 'Add to Cart']"));

    }

    public WebElement getRemoveBottom(){
           return driver.findElement(By.xpath(".//a[text()='Remove']"));

    }
}
