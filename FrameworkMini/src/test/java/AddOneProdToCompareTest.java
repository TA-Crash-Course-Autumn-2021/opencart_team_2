import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.menu.AddToComparePageBL;

import static enums.URLs.BASE_URL;

public class AddOneProdToCompareTest extends BaseTest{

    @Test
    public void searchByMenuAndAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToComparePageBL addToComparePageBL = mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButtonAddToComparePage()
                .clickOnIMacAirMenuButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddIMac();
    }
}
