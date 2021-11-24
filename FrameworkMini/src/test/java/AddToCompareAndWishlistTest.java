import navigation.Navigation;
import org.testng.annotations.Test;
import steps.AddToComparePageBL;
import steps.MainPageBL;
import steps.LoginUserByWishListPageBL;

import static enums.URLs.BASE_URL;

public class AddToCompareAndWishlistTest extends BaseTest{
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
    public void searchByMenuAndAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToComparePageBL addToComparePageBL = mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButtonAddToComparePage()
                .clickOnIMacAirMenuButton()
                .clickOnAddToCompareButton()
                .clickOnAddToWishListButton();
        addToComparePageBL.verifyAddIMac();
    }
}
