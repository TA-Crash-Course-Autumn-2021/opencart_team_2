package stories;

import navigation.Navigation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.CheckoutPageBL;
import steps.MainPageBL;
import steps.user.LoginUserByWishListPageBL;

import static enums.URLs.BASE_URL;

public class OrderTreeProdUsingProductPageAsLogUserTest extends StoriesBaseTest {
    @BeforeClass
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
    public void addProductToShoppingCartByProdPageTestAndCheckoutPerson() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButton()
                .clickOnIMacAirMenuButton()
                .clickOnAddToCartButton()
                .verifyAddProductButton("iMac");

        mainPageBL.getMenuPageBL()
                .clickOnPhones_PDAsButton()
                .clickOnIPhoneButton()
                .clickOnAddToCartButton()
                .verifyAddProductButton("iPhone");

        mainPageBL.getMenuPageBL()
                .clickOnComponentsButton()
                .clickOnMonitorsButton()
                .clickOnSamsungSyncMaster941BWButton()
                .clickOnAddToCartButton()
                .verifyAddProductButton("Samsung SyncMaster 941BW");

        CheckoutPageBL checkoutPageBL= mainPageBL.getHeaderPageBL()
                .clickOnCheckoutButton()
                .checkoutPersonStep2()
                .checkoutPersonStep3()
                .checkoutPersonStep4()
                .checkoutPersonStep5()
                .checkoutPersonStep6();

        checkoutPageBL.verifyCheckout();

    }

}
