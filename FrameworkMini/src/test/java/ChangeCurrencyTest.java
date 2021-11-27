import navigation.Navigation;
import org.testng.annotations.Test;
import pages.HeaderPage;
import steps.HeaderPageBL;
import steps.MainPageBL;
import steps.SearchPageBL;

import static enums.URLs.BASE_URL;

public class ChangeCurrencyTest extends BaseTest{
    @Test
    public void changeCurrencyTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCurrencyButton()
                .clickOnUAHButton()
                .verifyMacBookPrice()
                .verifyMacBookTax()
                .clickSearch()
                .clearSearch()
                .sendKeysSearch("Mac")
                .sendKeysSearchENTER()
                .verifyiMacPrice()
                .verifyiMacTax();

        MainPageBL mainPageBL2 = new MainPageBL();
        mainPageBL2.getMenuPageBL()
                .clickOnComponentsButton()
                .clickOnMonitorsButton()
                .verifySamsungSyncMaster941BWPrice()
                .verifySamsungSyncMaster941BWTax();
    }
}
