import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.AddToWishListPageBL;
import steps.MainPageBL;
import steps.user.LoginUserByWishListPageBL;

import static enums.URLs.BASE_URL;

public class AddOneProdToWishlistTest extends BaseTest {

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
    @Severity(SeverityLevel.TRIVIAL)
    public void searchElementAndAddToWishlist() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToWishListPageBL addToWishListPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchWishList("Mac")
                .clickOnAddToWishListMacBookButton();

        addToWishListPageBL.verifyAddMacBook();
    }
}
