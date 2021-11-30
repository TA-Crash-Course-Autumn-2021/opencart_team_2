package administration;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.user.LoginAdministrationPageBL;

import static enums.URLs.ADMIN_PANEL_URL;

public class EditCurrencyTest extends AdminBaseTest {
    @Test
    public void editNewCurrencyTest() {
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .inputUsername("admin")
                .inputPassword("admin")
                .clickLoginButton()
                .clickMenuSystem()
                .clickSubmenuLocalisation()
                .clickSubmenuCurrencies()
                .clickOnEditCurrenciesButton("Ukrainian Hryvnia")
                .registerEditCurrency()
                .verifyEditCurrency();
    }
}
