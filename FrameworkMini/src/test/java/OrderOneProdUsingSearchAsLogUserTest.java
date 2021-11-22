import navigation.Navigation;
import org.testng.annotations.Test;
import steps.CheckoutPageBL;
import steps.MainPageBL;
import steps.SearchPageBL;
import steps.WishListPageBL;

import static enums.URLs.BASE_URL;

public class OrderOneProdUsingSearchAsLogUserTest extends BaseTest {
    @Test
    public void loginUserWithInWishListPage() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        WishListPageBL wishListPageBL = mainPageBL.getHeaderPageBL()
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
                .clickSearch()
                .clearSearch()
                .sendKeysSearch("Mac")
                .sendKeysSearchENTER()
                .clickOnAddToCartMacBookAirButton();
        searchPageBL.verifyAddMacBook();
    }

    @Test
    public void searchEoCard(){
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
