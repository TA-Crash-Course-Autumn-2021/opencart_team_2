package administration;

import driver.DriverRepository;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import steps.user.LoginAdministrationPageBL;

import static enums.URLs.ADMIN_PANEL_URL;

public class AddNewTaxTest extends AdminBaseTest {
    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void addNewTaxClassesTest() {
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickMenu("Taxes")
                .clickSubmenuTaxClasses()
                .clickAddTaxButton()
                .addTaxClasses()
                .verifyAddNewTaxClasses();
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void addNewTaxRatesTest() {
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickMenu("Taxes")
                .clickSubmenuTaxRates()
                .clickAddTaxButton()
                .addTaxRates()
                .verifyAddNewTaxRates();
    }

    @AfterTest
    public void deleteTaxClassesAndTaxRates() {
        DriverRepository.instanceWebBrowser();
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickMenu("Taxes")
                .clickSubmenuTaxClasses()
                .clickChooseTaxClassesCheckbox("Sales Taxes")
                .clickOnDeleteTaxClassesButton()
                .confirmDeleteTaxClasses()
                .verifyDeleteTaxClasses();

        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickMenu("Taxes")
                .clickSubmenuTaxRates()
                .clickChooseTaxRatesCheckbox("Federal income tax")
                .clickOnDeleteTaxRatesButton()
                .confirmDeleteTaxRates()
                .verifyDeleteTaxRates();
        DriverRepository.closeBrowser();
    }
}
