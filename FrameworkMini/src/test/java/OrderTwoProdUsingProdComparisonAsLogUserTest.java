import navigation.Navigation;
import org.testng.annotations.Test;
import steps.AddToComparePageBL;
import steps.CheckoutPageBL;
import steps.MainPageBL;
import steps.LoginUserByWishListPageBL;

import static enums.URLs.BASE_URL;

public class OrderTwoProdUsingProdComparisonAsLogUserTest extends BaseTest{
    @Test
    public void searchAndAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToComparePageBL addToComparePageBL = mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButtonAddToComparePage()
                .clickOnIMacAirMenuButton()
                .clickOnAddToCompareButton()
                .clickOnProductComparisonMac()
                .clickOnAddToShoppingCartButton();
                //.clickOnRemoveButton();
        addToComparePageBL.verifyAddIMac();

        mainPageBL.getMenuPageBL()
                .clickOnPhones_PDAsButtonAddToComparePage()
                .clickOnIPhoneButton()
                .clickOnAddToCompareButton()
                .clickOnProductComparisonIPhone()
                .clickOnRemoveButton()
                .clickOnAddToShoppingCartButton();
       // addToComparePageBL.verifyAddIPhone();
    }
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
