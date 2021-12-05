package stories;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.AddToWishListPageBL;
import steps.CheckoutPageBL;
import steps.MainPageBL;
import steps.WishListPageBL;
import steps.user.LoginUserByWishListPageBL;

import static enums.URLs.BASE_URL;

public class OrderTwoProdUsingWishlistAsLogUserTest extends StoriesBaseTest{
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
    @Severity(SeverityLevel.CRITICAL)
    public void searchElementAndAddToWishlist() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToWishListPageBL addToWishListPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchWishList("Mac")
                .clickOnAddToWishListMacBookButton();
        addToWishListPageBL.verifyAddMacBook();

        WishListPageBL wishListPageBL = mainPageBL.getHeaderPageBL()
                .clickWishListButton()
                .clickOnButtonAddToCartMacBook()
                .verifyAddProductButton("MacBook");

                mainPageBL.getHeaderPageBL()
                        .inputSearchWishList("iPhone")
                        .clickOnAddToWishListIPhoneButton();
        addToWishListPageBL.verifyAddIPhone();

        mainPageBL.getHeaderPageBL()
                .clickWishListButton()
                .clickOnButtonAddToCartIPhone()
                .verifyAddProductButton("iPhone");

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
