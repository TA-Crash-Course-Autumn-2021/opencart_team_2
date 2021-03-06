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

public class EditTaxTest extends AdminBaseTest {
    @BeforeTest
    public void addTaxClassesAndTaxRates() {
        DriverRepository.instanceWebBrowser();
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

        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickMenu("Taxes")
                .clickSubmenuTaxRates()
                .clickAddTaxButton()
                .addTaxRates()
                .verifyAddNewTaxRates();
        DriverRepository.closeBrowser();
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void editTaxClassesTest() {
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickMenu("Taxes")
                .clickSubmenuTaxClasses()
                .clickOnEditTaxButton("Sales Taxes")
                .editTaxClasses()
                .verifyEditTaxClasses();
    }

//    @Test
//    @Severity(SeverityLevel.TRIVIAL)
//    public void editTaxRatesTest()  throws InterruptedException {
//        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
//        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
//        loginAdministrationPageBL
//                .registerAdmin()
//                .clickMenuSystem()
//                .clickMenu("Localisation")
//                .clickMenu("Taxes")
//                .clickSubmenuTaxRates()
//                .clickOnEditTaxRatesButton("Federal income tax")
//                .registerEditTaxRates()
//                .verifyEditTaxRates();
//    }

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
                .clickChooseTaxClassesCheckbox("Sales")
                .clickOnDeleteTaxClassesButton()
                .confirmDeleteTaxClasses()
                .verifyDeleteTaxClasses();

//        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
//        loginAdministrationPageBL
//                .registerAdmin()
//                .clickMenuSystem()
//                .clickMenu("Localisation")
//                .clickMenu("Taxes")
//                .clickSubmenuTaxRates()
//                .clickChooseTaxRatesCheckbox("Federal tax")
//                .clickOnDeleteTaxRatesButton()
//                .confirmDeleteTaxRates()
//                .verifyDeleteTaxRates();
        DriverRepository.closeBrowser();
    }
}
