import navigation.Navigation;
import org.testng.annotations.Test;
import steps.AddToWishListPageBL;
import steps.MainPageBL;
import steps.WishListPageBL;

import static enums.URLs.BASE_URL;

public class AddFourProdToWishlistTest extends BaseTest {
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
        mainPageBL.getHeaderPageBL()
                .clickSearch()
                .clearSearch()
                .sendKeysSearch("iPhone")
                .sendKeysSearchProdENTER()
                .clickOnAddToWishListIPhoneButton();
        addToWishListPageBL.verifyAddIPhone();

        mainPageBL.getHeaderPageBL()
                .clickSearch()
                .clearSearch()
                .sendKeysSearch("Samsung")
                .sendKeysSearchProdENTER()
                .clickOnAddToWishListSamsungSyncMaster941BWButton();
        addToWishListPageBL.verifyAddSamsungSyncMaster941BWButton();

        mainPageBL.getHeaderPageBL()
                .clickSearch()
                .clearSearch()
                .sendKeysSearch("Canon")
                .sendKeysSearchProdENTER()
                .clickOnAddToWishListCanonEOS5DButton();
        addToWishListPageBL.verifyAddCanonEOS5D();


    }
}
