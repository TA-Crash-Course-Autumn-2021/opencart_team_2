package administration;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.user.LoginAdministrationPageBL;

import static enums.URLs.ADMIN_PANEL_URL;

public class EditTaxTest extends AdminBaseTest {

    @Test
    public void editTaxClassesTest() {
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
                .clickOnEditTaxButton("Sales Taxes")
                .editTaxClasses()
                .verifyEditTaxClasses();
    }

    @Test
    public void editTaxRatesTest() {
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
                .clickOnEditTaxRatesButton("Federal income tax")
                .registerEditTaxRates()
                .verifyEditTaxRates();
    }
}
