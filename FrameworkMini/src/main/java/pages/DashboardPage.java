package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {

    @FindBy(id = "menu-system")
    WebElement menuSystem;

    @FindBy(xpath = "//a[text() = 'Localisation']")
    WebElement submenuLocalisation;

    @FindBy(xpath = "//a[text() = 'Currencies']")
    WebElement submenuCurrencies;

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
}
