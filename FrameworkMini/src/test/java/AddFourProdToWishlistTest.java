import navigation.Navigation;
import org.testng.annotations.Test;
import steps.AddToWishListPageBL;
import steps.MainPageBL;
import steps.user.LoginUserByWishListPageBL;

import static enums.URLs.BASE_URL;

public class AddFourProdToWishlistTest extends BaseTest {
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
                .inputSearchWishList("Mac")
                .clickOnAddToWishListMacBookButton();

        addToWishListPageBL.verifyAddMacBook();
        mainPageBL.getHeaderPageBL()
                .inputSearchWishList("iPhone")
                .clickOnAddToWishListIPhoneButton();
        addToWishListPageBL.verifyAddIPhone();

        mainPageBL.getHeaderPageBL()
                .inputSearchWishList("Samsung")
                .clickOnAddToWishListSamsungSyncMaster941BWButton();
        addToWishListPageBL.verifyAddSamsungSyncMaster941BWButton();

        mainPageBL.getHeaderPageBL()
                .inputSearchWishList("Canon")
                .clickOnAddToWishListCanonEOS5DButton();
        addToWishListPageBL.verifyAddCanonEOS5D();
    }
}
