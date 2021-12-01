package steps.administration;

import pages.administration.ProductsPage;
import pages.containers.ProductAdminContainer;

public class ProductsPageBL {

    ProductsPage productsPage;

    public ProductsPageBL(){
        productsPage = new ProductsPage();
    }

    public EditProductPageBL clickOnEditProductButton(String productTitle){
        ProductAdminContainer product = productsPage.getProducts()
                .stream()
                .filter(e -> e.getNameProduct().equals(productTitle))
                .findFirst()
                .orElseThrow(NumberFormatException::new);

        product.getEditButton().click();
        return new EditProductPageBL();
    }
}
