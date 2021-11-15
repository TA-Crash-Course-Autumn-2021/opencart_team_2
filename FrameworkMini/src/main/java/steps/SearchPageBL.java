package steps;

import org.testng.Assert;
import pages.SearchPage;

public class SearchPageBL {
    private SearchPage searchPage;

    public SearchPageBL() {
        searchPage = new SearchPage();
    }

    public SearchPageBL clickOnAddToCartMacBookAirButton() {
        searchPage.getAddToCartMacBookAirButton().click();
        return this;
    }

    public SearchPageBL clickOnAddToCartMacBookButton() {
        searchPage.getAddToCartMacBookButton().click();
        return this;
    }

    public SearchPageBL clickOnAddToCartSamsungSyncMaster941BWButton() {
        searchPage.getAddToCartSamsungSyncMaster941BWButton().click();
        return this;
    }

    public AppleCinemaPageBL clickOnAddToCartAppleCinema30() {
        searchPage.getAddToCartAppleCinema30().click();
        return new AppleCinemaPageBL();
    }


    public void verifyAddMacBookAir() {
        String expectedMessage = "Success";
        String nameItem = "MacBook Air";
        Assert.assertTrue(searchPage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to cart");
        Assert.assertTrue(searchPage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }

    public void verifyAddMacBook() {
        String expectedMessage = "Success";
        String nameItem = "MacBook";
        Assert.assertTrue(searchPage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to cart");
        Assert.assertTrue(searchPage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }

    public void verifyAddSamsungSyncMaster941BWButton() {
        String expectedMessage = "Success";
        String nameItem = "Samsung SyncMaster 941BW";
        Assert.assertTrue(searchPage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to cart");
        Assert.assertTrue(searchPage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
}
