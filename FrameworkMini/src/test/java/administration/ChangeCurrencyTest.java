package administration;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.SearchPageBL;

import static enums.URLs.BASE_URL;

public class ChangeCurrencyTest extends AdminBaseTest {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void changeCurrencyTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnCurrencyButton()
                .clickOnUAHButton()
                .verifyMacBookPrice()
                .verifyMacBookTax()
                .inputSearchAddToCart("Mac")
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
