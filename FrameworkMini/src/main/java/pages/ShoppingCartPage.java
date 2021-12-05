package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.ProductInCartContainer;

import java.util.List;
import java.util.stream.Collectors;


public class ShoppingCartPage extends BasePage{
    @FindBy(xpath = ".//tbody/tr")
    private List<WebElement> products;

    public  List<ProductInCartContainer> getProductsInCart(){
        return products.stream().map(ProductInCartContainer::new).collect(Collectors.toList());

    }
}
