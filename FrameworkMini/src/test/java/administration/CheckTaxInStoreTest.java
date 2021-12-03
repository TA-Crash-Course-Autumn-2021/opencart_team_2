package administration;

import driver.DriverRepository;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.CheckoutPageBL;
import steps.MainPageBL;
import steps.SearchPageBL;
import steps.user.LoginAdministrationPageBL;
import steps.user.LoginUserByWishListPageBL;

import static enums.URLs.ADMIN_PANEL_URL;
import static enums.URLs.BASE_URL;

public class CheckTaxInStoreTest extends AdminBaseTest {
    @BeforeTest
    public void addNewTaxRatesEditTaxClassesEditProduct() {
        DriverRepository.instanceWebBrowser();
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickMenu("Taxes")
                .clickSubmenuTaxRates()
                .clickAddTaxButton()
                .addTaxRatesCarbon()
                .verifyAddNewTaxRates();

        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickMenu("Taxes")
                .clickSubmenuTaxClasses()
                .clickOnEditTaxButton("Taxable Goods")
                .editTaxClassesGoods()
                .verifyEditTaxClasses();

        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuCatalog()
                .clickMenu("Products")
                .clickSubmenuProducts()
                .clickOnEditProductButton("iPhone")
                .clickOnDataButton()
                .clickOnTaxMenu()
                .clickTaxableGoodsMenu()
                .clickSaveButton();

        DriverRepository.closeBrowser();
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void loginUserThenSearchElementAndAddToCardThenCheckout() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginUserByWishListPageBL wishListPageBL = mainPageBL.getHeaderPageBL()
                .clickOnWishListButton()
                .clickOnLoginButton()
                .loginPerson();
        wishListPageBL.verifyLoginInWishList();

        new Navigation().navigateToUrl(BASE_URL.getValue());
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchAddToCart("iPhone")
                .clickOnAddToCart("iPhone");

        new Navigation().navigateToUrl(BASE_URL.getValue());
        CheckoutPageBL checkoutPageBL= mainPageBL.getHeaderPageBL()
                .clickOnCheckoutButton()
                .checkoutPersonStep2()
                .checkoutPersonStep3()
                .checkoutPersonStep4()
                .checkoutPersonStep5();
        checkoutPageBL.verifyNewTax();
    }
}
