package pages.administration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class DashboardPage extends BasePage {

    @FindBy(id = "menu-system")
    WebElement menuSystem;

    @FindBy(xpath = "//a[text() = 'Localisation']")
    WebElement submenuLocalisation;

    @FindBy(xpath = "//a[text() = 'Currencies']")
    WebElement submenuCurrencies;

    @FindBy(xpath = "//a[text() = 'Taxes']")
    WebElement submenuTaxes;

    @FindBy(xpath = "//a[text() = 'Tax Classes']")
    WebElement submenuTaxClasses;

    @FindBy(xpath = "//a[text() = 'Tax Rates']")
    WebElement submenuTaxRates;

    public WebElement getMenuSystem(){
        wait.until(ExpectedConditions.visibilityOf(menuSystem));
        return menuSystem;
    }

    public WebElement getSubmenuLocalisation(){
        wait.until(ExpectedConditions.visibilityOf(submenuLocalisation));
        return submenuLocalisation;
    }

    public WebElement getSubmenuCurrencies(){
        wait.until(ExpectedConditions.visibilityOf(submenuCurrencies));
        return submenuCurrencies;
    }

    public WebElement getSubmenuTaxes(){
        wait.until(ExpectedConditions.visibilityOf(submenuTaxes));
        return submenuTaxes;
    }

    public WebElement getSubmenuTaxClasses(){
        wait.until(ExpectedConditions.visibilityOf(submenuTaxClasses));
        return submenuTaxClasses;
    }

    public WebElement getSubmenuTaxRates(){
        wait.until(ExpectedConditions.visibilityOf(submenuTaxRates));
        return submenuTaxRates;
    }
}
