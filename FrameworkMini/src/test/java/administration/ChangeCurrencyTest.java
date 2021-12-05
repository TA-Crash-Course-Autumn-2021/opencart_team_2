package administration;

import driver.DriverRepository;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.SearchPageBL;
import steps.user.LoginAdministrationPageBL;

import static enums.URLs.ADMIN_PANEL_URL;
import static enums.URLs.BASE_URL;

public class ChangeCurrencyTest extends AdminBaseTest {
    @BeforeTest
    public void addNewCurrency() {
        DriverRepository.instanceWebBrowser();
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickSubmenuCurrencies()
                .clickOnAddNewCurrencyButton()
                .registerNewCurrency();
        DriverRepository.closeBrowser();
    }

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

    @AfterTest
    public void deleteCurrency() {
        DriverRepository.instanceWebBrowser();
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickSubmenuCurrencies()
                .clickChooseCurrencyCheckbox("Ukrainian Hryvnia")
                .clickOnDeleteCurrencyButton()
                .confirmDeleteCurrency()
                .verifyDeleteCurrency();
        DriverRepository.closeBrowser();
    }
}
