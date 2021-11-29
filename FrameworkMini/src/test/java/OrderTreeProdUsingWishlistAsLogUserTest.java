import navigation.Navigation;
import org.testng.annotations.Test;
import steps.*;

import static enums.URLs.BASE_URL;

public class OrderTreeProdUsingWishlistAsLogUserTest extends BaseTest{
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
    public void searchElementAndAddToWishlist() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToWishListPageBL addToWishListPageBL = mainPageBL.getHeaderPageBL()
                .clickSearch()
                .clearSearch()
                .sendKeysSearch("Mac")
                .sendKeysSearchProdENTER()
                .clickOnAddToWishListMacBookButton();
        addToWishListPageBL.verifyAddMacBook();

        WishListPageBL wishListPageBL = mainPageBL.getHeaderPageBL()
                .clickWishListButton()
                .clickOnButtonAddToCartMacBook()
                .verifyAddProductButton("MacBook");

    }
    @Test
    public void searchElementAndAddToWishlist2() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToWishListPageBL addToWishListPageBL =
                mainPageBL.getHeaderPageBL()
                        .clickSearch()
                        .clearSearch()
                        .sendKeysSearch("iPhone")
                        .sendKeysSearchProdENTER()
                        .clickOnAddToWishListIPhoneButton();
        addToWishListPageBL.verifyAddIPhone();

        WishListPageBL wishListPageBL = mainPageBL.getHeaderPageBL()
                .clickWishListButton()
                .clickOnButtonAddToCartIPhone()
                .verifyAddProductButton("iPhone");
    }

    @Test
    public void searchElementAndAddToWishlist3() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToWishListPageBL addToWishListPageBL =
                mainPageBL.getHeaderPageBL()
                        .clickSearch()
                        .clearSearch()
                        .sendKeysSearch("Samsung")
                        .sendKeysSearchProdENTER()
                        .clickOnAddToWishListSamsungSyncMaster941BWButton();
        addToWishListPageBL.verifyAddSamsungSyncMaster941BWButton();

        mainPageBL.getHeaderPageBL()
                .clickWishListButton()
                .clickOnButtonAddToCartSamsungSyncMaster941BW()
                .verifyAddProductButton("Samsung SyncMaster 941BW");
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
