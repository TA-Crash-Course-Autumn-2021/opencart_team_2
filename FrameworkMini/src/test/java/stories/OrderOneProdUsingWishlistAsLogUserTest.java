package stories;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.AddToWishListPageBL;
import steps.CheckoutPageBL;
import steps.MainPageBL;
import steps.WishListPageBL;
import steps.user.LoginUserByWishListPageBL;

import static enums.URLs.BASE_URL;

public class OrderOneProdUsingWishlistAsLogUserTest extends StoriesBaseTest{
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
                .inputSearchWishList("iPhone")
                .clickOnAddToWishListIPhoneButton();
        addToWishListPageBL.verifyAddIPhone();

        WishListPageBL wishListPageBL = mainPageBL.getHeaderPageBL()
                .clickWishListButton()
                .clickOnButtonAddToCartIPhone()
                .verifyAddProductButton("iPhone");
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
