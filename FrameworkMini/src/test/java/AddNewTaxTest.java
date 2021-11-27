import navigation.Navigation;
import org.testng.annotations.Test;
import steps.LoginAdministrationPageBL;

import static enums.URLs.ADMIN_PANEL_URL;

public class AddNewTaxTest extends BaseTest {

    @Test
    public void addNewTaxClassesTest() {
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
                .clickAddTaxButton()
                .addTaxClasses()
                .verifyAddNewTaxClasses();
    }

    @Test
    public void addNewTaxRatesTest() {
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
                .clickAddTaxButton()
                .addTaxRates()
                .verifyAddNewTaxRates();
    }
}
