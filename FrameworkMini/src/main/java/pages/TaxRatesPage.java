package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.containers.TaxRatesContainer;

import java.util.List;
import java.util.stream.Collectors;

public class TaxRatesPage extends BasePage{

    @FindBy(xpath = "//*[@data-original-title='Add New']")
    WebElement addTaxButton;

    @FindBy(xpath = "//tbody//tr")
    List<WebElement> taxes;

    @FindBy(xpath = "//*[@data-original-title='Delete']")
    WebElement deleteTaxRatesButton;

    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
    WebElement alertSuccessDeleteTaxRates;

    public WebElement getAddTaxButton(){
        wait.until(ExpectedConditions.visibilityOf(addTaxButton));
        return addTaxButton;
    }

    public List<TaxRatesContainer> getTaxes() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='panel-title']"))));
        return taxes.stream().map(TaxRatesContainer::new).collect(Collectors.toList());
    }

    public WebElement getDeleteTaxRatesButton(){
        return deleteTaxRatesButton;
    }

    public WebElement getAlertSuccessDeleteTaxRates() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessDeleteTaxRates));
        return alertSuccessDeleteTaxRates;
    }

    public Alert getAlertSubmitDeleteTaxRates() {
        return driver.switchTo().alert();
    }
}
