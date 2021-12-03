package pages.administration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class EditProductPage extends BasePage {
    @FindBy(xpath = "//*[text()='Data']")
    WebElement dataButton;

    public WebElement getDataButton() {
        return dataButton;
    }

    @FindBy(id="input-tax-class")
    WebElement taxMenu;

    public WebElement getTaxMenu() {
        return taxMenu;
    }

    @FindBy(xpath = "//*[text()='Taxable Goods']")
    WebElement taxableGoodsMenu;

    public WebElement getTaxableGoodsMenu() {
        return taxableGoodsMenu;
    }

    @FindBy(xpath = "//*[@data-original-title='Save']")
    WebElement saveButton;

    public WebElement getSaveButton() {
        return saveButton;
    }
}