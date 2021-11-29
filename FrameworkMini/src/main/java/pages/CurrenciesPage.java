package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.containers.CurrenciesContainer;

import java.util.List;
import java.util.stream.Collectors;

public class CurrenciesPage extends BasePage {

    @FindBy(xpath = "//*[@data-original-title = 'Add New']")
    WebElement addNewCurrencyButton;

    @FindBy(xpath = "//*[@data-original-title='Delete']")
    WebElement deleteCurrencyButton;

    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
    WebElement alertSuccessDeleteCurrency;

    @FindBy(xpath = "//tbody//tr")
    List<WebElement> currencies;

    public WebElement getAddNewCurrencyButton(){
        return addNewCurrencyButton;
    }

    public WebElement getDeleteCurrencyButton(){
        return deleteCurrencyButton;
    }

    public List<CurrenciesContainer> getCurrencies() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='panel-title']"))));
        return currencies.stream().map(CurrenciesContainer::new).collect(Collectors.toList());
    }

    public WebElement getAlertSuccessDeleteCurrency() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessDeleteCurrency));
        return alertSuccessDeleteCurrency;
    }

    public Alert getAlertSubmitAddCurrency() {
        return driver.switchTo().alert();
    }
}
