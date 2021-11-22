import navigation.Navigation;
import org.testng.annotations.Test;
import steps.AddToComparePageBL;
import steps.MainPageBL;

import static enums.URLs.BASE_URL;

public class AddTwoProdToCompareTest extends BaseTest{
    @Test
    public void searchElementAndAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToComparePageBL addToComparePageBL = mainPageBL.getMenuPageBL()
                .clickOnComponentsButton()
                .clickOnMonitorsButtonAddToComparePage()
                .clickOnAppleCinema30Button()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddAppleCinema30();


        mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("Canon")
                .sendKeysSearchForCompareProdENTER()
                .clickOnCanonEOS5DButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddCanonEOS5D();
    }
}