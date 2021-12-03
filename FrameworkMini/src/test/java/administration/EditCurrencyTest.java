package administration;

import driver.DriverRepository;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.user.LoginAdministrationPageBL;

import static enums.URLs.ADMIN_PANEL_URL;

public class EditCurrencyTest extends AdminBaseTest {
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
    @Severity(SeverityLevel.TRIVIAL)
    public void editNewCurrencyTest() {
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickSubmenuCurrencies()
                .clickOnEditCurrenciesButton("Ukrainian Hryvnia")
                .registerEditCurrency()
                .verifyEditCurrency();
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
                .clickChooseCurrencyCheckbox("Hryvnia")
                .clickOnDeleteCurrencyButton()
                .confirmDeleteCurrency()
                .verifyDeleteCurrency();
        DriverRepository.closeBrowser();
    }
}
