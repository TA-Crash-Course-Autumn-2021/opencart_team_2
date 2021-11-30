package stories;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.CheckoutPageBL;
import steps.MainPageBL;
import steps.menu.AddToComparePageBL;

import static enums.URLs.BASE_URL;

public class OrderOneProdUsingComparisonAsGuestUserTest extends StoriesBaseTest {
    @Test
    public void searchByMenuAndAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToComparePageBL addToComparePageBL = mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButtonAddToComparePage()
                .clickOnIMacAirMenuButton()
                .clickOnAddToCompareButton()
                .clickOnProductComparisonMac()
                .clickOnAddToShoppingCartButton();
        addToComparePageBL.verifyAddIMac();
    }
    @Test
    public void stepCheckoutPerson(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        CheckoutPageBL checkoutPageBL= mainPageBL.getHeaderPageBL()
                .clickOnCheckoutButton()
                .checkoutPersonStep1()
                .checkoutPersonStep2ForGuest()
                .checkoutPersonStep4()
                .checkoutPersonStep5()
                .checkoutPersonStep6();

        checkoutPageBL.verifyCheckout();
    }
}
