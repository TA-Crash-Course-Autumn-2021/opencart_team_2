package steps.menu;

import org.testng.Assert;
import pages.AddToComparePage;
import pages.search.ProductTypePage;

public class ProductTypePageBL {

    ProductTypePage productTypePage = new ProductTypePage();

    private AddToComparePage addToComparePage;
    public ProductTypePageBL() {
        addToComparePage = new AddToComparePage();
    }

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
    public ProductTypePageBL clickOnCanonEOS5DButton() {
        addToComparePage.getCanonEOS5DButton().click();
        return this;
    }
    public ProductTypePageBL clickOnIPhoneButton() {
        addToComparePage.getIPhoneButton().click();
        return this;
    }
    public ProductTypePageBL clickOnSamsungSyncMaster941BWButton() {
        addToComparePage.getSamsungSyncMaster941BWButton().click();
        return this;
    }
    public ProductTypePageBL clickOnAppleCinema30Button() {
        addToComparePage.getAppleCinema30Button().click();
        return this;
    }

    public ProductTypePageBL clickOnMacBookButton() {
        addToComparePage.getMacBookButton().click();
        return this;
    }

    public ProductTypePageBL clickOnMacBookAirButton() {
        addToComparePage.getMacBookAirButton().click();
        return this;
    }

    public ProductTypePageBL clickOnIPodClassicButton() {
        addToComparePage.getIPodClassicButton().click();
        return this;
    }

    public ProductTypePageBL clickOnIMacAirMenuButton() {
        addToComparePage.getIMacButton().click();
        return this;
    }
    public ProductTypePageBL clickOnSamsungGalaxyTab101Button() {
        addToComparePage.getSamsungGalaxyTab101Button().click();
        return this;
    }
    public ProductTypePageBL clickOnAddToCartButton() {
        productTypePage.getInputButtonAddToCart().click();
        return this;
    }
    public void verifyAddCanonEOS5D() {
        String expectedMessage = "Success";
        String nameItem = "Canon EOS 5D";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddIPhone() {
        String expectedMessage = "Success";
        String nameItem = "iPhone";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddSamsungSyncMaster941BW() {
        String expectedMessage = "Success";
        String nameItem = "Samsung SyncMaster 941BW";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddMacBook() {
        String expectedMessage = "Success";
        String nameItem = "MacBook";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddMacAir() {
        String expectedMessage = "Success";
        String nameItem = "MacBook Air";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddIPodClassic() {
        String expectedMessage = "Success";
        String nameItem = "iPod Classic";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddIMac() {
        String expectedMessage = "Success";
        String nameItem = "iMac";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddSamsungGalaxyTab101() {
        String expectedMessage = "Success";
        String nameItem = "Samsung Galaxy Tab 10.1";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddAppleCinema30() {
        String expectedMessage = "Success";
        String nameItem = " Apple Cinema 30";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
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
