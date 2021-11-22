package steps;

import org.testng.Assert;
import pages.ProductTypePage;

public class ProductTypePageBL {

    ProductTypePage productTypePage = new ProductTypePage();

    public ProductTypePageBL clickOnAddToCartIMacButton() {
        productTypePage.getAddToCartIMac().click();
        return this;
    }
    public ProductTypePageBL clickOnAddToCartSamsungSyncMaster941BWButton() {
        productTypePage.getAddToCartSamsungSyncMaster941BWButton().click();
        return this;
    }
    public ProductTypePageBL clickOnAddToCartSamsungGalaxyTab10Button() {
        productTypePage.getAddToCartSamsungGalaxyTab10().click();
        return this;
    }
    public ProductTypePageBL clickOnAddToCartPalmTreoProButton() {
        productTypePage.getAddToCartPalmTreoPro().click();
        return this;
    }

    public ProductTypePageBL verifyAddProductButton(String Product) {
        String expectedMessage = "Success";
        Assert.assertTrue(productTypePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to cart");
        Assert.assertTrue(productTypePage.getAlertSuccessAdd().getText().contains(Product), "Other item");
        return this;
    }
    public void verifySubtitleNoProductInCategory() {
        String expectedMessage = "There are no products to list in this category.";
        Assert.assertTrue(productTypePage.getSubtitleNoProductInCategory().getText().contains(expectedMessage), "Incorrect page title");
    }
}
