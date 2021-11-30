package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class ProductContainer extends BasePage {

    private WebElement rootElement;

    public ProductContainer(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getCheckboxChooseProduct() {
        return rootElement.findElement(By.xpath(".//td[1]"));
    }

    public String getTitleProduct() {
        return rootElement.findElement(By.xpath(".//h4")).getText();
    }

    public String getPriceProduct() {
        return rootElement.findElement(By.xpath(".//p[@class='price']")).getText();
    }

    public WebElement getAddToCartButton() {
        return rootElement.findElement(By.xpath(".//*[contains(@onclick,'cart.add')]"));
    }

    public WebElement getProductWishListButton() {
        return rootElement.findElement(By.xpath(".//*[@data-original-title='Add to Wish List']"));
    }

    public WebElement getCompareButton() {
        return rootElement.findElement(By.xpath(".//*[@data-original-title='Compare this Product']"));
    }
}
