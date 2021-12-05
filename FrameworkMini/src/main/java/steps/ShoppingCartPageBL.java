package steps;

import pages.ShoppingCartPage;
import pages.containers.ProductInCartContainer;

public class ShoppingCartPageBL {
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartPageBL(){shoppingCartPage= new ShoppingCartPage();}

    public  ShoppingCartPageBL getShoppingCartPageBL(){return new ShoppingCartPageBL();}


    public ShoppingCartPageBL clickOnProductTitle(String productName) {
        ProductInCartContainer product = shoppingCartPage.getProductsInCart()
                .stream()
                .filter(element -> element.getTitleCart().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);

        product.getTitleButton().click();
        return this;
    }

    public String getProductUnitPrice(String productName) {
        ProductInCartContainer product = shoppingCartPage.getProductsInCart()
                .stream()
                .filter(element -> element.getTitleCart ().contains(productName))
                .findAny()
                .orElseThrow(NullPointerException::new);

        System.out.println(product.getUnitPrice());
        return product.getUnitPrice();
    }

    public String getProductTotalPrice(String productName) {
        ProductInCartContainer product = shoppingCartPage.getProductsInCart()
                .stream()
                .filter(element -> element.getTitleCart ().contains(productName))
                .findAny()
                .orElseThrow(NullPointerException::new);

        System.out.println(product.getTotalPrice());
        return product.getTotalPrice();
    }

    public ShoppingCartPageBL clickOnUpDateButton(String productName) {
        ProductInCartContainer product = shoppingCartPage.getProductsInCart()
                .stream()
                .filter(element -> element.getTitleCart().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);

        product.getUpDate().click();
        return this;
    }

    public ShoppingCartPageBL clickOnRemoveButton(String productName) {
        ProductInCartContainer product = shoppingCartPage.getProductsInCart()
                .stream()
                .filter(element -> element.getTitleCart().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);

        product.getRemove().click();
        return this;
    }

}
