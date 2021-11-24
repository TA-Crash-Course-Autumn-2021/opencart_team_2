import navigation.Navigation;
import org.testng.annotations.Test;
import steps.AddToWishListPageBL;
import steps.MainPageBL;
import steps.LoginUserByWishListPageBL;

import static enums.URLs.BASE_URL;


public class AddOneProdToWishlistTest extends BaseTest {
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
    }
}
