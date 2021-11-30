package stories;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.CheckoutPageBL;
import steps.MainPageBL;
import steps.SearchPageBL;

import static enums.URLs.BASE_URL;

public class OrderOneProdUsingSearchAsGuestUserTest extends StoriesBaseTest {
    @Test
    public void searchElementAndAddToCard() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchAddToCart("Mac")
                .clickOnAddToCartMacBookAirButton();
        searchPageBL.verifyAddMacBookAir();
    }

    @Test
    public void searchEoCard(){
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
