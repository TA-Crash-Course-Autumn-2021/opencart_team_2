package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComparisonPage extends BasePage{
    
    @FindBy(xpath = ".//a[contains(@href, 'product_id')]/strong")
    private List<WebElement> products;

    @FindBy(xpath = ".//*[contains(@value, 'Add to Cart')]")
    private List<WebElement> addToCartButton;

    @FindBy(xpath = (".//*[text() = 'Remove']"))
    private List<WebElement> removeButton;

    public List<WebElement> getProduct() {
        return products;
    }

    public List<WebElement> getAddToCartButton() {
        return addToCartButton;
    }

    public List<WebElement> getRemoveButton() {
        return removeButton;
    }
}
