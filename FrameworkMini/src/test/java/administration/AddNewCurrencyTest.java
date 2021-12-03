package administration;

import driver.DriverRepository;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import steps.user.LoginAdministrationPageBL;

import static enums.URLs.ADMIN_PANEL_URL;

public class AddNewCurrencyTest extends AdminBaseTest {
    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void addNewCurrencyTest() {
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickSubmenuCurrencies()
                .clickOnAddNewCurrencyButton()
                .registerNewCurrency()
                .verifyAddNewCurrency();
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
