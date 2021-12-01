package administration;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.CheckoutPageBL;
import steps.MainPageBL;
import steps.SearchPageBL;
import steps.user.LoginAdministrationPageBL;
import steps.user.LoginUserByWishListPageBL;

import static enums.URLs.ADMIN_PANEL_URL;
import static enums.URLs.BASE_URL;

public class CheckTaxInStore extends AdminBaseTest {
    @Test
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
                .addTaxRatesCarbon()
                .verifyAddNewTaxRates();
    }

    @Test
    public void editTaxClassesTest() {
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
        loginAdministrationPageBL
                .registerAdmin()
                .clickMenuSystem()
                .clickMenu("Localisation")
                .clickMenu("Taxes")
                .clickSubmenuTaxClasses()
                .clickOnEditTaxButton("Taxable Goods")
                .editTaxClassesGoods()
                .verifyEditTaxClasses();
    }

    @Test
    public void editProductTest() {
        new Navigation().navigateToUrl(ADMIN_PANEL_URL.getValue());
        LoginAdministrationPageBL loginAdministrationPageBL = new LoginAdministrationPageBL();
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
    }
    @Test
    public void loginUserWithInWishListPage() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginUserByWishListPageBL wishListPageBL = mainPageBL.getHeaderPageBL()
                .clickOnWishListButton()
                .clickOnLoginButton()
                .loginPerson();
        wishListPageBL.verifyLoginInWishList();
    }

    @Test
    public void searchElementAndAddToCard() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchAddToCart("iPhone")
                .clickOnAddToCart("iPhone");
    }

    @Test
    public void stepCheckoutPerson() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        CheckoutPageBL checkoutPageBL= mainPageBL.getHeaderPageBL()
                .clickOnCheckoutButton()
                .checkoutPersonStep2()
                .checkoutPersonStep3()
                .checkoutPersonStep4()
                .checkoutPersonStep5();
        checkoutPageBL.verifyNewTax();
    }
}
