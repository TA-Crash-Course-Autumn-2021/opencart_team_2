package steps;

import org.testng.Assert;
import pages.Search_AddToWishListPage;

public class AddToWishListPageBL {
    private Search_AddToWishListPage search_AddToWishListPage;

    public AddToWishListPageBL() {
        search_AddToWishListPage = new Search_AddToWishListPage();
    }

    public AddToWishListPageBL clickOnAddToWishListCanonEOS5DButton() {
        search_AddToWishListPage.getAddToWishListCanonEOS5DButton().click();
        return this;
    }
    public AddToWishListPageBL clickOnAddToWishListIPhoneButton() {
        search_AddToWishListPage.getAddToWishListIPhoneButton().click();
        return this;
    }
    public AddToWishListPageBL clickOnAddToWishListSamsungSyncMaster941BWButton() {
        search_AddToWishListPage.getAddToWishListSamsungSyncMaster941BWButton().click();
        return this;
    }
    public AddToWishListPageBL clickOnAddToWishListMacBookButton() {
            search_AddToWishListPage.getAddToWishListMacBookButton().click();
            return this;
    }

    public void verifyAddCanonEOS5D() {
        String expectedMessage = "Success";
        String nameItem = "Canon EOS 5D";
        Assert.assertTrue(search_AddToWishListPage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to wishlist");
        Assert.assertTrue(search_AddToWishListPage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddIPhone() {
        String expectedMessage = "Success";
        String nameItem = "iPhone";
        Assert.assertTrue(search_AddToWishListPage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to wishlist");
        Assert.assertTrue(search_AddToWishListPage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddSamsungSyncMaster941BWButton() {
        String expectedMessage = "Success";
        String nameItem = "Samsung SyncMaster 941BW";
        Assert.assertTrue(search_AddToWishListPage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to wishlist");
        Assert.assertTrue(search_AddToWishListPage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddMacBook() {
        String expectedMessage = "Success";
        String nameItem = "MacBook";
        Assert.assertTrue(search_AddToWishListPage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to wishlist");
        Assert.assertTrue(search_AddToWishListPage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
}
