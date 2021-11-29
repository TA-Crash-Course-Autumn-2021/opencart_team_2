package steps;

import org.testng.Assert;
import pages.WishListPage;

public class WishListPageBL {
    private WishListPage wishListPage;
    public WishListPageBL() {
        wishListPage = new WishListPage();
    }
    public WishListPageBL clickOnButtonAddToCartMacBook(){
        wishListPage.getButtonAddToCartMacBook().click();
        return this;
    }
    public WishListPageBL clickOnButtonAddToCartIPhone(){
        wishListPage.getButtonAddToCartIPhoneButton().click();
        return this;
    }
    public WishListPageBL clickOnButtonAddToCartSamsungSyncMaster941BW(){
        wishListPage.getButtonAddToCartSamsungSyncMaster941BW().click();
        return this;
    }
    public WishListPageBL clickOnButtonShoppingCart(){
        wishListPage.getShoppingCartButton().click();
        return this;
    }

    public WishListPageBL verifyAddProductButton(String Product) {
        String expectedMessage = "Success";
        Assert.assertTrue(wishListPage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to cart");
        Assert.assertTrue(wishListPage.getAlertSuccessAdd().getText().contains(Product), "Other item");
        return this;
    }
}
