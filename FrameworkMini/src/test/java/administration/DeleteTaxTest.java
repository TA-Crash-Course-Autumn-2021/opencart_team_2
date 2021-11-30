package administration;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.user.LoginAdministrationPageBL;

import static enums.URLs.ADMIN_PANEL_URL;

public class DeleteTaxTest extends AdminBaseTest {
    @Test
    public void deleteTaxClassesTest() {
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .inputUsername("admin")
                .inputPassword("admin")
                .clickLoginButton()
                .clickMenuSystem()
                .clickSubmenuLocalisation()
                .clickSubmenuTaxes()
                .clickSubmenuTaxClasses()
                .clickChooseTaxClassesCheckbox("Sales Taxes")
                .clickOnDeleteTaxClassesButton()
                .confirmDeleteTaxClasses()
                .verifyDeleteTaxClasses();
    }

    @Test
    public void deleteTaxRatesTest() {
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .inputUsername("admin")
                .inputPassword("admin")
                .clickLoginButton()
                .clickMenuSystem()
                .clickSubmenuLocalisation()
                .clickSubmenuTaxes()
                .clickSubmenuTaxRates()
                .clickChooseTaxRatesCheckbox("Federal income tax")
                .clickOnDeleteTaxRatesButton()
                .confirmDeleteTaxRates()
                .verifyDeleteTaxRates();
    }
}
