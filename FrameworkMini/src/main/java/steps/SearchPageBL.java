package steps;

import org.testng.Assert;
import pages.SearchPage;
import util.DriverUtils;

public class SearchPageBL {

    private SearchPage searchPage;

    public SearchPageBL() {
        searchPage = new SearchPage();
    }

    public SearchPageBL inputKeyWordsInSearchCriteria(String keyWords) {
        searchPage.getSearchCriteria().click();
        searchPage.getSearchCriteria().clear();
        searchPage.getSearchCriteria().sendKeys(keyWords);
        return this;
    }

    public SearchPageBL clickSearchInProductDescriptionsCheckbox() {
        new DriverUtils().clickOnElementJS(searchPage.getSearchInProductDescriptions());
        return this;
    }

    public SearchPageBL clickAllCategories() {
        searchPage.getCategory().click();
        return this;
    }

    public SearchPageBL clickSubCategoryCheckbox() {
        //Only if you choose subCategory!!!
        new DriverUtils().clickOnElementJS(searchPage.getSubCategory());
        return this;
    }

    public SearchPageBL clickSearchGlobalButton() {
        searchPage.getButtonSearchGlobal().click();
        return this;
    }

    public void verifySearchTitle() {
        String expectedMessage = "Search";
        Assert.assertEquals(expectedMessage, searchPage.getTitleOfSearch().getText(), "Incorrect page title");
    }

    public void verifyMeetingTitle() {
        String expectedMessage = "Products meeting the search criteria";
        Assert.assertEquals(expectedMessage, searchPage.getHeaderMeeting().getText(), "Incorrect page subtitle");
    }

    public void verifySearchProductTitle(String product) {
        String expectedMessage = "Search - " + product ;
        Assert.assertEquals(expectedMessage, searchPage.getTitleOfSearchProduct(product).getText(), "Incorrect page title");
    }

    public void verifySearchProductTitleWhenNoMatches() {
        String expectedMessage = "There is no product that matches the search criteria.";
        Assert.assertEquals(expectedMessage, searchPage.getTitleNoProduct().getText(), "Incorrect page subtitle");
    }

    //////////////////////////////////////Add to cart button and verify alert////////////////////////////////////////////////////////
    public SearchPageBL clickOnAddToCartHTCTouchHDButton() {
        searchPage.getAddToCartHTCTouchHD().click();
        return this;
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

    public void verifyAddProductButton(String Product) {
        String expectedMessage = "Success";
        Assert.assertTrue(searchPage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to cart");
        Assert.assertTrue(searchPage.getAlertSuccessAdd().getText().contains(Product), "Other item");
    }
}
