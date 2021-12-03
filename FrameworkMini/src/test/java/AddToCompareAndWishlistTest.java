import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.menu.AddToComparePageBL;
import steps.user.LoginUserByWishListPageBL;

import static enums.URLs.BASE_URL;

public class AddToCompareAndWishlistTest extends BaseTest{
    @Test
    @Severity(SeverityLevel.TRIVIAL)
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
    @Severity(SeverityLevel.TRIVIAL)
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
