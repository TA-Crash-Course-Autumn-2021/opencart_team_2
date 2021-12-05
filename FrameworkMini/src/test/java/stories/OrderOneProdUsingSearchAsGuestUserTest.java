package stories;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.CheckoutPageBL;
import steps.MainPageBL;
import steps.SearchPageBL;

import static enums.URLs.BASE_URL;

public class OrderOneProdUsingSearchAsGuestUserTest extends StoriesBaseTest {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void searchElementAndAddToCardAndCheckoutPerson() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchAddToCart("Mac")
                .clickOnAddToCart("MacBook Air");
        searchPageBL.verifyAddMacBookAir();

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
