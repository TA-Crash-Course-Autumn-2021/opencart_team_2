import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.MiniCartPageBL;
import steps.SearchPageBL;
import steps.products.AppleCinemaPageBL;

import static enums.URLs.BASE_URL;

public class SearchAdd4ProductTest extends BaseTest {
    @Test
    public void search4ProductAndAddToCart() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickSearch()
                .clearSearch()
                .sendKeysSearch("Mac")
                .sendKeysSearchENTER()
                .clickOnAddToCartMacBookAirButton();
        searchPageBL.verifyAddProductButton("MacBook Air");

        mainPageBL.getHeaderPageBL()
                .clickSearch()
                .clearSearch()
                .sendKeysSearch("Mac")
                .sendKeysSearchENTER()
                .clickOnAddToCartMacBookButton();
        searchPageBL.verifyAddProductButton("MacBook");

        mainPageBL.getHeaderPageBL()
                .clickSearch()
                .clearSearch()
                .sendKeysSearch("Samsung")
                .sendKeysSearchENTER()
                .clickOnAddToCartSamsungSyncMaster941BWButton();
        searchPageBL.verifyAddProductButton("Samsung SyncMaster 941BW");

        mainPageBL.getHeaderPageBL()
                .clickSearch()
                .clearSearch()
                .sendKeysSearch("Apple Cinema")
                .sendKeysSearchENTER()
                .clickOnAddToCartAppleCinema30()
                .registerAppleCinema();
        AppleCinemaPageBL appleCinemaPage = new AppleCinemaPageBL();
        appleCinemaPage.verifyAppleCinema();

        MiniCartPageBL miniCartPage = new MiniCartPageBL();
        miniCartPage.clickOnMiniCartButton();
        miniCartPage.verifyMacBookInCardInTheCart();
        miniCartPage.verifyMacBookAirInCardInTheCart();
        miniCartPage.verifyAppleCinemaInCardInTheCart();
        miniCartPage.verifySamsungSyncMasterInTheCart();
    }
}