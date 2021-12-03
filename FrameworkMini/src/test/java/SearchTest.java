import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.SearchPageBL;

import static enums.URLs.BASE_URL;

public class SearchTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void searchProductPositiveTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickSearchHeaderButton()
                .inputKeyWordsInSearchCriteria("HTC Touch HD")
                .clickSearchInProductDescriptionsCheckbox()
                .clickSearchGlobalButton();
        searchPageBL.verifySearchProductTitle("HTC Touch HD");
        searchPageBL.verifyMeetingTitle();
        searchPageBL
                .clickOnAddToCart("HTC Touch HD")
                .verifyAddProductButton("HTC Touch HD");
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
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
