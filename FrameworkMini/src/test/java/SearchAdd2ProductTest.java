import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.MiniCartPageBL;
import steps.SearchPageBL;

import static enums.URLs.BASE_URL;

public class SearchAdd2ProductTest extends BaseTest {
    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void search2ProductAndAddToCart() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchAddToCart("Mac")
                .clickOnAddToCart("MacBook");
        searchPageBL.verifyAddProductButton("MacBook");

        mainPageBL.getHeaderPageBL()
                .inputSearchAddToCart("Samsung")
                .clickOnAddToCart("Samsung SyncMaster 941BW");
        searchPageBL.verifyAddProductButton("Samsung SyncMaster 941BW");

        MiniCartPageBL miniCartPage = new MiniCartPageBL();
        miniCartPage.clickOnMiniCartButton();
        miniCartPage.verifyMacBookInCardInTheCart();
        miniCartPage.verifySamsungSyncMasterInTheCart();
    }
}