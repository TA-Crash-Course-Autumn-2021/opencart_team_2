package administration;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.user.LoginAdministrationPageBL;

import static enums.URLs.ADMIN_PANEL_URL;

public class DeleteCurrencyTest extends AdminBaseTest {
    @Test
    public void deleteCurrencyTest() {
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .inputUsername("admin")
                .inputPassword("admin")
                .clickLoginButton()
                .clickMenuSystem()
                .clickSubmenuLocalisation()
                .clickSubmenuCurrencies()
                .clickChooseCurrencyCheckbox("Hryvnia")
                .clickOnDeleteCurrencyButton()
                .confirmDeleteCurrency()
                .verifyDeleteCurrency();
    }
}
