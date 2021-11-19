import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.SearchPageBL;

import static enums.URLs.BASE_URL;

public class SearchTest extends BaseTest {

    @Test
    public void searchProductPositiveTest() {new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickSearchHeaderButton()
                .inputKeyWordsInSearchCriteria("HTC Touch HD")
                .clickSearchInProductDescriptionsCheckbox()
                .clickSearchGlobalButton();
        searchPageBL.verifySearchProductTitle("HTC Touch HD");
        searchPageBL.verifyMeetingTitle();
        searchPageBL
                .clickOnAddToCartHTCTouchHDButton()
                .verifyAddProductButton("HTC Touch HD");
    }

    @Test
    public void searchProductNegativeTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickSearchHeaderButton()
                .inputKeyWordsInSearchCriteria("*/%")
                .clickSearchInProductDescriptionsCheckbox();
        searchPageBL.verifySearchProductTitleWhenNoMatches();
    }
}
