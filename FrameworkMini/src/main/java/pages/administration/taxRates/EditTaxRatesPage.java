package pages.administration.taxRates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class EditTaxRatesPage extends BasePage {

    @FindBy(id = "input-name")
    WebElement taxNameInput;

    @FindBy(id = "input-rate")
    WebElement taxRateInput;

    @FindBy(id = "input-type")
    WebElement typeMenu;

    public WebElement chooseTypeSubmenu(String value) { //F (Fixed Amount) or P (Percentage)
        return driver.findElement(By.xpath("//*[@id='input-type']//*[@value='" + value + "']"));
    }

    @FindBy(id = "input-geo-zone")
    WebElement geoZoneMenu;

    public WebElement chooseGeoZoneSubmenu(String value) { //4 (UK Shipping) or 3 (UK VAT Zone)
        return driver.findElement(By.xpath("//*[@id='input-geo-zone']//*[@value='" + value + "']"));
    }

    @FindBy(xpath = "//*[@data-original-title='Save']")
    WebElement saveButton;

    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
    WebElement alertSuccessAddTax;

    public WebElement getTaxNameInput() {
        return taxNameInput;
    }

    public WebElement getTaxRateInput() {
        return taxRateInput;
    }

    public WebElement getTypeMenu() {
        return typeMenu;
    }

    public WebElement getGeoZoneMenu() {
        return geoZoneMenu;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getAlertSuccessAddTax() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAddTax));
        return alertSuccessAddTax;
    }
}
