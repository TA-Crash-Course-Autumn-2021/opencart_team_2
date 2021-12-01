package pages.administration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.containers.ProductAdminContainer;

import java.util.List;
import java.util.stream.Collectors;

public class ProductsPage extends BasePage {
    @FindBy(xpath = "//tbody//tr")
    List<WebElement> products;

    public List<ProductAdminContainer> getProducts() {
        return products.stream().map(ProductAdminContainer::new).collect(Collectors.toList());
    }
}
