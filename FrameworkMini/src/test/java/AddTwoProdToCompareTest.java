import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.menu.AddToComparePageBL;

import static enums.URLs.BASE_URL;

public class AddTwoProdToCompareTest extends BaseTest{
    @Test
    @Severity(SeverityLevel.TRIVIAL)
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
                .inputSearchCompare("Canon")
                .clickOnCanonEOS5DButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddCanonEOS5D();
    }
}