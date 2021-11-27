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

    public ProductTypePageBL getSymbolСurrentCurrency() {
        System.out.println(productTypePage.getSymbolСurrentCurrency().getText());
        return this;
    }

    public String getTaxSamsungSyncMaster941BWStringType() {
        String temp = productTypePage.getTaxSamsungSyncMaster941BW().getText().replace("Ex Tax: ", "");
        return temp.replace(productTypePage.getSymbolСurrentCurrency().getText(), "");
    }

    public String getPriceSamsungSyncMaster941BWStringType() {
        String withoutSymbol = productTypePage.getPriceSamsungSyncMaster941BW().getText().replace(productTypePage.getSymbolСurrentCurrency().getText(), "");
        String temp = productTypePage.getTaxSamsungSyncMaster941BW().getText().replace(productTypePage.getSymbolСurrentCurrency().getText(), "");
        withoutSymbol = withoutSymbol.replace("\n","");
        return withoutSymbol.replace(temp,"");
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

    public ProductTypePageBL verifySamsungSyncMaster941BWPrice() {
        String expectedMessage = "9.111";
        Assert.assertTrue(this.getPriceSamsungSyncMaster941BWStringType().equals(expectedMessage), "Incorrect price SamsungSyncMaster941BW");
        return this;
    }

    public ProductTypePageBL verifySamsungSyncMaster941BWTax() {
        String expectedMessage = "7.530";
        Assert.assertTrue(this.getTaxSamsungSyncMaster941BWStringType().equals(expectedMessage), "Incorrect tax SamsungSyncMaster941BW");
        return this;
    }
}
