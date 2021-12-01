package pages.administration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class DashboardPage extends BasePage {

    @FindBy(id = "menu-system")
    WebElement menuSystem;
    @FindBy(id = "menu-catalog")
    WebElement menuCatalog;

    @FindBy(xpath = "//a[text() = 'Currencies']")
    WebElement submenuCurrencies;

    @FindBy(xpath = "//a[text() = 'Tax Classes']")
    WebElement submenuTaxClasses;

    @FindBy(xpath = "//a[text() = 'Tax Rates']")
    WebElement submenuTaxRates;

    @FindBy(xpath = "//a[text() = 'Products']")
    WebElement submenuProducts;

    public WebElement getMenuSystem(){
        wait.until(ExpectedConditions.visibilityOf(menuSystem));
        return menuSystem;
    }

    public WebElement getMenuCatalog(){
        wait.until(ExpectedConditions.visibilityOf(menuCatalog));
        return menuCatalog;
    }

    public WebElement chooseMenu(String nameMenu){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text() = '" + nameMenu + "']"))));
        return driver.findElement(By.xpath("//a[text() = '" + nameMenu + "']"));
    }

    public WebElement getSubmenuCurrencies(){
        wait.until(ExpectedConditions.visibilityOf(submenuCurrencies));
        return submenuCurrencies;
    }

    public WebElement getSubmenuTaxClasses(){
        wait.until(ExpectedConditions.visibilityOf(submenuTaxClasses));
        return submenuTaxClasses;
    }

    public WebElement getSubmenuProducts(){
        wait.until(ExpectedConditions.visibilityOf(submenuProducts));
        return submenuProducts;
    }

    public WebElement getSubmenuTaxRates(){
        wait.until(ExpectedConditions.visibilityOf(submenuTaxRates));
        return submenuTaxRates;
    }
}
