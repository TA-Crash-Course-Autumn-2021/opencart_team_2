package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToComparePage extends BasePage{

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement alertSuccessAdd;

    public WebElement getCanonEOS5DButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'product&product_id=30&search=Canon')]"));
    }

    public WebElement getAddToCompareButton(){
        return driver.findElement(By.xpath(".//*[contains(@data-original-title ,'Compare this Product')]"));
    }
    public WebElement getIPhoneButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'product&product_id=40&search=Iphone')]"));
    }

    public WebElement getSamsungSyncMaster941BWButton() {

        return driver.findElement(By.xpath(".//*[contains(@href,'product&product_id=33&search=Samsung')]"));
    }
    public WebElement getMacBookButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'product&product_id=43&search=MacBook')]"));
    }
    public WebElement getIPodClassicButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'product&product_id=48&search=iPod')]"));
    }
    public WebElement getMacBookAirButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'product&product_id=44&search=MacBook')]"));
    }
    public WebElement getIMacButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'product&path=20_27&product_id=41')]"));
    }
    public WebElement getSamsungGalaxyTab101Button() {
        return driver.findElement(By.xpath(".//*[contains(@href,'product&path=57&product_id=49')]"));
    }
    public WebElement getAppleCinema30Button() {
        return driver.findElement(By.xpath(".//*[contains(@href,'product&path=25_28&product_id=42')]"));
    }

    public WebElement getAlertSuccessAdd() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAdd));
        return alertSuccessAdd;
    }
}
