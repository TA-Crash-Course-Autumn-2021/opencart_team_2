package pages.administration.taxClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class EditTaxClassPage extends BasePage {

    @FindBy(id = "input-title")
    WebElement taxClassTitleInput;

    @FindBy(id = "input-description")
    WebElement descriptionInput;

    @FindBy(xpath = "//*[@data-original-title='Add Rule']")
    WebElement addRuleButton;

    @FindBy(xpath = "//select[@class='form-control' and contains(@name,'tax_rate_id')]")
    WebElement taxRateMenu;

    @FindBy(xpath = "//*[@data-original-title='Remove']")
    WebElement removeButton;

    public WebElement chooseTaxRateSubmenu(String value) { //87 (Eco Tax (-2.00)) or 86 (VAT (20%))
        return driver.findElement(By.xpath("//select[@class='form-control' and contains(@name,'tax_rate_id')]//*[text()='" + value + "']"));
    }

    @FindBy(xpath = "//select[@class='form-control' and contains(@name,'based')]")
    WebElement basedOnMenu;

    public WebElement chooseBasedOnSubmenu(String value) { //shipping (Shipping Address) or payment (Payment Address) or store (Store Address)
        return driver.findElement(By.xpath("//select[@class='form-control' and contains(@name,'based')]//*[@value='" + value + "']"));
    }

    @FindBy(xpath = "//*[contains(@name,'priority')]")
    WebElement priorityInput;

    @FindBy(xpath = "//*[@data-original-title='Save']")
    WebElement saveButton;

    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
    WebElement alertSuccessAddTax;

    public WebElement getTaxClassTitleInput() {
        wait.until(ExpectedConditions.visibilityOf(taxClassTitleInput));
        return taxClassTitleInput;
    }

    public WebElement getDescriptionInput() {
        return descriptionInput;
    }

    public WebElement getAddRuleButton() {
        return addRuleButton;
    }

    public WebElement getTaxRateMenu() {
        wait.until(ExpectedConditions.visibilityOf(taxRateMenu));
        return taxRateMenu;
    }

    public WebElement getBasedOnMenu() {
        return basedOnMenu;
    }

    public WebElement getPriorityInput() {
        return priorityInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getAlertSuccessAddTax() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAddTax));
        return alertSuccessAddTax;
    }
}
