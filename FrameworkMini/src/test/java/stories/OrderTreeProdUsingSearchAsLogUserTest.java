package stories;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.CheckoutPageBL;
import steps.MainPageBL;
import steps.SearchPageBL;
import steps.user.LoginUserByWishListPageBL;

import static enums.URLs.BASE_URL;

public class OrderTreeProdUsingSearchAsLogUserTest extends StoriesBaseTest{
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
                .inputSearchAddToCart("Mac")
                .clickOnAddToCart("MacBook Air");
        searchPageBL.verifyAddMacBookAir();

        mainPageBL.getHeaderPageBL()
                .inputSearchAddToCart("Mac")
                .clickOnAddToCart("MacBook");
        searchPageBL.verifyAddMacBook();

        mainPageBL.getHeaderPageBL()
                .inputSearchAddToCart("Samsung")
                .clickOnAddToCart("Samsung SyncMaster 941BW");
        searchPageBL.verifyAddSamsungSyncMaster941BWButton();
    }

    @Test
    public void stepCheckoutPerson(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
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