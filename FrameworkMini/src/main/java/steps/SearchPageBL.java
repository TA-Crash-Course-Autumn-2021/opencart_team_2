package steps;

import org.testng.Assert;
import pages.containers.CurrenciesContainer;
import pages.containers.ProductContainer;
import pages.search.SearchPage;
import steps.administration.currencies.EditCurrenciesPageBL;
import steps.products.AppleCinemaPageBL;
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

    public SearchPageBL getSymbolСurrentCurrency() {
        System.out.println(searchPage.getSymbolСurrentCurrency().getText());
        return this;
    }

    public String getTaxiMacStringType() {
        String temp = searchPage.getTaxiMac().getText().replace("Ex Tax: ", "");
        return temp.replace(searchPage.getSymbolСurrentCurrency().getText(), "");
    }

    public String getPriceiMacStringType() {
        String withoutSymbol = searchPage.getPriceiMac().getText().replace(searchPage.getSymbolСurrentCurrency().getText(), "");
        String temp = searchPage.getTaxiMac().getText().replace(searchPage.getSymbolСurrentCurrency().getText(), "");
        withoutSymbol = withoutSymbol.replace("\n","");
        return withoutSymbol.replace(temp,"");
    }

    public SearchPageBL verifyiMacPrice() {
        String expectedMessage = "3.95";
        Assert.assertTrue(this.getPriceiMacStringType().contains(expectedMessage), "Incorrect price iMac");
        return this;
    }

    public SearchPageBL verifyiMacTax() {
        String expectedMessage = "3.77";
        Assert.assertTrue(this.getTaxiMacStringType().contains(expectedMessage), "Incorrect tax iMac");
        return this;
    }

   public SearchPageBL clickOnAddToCart(String productTitle) {
        ProductContainer product = searchPage.getProducts()
                    .stream()
                    .filter(e -> e.getTitleProduct().equals(productTitle))
                    .findFirst()
                    .orElseThrow(NumberFormatException::new);

        product.getAddToCartButton().click();
        return this;
    }

    public AppleCinemaPageBL clickOnAddToCartAppleCinema30() {
        searchPage.getAddToCartAppleCinema30().click();
        return new AppleCinemaPageBL();
    }

    public void verifyAddProductButton(String product) {
        String expectedMessage = "Success";
        Assert.assertTrue(searchPage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to cart");
        Assert.assertTrue(searchPage.getAlertSuccessAdd().getText().contains(product), "Other item");
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
