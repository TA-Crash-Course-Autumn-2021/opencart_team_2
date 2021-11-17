package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuPage extends BasePage{
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement alertSuccessAdd;

    public WebElement getDesktopsButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'category&path=20') and @class='dropdown-toggle']"));
    }
    public WebElement getMac(){
        return driver.findElement(By.xpath(".//*[contains(@href,'category&path=20_27')]"));
    }

    public WebElement getLaptops_NotebooksButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'category&path=18') and @class='dropdown-toggle']"));
    }

    public WebElement getComponentsButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'category&path=25') and @class='dropdown-toggle']"));

    }
    public WebElement getMonitors(){
        return driver.findElement(By.xpath(".//*[contains(@href,'category&path=25_28')]"));
    }

    public WebElement getTabletsButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'category&path=57') and @class='dropdown-toggle']"));

    }

    public WebElement getSoftwareButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'category&path=17') and @class='dropdown-toggle']"));

    }

    public WebElement getPhones_PDAsButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'category&path=24') and @class='dropdown-toggle']"));

    }

    public WebElement getCamerasButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'category&path=33') and @class='dropdown-toggle']"));

    }

    public WebElement getMP3playerButton() {
        return driver.findElement(By.xpath(".//*[contains(@href,'category&path=34') and @class='dropdown-toggle']"));

    }
    public WebElement getAlertSuccessAdd() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAdd));
        return alertSuccessAdd;
    }

}
