import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.MiniCartPageBL;
import steps.SearchPageBL;

import static enums.URLs.BASE_URL;

public class SearchAdd2ProductTest extends BaseTest {
    @Test
    public void search2ProductAndAddToCart() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchAddToCart("Mac")
                .clickOnAddToCartMacBookButton();
        searchPageBL.verifyAddProductButton("MacBook");

        mainPageBL.getHeaderPageBL()
                .inputSearchAddToCart("Samsung")
                .clickOnAddToCartSamsungSyncMaster941BWButton();
        searchPageBL.verifyAddProductButton("Samsung SyncMaster 941BW");

        MiniCartPageBL miniCartPage = new MiniCartPageBL();
        miniCartPage.clickOnMiniCartButton();
        miniCartPage.verifyMacBookInCardInTheCart();
        miniCartPage.verifySamsungSyncMasterInTheCart();
    }
}